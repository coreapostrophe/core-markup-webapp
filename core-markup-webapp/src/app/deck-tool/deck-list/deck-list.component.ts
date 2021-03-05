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
    this.decks = [];
  }

  ngOnInit(): void {
  }

  onClickDeck(event, deckID){
    this.router.navigate(['Flashcard',deckID], {relativeTo: this.route.parent}).then(e=>{
      // error handling
    });
  }
}
