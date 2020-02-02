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
public class trinagulo extends Dimensiones{
    //area, volumen, perimetro
    private float area, volumen, perimetro;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public trinagulo(float area, float volumen, float perimetro) {
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }
    
    public trinagulo() {
    
    }
    
    public trinagulo(float area, float volumen, float perimetro, float lado, float base, float altura, float radio) {
        super(lado, base, altura, radio);
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }
    public void resultadoAT (){
        System.out.println("El Área es: "+ areat(getBase(),getAltura()));
    }
    
    public void resultadoVT (){
        System.out.println("El Volumen es: "+ volument(getBase(),getAltura()));
    }
    
    public void resultadoPT (){
        System.out.println("El Perimetro es: "+ perimetrot(getLado()));
    }
    
}
