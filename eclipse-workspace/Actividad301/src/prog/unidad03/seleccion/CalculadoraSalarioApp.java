package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {

  private static final int HORAS_NORMALES_MAXIMAS = 40;
  private static final int EUROS_POR_HORAS_EXTRAS = 20;
  private static final int EUROS_POR_HORAS_NORMALES = 16;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de horas trabajadas");
    int horas = Integer.parseInt(sc.nextLine());

    int horasExtra = horas - HORAS_NORMALES_MAXIMAS;
    int horasNormales = horas - horasExtra;
    double salario = horasNormales * EUROS_POR_HORAS_NORMALES + horasExtra * EUROS_POR_HORAS_EXTRAS;

    if (horasExtra > 1) {
      System.out.printf("El salario por trabajar %d horas normales y %d horas extra es %f €", horasNormales, horasExtra,
          salario);
    } else {
      System.out.printf("El salario por trabajar %d horas normales es de: %f €", horas, salario);
    }

  }

}
