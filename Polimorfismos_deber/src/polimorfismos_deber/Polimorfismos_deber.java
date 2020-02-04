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
public class Polimorfismos_deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total;
        solictud_saldo s=new solictud_saldo(400, 1726233164);
        System.out.println(s);
        retiros r=new retiros(100, 1726233164);
        System.out.println(r);
        deposito d=new  deposito(500, 1726233164);
        System.out.println(d);

        total= s.getValor()+d.getMontoDep()-r.getMonto();
        System.out.println("El saldo total que tiene es de: "+total);
        
    }
    
}
