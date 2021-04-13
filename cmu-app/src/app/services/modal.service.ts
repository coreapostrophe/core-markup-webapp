import {ComponentFactoryResolver, ComponentRef, EventEmitter, Injectable, Type, ViewContainerRef} from '@angular/core';
import {Subscription} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ModalService {
  private closeSubscription: Subscription;
  viewContainerRef: ViewContainerRef;
  isShowing = new EventEmitter<boolean>();

  constructor(private componentFactoryResolver: ComponentFactoryResolver) {
    this.isShowing.emit(false);
  }

  public createModal(component: Type<any>): void{
    const factory = this.componentFactoryResolver.resolveComponentFactory(component);

    this.isShowing.emit(true);
    this.viewContainerRef.clear();
    const componentRef: ComponentRef<any> = this.viewContainerRef.createComponent(factory);

    this.closeSubscription = componentRef.instance.close.subscribe(() => {
      this.closeSubscription.unsubscribe();
      this.viewContainerRef.clear();
      this.isShowing.emit(false);
    });
  }
}
