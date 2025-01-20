package MitablaConTotalesApp;

import java.util.Iterator;
import java.util.Scanner;

public class MiTablaConTotalesApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] tabla = new int[4][5];
    int[] sumaFilas = new int[4];
    int[] sumaColumnas = new int[5];
    int total = 0;
    for (int j = 0; j < tabla.length; j++) {
      for (int k = 0; k < tabla[j].length; k++) {
        System.out.printf("introduce el numero de la casilla (%d, %d): ", j+1, k+1);
        int valor = Integer.parseInt(sc.nextLine());
        tabla[j][k] = valor;
        sumaFilas[j] += valor;
        sumaColumnas[k] += valor;
        total += tabla[j][k];
      }
    }

    imprimir(tabla, sumaFilas, sumaColumnas, total);
  }

  public static void imprimir(int[][] array, int[] totalFilas, int[] totalColumnas, int total) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%5d", array[i][j]);
      }
      System.out.printf(" %5d%n", totalFilas[i]);
    }

    for (int j = 0; j < totalColumnas.length; j++) {
      System.out.printf("%5d", totalColumnas[j]);
    }
    System.out.printf(" %5d%n", total);
  }
}

