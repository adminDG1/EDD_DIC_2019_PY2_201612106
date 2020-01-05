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
public class QuickSort {
    
    public void MetodoQuickSort(double a[])
    {
        MetodoQuickSort(a,0,a.length);
    }
    public void MetodoQuickSort(double a[], int primero, int ultimo){
        
        int i,j,central;
        double pivote;
        central = (ultimo+primero)/2;
        pivote = a[central];
        double auxiliar;
        i = primero;
        j = ultimo;
       
        do{
            
            while(a[i] < pivote) i++;
            while(a[j] > pivote) j--;
            
            if (i <= j) {//intercambio los apuntadores;
                
                auxiliar = a[i];
                a[i] = a[j];
                a[j] = auxiliar;
                
                j--;
                i++;
            }
            
        } while ( i <= j);
        
        if (primero < j) {
            
            MetodoQuickSort(a,primero,j);//ordeno izquierdo
            
        }
        
        if (i < ultimo) {
            
            MetodoQuickSort(a, i, ultimo); // ordeno derecho
        }
        
    }
    
    
}
