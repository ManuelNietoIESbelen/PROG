package pro.unidad03.repeticion;

import java.util.Scanner;

public class SumaIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce un numero mayor que el anterior");
    int num2 = Integer.parseInt(sc.nextLine());
    
    int suma=0;

    while (num1 > num2) {
      System.out.println("ERROR AL INTORDUCIR LOS NUMEROS");
      System.out.println("Introduce un numero de nuevo");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce un numero mayor que el anterior");
      num2 = Integer.parseInt(sc.nextLine());
    }
    
    for(int i=num1;i<=num2;i++) {
      suma+=i;
    
    }
    System.out.printf("La suma total es  %d %n",suma);
  }

}
