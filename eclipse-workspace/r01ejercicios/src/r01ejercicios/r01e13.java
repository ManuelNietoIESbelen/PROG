package r01ejercicios;
import java.util.*;
public class r01e13 {

  private static final int MB_POR_KB = 1000;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("¿Cuantos MB quieres convertir?");
    int mb=Integer.parseInt(sc.nextLine());
    
    int kb=mb*MB_POR_KB;
    
    System.out.printf("%d MB son %d KB",mb,kb);
  }

}
