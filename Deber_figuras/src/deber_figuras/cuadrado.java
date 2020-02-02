/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_figuras;

/**
 *
 * @author antho
 */
public class cuadrado extends Dimensiones{
    //lado,volumen
    private float volumen;
    
    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public cuadrado(float volumen) {
        this.volumen = volumen;
    }

    public cuadrado(float volumen, float lado, float base, float altura, float radio) {
        super(lado, base, altura, radio);
        this.volumen = volumen;
    }

    public cuadrado() {
    }
    
}
