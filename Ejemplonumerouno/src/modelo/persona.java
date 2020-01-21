/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author antho
 */
public class persona {
    String nombres, apellidos,direccion;
    int cedula, edad,telefono;
    char genero;
    boolean estado_civil;

   

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(boolean estado_civil) {
        this.estado_civil = estado_civil;
    }

    public persona(String nombres, String apellidos, String direccion, int cedula, int edad, int telefono, char genero, boolean estado_civil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
        this.estado_civil = estado_civil;
    }    

    @Override
    public String toString() {
        return
            "nombre: " + this.getNombres();
    }
   
    
}

