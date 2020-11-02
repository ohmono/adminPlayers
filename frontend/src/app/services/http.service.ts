import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Player } from '../models/player.model';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  private baseUrl: string = environment.BASE_API_URL;
  constructor(private readonly _http: HttpClient) { }

  public getPlayers() {
    return this._http.get<Player[]>(this.baseUrl + '/players');
  }

  public getPlayer(id: string) {
    return this._http.get<Player>(this.baseUrl + '/player/' + id);
  }

  public searchPlayer(query: string) {
    return this._http.get<Player[]>(this.baseUrl + '/player/search/' + query);
  }
  /*public createPlater(Player: Player){
    return this._http.post(this.baseUrl+ '/')
  }*/
}

