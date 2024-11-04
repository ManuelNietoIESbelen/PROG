package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroCansinoApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Introduccion de numero seguro Cansino");
    int num=-1;
    try {
      while(num!=0) {
      System.out.println("Introduce un numero %n");
       num = Integer.parseInt(sc.nextLine());
      
      System.out.printf("El numero introducido es : %d",num);
      }
    } catch (NumberFormatException e) {
      System.out.println("El dato introducido no es un numero valido");
    }
    
    
 
  }

}
