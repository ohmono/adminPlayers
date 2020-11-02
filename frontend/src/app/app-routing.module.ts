import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { PlayersComponent } from './pages/players/players.component';
import { PlayerComponent } from './pages/player/player.component';
import { SearchComponent } from './pages/search/search.component';
import { CreateComponent } from './pages/create/create.component';

const routes: Routes = [{
  path: 'home', component: HomeComponent
}, {
  path: 'about', component: AboutComponent
}, {
  path: 'players', component: PlayersComponent
}, {
  path: 'player/:id', component: PlayerComponent
}, {
  path: 'search/:query', component: SearchComponent
}, {
  path: 'create', component: CreateComponent
}, {
  path: '**', pathMatch: 'full', redirectTo: 'home'
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
