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
public class retiros extends transaccion{
    
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public retiros(double monto, int cuenta) {
        super(cuenta);
        this.monto = monto;
    }

    public retiros(double monto) {
        this.monto = monto;
    }

    @Override
    public String ejecutar() {
        return " Su númeto de Cuenta es: "+getCuenta()+" su saldo es: "+monto;
    }

    @Override
    public String toString() {
        return "Su Número de cuenta: "+getCuenta()+" su retiro es de: "+getMonto();   
    }
    
    
    
    
}
