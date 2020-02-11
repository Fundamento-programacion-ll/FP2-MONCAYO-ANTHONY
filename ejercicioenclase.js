var nombre = "anthony dsa";
var a = "";
var lo = nombre.length;
console.log(nombre.length); //longitud de la palabra
console.log(nombre.indexOf('a')); //posicion de la letra
console.log(nombre.substring(2, 4))
console.log(nombre.search('ny'));

console.log(nombre.charAt(6));

while (lo >= 0) {
    a += nombre.charAt(lo);
    console.log(a);
    lo--;
}
var nu = 9;
console.log(nombre.slice(1, -7));
console.log(nombre.slice(1, 6));
console.log(nombre.split(" "));
var texto = "ha mundo hoa hoa mundo";
console.log("antes de remplazar:", texto);
console.log("despues de reemplazar ");
var lg = texto.length;
while (lg >= 0) {
    var texmod = texto.replace("mundo", "hola");
    lg--;
}


console.log(texmod);
var tex2 = "       hola mundo dos       ";
console.log(tex2);
console.log(tex2.trim());
console.log(texto.concat("", nombre));
console.log(texto.localeCompare("hola"));
console.log(texto.toLowerCase());