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
        
        float r,l, b,a;
        Circulo cir = new Circulo();
        trinagulo tr = new trinagulo();
        cuadrado cuad = new cuadrado();
        int opc = 0;
        int opc2;
        int op2;
        do{
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n1. Circulo \n2. Triángulo \n 3. Cuadrado"));
        switch(opc) {
            case 1:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("MENU \n Circulo \n"
                    + "1. Area \n"
                    + "2. Circunferencia \n"));
                      switch (op2){
                         case 1:
                             r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                             cir.setRadio(r);
                             cir.resultadoA();
                             break;
                         case 2:
                             r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                             cir.setRadio(r);
                             cir.resultadoC();
                             break;
                         default:
                             System.out.println("No está disponible esa opcion");
                             break;
                      }
                break;
                
            case 2:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("MENU \n Triangulo \n"
                    + "1. Area \n"
                    + "2. Volumen \n"
                    + "3. Perimetro \n"));
                      switch (op2){
                        case 1:
                             b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Base"));
                             a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Altura"));
                             tr.setBase(b);
                             tr.setAltura(a);
                             tr.resultadoAT();
                             break;
                        case 2:
                             b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                             a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Altura"));
                             tr.setBase(b);
                             tr.setAltura(a);
                             tr.resultadoVT();
                             break;
                        case 3:
                             l=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
                             tr.setLado(l);
                             tr.resultadoPT();
                             break;
                        default:
                             System.out.println("No está disponible esa opcion");
                             break;
                      }
                break;
            case 3:
                    System.out.println("Ingrese el radio del Triángulo");
                break;
            default:
                    JOptionPane.showMessageDialog(null, "Opción no Válida", "FAIL", JOptionPane.ERROR_MESSAGE);
                break;
        }
                    opc2 =JOptionPane.showConfirmDialog(null, "Desea ingresar otra figura");
        }while (opc2==0);
    }
    
}
