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
public class Trabajo_en_clase_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado_Asalariado p = new Empleado_Asalariado(32, "nombre", "apellido", 120);
        System.out.println(p);
        
        Empleador_comision e = new Empleador_comision(320, 430, "nombre", "apellido", 320);
        System.out.println(e);
        
        Empleado_por_horas h = new Empleado_por_horas(210, 320, "nombre", "apellido", 320);
        System.out.println(h);
        
        Empleado_base_mas_comision b = new Empleado_base_mas_comision(210, 320, 2310);
        System.out.println(b);
    }
    
}
