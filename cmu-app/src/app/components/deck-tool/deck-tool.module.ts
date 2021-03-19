import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DeckToolRoutingModule} from "./deck-tool-routing.module";
import { DeckListComponent } from './deck-list/deck-list.component';
import { DeckToolComponent } from './deck-tool.component';
import { DeckViewerComponent } from './deck-viewer/deck-viewer.component';
import {FormsModule} from "@angular/forms";



@NgModule({
  declarations: [DeckListComponent, DeckToolComponent, DeckViewerComponent],
  imports: [
    CommonModule,
    DeckToolRoutingModule,
    FormsModule
  ]
})
export class DeckToolModule { }
