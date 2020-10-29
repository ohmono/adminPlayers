//encargado de conseguir nuestro server de su capa y va a inicializarlo

const server = require("./server");

const {
  PORT,
  MONGO_URI
} = require("./config");

const mongoose = require("mongoose");

mongoose
  .connect(MONGO_URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  }).then(() => {
    server.listen(PORT, () => {
      console.log(`Players aplication running on port ${PORT}`);
    });
  }).catch(console.log);