import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {TextEditorComponent} from "../editor/text-editor/text-editor.component";
import {DeckListComponent} from "./deck-list/deck-list.component";

const routes: Routes = [
  {
    path:'',
    component: DeckListComponent,
    children:[
      {path:'', component:DeckListComponent, pathMatch:'full'}
    ]
  }
];

@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports:[
    RouterModule
  ]
})

export class DeckToolRoutingModule{ }
