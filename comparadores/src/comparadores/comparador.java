/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.Comparator;

/**
 *
 * @author antho
 */
public class comparador implements Comparator{

    int comparadornom;
    provincias provincias1, provincia2;
    
    @Override
    public int compare(Object pro1, Object pro2) {
        provincias1=(provincias) pro1;
        provincia2= (provincias) pro2;
        comparadornom = (provincias1.getNombre()).compareToIgnoreCase(provincia2.getNombre());
        return comparadornom;
    }    
}
