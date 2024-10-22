package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num=Integer.parseInt(sc.nextLine());
    
    if(num/10<1) {
      System.out.println("El numero tiene 1 cifra");
    }else if(num/10<10) {
      System.out.println("El numero tiene 2 cifras");
    }else if(num/10<100) {
      System.out.println("El numero tiene 3 cifras");
  }else {
    System.out.println("El numero tiene mas de 3 cifras");
  }
  }
}
