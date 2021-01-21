import {Directive, ElementRef, HostListener, Inject, Input} from '@angular/core';
import {DOCUMENT} from "@angular/common";

@Directive({
  selector: '[appDropdown]'
})
export class DropdownDirective {

  private contentElement;

  @Input('dropdown-content') dropdownContent: string;

  constructor(private el: ElementRef, @Inject(DOCUMENT) private document: Document) {}

  @HostListener('click') onClick(){
    if(this.contentElement == null){
      this.contentElement = this.document.getElementById(this.dropdownContent);
    }
    this.toggleDropdown();
  }

  private toggleDropdown(){
    if(this.contentElement.style.display == 'none'){
      this.contentElement.style.display = 'block';
    } else {
      this.contentElement.style.display = 'none';
    }
  }
}
