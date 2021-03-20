import { Injectable } from '@angular/core';
import {Deck} from '../models/deck-model';
import sampleDeck from '../../../../antlr/data/Sample.cmu.json';

@Injectable({
  providedIn: 'root'
})
export class DeckService {
  private deckList: Deck[] = [];
  public testDeck: Deck = {
    id: 0,
    title: 'Test Deck',
    colorTag: 'red',
    backgroundImage: 'https://i.kym-cdn.com/photos/images/facebook/001/376/201/1ac.png',
    cards: sampleDeck
  };

  constructor() {
    this.addDeck(this.testDeck);
  }

  public addDeck(deck: Deck){
    this.deckList.push(deck);
  }

  getDeckList(): Deck[]{
    return this.deckList;
  }
}
