package prog.unidad03.seleccion;

import java.util.Scanner;

public class ClasificarTriangulosApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce la longitud del primer lado");
    double lado1=Double.parseDouble(sc.nextLine());
    
    System.out.println("Introduce la longitud del segundo lado");
    double lado2=Double.parseDouble(sc.nextLine());
    
    System.out.println("Introduce la longitud del tercer lado");
    double lado3=Double.parseDouble(sc.nextLine());
    
    if(lado1==lado2 && lado2==lado3) {
      System.out.println("El trianfulo es equilatero");
    }else if(lado1==lado2 && lado2!=3) {
      System.out.println("El triangulo es isosceles");
    }else {
      System.out.println("El triangulo es escaleno");
    }
    
    
  }

}
