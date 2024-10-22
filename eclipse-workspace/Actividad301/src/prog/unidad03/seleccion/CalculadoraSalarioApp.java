package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce el numero de horas trabajadas");
    int horas=Integer.parseInt(sc.nextLine());
    int horasExtra= horas-40;
    int horasNormales= horas-horasExtra;
    double salario= horasNormales*16+horasExtra*20;
    
    if (horasExtra>1) {
          System.out.printf("El salario por trabajar %d horas normales y %d horas extra es %f €",horasNormales,horasExtra,salario);
    }else {
      System.out.printf("El salario por trabajar %d horas normales es de: %f €",horas,salario);
    }
    
    
  }

}
