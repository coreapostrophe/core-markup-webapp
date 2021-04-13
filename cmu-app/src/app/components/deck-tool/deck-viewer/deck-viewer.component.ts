import {Component, OnDestroy, OnInit} from '@angular/core';
import {animate, state, style, transition, trigger} from '@angular/animations';
import {Card} from '$app/models/card-model';
import {DeckService} from '$app/services/deck.service';
import {ActivatedRoute} from '@angular/router';
import {Subscription} from 'rxjs';
import {Deck} from '$app/models/deck-model';

enum CardState {
  DEFAULT = 'DEFAULT',
  FLIPPED = 'FLIPPED',
  OUT = 'OUT'
}

@Component({
  selector: 'app-deck-use',
  templateUrl: './deck-viewer.component.html',
  styleUrls: ['./deck-viewer.component.scss'],
  animations: [
    trigger('card', [
      state(CardState.DEFAULT, style({
        transform: 'rotateY(0deg)',
        opacity: '1'
      })),
      state(CardState.FLIPPED, style({
        transform: 'rotateY(90deg)',
        opacity: '1'
      })),
      state(CardState.OUT, style({
        transform: 'translateY(-2rem)',
        transformOrigin: '100% 100%',
        opacity: '1'
      })),
      transition('* => *', [
        animate('0.2s ease-in-out')
      ])
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

  async delay(callback: () => void, delay): Promise<void>{
    setTimeout(() => {
      callback();
    }, delay);
  }

  ngOnDestroy(): void {
    this.deckIdSubscription.unsubscribe();
  }

  async onCardDecision(isRemembered: boolean): Promise<void> {
    this.cardState = CardState.OUT;
    await this.delay(() => {
      this.currentCard.clearRandDetail();
      this.currentCard = this.currentDeck.pickCard();
      this.cardState = CardState.DEFAULT;
    }, 200).then(r => r);
  }

  async onCardClick(): Promise<void> {
    this.cardState = CardState.FLIPPED;
    await this.delay(() => {
      this.currentCard.flipped = !this.currentCard.flipped;
      this.cardState = CardState.DEFAULT;
    }, 200).then(r => r);
  }
}
