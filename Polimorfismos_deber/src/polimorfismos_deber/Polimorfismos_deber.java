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
        double Stotal;
        //saldo
        solictud_saldo s=new solictud_saldo(900, 1790457628);
        System.out.println(s);
        //deposito
        deposito d=new  deposito(600, 1790457628);
        System.out.println(d);
        //retiros
        retiros r=new retiros(300, 1790457628);
        System.out.println(r);
        Stotal= s.getValor()+d.getMontoDep()-r.getMonto();
        System.out.println("El saldo total que tiene es de: "+Stotal);
        
    }
    
}
