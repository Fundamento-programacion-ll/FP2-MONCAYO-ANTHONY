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
public class administrativo extends persona{
    
    private String area;
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public administrativo(String area, String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        super(nombre, apellido, genero, edad, ci, sueldo);
        this.area = area;
    }

    public administrativo() {
    }

    
    
    @Override
    public int calcularsueldo() {
        
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
}
