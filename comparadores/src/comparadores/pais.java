/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;

/**
 *
 * @author antho
 */
public class pais {
    private ArrayList<provincias> listaprovincias;

    public ArrayList<provincias> getListaprovincias() {
        return listaprovincias;
    }

    public void setListaprovincias() {
        int op;
        provincias provincia;
        
        this.listaprovincias = listaprovincias;
    }

    public pais(ArrayList<provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }
    //aqui se inicializan las variables
    public pais() {
        this.listaprovincias = new ArrayList<>();
        
    }
    
    public void agregarprov (provincias p){
        
    this.listaprovincias.add(p);
    }

    @Override
    public String toString() {
        return "Los paises son "+ this.listaprovincias;
    }
    
    
    
}
