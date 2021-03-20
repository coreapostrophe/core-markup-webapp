import {Directive, ElementRef, HostListener, Inject, Input} from '@angular/core';
import {DOCUMENT} from "@angular/common";

@Directive({
  selector: '[appDropdown]'
})
export class DropdownDirective {

  private contentElement;

  @Input('dropdown-content') dropdownContent: string;

  constructor(private el: ElementRef, @Inject(DOCUMENT) private document: Document) {}

  @HostListener('click') onClick(): void{
    this.contentElement = this.document.getElementById(this.dropdownContent);
    this.toggleDropdown();
  }

  @HostListener('focusout') onFocusOut(): void{
    this.contentElement.style.display = 'none';
  }

  private toggleDropdown(): void{
    this.contentElement.style.display = (this.contentElement.style.display != 'block') ? 'block' : 'none';
  }
}
