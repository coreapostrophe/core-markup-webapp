import { Injectable } from '@angular/core';
import {Deck} from '../models/deck-model';
import sampleDeck from '../../../../antlr/data/Sample.cmu.json';

@Injectable({
  providedIn: 'root'
})
export class DeckService {
  private deckList: Deck[] = [];
  public testJson = {
    id: 0,
    title: 'Test Deck',
    colorTag: 'orange',
    backgroundImage: 'https://i.kym-cdn.com/photos/images/facebook/001/376/201/1ac.png',
    cards: sampleDeck
  };
  public testDeck = new Deck(this.testJson, 0);

  constructor() {
    this.addDeck(this.testDeck);
  }

  public addDeck(deck: Deck): void{
    this.deckList.push(deck);
  }

  public getDeckList(): Deck[]{
    return this.deckList;
  }
}
