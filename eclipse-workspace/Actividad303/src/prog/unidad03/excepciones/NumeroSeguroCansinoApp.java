package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroCansinoApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Introduccion de numero seguro Cansino");
    int num=-1;
    boolean terminar= false;
    do {
    try {
      
      System.out.println("Introduce un numero");
       num = Integer.parseInt(sc.nextLine());
      
      System.out.printf("El numero introducido es : %d",num);
      terminar=true;
      
    } catch (NumberFormatException e) {
      System.out.println("El dato introducido no es un numero valido");
    }
    }while (!terminar);
    
 
  }

}
