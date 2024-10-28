package pro.unidad03.repeticion;

import java.util.Scanner;

public class CalcularDivisoresApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero mayor que 0");
    int num= Integer.parseInt(sc.nextLine());
    
      for(int i=1;i<=num;i++) {
        if(num%i==0) {
          System.out.printf("Es divisible por %d %n",i);
        }
      }
    
  }

}
