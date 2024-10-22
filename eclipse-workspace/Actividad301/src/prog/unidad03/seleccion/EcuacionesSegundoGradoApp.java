package prog.unidad03.seleccion;

import java.util.Scanner;

public class EcuacionesSegundoGradoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor de a:");
    double a = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el valor de b:");
    double b = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el valor de c:");
    double c = Double.parseDouble(sc.nextLine());

    double resultado1 = (-b + Math.sqrt((b * b) - 4 * c * a)) / 2 * a;
    double resultado2 = (-b - Math.sqrt((b * b) - 4 * c * a)) / 2 * a;

    double dicriminante = (b * b) - 4 * c * a;

    if (dicriminante >= 0) {
      if (resultado1 == resultado2) {
        System.out.printf("La ecuacion tiene dos soluciones reales e iguales%n son : %f y%f ", resultado1, resultado2);
      } else if (resultado1 != resultado2) {
        System.out.printf("La ecuacion tiene dos soluciones reales pero no iguales%n son : %f y%f ", resultado1, resultado2);
      }
    }else{
      System.out.printf("La ecuacion  no tiene soluciones reales");
    }

  }
}
