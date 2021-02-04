import {AfterViewInit, Component, OnDestroy} from '@angular/core';
import {NavigationEnd, Router} from "@angular/router";
import {filter} from "rxjs/operators";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements AfterViewInit, OnDestroy {

  switchIsDecktool: boolean;
  menuCollapsed: boolean;
  currentUrl: string;
  urlSubscription: Subscription;

  constructor(private router: Router) {
    this.switchIsDecktool = false;
    this.menuCollapsed = true;
  }

  ngAfterViewInit() {
    this.urlSubscription = this.router.events.pipe(
      filter((event) => event instanceof NavigationEnd))
      .subscribe( x=> {
        this.currentUrl = x['url'];
        if(this.currentUrl.slice(0,6) === '/Decks'){
          this.switchIsDecktool = true;
        }
        else if(this.currentUrl.slice(0,7) === '/Editor'){
          this.switchIsDecktool = false;
        }
      }
    );
  }

  onSwitch(){
    this.switchIsDecktool = !this.switchIsDecktool;
    if(this.switchIsDecktool == true){
      this.router.navigate(['/Decks']);
    } else {
      this.router.navigate(['/Editor']);
    }
  }

  onMenuDropdown(){
    this.menuCollapsed = !this.menuCollapsed;
  }

  ngOnDestroy() {
    this.urlSubscription.unsubscribe();
  }
}
