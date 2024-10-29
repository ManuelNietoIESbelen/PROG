package pro.unidad03.repeticion;

import java.util.Scanner;

public class CuentaPositivosApp {
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.println("Introduce un numero (negativo si quieres terminar el programa)");
  int num=Integer.parseInt(sc.nextLine());
  int contadorPositivos=0;

  do {
    System.out.println("Introduce un numero (negativo si quieres terminar el programa)");
    num = Integer.parseInt(sc.nextLine());
    contadorPositivos++;
  } while (num > 0);
  
  System.out.printf("Has introducido %d numeros positivos",contadorPositivos);
}
}
