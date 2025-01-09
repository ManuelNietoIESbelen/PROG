package arrays;


import java.util.Scanner;

public class arrays {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array1= new int [10];


    int num = 0;


    
    for (int i = 0; i < array1.length; i++) {
      System.out.println("introduce numero");
      num = Integer.parseInt(sc.nextLine());
      array1[i] = num;
     
      
      
    }
    
    System.out.println("que posicion quieres ver");
    int pos = Integer.parseInt(sc.nextLine());
    System.out.println(array1[pos]);
  }
  
  



  
}
