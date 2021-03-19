import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-deck-nav',
  templateUrl: './deck-nav.component.html',
  styleUrls: ['./deck-nav.component.scss']
})
export class DeckNavComponent implements OnInit {

  public searchBox = "";

  constructor() { }

  ngOnInit(): void {
  }

}
