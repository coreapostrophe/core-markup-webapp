import {Component, OnDestroy, OnInit, ViewChild} from '@angular/core';
import {ModalDirective} from '$app/directives/modal.directive';
import {ModalService} from '$app/services/modal.service';
import {Subscription} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit, OnDestroy{
  @ViewChild(ModalDirective, { static: true }) private modalHost: ModalDirective;

  private modalShowingSubscription: Subscription;
  title = 'cmu-app';
  modalShowing: boolean;

  constructor(private modalService: ModalService) {
  }

  ngOnInit(): void {
    this.modalService.viewContainerRef = this.modalHost.viewContainerRef;
    this.modalShowingSubscription = this.modalService.isShowing.subscribe((value)=>{
      this.modalShowing = value;
    });
  }

  ngOnDestroy(): void {
    this.modalShowingSubscription.unsubscribe();
  }
}
