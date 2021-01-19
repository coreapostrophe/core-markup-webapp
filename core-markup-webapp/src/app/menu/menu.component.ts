import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  switchIsDecktool: boolean;
  menuCollapsed: boolean;

  constructor() {
    this.switchIsDecktool = false;
    this.menuCollapsed = true;
  }

  ngOnInit(): void {
  }

  onSwitch(event){
    this.switchIsDecktool = event.target.checked;
  }

  onMenuDropdown(event){
    this.menuCollapsed = !this.menuCollapsed;
  }
}
