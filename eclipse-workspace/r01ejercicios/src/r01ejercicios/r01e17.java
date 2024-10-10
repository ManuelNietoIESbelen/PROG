package r01ejercicios;
import java.util.*;
public class r01e17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuanto es el presupuesto anual del hospital?");
    double presupuesto = Double.parseDouble(sc.nextLine());
    
    double gine=presupuesto*0.4;
    double trauma=presupuesto*0.35;
    double pedi=presupuesto*0.25;
    
    System.out.printf("El presupuesto de ginecologia es: %f €, el de traumatologia es: %f €, el de pediatria es: %f €",gine,trauma,pedi);
  }

}
