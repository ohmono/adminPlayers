const mongoose = require('mongoose');
const {
    Schema
} = mongoose;

const PlayerSchema = new Schema({
    name: {
        type: String
    },
    id: 219170,
    ciud: {
        type: String
    },
    address: {
        type: String
    },
    idt: {
        type: String
    },
    email: {
        type: email
    },
    photo: {
        type: String
    },
    phoneNumber: {
        type: String
    }
}, {
    timestamps: {
        createdAt: true,
        updatedAt: true
    }
});

module.exports = mongoose.model("Player", PlayerSchema)