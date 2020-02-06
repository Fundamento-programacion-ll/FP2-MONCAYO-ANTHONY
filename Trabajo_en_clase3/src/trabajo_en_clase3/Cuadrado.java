/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Cuadrado extends punto{
    
    private double lado;

    public Cuadrado() {
        super();
        this.lado = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el lado"));
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = lado ;
    }

    /**public Cuadrado() {
    super();
    String datos = JOptionPane.showInputDialog(null,"Ingrese el lado");
    this.lado=Integer.parseInt(datos);
    }**/
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawRect(super.getX(), super.getX(), (int) this.lado, (int) this.lado);
    }
    
    
    
}
