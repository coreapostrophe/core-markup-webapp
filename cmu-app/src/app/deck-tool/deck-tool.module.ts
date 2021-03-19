import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DeckToolRoutingModule} from "./deck-tool-routing.module";
import { DeckListComponent } from './deck-list/deck-list.component';
import { DeckNavComponent } from './deck-nav/deck-nav.component';
import { DeckUseComponent } from './deck-use/deck-use.component';
import {FormsModule} from "@angular/forms";



@NgModule({
  declarations: [DeckListComponent, DeckNavComponent, DeckUseComponent],
  imports: [
    CommonModule,
    DeckToolRoutingModule,
    FormsModule
  ]
})
export class DeckToolModule { }
