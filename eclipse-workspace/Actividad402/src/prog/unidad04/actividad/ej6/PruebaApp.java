package prog.unidad04.actividad.ej6;

public class PruebaApp {

  public static void main(String[] args) {
    Punto punto1 = new Punto(1.0,1.0);
    Punto punto2 = new Punto(2.0,3.0);
    Punto punto3 = new Punto(3.0,1.0);
    
    Triangulo triangulo = new Triangulo(punto1,punto2,punto3);
    
    System.out.println("area traingulo: "+ triangulo.CalcularArea());
    System.out.println("perimetro triangulo: "+triangulo.CalcularPerimetro());
    
    double radio= 5;
    
    Circulo circulo = new Circulo(radio);
    
    System.out.println("Area circulo: " + circulo.AreaCirculo() );
    System.out.println("Perimetro circulo: " + circulo.PerimetroCirculo() );
    
    
    Rectangulo rectangulo = new Rectangulo(punto1,punto2);
    
    System.out.println("Area rectangulo: " + rectangulo.AreaRectangulo());
    System.out.println("perimetro rectangulo: " + rectangulo.PerimetroRectangulo());
    
    
    
  }

}
