var arreglo = {

}
var arreglojson = [{
    nombre: 'anthony',
    apellido: 'moncayo',
    edad: 21
}, {
    nombre: 'juan',
    apellido: 'monca',
    edad: 25
}, {
    nombre: 'nicolas',
    apellido: 'monyo',
    edad: 22
}, {
    nombre: 'maria',
    apellido: 'mayo',
    edad: 27
}, {
    nombre: 'juana',
    apellido: 'moayo',
    edad: 26
}];
var buscarusuario = (arreglojson, usuariobuscar) => {
    var usuarioencontrado = arreglojson.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    console.log(usuarioencontrado);
};
buscarusuario(arreglojson, ('anthony'));
//agregar usuario

var nuevousuario = (arreglojson, n, a, e) => {
    var nuevo = {
        nombre: n,
        apellido: a,
        edad: e
    }
    return arreglojson.push(nuevo);
};
nuevousuario(arreglojson, ("anthony"), ("moncayo "), (27));


//buscar usuario
var buscarusuarion = (arreglojson, usuariobuscar) => {
    var usuarioencontrado = arreglojson.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    if (usuarioencontrado === undefined) {
        nuevousuario(arreglojson, (usuariobuscar), ("nuevoapellido"), (27));

    } else {
        console.log(usuarioencontrado);
    }

};
buscarusuarion(arreglojson, ('dsa'));
console.log(arreglojson);
//eliminar usuario

var eliminarusuario = ((arreglojson, u) => {
    var usuarioencontrado = arreglojson.find((usuario) => {
        return usuario.nombre !== u;
    });
    console.log(usuarioencontrado);
});

console.log(arreglojson);