package pro.unidad03.repeticion;

import java.util.Scanner;

public class MediaPositivosApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=0;
    int total=0;
    int contador=0;
    
    do {
     System.out.println("Introduce un numero real positivo o cero(negativopara terminar)");
      num=Integer.parseInt(sc.nextLine());
       total += num;
       contador++; 
    }
    while(num>=0); 
    total=total+1;
    contador=contador-1;
    System.out.println(total);
    System.out.println(contador);
    int media=total/contador;
    
    System.out.printf("La media de los numeros que has introducido es %d %n",media);
  }

}
