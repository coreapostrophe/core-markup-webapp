import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-menu-links',
  templateUrl: './menu-links.component.html',
  styleUrls: ['./menu-links.component.scss']
})
export class MenuLinksComponent implements OnInit {

  menuLinksObject: {
    name: string,
    listItems: {
      label: string,
      onClick: () => void
    }[]
  }[] = [
    {name: 'File', listItems: [
        {label: 'New', onClick: this.onClick},
        {label: 'Open', onClick: this.onClick},
        {label: 'Save', onClick: this.onClick},
        {label: 'Save as', onClick: this.onClick},
      ]},
    {name: 'Edit', listItems: [
        {label: 'Paragraph Spacing', onClick: this.onClick},
        {label: 'Indentation', onClick: this.onClick},
        {label: 'Word Count', onClick: this.onClick},
        {label: 'Comments', onClick: this.onClick},
      ]},
    {name: 'View', listItems: [
        {label: 'Read Mode', onClick: this.onClick},
        {label: 'Zoom', onClick: this.onClick},
        {label: 'Properties', onClick: this.onClick},
      ]},
    {name: 'Help', listItems: [
        {label: 'About', onClick: this.onClick},
        {label: 'Feedback', onClick: this.onClick},
        {label: 'What\'s New', onClick: this.onClick},
      ]},
  ];

  onClick(): void{
    console.log('clicked!');
  }

  constructor() { }

  ngOnInit(): void {

  }

}
