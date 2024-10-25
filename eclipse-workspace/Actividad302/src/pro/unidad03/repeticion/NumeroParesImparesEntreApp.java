package pro.unidad03.repeticion;

import java.util.Iterator;
import java.util.Scanner;

public class NumeroParesImparesEntreApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce un numero");
    int num2 = Integer.parseInt(sc.nextLine());
    
    
    if(num2<=num1) {
      System.out.println("ERROR");
    }else {
    for (int i=num1; i<num2; i++) {
      if(i%2==0) {
        System.out.printf("El numero %d es par %n",i);
      }else {
        System.out.printf("El numero %d es impar %n",i);
      }
    }
  }
  }
}
