export class Card{
  private _concept: string;
  private _details: {
    label?: string,
    next?: number
  }[];
  private _parent: number;
  private _enumerable: boolean;
  private _headers: string[];
  private _root: boolean;


  constructor(card: CardModel) {
    this._concept = card.concept;
    this._details = card.details;
    this._enumerable = card.enumerable;
    this._headers = card.headers;
    this._root = card.root;
    this._parent = card.parent;
  }

  private getRandomInt(max: number): number{
    return Math.floor(Math.random() * Math.floor(max));
  }

  getRandomDetailString(): string{
    return this._details[this.getRandomInt(this._details.length)].label;
  }

  get concept(): string {return this._concept; }
  get details(): { label?: string; next?: number }[] {return this._details; }
  get enumerable(): boolean {return this._enumerable; }
  get headers(): string[] {return this._headers; }
  get root(): boolean {return this._root; }
  get parent(): number {return this._parent; }
}

interface CardModel{
  concept: string;
  details: {
    label?: string,
    next?: number
  }[];
  parent?: number;
  enumerable: boolean;
  headers: string[];
  root: boolean;
}
