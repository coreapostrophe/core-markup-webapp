import {Component, OnInit, ViewChild} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {animate, state, style, transition, trigger} from "@angular/animations";
import {Card} from "../../models/card-model";

@Component({
  selector: 'app-deck-use',
  templateUrl: './deck-use.component.html',
  styleUrls: ['./deck-use.component.scss'],
  animations: [
    trigger('card', [
      state('in', style({
        opacity: 1,
        transform: 'Scale(1)'
      })),
      transition(':enter', [
        style({
          opacity: 0,
          transform: 'Scale(0.75)'
        }),animate("0.4s ease")
      ]),
      transition(':leave', [animate("0.4s ease",
        style({
          opacity: 0
        }))])
    ])
  ]
})
export class DeckUseComponent implements OnInit {

  @ViewChild('currentCard') currentCard;
  private allCards: Card[] = [
    {
      front: 'this is a sample front',
      back: 'this is a sample back',
      enumerable: false,
      headers: ''
    },
    {
      front: 'this is a sample front 2',
      back: 'this is a sample back',
      enumerable: false,
      headers: ''
    },
    {
      front: 'this is a sample front 3',
      back: 'this is a sample back',
      enumerable: false,
      headers: ''
    }
  ];
  domCard: Card[] = [];


  constructor(private route: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.swapCard(this.getRandomInt(this.allCards.length));
  }

  private getRandomInt(max){
    return Math.floor(Math.random()*Math.floor(max))
  }


  onRemember(){
    this.swapCard(this.getRandomInt(this.allCards.length));
  }

  onForget(){
    this.swapCard(this.getRandomInt(this.allCards.length));
  }

  private swapCard(i: number){
    if(this.domCard.length > 0){
      this.domCard = [];
    }
    this.domCard.push(this.allCards[i]);
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
