/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author antho
 */
public class Gato extends animal{
    private float estatura;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public Gato(float estatura) {
        this.estatura = estatura;
    }

    public Gato(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }

    public Gato() {
    }
    public void datos (){
        System.out.println("Nombre: "+ getNombre()+ "Edad: "+ getEdad()+ "genero "+ getGenero());
    }
    
}
