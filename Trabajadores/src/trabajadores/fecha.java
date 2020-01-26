/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author antho
 */
public class fecha {
    
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = new GregorianCalendar();
    
    int dia ;
    int mes;
    int anio;
    int ultdia;
    
    
    public int getDia() {
        dia =  c2.get(Calendar.DATE);
        return dia;
    }

    public void setDia(int dia) {
        
        this.dia = dia;
    }
    
    public int getMes() {
        mes = c2.get(Calendar.MONTH);
        mes = mes+1;
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        anio = c2.get(Calendar.YEAR);
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getUltdia() {
        ultdia = c2.get(Calendar.DAY_OF_MONTH);
        return ultdia;
    }

    public void setUltdia(int ultdia) {
        this.ultdia = ultdia;
    }
    
    
    
    public fecha() {
    }

    public fecha(int dia, int mes, int anio) {
        this.dia = getDia();
        this.mes = getMes();
        this.anio = getAnio();
    }  

    public fecha(int dia, int mes, int anio, int ultdia) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.ultdia = ultdia;
    }
    
    
}
