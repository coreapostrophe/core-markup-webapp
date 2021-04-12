import {AfterViewInit, Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute, ActivatedRouteSnapshot, NavigationEnd, Router, UrlSegment} from '@angular/router';
import {filter, map} from 'rxjs/operators';
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

  menuLinksObject = [
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

  constructor(private router: Router, private route: ActivatedRoute) {
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
      this.router.navigate(['/Decks']);
    } else {
      this.router.navigate(['/Editor']);
    }
  }

  onMenuDropdown(): void{
    this.menuCollapsed = !this.menuCollapsed;
  }

  ngOnDestroy(): void {
    this.urlSubscription.unsubscribe();
  }
}
