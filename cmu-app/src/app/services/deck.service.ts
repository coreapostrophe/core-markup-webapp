import { Injectable } from '@angular/core';
import {Deck} from "../models/deck-model";
import sampleDeck from "../../assets/prod_samples/Sample.cmu.json";

@Injectable({
  providedIn: 'root'
})
export class DeckService {
  private deckList: Deck[] = [];

  constructor() {

  }

  public addDeck(deck: Deck){
    this.deckList.push(deck);
  }

  getDeckList(): Deck[]{
    return this.deckList;
  }
}
