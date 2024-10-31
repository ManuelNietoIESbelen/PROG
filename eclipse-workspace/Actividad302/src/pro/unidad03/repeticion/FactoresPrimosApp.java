package pro.unidad03.repeticion;

import java.util.Scanner;

public class FactoresPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num = Integer.parseInt(sc.nextLine());
    int divisores = 0;
    if (num > 1) {
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          divisores++;
        }
      
          if (divisores > 0) {
            
          }else {
            System.out.printf("%d es un factor primo %n", i);
          }
        }
      }
    }
  
}
