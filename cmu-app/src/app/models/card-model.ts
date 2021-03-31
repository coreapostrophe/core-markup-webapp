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

  private _flipped: boolean;
  private _randDetail: string;

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

  getRandDetail(): string{
    if(this._randDetail){
      return this._randDetail;
    } else {
      this._randDetail = this._details[this.getRandomInt(this._details.length)].label;
      return this._randDetail;
    }
  }

  clearRandDetail(): void{
    this._randDetail = undefined;
  }

  get concept(): string {return this._concept; }
  get details(): { label?: string; next?: number }[] {return this._details; }
  get enumerable(): boolean {return this._enumerable; }
  get headers(): string[] {return this._headers; }
  get root(): boolean {return this._root; }
  get parent(): number {return this._parent; }
  get flipped(): boolean {return this._flipped;}
  set flipped(value: boolean) {this._flipped = value;}
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
