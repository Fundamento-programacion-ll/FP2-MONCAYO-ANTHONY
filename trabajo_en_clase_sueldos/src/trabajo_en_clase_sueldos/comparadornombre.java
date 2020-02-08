/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_sueldos;

import java.util.Comparator;

/**
 *
 * @author antho
 */
public class comparadornombre implements Comparator{
    
    int compararNombre;
    persona per1, per2;

    @Override
    public int compare(Object t, Object t1) {
        per1 = (persona)t;
        per2 = (persona)t1;
        if (per1.getSueldo()
                > per2.getSueldo()) {
            compararNombre = 1;
        } else {
            compararNombre =  -1;
        }       
        return compararNombre;
    }
    
}
