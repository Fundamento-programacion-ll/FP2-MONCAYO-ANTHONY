/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class empleado {
    
    String [] nombre,apellidos;
    int []salario;
    String [] fecha_ingreso, fecha_nacimiento;

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public String[] getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String[] fecha_ingreso) {
        /**String datosVector; 
        
        datosVector = JOptionPane.showInputDialog(null, "Ingrese la fecha de ingreso de la\n siguiente forma: \n DD/MM/AAAA \n separados por un una barra diagonal");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, "/"); //datos,separador
        
        for (int i = 0; i < this.fecha_ingreso.length&&tokkens.hasMoreTokens(); i++) {   
            this.fecha_ingreso[i] = Integer.parseInt(tokkens.nextToken());   
        }**/
        this.fecha_ingreso = fecha_ingreso;
    }

    public String[] getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String[] fecha_nacimiento) {
        /**
        String datosVector; 
        
        datosVector = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento de la\n siguiente forma: \n DD/MM/AAAA \n separados por un una barra diagonal");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, "/"); //datos,separador
        
        for (int i = 0; i < this.fecha_nacimiento.length&&tokkens.hasMoreTokens(); i++) {   
            this.fecha_nacimiento[i] = Integer.parseInt(tokkens.nextToken());   
        }**/
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public empleado(String[] nombre, String[] apellidos, int[] salario, String[] fecha_ingreso, String[] fecha_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public empleado() {
    }
    
    public void ingresarempleados (int numempleados){
    
        String [] nom = new String[numempleados];
        String [] ape = new String[numempleados];
        int [] sal = new int[numempleados];
        String [] fing = new String[numempleados];
        String [] fnac = new String[numempleados];
        //int naci =0;
        //int ing = 0;
        for (int i = 0; i < numempleados; i++) {
            String  n = JOptionPane.showInputDialog(null,"Ingrese el Nombre del empleado N°: "+ (i+1));
            nom [i] = n;
            String  ap = JOptionPane.showInputDialog(null,"Ingrese el Apellido del empleado N°: "+ (i+1));
            ape [i] = ap;
            int salr = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Salario del empleado N°: "+ (i+1)));
            sal [i] = salr;
            String emp = JOptionPane.showInputDialog(null,"Ingrese la fecha de ingreso del empleado N°: "+(i+1)+" de la\n siguiente forma: \n DD/MM/AAAA \n separados por un una barra diagonal");
          String [] obtfing = emp.split("");
            fing[i] = emp;
//            ing = Integer.parseInt(emp);
            String nac = JOptionPane.showInputDialog(null,"Ingrese la fecha de nacimiento del empleado N°: "+(i+1)+" de la\n siguiente forma: \n DD/MM/AAAA \n separados por un una barra diagonal");
          String [] obtfnac = nac.split("");
            fnac [i] = nac;
//            naci = Integer.parseInt(nac);
        }
        setNombre(nom);
        setApellidos(ape);
        setSalario(sal);
        setFecha_ingreso(fing);
        setFecha_nacimiento(fnac);
    }
    
    public void listaempleados (){
        
        String [] nom = getNombre();
        String [] ape = getApellidos();
        int [] sal = getSalario();
        String [] feching = getFecha_ingreso();
        String [] fechnac = getFecha_nacimiento();
        String [] dia = new String[nom.length];
        String [] mes = new String[nom.length];
        String [] anio = new String[nom.length];
        String [] fech = new String[nom.length];
        String dg1,dg2,dg3,dg4,dg5,dg6,dg7,dg8,dg9,dg10;
        int [] d = new int[2];
        int [] m = new int[2];
        int [] a = new int[4];
        
            
        System.out.println("Lista de Empleados");
        int burb=0;
        String temp ="";
        for (int i = 0; i <nom.length; i++) {
            
            fech  = feching[i].split("");
            dg1 = fech[fech.length - 10];
            dg2 = fech[fech.length - 9];
            dg3 = fech[fech.length - 7];
            dg4 = fech[fech.length - 6];
            dg5 = fech[fech.length - 4];
            dg6 = fech[fech.length - 3];
            dg7 = fech[fech.length - 2];
            dg8 = fech[fech.length - 1];
            
      /**      
            dg1 = feching[feching.length - 10];
            dg2 = feching[feching.length - 9];
            dg3 = feching[feching.length - 8];
            dg4 = feching[feching.length - 7];
            dg5 = feching[feching.length - 6];
            dg6 = feching[feching.length - 5];
            dg7 = feching[feching.length - 4];
            dg8 = feching[feching.length - 3];
            dg9 = feching[feching.length - 2];
            dg10 = feching[feching.length - 1];
**/            
            dia [i] = dg1+dg2;
            mes [i] = dg3+dg4;
            anio [i]= dg5+dg6+dg7+dg8;
            
            d [i]= Integer.parseInt(dia [i]);
            m [i]= Integer.parseInt(mes [i]);
            a [i]= Integer.parseInt(anio [i]);
            /**d [i]= Integer.parseInt(dia [i]);
            m [i]= Integer.parseInt(mes [i]);
            a [i]= Integer.parseInt(anio [i]);
            **/
            System.out.println("Empleado N°: "+ (i+1));
            System.out.println("Nombre: "+nom[i]+" Apellido: "+ape[i]+" Salario: "+ sal[i]+" Fecha de Ingreso: "+ feching[i]+" dia: "+ d[i]+" mes: "+m[i]+" anio: "+a[i]+" Fecha de Nacimiento: "+fechnac[i]+"\n");
        }
        for (int i = 0; i <nom.length; i++) {
            for (int j = 0; j <nom.length; j++) {
                if(sal[j]<sal[i]){
                    burb= sal[i];
                    sal[i]= sal[j];
                    sal[j]=burb;
                    
                    temp= nom[i];
                    nom[i]= nom[j];
                    nom[j]=temp;
                    
                    temp= ape[i];
                    ape[i]= ape[j];
                    ape[j]=temp;
                }
            }
            
        }
        
        System.out.println("Empleado con mayor salario: "+ sal [0]+ " Empleado: "+ nom [0] +" "+ ape [0]);
        System.out.println("Empleado con mas antigüedad: ");
        
    }
}
