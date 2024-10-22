package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce la nota de mates:");
    double notaMates=Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la nota de lengua:");
    double notaLengua=Double.parseDouble(sc.nextLine());
    
    if(notaMates < 5 && notaLengua<5) {
      System.out.println("Como has suspendido las dos, repites");
    }else if(notaMates < 5 && notaLengua >=5 || notaMates >= 5 && notaLengua <5) {
      System.out.println("Has suspendido una asique pasas con pendientes");
    }else if (notaMates>=5 && notaLengua>=5){
      System.out.println("Has aprobado todo , pasas sin pendientes");
    }
    
  }

}
