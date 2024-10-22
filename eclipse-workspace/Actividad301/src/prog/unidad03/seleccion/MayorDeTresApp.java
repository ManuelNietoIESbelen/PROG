package prog.unidad03.seleccion;

import java.util.Scanner;

public class MayorDeTresApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num1=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce otro numero entero");
    int num2=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce otro numero entero");
    int num3=Integer.parseInt(sc.nextLine());
    
    
    boolean esMayor1= num1>num2 && num1>num3;
    boolean esMayor2= num2>num3 && num2>num1;
   

    
    System.out.println("El numero mayor es: "+(esMayor1 ? num1: (esMayor2 ? num2 :num3)));
  }

}
