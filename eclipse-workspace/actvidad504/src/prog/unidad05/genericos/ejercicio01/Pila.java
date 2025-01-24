package prog.unidad05.genericos.ejercicio01;

import java.util.List;

public class Pila <T>{
  private List <T> pila;

  public Pila() {
    this.pila = pila;
    
    
  }
  
  
  public void push (T elemento) {
      pila.add(elemento);
    
  }
  
  public T pop() {
    if (pila.isEmpty()) {
      throw new EmptyStackException();
    }
    
  }
  
  public boolean esVacia() {
    boolean comprobar;
   return comprobar = pila.isEmpty() ?  true : false;
  }
  public int getNumeroElementos() {
   int num;
  return num = pila.size();
  }
  
}
