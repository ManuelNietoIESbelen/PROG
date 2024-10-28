package pro.unidad03.repeticion;

import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero mayor que 0 para calcular su factorial");
    int num=Integer.parseInt(sc.nextLine());
    long fact=1;
     for(int i=1;i<=num;i++) {
       fact=fact*i;   
     }
    System.out.println(fact);
  }

}
