package r01ejercicios;
import java.util.*;
public class r01e19 {

  private static final double PI = 3.14;

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("¿Cual es el radio de la circunferencia?");
    double r= Double.parseDouble(sc.nextLine());
    
    
    double longitud=r*2*PI;
    double area= (Math.pow(r, 2))*PI;
    
    System.out.printf("La longitud es: %f cm cuadrados",longitud);
    
    System.out.printf("La el area es: %f cm cuadrados",area);
  
  }

}
