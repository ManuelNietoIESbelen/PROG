import java.util.Scanner;

public class Prueba {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Persona suj1 = new Persona();
    Persona suj2 = new Persona();
    Persona suj3 = new Persona();

    String nombre1, nombre2, nombre3;
    String intento;

    System.out.println("Nombre:");
    nombre1 = sc.nextLine();
    System.out.println("Edad:");
    suj1.edad = Integer.parseInt(sc.nextLine());
//    System.out.println("peso:");
//    suj1.peso = Integer.parseInt(sc.nextLine());
    System.out.println("Nombre:");
    nombre2 = sc.nextLine();
    System.out.println("Edad:");
    suj2.edad = Integer.parseInt(sc.nextLine());
//    System.out.println("peso:");
//    suj2.peso = Integer.parseInt(sc.nextLine());
    System.out.println("Nombre:");
    nombre3 = sc.nextLine();
    System.out.println("Edad:");
    suj3.edad = Integer.parseInt(sc.nextLine());
//    System.out.println("peso:");
//    suj3.peso = Integer.parseInt(sc.nextLine());

    int edad1 = suj1.edad;
    int edad2 = suj2.edad;
    int edad3 = suj3.edad;

    System.out.printf(" %s tiene %d años y pesa %f kg %n", nombre1, suj1.edad, suj1.peso);
    System.out.printf(" %s tiene %d años y pesa %f kg %n", nombre2, suj2.edad, suj2.peso);
    System.out.printf(" %s tiene %d años y pesa %f kg %n", nombre3, suj3.edad, suj3.peso);

    if (edad1 > edad2 && edad1 > edad3) {
      System.out.printf("El capitan es %s porque es el mayor", nombre1);
    } else if (edad2 > edad1 && edad2 > edad3) {
      System.out.printf("El capitan es%s porque es el mayor", nombre2);
    } else {
      System.out.printf("El capitan es %s porque es el mayor %n", nombre3);

    }
    System.out.println("¿Quien es el siguiente mas mayor?");
    intento = sc.nextLine();

    while (!nombre2.equals(intento)) {
      System.out.println("Prueba otra vez¿Quien es el siguiente mas mayor?");
      intento = sc.nextLine();
    }
    System.out.println("Has acertado, muy bien");

  }
}
