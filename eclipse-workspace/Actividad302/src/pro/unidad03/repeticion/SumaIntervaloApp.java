package pro.unidad03.repeticion;

import java.util.Scanner;

public class SumaIntervaloApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num1=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce un numero mayor que el anterior");
    int num2=Integer.parseInt(sc.nextLine());
     
    if(num1>num2) {
      
    }else {
      System.out.println("Error de inicio de sesion");
    }
  }

}
