/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class vector {
    
        private int vector[];
        ArrayList Nprimos=new ArrayList();

    public int[] getVector() {
        return vector;
    }

    public void setVector() {
        
        String datosVector; 
        
        datosVector = JOptionPane.showInputDialog(null, "Ingrese los Datos separados por coma");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, ","); //datos,separador
        
        for (int i = 0; i < this.vector.length&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[i] = Integer.parseInt(tokkens.nextToken());
            
        }
    }

    public vector(int[] vector) {
        
        super();
        
        this.vector = vector;
    }
    
    public vector(int dimension) {
        
        super();
        
        vector=new int [dimension];
        
        this.setVector();
        
    }
    
    
    
    public void verf (int dimension){
    
        boolean v=false;
        for (int i = 0; i < dimension; i++) {
            v=false;
        for (int c=2; c<vector[i]; c++){
        if(vector[i]%c==0){
        v=true;
        }
        }
          if (v == false){
          Nprimos.add(vector[i]);
        }
        }
       
        
    }
        
    public String primo (){
        
        String verfc="";
        System.out.println("Los Numeros primos son: ");
        for (int i=0; i<Nprimos.size(); i++){
        
            System.out.println(">> "+Nprimos.get(i));
        
            verfc += Nprimos.get(i).toString() + "\n";
            
        }
        if (Nprimos.size()<=0){
            return "No hay numeros primos";
        }
    
    return "";
    }
    
    
    public vector() {
        
    
    }
    
     @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector); 
    }

    
}
