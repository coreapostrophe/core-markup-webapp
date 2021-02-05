import { Component, OnInit } from '@angular/core';
import {Deck} from "../../models/deck-model";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-deck-list',
  templateUrl: './deck-list.component.html',
  styleUrls: ['./deck-list.component.scss']
})
export class DeckListComponent implements OnInit {

  decks: Deck[];

  constructor(private router: Router, private route:ActivatedRoute) {
    this.decks = [
      {
        ID: 1,
        Title: 'Sample Deck',
        ColorTag: 'yellow'
      },
      {
        ID: 2,
        Title: 'Sample Deck',
        ColorTag: 'red'
      },
      {
        ID: 3,
        Title: 'Sample Deck',
        ColorTag: 'blue'
      },
      {
        ID: 4,
        Title: 'Sample Deck',
        ColorTag: 'violet'
      },
      {
        ID: 5,
        Title: 'Sample Deck',
        ColorTag: 'orange'
      },
    ];
  }

  ngOnInit(): void {
  }

  onClickDeck(event, deckID){
    console.log(deckID);
    this.router.navigate(['Flashcard',deckID], {relativeTo: this.route.parent}).then(e=>{
      // error handling
    });
  }
}
