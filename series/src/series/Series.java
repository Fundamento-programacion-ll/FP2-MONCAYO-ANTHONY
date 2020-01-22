/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num =0;
        int opc=0;
        metodos met = new metodos();
        serie s = new serie(num);
        
        
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Ingrese un número"); 
        num = sc.nextInt();
        s.setNumero(num);
        
        System.out.println("El resultado es: "+ met.ejercicio(num));
            System.out.println("Desea ingresar otro numero \n Si=>1 No=>0");
            opc = sc.nextInt();
        }while (opc!=0);
        
    }
    
    
}
