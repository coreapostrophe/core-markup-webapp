import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-menu-links',
  templateUrl: './menu-links.component.html',
  styleUrls: ['./menu-links.component.scss']
})
export class MenuLinksComponent implements OnInit {
  @Input() menuLinksObject: {
    name: string,
    listItems: {
      label: string,
      onClick: () => void
    }[]
  }[];

  constructor() { }

  ngOnInit(): void {

  }

}
