import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {DeckListComponent} from "./deck-list/deck-list.component";

const routes: Routes = [
  {
    path:'',
    component: DeckListComponent,
    children:[]
  }
];

@NgModule({
  imports:[RouterModule.forChild(routes)],
  exports:[RouterModule]
})

export class DeckToolRoutingModule{ }
