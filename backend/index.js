//encargado de conseguir nuestro server de su capa y va a inicializarlo

const server = require('./server');
const {
    PORT
} = require('./config');

server.listen(PORT, () => {
    console.log(`Players aplication running on port ${PORT}`);
})