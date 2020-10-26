const mongoose = require('mongoose');
const {
    Schema
} = mongoose;

const PlayerSchema = new Schema({
    name: {
        type: String
    },
    id: {
        type: Number
    },
    city: {
        type: String
    },
    address: {
        type: String
    },
    idType: {
        type: String
    },
    email: {
        type: String
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

module.exports = mongoose.model("Player", PlayerSchema);