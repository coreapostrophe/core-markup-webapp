import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-deck-nav',
  templateUrl: './deck-tool.component.html',
  styleUrls: ['./deck-tool.component.scss']
})
export class DeckToolComponent implements OnInit {

  public searchBox = "";

  constructor() { }

  ngOnInit(): void {
  }

}
