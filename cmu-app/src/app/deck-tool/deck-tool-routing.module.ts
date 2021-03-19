import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {DeckNavComponent} from "./deck-nav/deck-nav.component";
import {DeckListComponent} from "./deck-list/deck-list.component";
import {DeckUseComponent} from "./deck-use/deck-use.component";

const routes: Routes = [
  {
    path:'',
    component: DeckNavComponent,
    children:[
      {path:'', pathMatch:'full', redirectTo:'List'},
      {path:'List', component: DeckListComponent},
      {path:'Flashcard/:id', component: DeckUseComponent}
    ]
  }
];

@NgModule({
  imports:[RouterModule.forChild(routes)],
  exports:[RouterModule]
})

export class DeckToolRoutingModule{ }
