package prog.unidad07.ejercicio1;

public class Triangulo {
  private Punto vertice1;
  private Punto vertice2;
  private Punto vertice3;

  public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
    this.vertice1 = vertice1;
    this.vertice2 = vertice2;
    this.vertice3 = vertice3;
  }
  
  
  public Punto getVertice1() {
    return vertice1;
  }

  public void setVertice1(Punto vertice1) {
    this.vertice1 = vertice1;
  }

  public Punto getVertice2() {
    return vertice2;
  }

  public void setVertice2(Punto vertice2) {
    this.vertice2 = vertice2;
  }

  public Punto getVertice3() {
    return vertice3;
  }

  public void setVertice3(Punto vertice3) {
    this.vertice3 = vertice3;
  }
  
  public double getArea() {
    double lado1 = vertice1.distancia(vertice2);
    double lado2 = vertice2.distancia(vertice3);
    double lado3 = vertice3.distancia(vertice1);
    
    return lado1 +lado2 + lado3;
  }
  
  @Override
  public double getPerimetro() {
    double lado1 = vertice1.distancia(vertice2);
    double lado2 = vertice2.distancia(vertice3);
    double lado3 = vertice3.distancia(vertice1);
    
    return lado1 +lado2 + lado3;
  }
  
  
  @Override
  
  public String toString() {
    return "Triangulo{" + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + '}';
  }
}
