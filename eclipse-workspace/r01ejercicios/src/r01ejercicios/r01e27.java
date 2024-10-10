package r01ejercicios;

import java.util.*;

public class r01e27 {

  public static void main(String[] args) {
    boolean comprobar = false;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tu edad");
    int edad = Integer.parseInt(sc.nextLine());

    if (edad >= 18) {
      comprobar = true;
    }
    System.out.println(comprobar);
  }

}
