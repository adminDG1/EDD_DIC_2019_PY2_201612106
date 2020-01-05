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
public class Burbuja{
    
    public int[] MetodoBurbuja(int[] n){
       int temp;
       int t = n.length;
       
        for (int i = 1; i < t; i++) {
            for (int j = t-1; j >= i; j--) {
                if (n[j] < n[j-1]) {
                   temp = n[j] ;
                   n[j] = n[j-1];
                   n[j-1] = temp; 
                } // fin if
            } //fin 2 for
        } //fin for 1
        
        return n;
    }
    
    
    
}
