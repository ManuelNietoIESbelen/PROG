package prog.unidad04.actividad402.ej9;

public class PruebaApp {

  public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(1,2);
    Fraccion fraccion2 = new Fraccion(1,2);
    
    
    System.out.println("Producto: "+fraccion1.fraccionProducto(fraccion1, fraccion2));
    System.out.println("Division: "+fraccion1.fraccionDivision(fraccion1, fraccion2));
  }

}
