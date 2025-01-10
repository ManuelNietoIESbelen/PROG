package prog.unidad05.arrayuni;

import java.util.Scanner;

public class ej2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("La longitud de la coleccion");
    int longitud = Integer.parseInt(sc.nextLine());

    System.out.println("el valor minimo de la coleccion");
    int valorMinimo = Integer.parseInt(sc.nextLine());

    System.out.println("el valor maximo de la coleccion");
    int valorMaximo = Integer.parseInt(sc.nextLine());


    int[] numeros = generarArrayEnteroAleatorio(longitud, valorMinimo, valorMaximo);
    

    for (int numero : numeros) {
      System.out.println(numero);
    }

  }

  public static int[] generarArrayEnteroAleatorio(int longitud, int valorMinimo, int valorMaximo) {
    int[] numeros = new int[longitud];
    int rango = (valorMaximo - valorMinimo) + 1;

    for (int i = 0; i < numeros.length; i++) {
      int random = (int) (Math.random() * rango) + valorMinimo;
      numeros[i] = random;
    }
    
    return numeros;
  }

}
