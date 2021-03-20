import {Component, OnInit, ViewChild} from '@angular/core';
import {animate, state, style, transition, trigger} from '@angular/animations';
import {Card} from '../../../models/card-model';
import {DeckService} from '../../../services/deck.service';
import {ActivatedRoute} from '@angular/router';
import {Observable, Subscription} from 'rxjs';

@Component({
  selector: 'app-deck-use',
  templateUrl: './deck-viewer.component.html',
  styleUrls: ['./deck-viewer.component.scss'],
  animations: [
    trigger('card', [
      state('default', style({
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
export class DeckViewerComponent implements OnInit {
  private deckId;
  private allCards: Card[] = [];
  private deckIdSubscription: Subscription;

  cardState: CardState = CardState.DEFAULT;
  currentCard: Card;

  constructor(private route: ActivatedRoute, private deckService: DeckService) {}

  ngOnInit(): void {
    this.deckIdSubscription = this.route.params.subscribe(params => {
      this.deckId = params.id;
    });
    this.allCards = this.deckService.getDeckList()[this.deckId].cards;
    this.chooseCard();
  }

  onCardDecision(isRemembered: boolean): void{
    if (this.cardState !== CardState.FLIPPED){
      this.cardState = CardState.FLIPPED;
    } else {
      this.cardState = isRemembered ? CardState.REMEMBERED : CardState.FORGOT;
      this.swapCard(this.getRandomInt(this.allCards.length));
      this.cardState = CardState.DEFAULT;
    }
  }

  private getRandomInt(max): number{
    return Math.floor(Math.random() * Math.floor(max));
  }

  private chooseCard(): void{
    this.swapCard(this.getRandomInt(this.allCards.length));
  }

  private swapCard(i: number): void{
    this.currentCard = this.allCards[i];
  }
}

enum CardState {
  DEFAULT= 'default',
  FLIPPED = 'flipped',
  REMEMBERED = 'remembered',
  FORGOT = 'forgot'
}
