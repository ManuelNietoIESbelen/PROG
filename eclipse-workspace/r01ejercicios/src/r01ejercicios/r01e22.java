package r01ejercicios;

import java.util.*;

public class r01e22 {

  private static final int LITROS_POR_METRO_CUBICO = 1000;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos calcular cuanto cuesta llenar la piscina");
    System.out.println("¿Cuantos metros de profundidad tiene la piscina?");
    double profundidad = Double.parseDouble(sc.nextLine());

    System.out.println("¿Cuantos metros mide largo?");
    double largo = Double.parseDouble(sc.nextLine());

    System.out.println("¿Cuantos metros mide ancho?");
    double ancho = Double.parseDouble(sc.nextLine());

    System.out.println("¿Cuanto cuesta el litro de agua?(En litros)");
    double precio = Double.parseDouble(sc.nextLine());

    double total = ((profundidad * ancho * largo) * LITROS_POR_METRO_CUBICO) * precio;

    System.out.printf(Locale.US, "El precio total de llenar la piscina es: %f €", total);
  }

}
