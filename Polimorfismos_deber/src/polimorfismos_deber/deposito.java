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
        return "Cuenta: "+getCuenta()+"\n A depositado: "+montoDep;
    }

    @Override
    public String toString() {
        return "N_ cuenta es: "+getCuenta()+" su Deposito es de: "+getMontoDep();
    }
    
    
}
