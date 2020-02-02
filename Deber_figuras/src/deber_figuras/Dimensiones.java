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
public class Dimensiones {
    private float lado, base, altura,radio;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Dimensiones() {
    }

    public Dimensiones(float lado, float base, float altura, float radio) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public  float circunferencia(){
    
        return 0;
    }
    
}
