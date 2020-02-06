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
public class punto extends figuras{
    
    private int puntox, puntoy;

     public punto(int x, int y) {
        super();
        this.puntox = puntox;
        this.puntoy = puntoy;        
    }

    public int getX() {
        return puntox;
    }

    public void setX(int x) {
        this.puntox = puntox;
    }

    public int getY() {
        return puntoy;
    }

    public void setY(int y) {
        this.puntoy = puntoy;
    }
    
    public punto(){
        super();
        String datos = JOptionPane.showInputDialog(null,"Ingrese los valores");
        StringTokenizer tokens = new StringTokenizer(datos,",");
        this.puntox=Integer.parseInt(tokens.nextToken());
        this.puntoy=Integer.parseInt(tokens.nextToken());
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.puntox, this.puntoy, 30, 30);
        
    }

    @Override
    public String toString() {
        return "punto{" + "puntox=" + puntox + ", puntoy=" + puntoy + '}';
    }
}
