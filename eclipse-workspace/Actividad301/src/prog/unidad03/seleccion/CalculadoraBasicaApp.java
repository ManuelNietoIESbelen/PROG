package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la operacion a realizar S(suma) R(resta) P(producto) D(division)");
    char operacion = sc.nextLine().charAt(0);
    
    System.out.println("Introduce el primer operando:");
    double num1 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el segundo operando:");
    double num2 = Double.parseDouble(sc.nextLine());
    
    double resultado;
    
    switch (operacion) {
    case 'S':
      resultado = num1 + num2;
      System.out.printf("El resultado de la operacion es %f: ",resultado);
      break;
    case 'R':
      resultado = num1 - num2;
      System.out.printf("El resultado de la operacion es: %f ", resultado);
      break;
    case 'P':
      resultado = num1 * num2;
      System.out.printf("El resultado de la operacion es: %f ", resultado);
      break;
    case 'D':
      resultado = num1 / num2;
      System.out.printf("El resultado de la operacion es: %f ", resultado);
      break;
    }

  }

}
