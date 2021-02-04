import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DeckToolRoutingModule} from "./deck-tool-routing.module";
import { DeckListComponent } from './deck-list/deck-list.component';
import { DeckNavComponent } from './deck-nav/deck-nav.component';
import { DeckUseComponent } from './deck-use/deck-use.component';



@NgModule({
  declarations: [DeckListComponent, DeckNavComponent, DeckUseComponent],
    imports: [
        CommonModule,
        DeckToolRoutingModule
    ]
})
export class DeckToolModule { }
