package r01ejercicios;

import java.util.*;

public class r01e14 {

  private static final int NOTA1 = 5;

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("¿Que deseas sacar de media?");
    double media=Double.parseDouble(sc.nextLine());
    
    double nota2=(media*2)-NOTA1;
    
    System.out.printf("Si quieres tener una media de: %f deber sacar: %f",media,nota2);
    
  }

}
