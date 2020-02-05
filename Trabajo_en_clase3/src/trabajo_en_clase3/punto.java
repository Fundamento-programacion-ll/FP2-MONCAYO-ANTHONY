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

    public int getPuntox() {
        return puntox;
    }

    public void setPuntox(int puntox) {
        this.puntox = puntox;
    }

    public int getPuntoy() {
        return puntoy;
    }

    public void setPuntoy(int puntoy) {
        this.puntoy = puntoy;
    }

    public punto(int puntox, int puntoy) {
        this.puntox = puntox;
        this.puntoy = puntoy;
    }
    
    public punto(){
        super();
        String datos = JOptionPane.showInputDialog(null,"Ingrese los valores");
        StringTokenizer tokens = new StringTokenizer(datos);
        this.puntox=Integer.parseInt(tokens.nextToken());
        this.puntoy=Integer.parseInt(tokens.nextToken());
        for (int i = 0; i < 2&&tokens.hasMoreTokens(); i++) {
            
        }
    
    }
    
    @Override
    public void Dibujo(Graphics g) {
        g.setColor(Color.RED);
        System.out.println(this.puntox+" "+ this.puntoy);
        g.fillOval(this.puntox, this.puntoy, 30, 30);
        
    }

    @Override
    public String toString() {
        return "punto{" + "puntox=" + puntox + ", puntoy=" + puntoy + '}';
    }
    
    
}
