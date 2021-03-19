export class Card{
  concept: string;
  details: {
    label?: string,
    next?: number
  }[];
  enumerable: boolean;
  headers: string[];
  root: boolean;
}
