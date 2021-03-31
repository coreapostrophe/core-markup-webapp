import { Injectable } from '@angular/core';
import {Deck} from '../models/deck-model';
import sampleDeck from '../../../../antlr/data/Sample.cmu.json';

@Injectable({
  providedIn: 'root'
})
export class DeckService {
  private deckList: Deck[] = [];
  private sampleDeck = new Deck(sampleDeck, 0);

  constructor() {
    this.addDeck(this.sampleDeck);
  }

  public addDeck(deck: Deck): void{
    this.deckList.push(deck);
  }

  public getDeck(index: number): Deck{
    try{
      return this.deckList[index];
    } catch (e){
      return null;
    }
  }

  public getDeckList(): Deck[]{
    return this.deckList;
  }
}
