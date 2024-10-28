package pro.unidad03.repeticion;

import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("De que numero quieres mostrar la tabla de multiplicar");
    int num=Integer.parseInt(sc.nextLine());
    
    for(int i=1;i<=10;i++){
      int producto= i*num;
      System.out.printf("%d x %d = %d %n",num,i,producto);
    }
      
  }

}
