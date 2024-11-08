package prog.unidad03.combinado;

import java.util.Scanner;

public class ParImparFibonacciApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fibo = 0;
    int primerNum = 0;
    int segundoNum = 1;
    boolean terminar = false;

    do {
      try {
        System.out.println("introduce un numero entero");
        int num = Integer.parseInt(sc.nextLine());
        
        if (num % 2 == 0) {
          System.out.println("El numero es par");
        } else {
          System.out.println("El numero es impar");
        }
        if (num >= 0) {
          System.out.println("El numero es positivo");
          for (int i = 1; i < num; i++) {
            fibo = primerNum + segundoNum;
            segundoNum = primerNum;
            primerNum = fibo;
          }
          System.out.printf("El elemento %d de la sucesion de fibonacci es %d", num, fibo);
          terminar = true;
        } else {

          System.out.println("El numero es negativo");
          terminar = true;
        }

      } catch (NumberFormatException e) {
        System.out.println("Entrada no válida. Debe introducir un numero entero");
      }
    } while (!terminar);
  }

}
