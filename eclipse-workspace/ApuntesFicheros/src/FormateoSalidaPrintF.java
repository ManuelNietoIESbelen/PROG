
public class FormateoSalidaPrintF {
  public static void main(String[] args) {
    int numero = 12345;
    double precio = 45.678;

    System.out.printf("Número: %,d%n", numero); // Separador de miles
    System.out.printf("Precio: %.2f€%n", precio); // 2 decimales
  }
}
