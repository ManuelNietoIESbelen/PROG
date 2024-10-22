
package r01ejercicios;

import java.util.*;

public class r01e28 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean comprobar = false;

    System.out.println("Escribe una edad");
    int edad1 = Integer.parseInt(sc.nextLine());

    System.out.println("Escribe otra edad");
    int edad2 = Integer.parseInt(sc.nextLine());

    System.out.println("Escribe otra edad");
    int edad3 = Integer.parseInt(sc.nextLine());

    if (edad1 > edad2 && edad2 > edad3) {

      comprobar = true;
    }

    System.out.println(comprobar);
  }

}
