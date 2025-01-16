package actividad502.prog.unidad05.arraysmulti.ejercicio1;

import java.util.Scanner;

public class MiPrimerArrayBidimensional {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MI PRIMER ARRAY BIDIMENSIONAL");
    System.out.println("-----------------------------");

    int[][] tabla = { { 35, 12, 64, 69, 0, 93 }, { 0, 12, 0, 0, 92, 97 }, { 13, 0, 33, 0, 0, 0 } };

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.printf("%5d",tabla[i][j]);
      }
      System.out.println("");
    }
  }

}
