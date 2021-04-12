import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-tools-panel',
  templateUrl: './tools-panel.component.html',
  styleUrls: ['./tools-panel.component.scss']
})
export class ToolsPanelComponent implements OnInit {

  toolPanelObject: {
    name: string,
    toolItems: {
      src: string,
      onClick: () => void
    }[]
  }[] = [
    {name: 'Generate', toolItems: [
        {src: 'assets/svg/icon-question.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-enumerable.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-details.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-header-up.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-header-down.svg', onClick: this.onClick},
      ]},
    {name: 'Utility', toolItems: [
        {src: 'assets/svg/icon-save.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-save-as.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-open.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-preferences.svg', onClick: this.onClick}
      ]},
  ];

  onClick(): void{
    console.log('clicked!')
  }

  constructor() { }

  ngOnInit(): void {
  }
}
