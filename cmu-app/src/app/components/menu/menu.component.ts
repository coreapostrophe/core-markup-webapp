import {AfterViewInit, Component, OnDestroy} from '@angular/core';
import {NavigationEnd, Router} from '@angular/router';
import {filter} from 'rxjs/operators';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements AfterViewInit, OnDestroy {
  urlSubscription: Subscription;
  isDecktool: boolean;
  menuCollapsed: boolean;

  constructor(private router: Router) {
    this.isDecktool = false;
    this.menuCollapsed = true;
  }

  ngAfterViewInit(): void {

    this.urlSubscription = this.router.events.pipe(
      filter((event) => event instanceof NavigationEnd))
      .subscribe( event => {
        const currentUrl = event[('url')];
        this.isDecktool = (currentUrl !== '/Editor');
      }
    );
  }

  onSwitch(): void{
    this.isDecktool = !this.isDecktool;
    if (this.isDecktool === true){
      this.router.navigate(['/Decks']).then(r => r);
    } else {
      this.router.navigate(['/Editor']).then(r => r);
    }
  }

  onMenuDropdown(): void{
    this.menuCollapsed = !this.menuCollapsed;
  }

  ngOnDestroy(): void {
    this.urlSubscription.unsubscribe();
  }
}
