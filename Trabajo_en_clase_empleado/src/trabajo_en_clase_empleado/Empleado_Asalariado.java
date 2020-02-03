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
public class Empleado_Asalariado extends Empleado{
    
    private double Salario_semanal;

    public double getSalario_semanal() {
        return Salario_semanal;
    }

    public void setSalario_semanal(double Salario_semanal) {
        this.Salario_semanal = Salario_semanal;
    }

    public Empleado_Asalariado(double Salario_semanal) {
        this.Salario_semanal = Salario_semanal;
    }

    public Empleado_Asalariado(double Salario_semanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.Salario_semanal = Salario_semanal;
    }

    public Empleado_Asalariado() {
    }

    
    
}
