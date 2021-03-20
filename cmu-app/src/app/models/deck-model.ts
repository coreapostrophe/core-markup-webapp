import {Card} from "./card-model";

export class Deck{
  id: number;
  title?: string;
  colorTag?: string;
  backgroundImage?: string;
  cards: Card[] = [];

  constructor(deck: DeckModel, id: number) {
    this.id = id;
    this.title = deck.title;
    this.colorTag = deck.colorTag;
    this.backgroundImage = deck.backgroundImage;
    deck.cards.forEach((value)=>{
      this.cards.push(new Card(value));
    });
  }

  private getRandomInt(max: number): number{
    return Math.floor(Math.random() * Math.floor(max));
  }

  getRandomCard(): Card{
    return this.cards[this.getRandomInt(this.cards.length)];
  }
}

interface DeckModel{
  title?: string;
  colorTag?: string;
  backgroundImage?: string;
  cards: Card[];
}
