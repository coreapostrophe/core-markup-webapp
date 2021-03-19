import {Component, OnInit, ViewChild} from '@angular/core';
import {animate, state, style, transition, trigger} from "@angular/animations";
import {Card} from "../../../models/card-model";
import {DeckService} from "../../../services/deck.service";
import {ActivatedRoute} from "@angular/router";

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
        }),animate("0.2s ease")
      ]),
      transition(':leave', [animate("0.4s ease",
        style({
          opacity: 0,
          transform: 'Scale(0.75)'
        }))])
    ])
  ]
})
export class DeckViewerComponent implements OnInit {
  @ViewChild('currentCard') currentCard;

  private allCards: Card[] = [];
  domCard: Card[] = [];
  cardState: CardState = CardState.DEFAULT;


  constructor(private route:ActivatedRoute, private deckList: DeckService) {}

  ngOnInit(): void {
    this.swapCard(this.getRandomInt(this.allCards.length));
  }

  private getRandomInt(max){
    return Math.floor(Math.random()*Math.floor(max))
  }

  onCardDecision(isRemembered: boolean){
    if(this.cardState != CardState.FLIPPED){
      this.cardState = CardState.FLIPPED;
    } else {
      this.cardState = isRemembered ? CardState.REMEMBERED : CardState.FORGOT;
      this.swapCard(this.getRandomInt(this.allCards.length));
      this.cardState = CardState.DEFAULT;
    }
  }

  private swapCard(i: number){
    if(this.domCard.length > 0){
      this.domCard = [];
    }
    this.domCard.push(this.allCards[i]);
  }
}

enum CardState {
  DEFAULT= 'default',
  FLIPPED = 'flipped',
  REMEMBERED = 'remembered',
  FORGOT = 'forgot'
}
