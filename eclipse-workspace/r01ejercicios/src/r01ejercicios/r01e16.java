package r01ejercicios;
 import java.util.*;
public class r01e16 {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("¿Cuanto invierte la primera persona?");
    double inversion1 = Double.parseDouble(sc.nextLine());
    System.out.println("¿Cuanto invierte la segunda persona?");
    double inversion2 = Double.parseDouble(sc.nextLine());
    System.out.println("¿Cuanto invierte la tercera persona?");
    double inversion3 = Double.parseDouble(sc.nextLine());
    
    double valorTotal= inversion1+inversion2+inversion3;
    double porcen1= inversion1*100/valorTotal;
    double porcen2= inversion2*100/valorTotal;
    double porcen3= inversion3*100/valorTotal;
    
    System.out.printf("Primera persona: %f  , segunda persona: %f , tercera persona: %f ",porcen1,porcen2,porcen3);
  }

}
