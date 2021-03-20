import {Card} from "./card-model";

export class Deck{
  id: number;
  title?: string;
  colorTag?: string;
  backgroundImage?: string;
  cards: Card[];
}
