package prog.unidad04.actividad.ej6;

public class Circulo {
  //Parametros 
  protected double radio;
  
  //Constructor
  public Circulo(double radio) {
    this.radio = radio;
  }
  
  //metodos
  public double PerimetroCirculo() {
    return Math.PI*radio*2;
  }

  public double AreaCirculo() {
    return Math.PI*radio*radio;
  }
 
  
}
