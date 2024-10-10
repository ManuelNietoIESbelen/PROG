package prueba;

import java.util.Iterator;
import java.util.Scanner;

public class clase {
  

  public static void main(String[] args) {
    

    int n1, n2;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.println("Escribe un numero");
      n1 = sc.nextInt();
      int suma = 0;
      suma = +n1;
      System.out.println(suma);
      if (suma > 100) {
        System.out.println("SE ACABÓ");

      }
    }

  }
}
