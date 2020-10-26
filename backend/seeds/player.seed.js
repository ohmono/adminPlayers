const mongoose = require('mongoose');
const server = mongoose;
const {
    MONGO_URI
} = require('../config');
const {
    Player
} = require('../models');

mongoose.connect(MONGO_URI, {
    useNewUrlParser: true
});
//nodejs hace in singleton y cada ves que llamamos una instancia se reconoce como el mismo objeto

const players = [{
        'name': 'Del Toro Arreola David',
        'id': 219170,
        'address': 'Calle1#3 - 02',
        'email': 'DelToro@clubdragones.com',
        'photo': 'DelTorophoto.jpg',
        'phoneNumber': '195418',
        'city': 'la Estrella',
        'idType': 'CC'
    },
    {
        'name': 'Delgado Bugarín Norma',
        'id': 45710,
        'address': 'Calle2#6 - 02',
        'email': 'DelgadoBugarín@clubdragones.com',
        'photo': 'DelgadoBugarínphoto.jpg',
        'phoneNumber': '134486',
        'city': 'Bello',
        'idType': 'TI'
    },
    {
        'name': 'Ferrer Chávez María Manuela',
        'id': 59266,
        'address': 'Calle3#9 - 02',
        'email': 'FerrerChávez@clubdragones.com',
        'photo': 'FerrerChávezphoto.jpg',
        'phoneNumber': '279774',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': ' Figueroa Salmorán Norma Nelia ',
        'id': 16838,
        'address': 'Calle4#12 - 02',
        'email': 'Figueroa@clubdragones.com',
        'photo': 'Figueroaphoto.jpg',
        'phoneNumber': '236027',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    },
    {
        'name': 'Figueroa Salmorán Rómulo Amadeo ',
        'id': 19630,
        'address': 'Calle5#15 - 02',
        'email': 'FigueroaSalmorán@clubdragones.com',
        'photo': 'FigueroaSalmoránphoto.jpg',
        'phoneNumber': '124884',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Figueroa Valle Jorge Alberto ',
        'id': 48580,
        'address': 'Calle6#18 - 02',
        'email': 'FigueroaValle@clubdragones.com',
        'photo': 'FigueroaVallephoto.jpg',
        'phoneNumber': '143008',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Báez Chávez Ángel Salvador',
        'id': 202570,
        'address': 'Calle7#21 - 02',
        'email': 'BáezChávez@clubdragones.com',
        'photo': 'BáezChávezphoto.jpg',
        'phoneNumber': '281081',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'Balderas Flores Luis Alberto',
        'id': 215902,
        'address': 'Calle8#24 - 02',
        'email': 'BalderasFlores@clubdragones.com',
        'photo': 'BalderasFloresphoto.jpg',
        'phoneNumber': '148069',
        'city': 'la Estrella',
        'idType': 'CC'
    },
    {
        'name': 'Ballesteros González Francisco',
        'id': 272708,
        'address': 'Calle9#27 - 02',
        'email': 'BallesterosGonzález@clubdragones.com',
        'photo': 'BallesterosGonzálezphoto.jpg',
        'phoneNumber': '15967',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Ballesteros Gutiérrez Rubio Raúl',
        'id': 146679,
        'address': 'Calle10#30 - 02',
        'email': 'BallesterosGutiérrez@clubdragones.com',
        'photo': 'BallesterosGutiérrezphoto.jpg',
        'phoneNumber': '81495',
        'city': 'Envigado',
        'idType': 'CC'
    },
    {
        'name': 'Baltazar Cedeño Laura Elizabeth',
        'id': 132545,
        'address': 'Calle11#33 - 02',
        'email': 'BaltazarCedeño@clubdragones.com',
        'photo': 'BaltazarCedeñophoto.jpg',
        'phoneNumber': '146742',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': 'Delgado Guajardo Héctor Federico',
        'id': 133332,
        'address': 'Calle12#36 - 02',
        'email': 'DelgadoGuajardo@clubdragones.com',
        'photo': 'DelgadoGuajardophoto.jpg',
        'phoneNumber': '18046',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Delgado Salgado Clemente',
        'id': 150511,
        'address': 'Calle13#39 - 02',
        'email': 'DelgadoSalgado@clubdragones.com',
        'photo': 'DelgadoSalgadophoto.jpg',
        'phoneNumber': '291559',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Díaz Cruz Carlos',
        'id': 265070,
        'address': 'Calle14#42 - 02',
        'email': 'DíazCruz@clubdragones.com',
        'photo': 'DíazCruzphoto.jpg',
        'phoneNumber': '180085',
        'city': 'Bello',
        'idType': 'TI'
    },
    {
        'name': 'Díaz Morfín Julio César',
        'id': 143474,
        'address': 'Calle15#45 - 02',
        'email': 'DíazMorfín@clubdragones.com',
        'photo': 'DíazMorfínphoto.jpg',
        'phoneNumber': '228318',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Díaz Núñez Juan Manuel',
        'id': 58016,
        'address': 'Calle18#5 - 23',
        'email': 'DíazNúñez@clubdragones.com',
        'photo': 'DíazNúñezphoto.jpg',
        'phoneNumber': '139486',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': 'Díaz Sánchez Julio Eduardo',
        'id': 178719,
        'address': 'Calle36#10 - 23',
        'email': 'DíazSánchez@clubdragones.com',
        'photo': 'DíazSánchezphoto.jpg',
        'phoneNumber': '188942',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Díaz Vivaldo José Vicente',
        'id': 93886,
        'address': 'Calle54#15 - 23',
        'email': 'DíazVivaldo@clubdragones.com',
        'photo': 'DíazVivaldophoto.jpg',
        'phoneNumber': '60196',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    },
    {
        'name': 'Domínguez Barrios Gabriel',
        'id': 265392,
        'address': 'Calle72#20 - 23',
        'email': 'DomínguezBarrios@clubdragones.com',
        'photo': 'DomínguezBarriosphoto.jpg',
        'phoneNumber': '73353',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': 'Domínguez Romo Gerardo',
        'id': 196101,
        'address': 'Calle90#25 - 23',
        'email': 'DomínguezRomo@clubdragones.com',
        'photo': 'DomínguezRomophoto.jpg',
        'phoneNumber': '71616',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Domínguez Velasco Miguel Ángel',
        'id': 99573,
        'address': 'Calle108#30 - 23',
        'email': 'DomínguezVelasco@clubdragones.com',
        'photo': 'DomínguezVelascophoto.jpg',
        'phoneNumber': '3491',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Duarte Briz Jesús Alfredo',
        'id': 266920,
        'address': 'Calle126#35 - 23',
        'email': 'DuarteBriz@clubdragones.com',
        'photo': 'DuarteBrizphoto.jpg',
        'phoneNumber': '1125',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Durán de Jesús Julián',
        'id': 211687,
        'address': 'Calle144#40 - 23',
        'email': 'Duránde@clubdragones.com',
        'photo': 'Durándephoto.jpg',
        'phoneNumber': '246402',
        'city': 'Bello',
        'idType': 'CC'
    },
    {
        'name': 'Durán San Vicente Raúl Edmundo',
        'id': 74424,
        'address': 'Calle162#45 - 23',
        'email': 'DuránSan@clubdragones.com',
        'photo': 'DuránSanphoto.jpg',
        'phoneNumber': '123388',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Gallegos Verdías Rosa Elena ',
        'id': 192285,
        'address': 'Calle180#50 - 23',
        'email': 'GallegosVerdías@clubdragones.com',
        'photo': 'GallegosVerdíasphoto.jpg',
        'phoneNumber': '220150',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Gamboa Banda Martín Ángel ',
        'id': 220655,
        'address': 'Calle198#55 - 23',
        'email': 'GamboaBanda@clubdragones.com',
        'photo': 'GamboaBandaphoto.jpg',
        'phoneNumber': '279142',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Garcés Yanome José de Jesús',
        'id': 278446,
        'address': 'Calle216#60 - 23',
        'email': 'GarcésYanome@clubdragones.com',
        'photo': 'GarcésYanomephoto.jpg',
        'phoneNumber': '209901',
        'city': 'Bello',
        'idType': 'CC'
    },
    {
        'name': ' García Beltrán Juan Carlos ',
        'id': 208488,
        'address': 'Calle234#65 - 23',
        'email': 'García@clubdragones.com',
        'photo': 'Garcíaphoto.jpg',
        'phoneNumber': '45446',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    },
    {
        'name': 'García Campos J. Elías ',
        'id': 116949,
        'address': 'Calle252#70 - 23',
        'email': 'GarcíaCampos@clubdragones.com',
        'photo': 'GarcíaCamposphoto.jpg',
        'phoneNumber': '201105',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'García Cancino Mario Francisco ',
        'id': 77332,
        'address': 'Calle270#75 - 23',
        'email': 'GarcíaCancino@clubdragones.com',
        'photo': 'GarcíaCancinophoto.jpg',
        'phoneNumber': '76489',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'García Cante Marcela Elizabhet ',
        'id': 243992,
        'address': 'Calle0#1 - 83',
        'email': 'GarcíaCante@clubdragones.com',
        'photo': 'GarcíaCantephoto.jpg',
        'phoneNumber': '226416',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'García Chávez Ricardo ',
        'id': 84589,
        'address': 'Calle9#2 - 83',
        'email': 'GarcíaChávez@clubdragones.com',
        'photo': 'GarcíaChávezphoto.jpg',
        'phoneNumber': '298508',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    },
    {
        'name': 'García García Iván ',
        'id': 298508,
        'address': 'Calle18#3 - 83',
        'email': 'GarcíaGarcía@clubdragones.com',
        'photo': 'GarcíaGarcíaphoto.jpg',
        'phoneNumber': '84589',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'García García Mario Alberto ',
        'id': 226416,
        'address': 'Calle27#4 - 83',
        'email': 'GarcíaGarcía@clubdragones.com',
        'photo': 'GarcíaGarcíaphoto.jpg',
        'phoneNumber': '243992',
        'city': 'Medellin',
        'idType': 'CC'
    },
    {
        'name': 'García González Miriam Aidé ',
        'id': 76489,
        'address': 'Calle36#5 - 83',
        'email': 'GarcíaGonzález@clubdragones.com',
        'photo': 'GarcíaGonzálezphoto.jpg',
        'phoneNumber': '77332',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    },
    {
        'name': 'ortés García Aristeo',
        'id': 201105,
        'address': 'Calle45#6 - 83',
        'email': 'ortésGarcía@clubdragones.com',
        'photo': 'ortésGarcíaphoto.jpg',
        'phoneNumber': '116949',
        'city': 'Bello',
        'idType': 'TI'
    },
    {
        'name': 'Cortés Ortiz Óscar Saúl',
        'id': 45446,
        'address': 'Calle54#7 - 83',
        'email': 'CortésOrtiz@clubdragones.com',
        'photo': 'CortésOrtizphoto.jpg',
        'phoneNumber': '208488',
        'city': 'Envigado',
        'idType': 'CC'
    },
    {
        'name': 'Cortés Santos José Eduardo',
        'id': 209901,
        'address': 'Calle63#8 - 83',
        'email': 'CortésSantos@clubdragones.com',
        'photo': 'CortésSantosphoto.jpg',
        'phoneNumber': '278446',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'Cortés Trujillo Natalia Esperanza',
        'id': 279142,
        'address': 'Calle72#9 - 83',
        'email': 'CortésTrujillo@clubdragones.com',
        'photo': 'CortésTrujillophoto.jpg',
        'phoneNumber': '220655',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Cortez Arias Baltazar',
        'id': 220150,
        'address': 'Calle81#10 - 83',
        'email': 'CortezArias@clubdragones.com',
        'photo': 'CortezAriasphoto.jpg',
        'phoneNumber': '192285',
        'city': 'la Estrella',
        'idType': 'CC'
    },
    {
        'name': 'Cruz Álvarez José Luis',
        'id': 123388,
        'address': 'Calle90#11 - 83',
        'email': 'CruzÁlvarez@clubdragones.com',
        'photo': 'CruzÁlvarezphoto.jpg',
        'phoneNumber': '74424',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': 'Cruz Carmona Sergio Ignacio',
        'id': 246402,
        'address': 'Calle99#12 - 83',
        'email': 'CruzCarmona@clubdragones.com',
        'photo': 'CruzCarmonaphoto.jpg',
        'phoneNumber': '211687',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Cruz García José Luis',
        'id': 1125,
        'address': 'Calle108#13 - 83',
        'email': 'CruzGarcía@clubdragones.com',
        'photo': 'CruzGarcíaphoto.jpg',
        'phoneNumber': '266920',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': 'Cruz González Héctor Alejandro',
        'id': 3491,
        'address': 'Calle117#14 - 83',
        'email': 'CruzGonzález@clubdragones.com',
        'photo': 'CruzGonzálezphoto.jpg',
        'phoneNumber': '99573',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Cruz Martínez Luis Abel',
        'id': 71616,
        'address': 'Calle126#15 - 83',
        'email': 'CruzMartínez@clubdragones.com',
        'photo': 'CruzMartínezphoto.jpg',
        'phoneNumber': '196101',
        'city': 'Medellin',
        'idType': 'CC'
    },
    {
        'name': 'Cuéllar Avendaño Patricia',
        'id': 73353,
        'address': 'Calle13#7 - 40',
        'email': 'CuéllarAvendaño@clubdragones.com',
        'photo': 'CuéllarAvendañophoto.jpg',
        'phoneNumber': '265392',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Cuéllar Díaz Jesús Arturo',
        'id': 60196,
        'address': 'Calle26#14 - 40',
        'email': 'CuéllarDíaz@clubdragones.com',
        'photo': 'CuéllarDíazphoto.jpg',
        'phoneNumber': '93886',
        'city': 'Bello',
        'idType': 'TI'
    },
    {
        'name': 'Cueto López Gilberto',
        'id': 188942,
        'address': 'Calle39#21 - 40',
        'email': 'CuetoLópez@clubdragones.com',
        'photo': 'CuetoLópezphoto.jpg',
        'phoneNumber': '178719',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Cuevas Nolasco José Luis',
        'id': 139486,
        'address': 'Calle52#28 - 40',
        'email': 'CuevasNolasco@clubdragones.com',
        'photo': 'CuevasNolascophoto.jpg',
        'phoneNumber': '58016',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'García Ledesma Juan Pablo',
        'id': 228318,
        'address': 'Calle65#35 - 40',
        'email': 'GarcíaLedesma@clubdragones.com',
        'photo': 'GarcíaLedesmaphoto.jpg',
        'phoneNumber': '143474',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': ' García López José Alfonso ',
        'id': 180085,
        'address': 'Calle78#42 - 40',
        'email': 'García@clubdragones.com',
        'photo': 'Garcíaphoto.jpg',
        'phoneNumber': '265070',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'Esquer Limón Cuauhtémoc ',
        'id': 291559,
        'address': 'Calle91#49 - 40',
        'email': 'EsquerLimón@clubdragones.com',
        'photo': 'EsquerLimónphoto.jpg',
        'phoneNumber': '150511',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Esquinca Gutiérrez José Rodulfo',
        'id': 18046,
        'address': 'Calle104#56 - 40',
        'email': 'EsquincaGutiérrez@clubdragones.com',
        'photo': 'EsquincaGutiérrezphoto.jpg',
        'phoneNumber': '133332',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': ' Esquivel Estrada Carlos ',
        'id': 146742,
        'address': 'Calle117#63 - 40',
        'email': 'Esquivel@clubdragones.com',
        'photo': 'Esquivelphoto.jpg',
        'phoneNumber': '132545',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'Estrada Torres Gilberto ',
        'id': 81495,
        'address': 'Calle130#70 - 40',
        'email': 'EstradaTorres@clubdragones.com',
        'photo': 'EstradaTorresphoto.jpg',
        'phoneNumber': '146679',
        'city': 'Sabaneta',
        'idType': 'CC'
    },
    {
        'name': 'Faz Mendoza Ma. Cira ',
        'id': 15967,
        'address': 'Calle143#77 - 40',
        'email': 'FazMendoza@clubdragones.com',
        'photo': 'FazMendozaphoto.jpg',
        'phoneNumber': '272708',
        'city': 'Santa Elena',
        'idType': 'TI'
    },
    {
        'name': 'Félix Brasil Jesús Arcadio',
        'id': 148069,
        'address': 'Calle156#84 - 40',
        'email': 'FélixBrasil@clubdragones.com',
        'photo': 'FélixBrasilphoto.jpg',
        'phoneNumber': '215902',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': ' Fernández Castillo Raúl ',
        'id': 281081,
        'address': 'Calle169#91 - 40',
        'email': 'Fernández@clubdragones.com',
        'photo': 'Fernándezphoto.jpg',
        'phoneNumber': '202570',
        'city': 'San antonio de Prado',
        'idType': 'CC'
    },
    {
        'name': 'Fernández del Río Ángel de Jesús',
        'id': 143008,
        'address': 'Calle182#98 - 40',
        'email': 'Fernándezdel@clubdragones.com',
        'photo': 'Fernándezdelphoto.jpg',
        'phoneNumber': '48580',
        'city': 'Envigado',
        'idType': 'CC'
    },
    {
        'name': ' Fernández Haggar María Enriqueta ',
        'id': 124884,
        'address': 'Calle195#105 - 40',
        'email': 'Fernández@clubdragones.com',
        'photo': 'Fernándezphoto.jpg',
        'phoneNumber': '19630',
        'city': 'Medellin',
        'idType': 'TI'
    },
    {
        'name': 'Fernández Martínez José ',
        'id': 236027,
        'address': 'Calle208#112 - 40',
        'email': 'FernándezMartínez@clubdragones.com',
        'photo': 'FernándezMartínezphoto.jpg',
        'phoneNumber': '16838',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': 'Ferreira Centeno Ángel Virgilio',
        'id': 279774,
        'address': 'Calle221#119 - 40',
        'email': 'FerreiraCenteno@clubdragones.com',
        'photo': 'FerreiraCentenophoto.jpg',
        'phoneNumber': '59266',
        'city': 'la Estrella',
        'idType': 'TI'
    },
    {
        'name': ' Ferrer Chávez María Manuela',
        'id': 134486,
        'address': 'Calle234#126 - 40',
        'email': 'Ferrer@clubdragones.com',
        'photo': 'Ferrerphoto.jpg',
        'phoneNumber': '45710',
        'city': 'Sabaneta',
        'idType': 'TI'
    },
    {
        'name': ' Figueroa Salmorán Norma Nelia',
        'id': 195418,
        'address': 'Calle247#133 - 40',
        'email': 'Figueroa@clubdragones.com',
        'photo': 'Figueroaphoto.jpg',
        'phoneNumber': '219170',
        'city': 'San antonio de Prado',
        'idType': 'TI'
    }
];



Player.create(players).then(() => {
    console.log("Players created");
    mosngoose.disconnect()

}).catch(console.log)