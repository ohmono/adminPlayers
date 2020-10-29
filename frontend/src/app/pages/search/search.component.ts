import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from 'src/app/services/http.service';
import { Player } from 'src/app/models/player.model';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  players: Player[] = [];
  query: string;
  constructor(private _activatedRoute: ActivatedRoute, private _httpService: HttpService) { }

  ngOnInit() {
    this._activatedRoute.params.subscribe(params => {
      this.query = params["query"];
      this._httpService.searchPlayer(this.query).subscribe((players: Player[]) => {
        this.players = players['data'];

      })
    })
  }

}
