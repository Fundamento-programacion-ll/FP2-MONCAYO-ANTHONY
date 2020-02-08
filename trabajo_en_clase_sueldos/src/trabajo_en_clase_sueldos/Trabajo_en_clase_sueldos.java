/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_sueldos;

import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Trabajo_en_clase_sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lista_persona l = new lista_persona();
        String salida="";
        l.setListapersonas();
        salida += "Lista Personas: \n"+l.toString();
        System.out.println(salida);
        
        l.ordenarPorNombreProvincia();
        salida += "Lista Personas por Nombre: \n"+l.toString();
        System.out.println(salida);
    }   
}