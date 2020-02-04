/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismos_deber;

/**
 *
 * @author antho
 */
public class solictud_saldo extends transaccion{
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public solictud_saldo(double valor, int cuenta) {
        super(cuenta);
        this.valor = valor;
    }

    public solictud_saldo(double valor) {
        this.valor = valor;
    }

    @Override
    public String ejecutar() {
        return "Su Número de Cuenta es: "+getCuenta()+" su saldo es de: "+valor;
    }

    @Override
    public String toString() {
        return ejecutar();
    }
}
