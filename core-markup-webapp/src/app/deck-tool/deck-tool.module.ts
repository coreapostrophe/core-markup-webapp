import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DeckToolRoutingModule} from "./deck-tool-routing.module";
import { DeckListComponent } from './deck-list/deck-list.component';



@NgModule({
  declarations: [DeckListComponent],
    imports: [
        CommonModule,
        DeckToolRoutingModule
    ]
})
export class DeckToolModule { }
