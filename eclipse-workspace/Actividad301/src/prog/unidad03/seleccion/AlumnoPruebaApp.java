package prog.unidad03.seleccion;

import java.util.Scanner;

public class AlumnoPruebaApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("introduce la nota de la primera evaluacion");
    double nota1=Double.parseDouble(sc.nextLine());
    System.out.println("introduce la nota de la segunda evaluacion");
    double nota2=Double.parseDouble(sc.nextLine());
    System.out.println("introduce la nota de la tercera  evaluacion");
    double nota3=Double.parseDouble(sc.nextLine());
    
    
    double media = (nota1+nota2+nota3)/3;
    
    if(media >= 5) {
      System.out.printf("El alumno ha aprobado con una nota de %f",media);
    }else {
      System.out.printf("El alumno ha suspendido con una nota de %f",media);
    }
    
    
  }

}
