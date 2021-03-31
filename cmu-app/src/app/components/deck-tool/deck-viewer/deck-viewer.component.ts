import {Component, OnDestroy, OnInit, ViewChild} from '@angular/core';
import {animate, state, style, transition, trigger} from '@angular/animations';
import {Card} from '../../../models/card-model';
import {DeckService} from '../../../services/deck.service';
import {ActivatedRoute} from '@angular/router';
import {Observable, Subscription} from 'rxjs';
import {Deck} from '../../../models/deck-model';

enum CardState {
  DEFAULT = 'DEFAULT',
  FLIPPED = 'FLIPPED',
  REMEMBERED = 'REMEMBERED',
  FORGOT = 'FORGOT',
}

@Component({
  selector: 'app-deck-use',
  templateUrl: './deck-viewer.component.html',
  styleUrls: ['./deck-viewer.component.scss'],
  animations: [
    trigger('card', [
      state(CardState.DEFAULT, style({
        opacity: 1,
        transform: 'Scale(1)'
      })),
      transition(':enter', [
        style({
          opacity: 0,
          transform: 'Scale(0.75)'
        }), animate('0.2s ease')
      ]),
      transition(':leave', [animate('0.4s ease',
        style({
          opacity: 0,
          transform: 'Scale(0.75)'
        }))])
    ])
  ]
})
export class DeckViewerComponent implements OnInit, OnDestroy {
  private deckId;
  private deckIdSubscription: Subscription;

  cardState: string = CardState.DEFAULT;
  currentDeck: Deck;
  currentCard: Card;

  constructor(private route: ActivatedRoute, private deckService: DeckService) {}

  ngOnInit(): void {
    this.deckIdSubscription = this.route.params.subscribe(params => {
      this.deckId = params.id;
    });
    this.currentDeck = this.deckService.getDeck(this.deckId);
    this.currentCard = this.currentDeck.pickCard();
  }

  ngOnDestroy(): void {
    this.deckIdSubscription.unsubscribe();
  }

  onCardDecision(isRemembered: boolean): void{
    this.currentCard.clearRandDetail();
    this.currentCard = this.currentDeck.pickCard();
  }

  onCardClick(): void{
    this.currentCard.flipped = !this.currentCard.flipped;
  }
}
