import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  switchIsDecktool: boolean;
  menuCollapsed: boolean;

  constructor(private route: Router) {
    this.switchIsDecktool = false;
    this.menuCollapsed = true;
  }

  ngOnInit(): void {
    this.updateSwitch();
  }

  onSwitch(event){
    this.switchIsDecktool = event.target.checked;
    this.updateSwitch()
  }

  updateSwitch(){
    if(this.switchIsDecktool == true){
      this.route.navigate(['/Decks']);
    } else {
      this.route.navigate(['/Editor']);
    }
  }

  onMenuDropdown(event){
    this.menuCollapsed = !this.menuCollapsed;
  }
}
