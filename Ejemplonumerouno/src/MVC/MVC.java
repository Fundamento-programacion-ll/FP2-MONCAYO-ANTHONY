/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import modelo.persona;
import vista.usuario;

/**
 *
 * @author antho
 */
public class MVC {
    public static void main(String[] args) {
        usuario inicio = new usuario();
        
        
        persona Juana = new persona("Juana","Jimenez","1750420117","0987181053", "Carcelen", 0,'m', true);
        persona Juan = new persona("Juana","Jimenez","1750420117","0987181053", "Carcelen", 0,'m', true);
        persona Juanes = new persona("Juana","Jimenez","1750420117","0987181053", "Carcelen", 0,'m', true);
        
        //System.err.println(Juana);
        
        inicio.menu();
        
    }
    
    
}
