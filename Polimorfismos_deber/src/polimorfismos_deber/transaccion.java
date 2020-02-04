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
public abstract class transaccion {
    private int cuenta;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public transaccion(int cuenta) {
        this.cuenta = cuenta;
    }

    public transaccion() {
    }
    
    public abstract String ejecutar();
    
    public String obtenercuenta(){
    
    return null;
    }
}
