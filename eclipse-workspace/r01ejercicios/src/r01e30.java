import java.util.*;

public class r01e30 {

  public static void main(String[] args) {
    int num;
  

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero porfavor");
    num = Integer.parseInt(sc.nextLine());

   boolean comprobar =num / 10 < 10 && num / 10 > 1 ==false;
  

    System.out.println(comprobar);

  }

}
