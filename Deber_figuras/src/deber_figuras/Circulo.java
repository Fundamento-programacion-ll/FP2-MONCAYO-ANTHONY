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
public class Circulo extends Dimensiones{
    //circunferencia
    private float circunferencia;

    Circulo() {
       
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Circulo(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Circulo(float circunferencia, float lado, float base, float altura, float radio) {
        super(lado, base, altura, radio);
        this.circunferencia = circunferencia;
    }
    
    
    public void resultadoC (){
        System.out.println("La circuferencia es:"+ circunferencia(getRadio())); 
    }
    
    public void resultadoA (){
        System.out.println("El Area es:"+areac(getRadio())); 
    }
}
