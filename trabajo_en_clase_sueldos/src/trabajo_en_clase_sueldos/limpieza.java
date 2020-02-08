/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_sueldos;

/**
 *
 * @author antho
 */
public class limpieza extends persona{
    
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public limpieza(String turno, String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        super(nombre, apellido, genero, edad, ci, sueldo);
        this.turno = turno;
    }

    public limpieza() {
    }
    
    @Override
    public int calcularsueldo() {
        return getSueldo();
    }

    @Override
    public String toString() {
        return "";
    }
    
    
}
