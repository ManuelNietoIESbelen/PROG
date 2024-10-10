package r01ejercicios;

import java.util.*;

public class r01e25 {

  public static void main(String[] args) {
    boolean comprobar = false;
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe un numero entero");
    int num = Integer.parseInt(sc.nextLine());

    if (num % 2 == 0) {
      comprobar = true;

    }
    System.out.println(comprobar);
  }

}
