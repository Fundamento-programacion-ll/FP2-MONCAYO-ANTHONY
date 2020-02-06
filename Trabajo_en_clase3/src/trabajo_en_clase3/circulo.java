/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

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
        super();
        this.radio = (int) Double.parseDouble(JOptionPane.showInputDialog("ingrese la radio del circulo"));
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
     public double getDiametro() {
        return 2 * this.radio;
    }

    public double getCircunferencia() {
        return Math.PI * this.getDiametro();
    }

    public double getPerimetro() {
        return this.getCircunferencia();
    }
    
     public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawOval(super.getX(), super.getY(), (int) this.radio, (int) this.radio);
    }
     
     public double getArea() {
        return Math.PI * getRadio() * getRadio();
    }

    public double getVolumen() {
        return 0.0;
    }
    
    @Override
    public String toString() {
        return "El area del circulo es: "+ getArea();
    }
    
     
}
