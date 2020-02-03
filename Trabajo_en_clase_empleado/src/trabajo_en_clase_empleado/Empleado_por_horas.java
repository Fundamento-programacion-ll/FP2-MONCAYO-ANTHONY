/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_empleado;

/**
 *
 * @author antho
 */
public class Empleado_por_horas extends Empleado{
    
    private double sueldo, horas;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public Empleado_por_horas(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public Empleado_por_horas(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public Empleado_por_horas() {
    }
    
    
    
}
