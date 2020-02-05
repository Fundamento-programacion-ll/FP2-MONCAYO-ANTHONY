/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismos_deber;

import javax.swing.JOptionPane;

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
        String u,c;
        int Nc = 0;
        deposito d=new  deposito();
        retiros r=new retiros();
        solictud_saldo s=new solictud_saldo();
        String usua,contr;
        int ncun, sal;
        String [] usuario = new String[10];
        int [] Ncuenta = new int[10];
        int [] saldo = new int[10];
        String [] contraseña = new String[10];
        // Usuarios
        usuario [0] = "Anthony";
        usuario [1] = "Toñito";
        usuario [2] = "Toño";
        //Ncuenta 
        Ncuenta [0] = 156452345;
        Ncuenta [1] = 214465476;
        Ncuenta [2] = 436546578;
        //Contraseña
        contraseña [0]= "moncayo27";
        contraseña [1]= "moncayo27";
        contraseña [2]= "moncayo27";
        //saldo
        saldo [0]  = 300;
        saldo [1]  = 300;
        saldo [2]  = 300;
        
        int opc2,opc,nu=0,nnc,nc=0,sald;
        boolean v=false;
        do{
        do {
            u=JOptionPane.showInputDialog(null,"Ingrese su usuario");
            for (int i = 0; i <usuario.length; i++) {
            if (u.equalsIgnoreCase(usuario[i])){
                nu=i;
                nc=i;
                c=JOptionPane.showInputDialog(null,"Ingrese su Contraseña");
                for (int j = 0; j <contraseña.length; j++) {
                    if(c.equalsIgnoreCase(contraseña[j])){
                    v=true;
                    }
                }
            }
            }
            if(v==false){JOptionPane.showMessageDialog(null, "Datos Erroneso", "FAIL", JOptionPane.ERROR_MESSAGE);}else{
            JOptionPane.showMessageDialog(null, "Usuario Valido"); 
            System.out.println("nc: "+ nc);
            }
         }while(v==false); 
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n1. Deposito saldo \n2. Retiro \n 3. Consultar Saldo  \n 4. Agregar cuenta "));
        switch (opc){
            //Deposito
            case 1:
                sald=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                for (int i = 0; i <Ncuenta.length; i++) {
                    if (Nc==Ncuenta[i]){
                    int dep=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su Deposito"));
                d.setCuenta(Ncuenta[nu]);
                d.setMontoDep(dep);
                
                d.ejecutar();
                System.out.println(d);
                System.out.println("Saldo total: "+ d.dep(dep, saldo[nu]));
                    }
                }
                break;
            //Retiro    
            case 2:
                sald=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                for (int i = 0; i <Ncuenta.length; i++) {
                    if (Nc==Ncuenta[i]){
                    int ret=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su Retiro"));
                r.setCuenta(Ncuenta[nu]);
                r.setMonto(ret);
                r.ejecutar();
                System.out.println("Saldo total: "+ d.dep(ret, saldo[nu]));
                    }
                }
                
                break;
            //COnsultar Saldo
            case 3:
                 sald=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                for (int i = 0; i <Ncuenta.length; i++) {
                    if (Nc==Ncuenta[i]){
                        s.setValor(saldo[i]);
                        
                        System.out.println("Su saldo total es " + s.getValor());
                        s.ejecutar();
                    }
                }
                
                break;
            case 4:
                int cont =0;
                usua=JOptionPane.showInputDialog(null,"Ingrese su Nombre de Usuario");
                usuario [3+cont]=usua;
                contr=JOptionPane.showInputDialog(null,"Ingrese su Contraseña");
                contraseña [3+cont]=contr;
                ncun=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                Ncuenta [3+cont]=ncun;
                sal=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero Saldo"));
                saldo [3+cont]=sal;
                
                System.out.println("Su cuenta fue creada con exito: \n Usuario: "+ usuario[3+cont]
                        +" Contraseña: "+ contraseña[3+cont] +" Numero de cuentra: "+ Ncuenta[3+cont]
                        + " Saldo: "+ saldo[3+cont]);
                cont++;
                
                break;
            
            default:
                System.out.println("Gracias por Preferirnos");
                break;
        }
        
            opc2 = JOptionPane.showConfirmDialog(null, "Desea continuar usando el programa");
        }while(opc2==0);
    }
    
}
