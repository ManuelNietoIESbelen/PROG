package pro.unidad03.repeticion;

import java.util.Scanner;

public class InvierteNumero {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num=Integer.parseInt(sc.nextLine());
    int invertido=0;
    while(num>0) {
      int ultimoDigito=num%10;
      invertido=(invertido*10)+ultimoDigito;
      num=num/10;
    }
    System.out.println(invertido);
    

    
  }

}
  
  