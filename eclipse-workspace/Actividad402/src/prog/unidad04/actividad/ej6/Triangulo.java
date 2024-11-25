package prog.unidad04.actividad.ej6;

public class Triangulo {
  //Parametros
  protected Punto vertice1;
  protected Punto vertice2;
  protected Punto vertice3;

  
  //Constructor
  public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
    super();
    this.vertice1 = vertice1;
    this.vertice2 = vertice2;
    this.vertice3 = vertice3;
  }

  private double CalcularSegmento(Punto punto1, Punto punto2) {
    return Math.sqrt(Math.pow((punto1.posX - punto2.posX), 2) + Math.pow((punto1.posY - punto2.posY), 2));
  }

 

  public double CalcularArea(){
    double segmento1 = CalcularSegmento(vertice1, vertice2);
    double segmento2 = CalcularSegmento(vertice2, vertice3);
    double segmento3 = CalcularSegmento(vertice3, vertice1);

    double semiperimetro = (segmento1 + segmento2 + segmento3) / 2;
    return Math
        .sqrt(semiperimetro * (semiperimetro - segmento1) * (semiperimetro - segmento2) * (semiperimetro - segmento3));
    
  }
  
  public double CalcularPerimetro() {
    double segmento1 = CalcularSegmento(vertice1, vertice2);
    double segmento2 = CalcularSegmento(vertice2, vertice3);
    double segmento3 = CalcularSegmento(vertice3, vertice1);
    
    return segmento1+segmento2+segmento3;
  }

}
