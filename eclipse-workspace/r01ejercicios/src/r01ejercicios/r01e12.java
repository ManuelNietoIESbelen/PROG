package r01ejercicios;
import java.util.*;
public class r01e12 {

  private static final double PI = 3.14;

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Vamos a calcular el volumen de un cono ¿que valor tiene el radio?");
    double radio=Double.parseDouble(sc.nextLine());
    
    System.out.println("¿Que valor tiene la altura?");
    double altura=Double.parseDouble(sc.nextLine());
    
    double volumen= (PI*radio*radio*altura)/3;
    
    System.out.printf("El volumen del cono es: %f metros cubicos",volumen);
    
  }

}
