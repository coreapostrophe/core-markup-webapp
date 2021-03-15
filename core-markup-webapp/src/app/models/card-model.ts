export class Card{
  concept: string;
  details: {
    order: number,
    label?: string,
    next?: Card
  }[];
  enumerable: boolean;
  headers: string[];
  root: boolean;
}
