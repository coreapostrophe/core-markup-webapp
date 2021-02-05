import {Component, OnInit, ViewChild} from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-deck-use',
  templateUrl: './deck-use.component.html',
  styleUrls: ['./deck-use.component.scss']
})
export class DeckUseComponent implements OnInit {

  @ViewChild('currentCard') currentCard;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {

  }


  onMouseEnterRemember(){
    this.currentCard.nativeElement.classList.add("current-card-rot_remember");
  }

  onMouseLeaveRemember(){
    this.currentCard.nativeElement.classList.remove("current-card-rot_remember");
  }

  onMouseEnterForgot(){
    this.currentCard.nativeElement.classList.add("current-card-rot_forgot");
  }

  onMouseLeaveForgot(){
    this.currentCard.nativeElement.classList.remove("current-card-rot_forgot");
  }
}
