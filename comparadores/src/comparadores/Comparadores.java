/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author antho
 */
public class Comparadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String salida = "";
        provincias pr = new provincias();
        pais pa  = new pais();
        pa.setListaprovincias();
        salida += "Lista Provincias: \n "+ pa.toString();
        System.out.println(salida);
        
    }
    
}
