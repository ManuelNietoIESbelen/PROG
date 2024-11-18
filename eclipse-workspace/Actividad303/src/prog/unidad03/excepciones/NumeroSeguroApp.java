package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    try {
      System.out.println("Introduce un numero");
      int num= Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Lo que has introducido no es un numero");
    }

}}
