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
public class NodoAvl {
    
    int fe;
    private int valor;
    private int altura;
    private NodoAvl izquierdo;
    private NodoAvl derecho;
    
    public NodoAvl(int valor)
    {
        this.valor = valor;
        fe = 0;
        altura  = 1;
        izquierdo = null;
        derecho = null;
              
    }
    
    public NodoAvl(int valor , NodoAvl ramaIzdo, NodoAvl ramaDech){
    
        fe = 0;
    
    }
    
    public void SetValor(int valor){ this.valor = valor;}
    public int GetValor(){return valor;}
    public void SetAltura(int altura){this.altura = altura;}
    public int getAltura(){return altura;}
    
    public NodoAvl GetIzquierdo(){return izquierdo;}
    public void SetIzquierdo(NodoAvl n){ izquierdo = n;}
    public NodoAvl GetDerecho(){return derecho;}
    public void SetDerecho(NodoAvl n){derecho = n;}
    
}
