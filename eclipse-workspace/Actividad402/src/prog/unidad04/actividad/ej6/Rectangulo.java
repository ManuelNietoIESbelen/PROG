package prog.unidad04.actividad.ej6;

public class Rectangulo {
  //Parametros
  protected Punto vertice;
  protected Punto verticeOpuesto;
 
  
  //Constructor
  public Rectangulo(Punto vertice, Punto verticeOpuesto) {
    this.vertice = vertice;
    this.verticeOpuesto = verticeOpuesto;
  }
  
  Punto puntoAuxiliar1 = new Punto(vertice.getPosX(),verticeOpuesto.getPosY());
  
  //Metodos
  public double AreaRectangulo() {
    
    double altura = CalcularSegmento(vertice,puntoAuxiliar1);
    double base = CalcularSegmento(verticeOpuesto,puntoAuxiliar1);
    
    
    return base*altura;
  }
  
  public double PerimetroRectangulo() {
    double altura = CalcularSegmento(vertice,puntoAuxiliar1);
    double base = CalcularSegmento(verticeOpuesto,puntoAuxiliar1);
    
    return base*2 + altura*2;
  }
  
  private double CalcularSegmento(Punto punto1, Punto punto2) {
    return Math.sqrt(Math.pow((punto1.posX - punto2.posX), 2) + Math.pow((punto1.posY - punto2.posY), 2));
  }

  
}


