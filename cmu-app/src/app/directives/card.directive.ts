import {Directive, ElementRef, HostListener, Inject, Input} from '@angular/core';
import {DOCUMENT} from "@angular/common";

@Directive({
  selector: '[appCard]'
})
export class CardDirective {

  constructor(private el: ElementRef) {}

}
