package prog.unidad06.examen.ejercicio2;

public class dni {
  import java.util.regex.*;
  import java.util.Scanner;

  public class validarDNI {
      public static void main(String[] args) {
          String dniIntroducido = null;
          Scanner miScanner = new Scanner(System.in);
          Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
          System.out.print("Introduce un DNI correcto: ");
          dniIntroducido = miScanner.nextLine();
          Matcher mat = patron.matcher(dniIntroducido);
          while(!mat.matches()){
             System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
             System.out.print("Introduce un DNI correcto: ");
             dniIntroducido = miScanner.nextLine();
             mat = patron.matcher(dniIntroducido);
          }
          System.out.println("El DNI " + dniIntroducido + " es válido.");
      }
  }
}
