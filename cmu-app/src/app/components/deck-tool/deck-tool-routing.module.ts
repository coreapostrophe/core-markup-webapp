import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {DeckToolComponent} from './deck-tool.component';
import {DeckListComponent} from './deck-list/deck-list.component';
import {DeckViewerComponent} from './deck-viewer/deck-viewer.component';

const routes: Routes = [
  {
    path: '',
    component: DeckToolComponent,
    children: [
      {path: '', pathMatch: 'full', redirectTo: 'List'},
      {path: 'List', component: DeckListComponent},
      {path: 'Flashcard/:id', component: DeckViewerComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class DeckToolRoutingModule{ }
