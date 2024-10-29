package pro.unidad03.repeticion;

import java.util.Scanner;

public class PositivoNegativoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    do {
      System.out.println("Introduce un numero (0 si quieres terminar el programa)");
      num = Integer.parseInt(sc.nextLine());
      if (num < 0) {
        System.out.printf("El numero %d es negativo %n", num);
      } else if(num>0) {
        System.out.printf("El numero %d es positivo %n", num);
      }
    } while (num != 0);

  }

}
