package prog.unidad04.actividad402.ej9;

public class Fraccion {
  //Atributos
  protected int numerador; 
  protected int denominador;  
  //Constructor
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  //Metodos
  public String fraccionSuma(Fraccion fraccion1, Fraccion fraccion2) {
     
    
    return null;
  }
  
  
  public Fraccion resta(Fraccion otra) {
    Fraccion resultado = new Fraccion((this.numerador * otra.denominador) - (otra.numerador * this.denominador), this.denominador * otra.denominador);
    return resultado;
  }


public String fraccionProducto(Fraccion fraccion1, Fraccion fraccion2) {
  int productoNumerador=fraccion1.numerador*fraccion2.numerador;
  int productoDenominador=fraccion1.denominador*fraccion2.denominador;
  
  return  productoNumerador+"/"+productoDenominador;
}
public String fraccionDivision(Fraccion fraccion1, Fraccion fraccion2) {
  int divisionNumerador=fraccion1.numerador*fraccion2.denominador;
  int divisionDenominador=fraccion1.denominador*fraccion2.numerador;
  
  return  divisionNumerador+"/"+divisionDenominador;
  
  
  
  
}
  

  

}
