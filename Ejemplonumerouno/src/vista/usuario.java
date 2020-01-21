/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.user;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class usuario {
    user metodos = new user();
    
    public void menu(){
    
        int opcion =0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n"+"1. Agregar persona\n"+"2. Listar personas\n"
                +"3. Salir\n",this ));
    do {
    switch (opcion){
    
        case 1 :
            String nombre = JOptionPane.showInputDialog(null,"Ingrese un nombre");
            metodos.agregarpersona(nombre);
            System.out.println(metodos.ListarPersona());
            break;
        case 2 :
            System.out.println("Hola");
            System.out.println(metodos.ListarPersona());
            
            break;
            
        case 3 :
            
            opcion =3;
            break;
            
        default:
            opcion =3;
            
            break;
    }
    }while(opcion !=3);
    }
    
    
}
