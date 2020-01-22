/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

/**
 *
 * @author antho
 */
public class metodos {
    
    
    public int ejercicio (int numero){
        serie s = new serie(numero);
       
       int suma=1;
       
        for (int i = 0; i <s.getNumero(); i++) {
            suma =suma*2;    
        }
    return suma;
    }
    
}
