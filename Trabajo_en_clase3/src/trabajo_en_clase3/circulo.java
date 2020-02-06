/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase3;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author antho
 */
public class circulo extends punto{
    
    private int radio;

    public circulo(int puntox, int puntoy) {
        super(puntox, puntoy);
    }

    public circulo() {
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public circulo(int radio, int puntox, int puntoy) {
        super(puntox, puntoy);
        this.radio = radio;
    }

    public circulo(int radio) {
        this.radio = radio;
    }
    
     public void paint(Graphics g){
        g.setColor(Color.RED);
             g.drawOval(super.getX(), super.getY(), this.radio, this.radio);   
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
