package prog.unidad05.arrayobjetos.ejercicio01;

import java.util.Scanner;

public class GestionaLibrosApp extends Libro {

  public static void main(String[] args) {
    Libro[] libros = new Libro[3];
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("GESTION DE LIBROS");
    System.out.println("------------------");
    System.out.println("(1) Agregar libro");
    System.out.println("(2) Mostrar titulo");
    System.out.println("(3) Buscar libro por titulo");
    System.out.println("(4) Buscar libro por año de publicacion");
    System.out.println("(0) Salir de la aplicacion");
    System.out.print("Introduzca una opcion (0-4): ");
    int numeroMenu=Integer.parseInt(sc.nextLine());
    
    switch (numeroMenu) {
    case 1:    
      
      System.out.printf("Introduce el titulo del libro:");
      String titulo = sc.nextLine();
      System.out.printf("Introduce el nombre del autor:");
      String autor = sc.nextLine();
      System.out.printf("Introduce el año de publicacion:");
      int anyo=Integer.parseInt(sc.nextLine());
      Libro libro = new Libro();
      
      libro.agregarLibro(titulo,autor,anyo);
      
    case 2:
      mostrarLibros();
    }
  }
  
  private void agregarLibro(String titulo,String autor,int anyo) {
    Libro libro = new Libro();
    for (int i = 0; i < libros.length; i++) {
      libro=libros[i];
    }
  }
  private void mostrarLibros() {
   
    for(Libro libro : libros) {
      System.out.printf("Titulo: s%, Autor: s%, Año de publicacion: d%",libro.titulo,libro.autor,libro.anyo);
    }
   }
  
  
  
  
  
}
