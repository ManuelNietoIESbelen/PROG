import java.util.*;

public class claseHola {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombre;
    int cant, num, total=0;
    int div;
    System.out.println("Introduce tu nombre porfavor");
    nombre = sc.nextLine();

    System.out.println("Cuantos numeros quieres sumar");
    cant = sc.nextInt();

    for (int i = 1; i <= cant; i++) {
      System.out.println("Escriba el numero "+i+" "+nombre);
      num = sc.nextInt();
      total+=num;

    }
    System.out.println("La suma total es  " + total);
                                                                                                            
    
    System.out.println("Ahora entre que numero lo quieres dividir?");
    div=sc.nextInt();
    
   total=total/div;
    
    System.out.println("El resultado final es "+ total+" "+nombre);
    
  }
}
