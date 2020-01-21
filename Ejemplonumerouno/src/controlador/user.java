/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author antho
 */
public class user {
    
    ArrayList listapersonas = new ArrayList<String>();
    
    public String agregarpersona (String nombre){
    
        listapersonas.add(nombre);
        return "persona agregada, "+ nombre;
    }
    
    public String ListarPersona (){  
        String lista="";
        //for (Object persona: listapersonas) {
          //  System.out.print(persona);
        //}
        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println(listapersonas.get(i));
            lista += listapersonas.get(i).toString()+"\n";
        }
        
    return lista;
    }
    
    
}
