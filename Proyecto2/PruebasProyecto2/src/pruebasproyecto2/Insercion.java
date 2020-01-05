/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasproyecto2;

/**
 *
 * @author chana
 */
public class Insercion {
 
    public void MetodoInsercion(int a[]){
    
      int i,j;
      int aux;
        for ( i = 1; i < a.length; i++) {
            j = i;
            aux = a[i];
            while(j > 0 && aux < a[j-1] ){
                
                a[j] = a[j-1];
                j--;
            } // fin while
           a[j] = aux;
        } // fin for
        
    }
}
