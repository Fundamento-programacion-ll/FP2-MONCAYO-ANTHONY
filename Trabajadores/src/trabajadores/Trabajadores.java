/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;


import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Trabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        fecha f= new fecha();
        empleado em = new empleado();
        
        int numemp = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuantos empleados va a ingresar :"));
        em.ingresarempleados(numemp);
        em.listaempleados();
        
        
    }
    
}
