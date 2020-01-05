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
public class ArbolAvl {
    
    private NodoAvl raiz;
    private String graf;
    private int contador;
    String auxiliares;
    String rotacion;
    
  ArbolAvl(){
  
      raiz = null;
      graf = "";
      contador = 0;
  
  }
  
  public NodoAvl getRaiz(){return raiz;}
  public void SetRaiz(NodoAvl raiz){this.raiz = raiz;}
  public int getContador(){ return contador;}
  
  public int Altura(NodoAvl altura){
  
      if(altura == null){return 0;}
      return altura.getAltura();
  }
  
  public int Maximo(int subA, int subB){
  
     if(subA > subB){
          return subA;
      }
        return subB;
      
  }
  
  public int Valanceo(NodoAvl nodo){
  
      if(nodo == null){return 0;}
      return Altura(nodo.GetIzquierdo())-Altura(nodo.GetDerecho());
      
  }
  
  public NodoAvl ValorMinimo(NodoAvl nodo){
  
      NodoAvl actual = nodo;
      if(actual.GetIzquierdo() != null){
      actual = ValorMinimo(actual.GetIzquierdo());
      }
      return actual;
  }
  
  public NodoAvl EncontrarMayor(NodoAvl nodo){
      
      if (nodo.GetDerecho() != null) {
          nodo = EncontrarMayor(nodo.GetDerecho());
      }
      return nodo;
  }
  
  public static NodoAvl RotacionII(NodoAvl nodo){ // recibe el padre
  
      NodoAvl t1 = nodo.GetIzquierdo();
      nodo.SetIzquierdo(t1.GetDerecho());
      t1.SetDerecho(nodo);
      nodo = t1;
      return nodo;
      
  }
  
  public static NodoAvl RotacionDD(NodoAvl nodo){
  
      NodoAvl t1 = nodo.GetDerecho(); //n
      nodo.SetDerecho(t1.GetIzquierdo());
      t1.SetIzquierdo(nodo);
      nodo = t1;
      return nodo;
  }
  
  public static NodoAvl RotacionDI(NodoAvl nodo){
  
      NodoAvl t1 = nodo.GetDerecho();
      NodoAvl t2 = t1.GetIzquierdo();
      
      t1.SetIzquierdo(t2.GetDerecho());
      t2.SetDerecho(t1);
      nodo.SetDerecho(t2.GetIzquierdo());
      t2.SetIzquierdo(nodo);
      nodo = t2;
      return nodo;
      
  }
  
  public static NodoAvl RotacionID(NodoAvl nodo){
  
      NodoAvl t1 = nodo.GetIzquierdo();
      NodoAvl t2 = t1.GetDerecho();
      
      t1.SetDerecho(t2.GetIzquierdo());
      t2.SetIzquierdo(t1);
      nodo.SetIzquierdo(t2.GetDerecho());
      t2.SetDerecho(nodo);
      nodo = t2;
      return nodo;
      
  }
  
  //recibe raiz 
  public NodoAvl Insertar(NodoAvl nodo, int valor) throws Exception{
      
      if(nodo == null){
          
          return (new NodoAvl(valor));
      } 
      else if(valor < nodo.GetValor()){ // si es menor a la raiz
      
          NodoAvl iz;
          iz = Insertar(nodo.GetIzquierdo(),valor);
          nodo.SetIzquierdo(iz);/////
          
      } else if(valor > nodo.GetValor()){ // inserto a la dere
          
          NodoAvl der;
          der = Insertar(nodo.GetDerecho(),valor);
          nodo.SetIzquierdo(der);
          
      } else{ // si viene repetido
          
          return nodo;
          
      } 
      
      nodo.SetAltura(Maximo(Altura(nodo.GetIzquierdo()),Altura(nodo.GetDerecho()))+1);
      
      int balance  = Valanceo(nodo);
      
      //
      if (balance > 1 && valor < nodo.GetIzquierdo().GetValor()) {
          
          return RotacionII(nodo);
      }
      if (balance <-1 && valor > nodo.GetDerecho().GetValor()) {
          
          return RotacionDD(nodo);
      }
      if (balance > 1 && valor > nodo.GetIzquierdo().GetValor()) {
          
          return RotacionID(nodo);
      }
      if (balance < -1 && valor < nodo.GetDerecho().GetValor()) {
          
          return RotacionDI(nodo);
      }
      
      return nodo;
      
  }
  
  public NodoAvl EliminarDato(NodoAvl actual, int valor){
  
      if (actual != null) {
          
          if (valor == actual.GetValor()) {
              
              if (actual.GetIzquierdo() == null && actual.GetDerecho() == null) {
                  
                  actual = null;
                  
              } else if (actual.GetIzquierdo() != null && actual.GetDerecho() != null) {
                  
                  NodoAvl aux = EncontrarMayor(actual.GetIzquierdo());
                  actual.SetValor(aux.GetValor());
                  actual.SetIzquierdo(EliminarDato(actual.GetIzquierdo(),actual.GetValor()));
              
              } else if (actual.GetDerecho() != null){
                  
                  actual = actual.GetDerecho();
                  
              } else{
                  
                 actual = actual.GetIzquierdo();
                 
              }
              
          } else if (valor < actual.GetValor()) {
              
              actual.SetIzquierdo(EliminarDato(actual.GetIzquierdo(), valor));
              
          }else{
          
              actual.SetDerecho(EliminarDato(actual.GetDerecho(),valor));
              
          }
          
      }
      
      //rotaciones
      if (actual != null) {
          
          if ((Altura(actual.GetDerecho())-Altura(actual.GetIzquierdo())) == -2) {
              
             if(Altura(actual.GetIzquierdo().GetIzquierdo()) >= Altura(actual.GetIzquierdo().GetDerecho()))
                {
                    actual = RotacionII(actual); 
                }else
                {
                    actual = RotacionID(actual); 
                }
                
                 
              } else if ((Altura(actual.GetDerecho())-Altura(actual.GetIzquierdo())) == 2) {
           
              if( Altura(actual.GetDerecho().GetDerecho()) >= Altura(actual.GetDerecho().GetIzquierdo()) )
                {
                    actual = RotacionDD(actual); 
                }else
                {
                    actual = RotacionDI(actual);
                }
              
          }
              
          } 
          
          return actual;
      }
      
  }
  

