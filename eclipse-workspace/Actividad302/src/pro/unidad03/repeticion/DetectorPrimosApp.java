package pro.unidad03.repeticion;

import java.util.Scanner;

public class DetectorPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entero mayor que 1 para ver si es primo o no");
    int num = Integer.parseInt(sc.nextLine());
    int divisores = 0;
    for (int i = 2; i < num; i++) {

      if (num % i == 0) {
        divisores++;
      }
    }
    if(divisores>0) {
      System.out.printf("El numero %d no es primo %n",num);
    }else {
      System.out.printf("el numero %d es primo %n",num);
    }

  }

}
