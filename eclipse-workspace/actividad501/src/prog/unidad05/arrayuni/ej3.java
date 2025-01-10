package prog.unidad05.arrayuni;

import java.util.Scanner;

public class ej3 {
  public static void main(String[] args) {
    int[] notas = {10, 9, 10, 1, 4, 4, 0, 9, 6, 9,10, 9, 10, 1, 4, 4, 0, 9, 6, 9,10, 9, 10, 1, 4, 4, 0, 9, 6, 9};
    Scanner sc = new Scanner(System.in);


    int notaUsuario = 0;
    
    
    while (notaUsuario >= 0 && notaUsuario <= 10) {
      int contador = 0;
      System.out.println("Introduzca la calificacion a buscar(0 a 10, -1 para terminar): ");
      notaUsuario = Integer.parseInt(sc.nextLine());

      for (int nota : notas) {
        if (notaUsuario==nota) {
          contador++;
        }
      }
      System.out.printf("Con la calificacion %d se han encontrado %d alumnos", notaUsuario, contador);

      
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
