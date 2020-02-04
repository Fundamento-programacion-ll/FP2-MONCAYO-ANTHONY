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
public class deposito extends transaccion{
    private double montoDep;

    public double getMontoDep() {
        return montoDep;
    }

    public void setMontoDep(double montoDep) {
        this.montoDep = montoDep;
    }

    public deposito(double montoDep, int cuenta) {
        super(cuenta);
        this.montoDep = montoDep;
    }

    public deposito(double montoDep) {
        this.montoDep = montoDep;
    }

    public deposito() {
    }
    
    @Override
    public String ejecutar() {
        return "Su número de Cuenta es: "+getCuenta()+" su monto depositado es de: "+getMontoDep();
    }
    public int dep (int dep, int saldo){
       int stotal= dep+  saldo;
       return stotal;
    }

    @Override
    public String toString() {
        return "Su Número de cuenta es: "+getCuenta()+" su monto depositado es de: "+getMontoDep();
    }
    
    
}
