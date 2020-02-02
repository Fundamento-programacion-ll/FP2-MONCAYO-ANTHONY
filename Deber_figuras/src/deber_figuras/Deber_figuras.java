/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_figuras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Deber_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int r =0;
        int b,a;
        
        System.out.println("Menu");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int opc = 0;
        
        int opc2;
        do{
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n1. Circulo \n2. Triángulo \n 3. Cuadrado"));
        switch(opc) {
            case 1:
                System.out.println("Ingrese el radio del circulo");
                
                break;
            case 2:
                      System.out.println("Ingrese el radio del Cuadrado");
                break;
            case 3:
                      System.out.println("Ingrese el radio del Triángulo");
                break;
            default:
                      System.out.println("Opción no Válida");
                break;
        }
            opc2 =JOptionPane.showConfirmDialog(null, "Desea ingresar otra figura");
        }while (opc2==0);
    }
    
}
