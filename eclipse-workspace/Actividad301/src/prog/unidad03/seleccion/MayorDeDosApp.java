package prog.unidad03.seleccion;

import java.util.Scanner;

public class MayorDeDosApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num1=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce otro numero entero");
    int num2=Integer.parseInt(sc.nextLine());
    
    
    boolean esMayor= num1>num2;
    
    
    System.out.println("El numero mayor es: "+(esMayor ? num1: num2));
  }

}
