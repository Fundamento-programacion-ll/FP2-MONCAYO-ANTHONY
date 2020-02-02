/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perrito = new Perro(1, "perro", "macho","Firulais", 1);
        Gato gatito = new Gato(1, "perro", "macho","Firulais", 1);
        System.out.println("Ingrese el numero 1 y numero 2");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
                
        perrito.datos(num1,num2);
       
        gatito.datos();
        
         ;
    }
    
}
