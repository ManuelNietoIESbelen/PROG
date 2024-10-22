package r01ejercicios;
import java.util.*;
public class r01e15 {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("¿Cuanto es el salario base?");
    double salarioBase=Double.parseDouble(sc.nextLine());
    
    double totalSalario= salarioBase+((0.1*salarioBase)*3);
    
    System.out.printf("Cobra en total: %f €",totalSalario);
      
  }

}
