package r01ejercicios;

import java.util.*;

public class r01e20 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a calcular el area del terreno");
    System.out.println("¿cual es el valor de a?");
    double a = Double.parseDouble(sc.nextLine());

    System.out.println("¿cual es el valor de b?");
    double b = Double.parseDouble(sc.nextLine());

    System.out.println("¿cual es el valor de c?");
    double c = Double.parseDouble(sc.nextLine());

    double area = ((a - c) * b) / 2 + c * b;

    System.out.printf("El area tota es: %f metros cuadrados", area);
  }

}
