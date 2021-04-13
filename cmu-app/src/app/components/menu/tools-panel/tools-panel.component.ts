import {AfterViewInit, Component, OnDestroy, OnInit} from '@angular/core';
import {NavigationEnd, Router} from '@angular/router';
import {Subscription} from 'rxjs';
import {filter} from 'rxjs/operators';
import ToolsPanelModel from '$app/models/tools-panel-model';
import EditorToolsPanel from '$app/components/menu/tools-panel/tools-list/EditorToolsPanel';

@Component({
  selector: 'app-tools-panel',
  templateUrl: './tools-panel.component.html',
  styleUrls: ['./tools-panel.component.scss']
})
export class ToolsPanelComponent implements OnInit, AfterViewInit, OnDestroy {

  private urlSubscription: Subscription;

  toolPanelObject: ToolsPanelModel[];

  editorToolsPanel = new EditorToolsPanel();

  constructor(private router: Router) {
    this.toolPanelObject = [];
  }

  ngAfterViewInit(): void {
    this.urlSubscription = this.router.events.pipe(
      filter((event) => event instanceof NavigationEnd))
      .subscribe(event => {
        const currentUrl = event[('url')];
        if (currentUrl === '/Editor'){
          this.toolPanelObject = this.editorToolsPanel.toolPanelObject;
        } else {
          this.toolPanelObject = [];
        }
      });
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }
}
