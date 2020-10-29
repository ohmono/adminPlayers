import { Component, OnInit } from '@angular/core';
import { HttpService } from 'src/app/services/http.service';
import { Player } from 'src/app/models/player.model';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent implements OnInit {
  public players: Player[];
  constructor(private _httpService: HttpService) { }

  ngOnInit() {

    this._httpService.getPlayers().subscribe((players: Player[]) => {
      this.players = players["data"];
    });
  }

}
