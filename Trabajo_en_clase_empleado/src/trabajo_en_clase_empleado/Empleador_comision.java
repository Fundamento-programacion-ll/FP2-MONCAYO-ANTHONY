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
public class Empleador_comision extends Empleado{
    
    private double ventas_brutas,tarifa_comision;

    public double getVentas_brutas() {
        return ventas_brutas;
    }

    public void setVentas_brutas(double ventas_brutas) {
        this.ventas_brutas = ventas_brutas;
    }

    public double getTarifa_comision() {
        return tarifa_comision;
    }

    public void setTarifa_comision(double tarifa_comision) {
        this.tarifa_comision = tarifa_comision;
    }

    public Empleador_comision(double ventas_brutas, double tarifa_comision) {
        this.ventas_brutas = ventas_brutas;
        this.tarifa_comision = tarifa_comision;
    }

    public Empleador_comision(double ventas_brutas, double tarifa_comision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.ventas_brutas = ventas_brutas;
        this.tarifa_comision = tarifa_comision;
    }

    public Empleador_comision() {
    }

    @Override
    public double calcular_ingresos() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado: \n Nombre: "+ getNombre()+ " Apellido: "+ getApellido()+ "Salario semanal: "+ getTarifa_comision(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
