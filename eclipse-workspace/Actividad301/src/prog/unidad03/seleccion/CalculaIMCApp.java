package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaIMCApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el peso en kilogramos");
    double peso = Double.parseDouble(sc.nextLine());
    System.out.println("Introduzca la altura en metros");
    double altura = Double.parseDouble(sc.nextLine());

    double imc = peso / (altura * altura);

    while (peso < 0 || altura < 0) {
      System.out.println("LOS DATOS SON INCORRECTOS, POR FAVOR INTENTELO DE NUEVO");
      System.out.println("Introduzca el peso en kilogramos");
      peso = Double.parseDouble(sc.nextLine());
      System.out.println("Introduzca la altura en metros");
      altura = Double.parseDouble(sc.nextLine());
    }

    if (imc < 16) {
      System.out.printf("Su IMC es de %f con un diagnostico de : Ingreso en hospital por infrapeso", imc);
    } else if (16 <= imc && imc < 17) {
      System.out.printf("Su IMC es de %f con un diagnostico de : infrapeso", imc);
    } else if (17 <= imc && imc < 18) {
      System.out.printf("Su IMC es de %f con un diagnostico de : Bajopeso", imc);
    } else if (18 <= imc && imc < 25) {
      System.out.printf("Su IMC es de %f con un diagnostico de : Peso normal (Saludable)", imc);
    } else if (25 <= imc && imc < 30) {
      System.out.printf("Su IMC es de %f con un diagnostico de : Sobrepeso (obsesidad de grado I)", imc);
    } else if (30 <= imc && imc < 35) {
      System.out.printf("Su IMC es de %f con un diagnostico de : sobrepeso crónico (obesidad de grado II)", imc);
    } else if (35 <= imc && imc < 40) {
      System.out.printf("Su IMC es de %f con un diagnostico de: Obesidad premorbida (obesidad de grado III)", imc);
    } else {
      System.out.printf("Su IMC es de %f con un diagnostico de : Obesidad morbida (obesidad de grado IV)", imc);
    }

  }
}
