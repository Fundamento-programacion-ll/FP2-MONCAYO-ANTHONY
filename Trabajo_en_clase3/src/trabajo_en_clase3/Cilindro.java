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
public class Cilindro extends circulo{
    
     private double altura;

    public Cilindro() {
        super();
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del cilindro"));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(double altura, int puntox, int puntoy) {
        super(puntox, puntoy);
        this.altura = altura;
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double altura, int radio, int puntox, int puntoy) {
        super(radio, puntox, puntoy);
        this.altura = altura;
    }

    public Cilindro(double altura, int radio) {
        super(radio);
        this.altura = altura;
    }
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.RED);

        g.fillOval(getX(), (int) (getY() + this.altura), (int) super.getRadio(), (int) super.getRadio());

        g.setColor(Color.RED);
        g.drawLine((int) (super.getX() + super.getRadio()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX() + super.getRadio()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
        g.drawLine((int) (getX()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));

    }

    @Override
    public String toString() {
        return "\nCilindro" + " \nAltura= " + this.altura + super.toString();
    }

}
