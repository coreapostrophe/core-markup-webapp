import { Component, OnInit } from '@angular/core';
import {Deck} from "../../../models/deck-model";
import {ActivatedRoute, Router} from "@angular/router";
import {DeckService} from "../../../services/deck.service";

@Component({
  selector: 'app-deck-list',
  templateUrl: './deck-list.component.html',
  styleUrls: ['./deck-list.component.scss']
})
export class DeckListComponent implements OnInit {
  decks: Deck[] = [];

  constructor(private router: Router, private route: ActivatedRoute, private deckService: DeckService) {
  }

  ngOnInit(): void {
    this.decks = this.deckService.getDeckList();
  }



  onClickDeck(event, deckID): void{
    this.router.navigate(['Flashcard', deckID], {relativeTo: this.route.parent}).then(e => {
      // error handling
    });
  }
}
