package prog.unidad06.ficheros.ejercicio02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribeFicheroTextoApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Introduce la ruta del archivo que quieres crear: ");
    String rutaFichero = sc.nextLine();

    EscribirFichero(rutaFichero);

  }

  private static void EscribirFichero(String rutaFichero) {
    Scanner sc = new Scanner(System.in);
    String linea = null;
    try (PrintWriter escritor = new PrintWriter(new FileWriter(rutaFichero))) {
      System.out.println("Fichero Iniciado con exito. Introduzca el texto");
      do {
        System.out.print("Texto de la linea: ");
        linea = sc.nextLine();
        escritor.printf("%s%n", linea);
      } while (!linea.isBlank());

    } catch (IOException e) {
      System.out.println("error");
    }

  }
}
