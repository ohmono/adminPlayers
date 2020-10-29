import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from 'src/app/services/http.service';
import { Player } from 'src/app/models/player.model';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {
  public player: Player = {
    name: '',
    _id: '',
    city: '',
    address: '',
    idType: '',
    email: '',
    photo: '',
    phoneNumber: '',
    bornDate: '',
    createdAt: null,
    updatedAt: null
  };

  constructor(private _activatedRoute: ActivatedRoute, private _httpService: HttpService) { }

  ngOnInit() {
    this._activatedRoute.params.subscribe(params => {
      const id = params['id'];
      this._httpService.getPlayer(id).subscribe((player: Player) => {
        this.player = player['data']
      })
    })
  }

}

