import java.util.*;

public class hola1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Por favor, introduce tu nombre:");
    String nombre = sc.nextLine();

  
    System.out.println("Hola " + nombre + ", bienvenido al ejercicio de inversión de cadenas.");


    System.out.println("Por favor, introduce una cadena de texto para invertir:");
    String cadena = sc.nextLine();


    String cadenaInvertida = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {  
        cadenaInvertida += cadena.charAt(i);
    }

  
    System.out.println("La cadena invertida es: " + cadenaInvertida);

    System.out.println("¡Gracias por completar el ejercicio, " + nombre + "!");


    sc.close();
      }
   
  }


