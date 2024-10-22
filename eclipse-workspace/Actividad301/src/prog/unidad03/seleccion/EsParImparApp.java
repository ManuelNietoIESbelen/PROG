package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num=Integer.parseInt(sc.nextLine());
    
    if(num%2==0) {
      System.out.printf("El numero %d es par",num);
    }else {
      System.out.printf("El numero %d es impar",num);
    }
    
    
  }

}
