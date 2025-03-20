package prog.unidad06.ficheros.ejercicio01;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MuestraFicheroTextoApp {
 
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.printf("Introduce la ruta del archivo a mostrar: ");
    String rutaFichero = sc.nextLine();
    
    System.out.printf("Contenido de %s ",rutaFichero);  
    
    leerFichero(rutaFichero);
    
  }
  
  private static void leerFichero(String rutaFichero) {
  try(BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))){
    String linea= null;
      do {
       linea = lector.readLine();
       if (linea!= null) {
        System.out.println(linea);
      }
       
      }while(linea!=null);
    
  }catch(FileNotFoundException e) {
    
  }catch(IOException e) {
    
  }
  
}
}
