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
    
    

    int mayor1=(num1>num2) ? num1 : num2;
    int mayor2=(mayor1>num3) ? mayor1:num3;

    
    System.out.printf("El numero mayor es:  %d",mayor2);
  }

}
