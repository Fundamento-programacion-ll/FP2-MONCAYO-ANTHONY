/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_sueldos;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class lista_persona {
    
    private ArrayList <persona> listapersonas;

    public lista_persona() {
        this.listapersonas = new ArrayList<>();
    }

    public lista_persona(ArrayList<persona> listaperson) {
        this.listapersonas = listaperson;
    }

    public ArrayList<persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas() {
    int opcion ;
        persona per;
        do {            
            per = new persona();
            agregarProvincia(per);
            opcion = JOptionPane.showConfirmDialog(null, "Desea agregar mas personas");
        } while (opcion==0);
        
    }
    
    
    public void agregarProvincia(persona provincia){
        this.listapersonas.add(provincia);
    }
    
    
    public void ordenarPorNombreProvincia(){
        // ordenar la lista de objetos por el nombre
        Collections.sort(listapersonas, new Comparadorsueldo());
    }
    
    /*
    public void ordenarPorNumero(){
        // ordenar la lista de objetos por el nombre
        Collections.sort(listaProvincias, new comparadorHabitantes());
    }*/
    

    @Override
    public String toString() {
        return "Lista personas \n"+this.listapersonas;
    }

}
