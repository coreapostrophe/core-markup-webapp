export class Card{
  concept: string;
  details: {
    order: number,
    label?: string,
    next?: number
  }[];
  enumerable: boolean;
  headers: string[];
  root: boolean;

  constructor(card: CardModel) {
    this.concept = card.concept;
    this.details = card.details;
    this.enumerable = card.enumerable;
    this.headers = card.headers;
    this.root = card.root;
  }

  private getRandomInt(max: number): number{
    return Math.floor(Math.random() * Math.floor(max));
  }

  getRandomDetailString(): string{
    return this.details[this.getRandomInt(this.details.length)].label;
  }
}

interface CardModel{
  concept: string;
  details: {
    order: number,
    label?: string,
    next?: number
  }[];
  enumerable: boolean;
  headers: string[];
  root: boolean;
}
