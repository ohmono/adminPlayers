const express = require('express');
const server = express();
const cors = require('cors');
const { Player } = require('../models')

// middlewares
server.use(express.json());
server.use(express.static(__dirname + '/../public'));
server.use(cors());


// routes
server.get('/api/players', async (req, res) => {
    let players = await Player.find();
    players = players.map((player) => {
        player.photo = `${req.protocol}://${req.headers.host}/img/${player.photo}`;
        return player
    })
    return res.send({
        error: false,
        data: players
    });
});

server.get('/api/player/:_id', async (req, res) => {
    const { _id } = req.params;
    let player = await Player.findById(_id);
    player.photo = `${req.protocol}://${req.headers.host}/img/${player.photo}`;

    return res.send({ error: false, data: player });
});

server.get('/api/player/search/:name', async (req, res) => {

    const { name } = req.params;

    let players = await Player.find({
        name: { $regex: new RegExp(name, 'i') }
    });

    players = players.map((player) => {
        player.photo = `${req.protocol}://${req.headers.host}/img/${player.photo}`;
        return player;
    });
    return res.send({
        error: false,
        data: players
    });
});

module.exports = server;