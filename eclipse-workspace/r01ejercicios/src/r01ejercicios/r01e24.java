package r01ejercicios;

import java.util.*;

public class r01e24 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuanto ha durado la llamada?(MINUTOS)");
    int dur=Integer.parseInt(sc.nextLine());
    System.out.println("¿Cuanto cuesta la llamada?(EUROS)");
    int coste=Integer.parseInt(sc.nextLine());
    System.out.println("¿Cuanto pagas por minuto?(EUROS)");
    int costeMinutos=Integer.parseInt(sc.nextLine());
    
   int  total=coste+costeMinutos*dur;
    System.out.printf("El total que tienes que pagar es: %d",total);
    
    
  }

}
