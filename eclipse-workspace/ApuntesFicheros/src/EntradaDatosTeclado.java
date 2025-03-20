import java.util.Scanner;

public class EntradaDatosTeclado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Introduce tu edad: ");
    int edad = Integer.parseInt(sc.nextLine()); // Evita problemas con nextInt()

    System.out.printf("Hola %s, tienes %d años.%n", nombre, edad);

    sc.close();
  }
}
