import { Component, OnInit } from '@angular/core';
import {Deck} from "../../models/deck-model";

@Component({
  selector: 'app-deck-list',
  templateUrl: './deck-list.component.html',
  styleUrls: ['./deck-list.component.scss']
})
export class DeckListComponent implements OnInit {

  decks: Deck[];

  constructor() {
    this.decks = [
      {
        Title: 'Sample Deck',
        ColorTag: 'yellow'
      },
      {
        Title: 'Sample Deck',
        ColorTag: 'red'
      },
      {
        Title: 'Sample Deck',
        ColorTag: 'blue'
      },
      {
        Title: 'Sample Deck',
        ColorTag: 'violet'
      },
      {
        Title: 'Sample Deck',
        ColorTag: 'orange'
      },
    ];
  }

  ngOnInit(): void {
  }

}
