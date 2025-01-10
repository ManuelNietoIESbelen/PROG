package prog.unidad05.arrayuni;

import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("OPERACIONES VARIAS SOBRE UN ARRAY DE 8 ELEMENTOS");
    System.out.println("A continuacion se van a solicitar 8 numeros reales");

    double[] numeros = new double[8];

    double sumaTotal=0;
    double sumaTotalMayores=0;
    int numerosMayores50=0;
    double sumaTotalMedia=0;
    int contador=0;

    
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Introduce el numero " + (i + 1) + ": ");
      double numeroUsuario = Double.parseDouble(sc.nextLine());
      numeros[i] = numeroUsuario;
       sumaTotal += numeroUsuario;
      if (numeroUsuario > 36) {
         sumaTotalMayores += numeroUsuario;
      }
      if (numeroUsuario > 50) {
        numerosMayores50++;
     }
      if(numeroUsuario>=10 && numeroUsuario<=30) {
        sumaTotalMedia += numeroUsuario;
        contador++;
      }
    }
    
    System.out.println("Suma total: "+sumaTotal);
    System.out.println("Suma total de los elementos mayores a 36: "+sumaTotalMayores);
    System.out.println("Cantidad de elementos mayores a 50 es de: "+numerosMayores50);
    System.out.println("Media de los elementos compredidos entre 10 y 30: "+sumaTotalMedia/contador);
  }

}
