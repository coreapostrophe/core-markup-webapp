import {Card} from './card-model';

export class Deck{
  private _id: number;
  private _title?: string;
  private _colorTag?: string;
  private _backgroundImage?: string;
  private _cards: Card[] = [];

  constructor(deck: DeckModel, id: number) {
    this._id = id;
    this._title = deck.title;
    this._colorTag = deck.colorTag;
    this._backgroundImage = deck.backgroundImage;
    deck.cards.forEach((card) => {
      this._cards.push(new Card(card));
    });
  }

  private static randInt(max: number): number{
    return Math.floor(Math.random() * Math.floor(max));
  }

  pickCard(index?: number): Card{
    if (index){
      return this._cards[index];
    } else {
      return this._cards[Deck.randInt(this._cards.length)];
    }
  }

  get id(): number {return this._id; }
  get title(): string {return this._title; }
  get colorTag(): string {return this._colorTag; }
  get backgroundImage(): string {return this._backgroundImage; }
  get cards(): Card[] {return this._cards; }
}

interface DeckModel{
  title?: string;
  colorTag?: string;
  backgroundImage?: string;
  cards: Card[];
}
