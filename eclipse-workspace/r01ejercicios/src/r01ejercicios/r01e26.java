package r01ejercicios;
import java.util.*;
public class r01e26 {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    boolean comprobar = false;
    
    System.out.println("Escribe la nota de la primera evaluación");  
    int nota1=Integer.parseInt(sc.nextLine());
    
    System.out.println("Escribe la nota de la segunda evaluación");  
    int nota2=Integer.parseInt(sc.nextLine());
    
    System.out.println("Escribe la nota de la tercera evaluación");  
    int nota3=Integer.parseInt(sc.nextLine());
    
    int media= (nota1+nota2+nota3)/3;
    if(media>=5){
      comprobar=true;
    }
    
    System.out.println(comprobar);
    
    
    
  }

}
