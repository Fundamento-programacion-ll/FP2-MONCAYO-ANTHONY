var json1 = {

    nombre: "juan",
    apellido: "gonzales",
    edad: 21,
    casado: true,
    mascota: ['cachetes'],

    colegio: [
        'Don Bosco',
        0987574632
    ]

};


var a = 'aaa';
letv = 21;

var jsonanth = {

    nombre: 'anthony',
    apellido: 'moncayo'
}

console.log("Nombre:");
console.log(jsonanth.nombre, jsonanth.apellido);
var jsonsuma = {
    a: 1,
    b: 2
}
var n1 = 1;
var bool = false;
var string = "hola";
vard = 0;

console.log("suma");
console.log(jsonsuma.a + jsonsuma.b);
console.log("suma de lo que sea");
console.log(undefined + false);
console.log(undefined + "dasdsadsa");

var mifunction = function() {
    console.log('function 1');
    return 12;
};

var miifunction = function(n1, n2) {
    return n1 + n2;

};
console.log(mifunction());
console.log(miifunction(1, 2));

var jsondunciones = {

    var: suma = function(n1, n2) {
        return n1 + n2;
    },
    var: resta = function(n1, n2) {
        return n1 - n2;
    },
    var: multiplicacion = function(n1, n2) {
        return n1 * n2;
    },
    var: div = function(n1, n2) {
        return n1 / n2;
    }
};
console.log("suma");
console.log(suma(1, 1));
console.log("resta");
console.log(resta(2, 1));
console.log("mul");
console.log(multiplicacion(1, 2));
console.log("div");
console.log(div(4, 2));