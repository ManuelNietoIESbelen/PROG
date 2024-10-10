package r01ejercicios;

import java.util.*;

public class r01e11 {

  private static final int EUROS_POR_HORA = 12;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuantas horas has trabajado esta semana?");
    int horasTrabajadas = Integer.parseInt(sc.nextLine());

    int salario = horasTrabajadas * EUROS_POR_HORA;

    System.out.printf("El salario semanal es: %d €", salario);

  }

}
