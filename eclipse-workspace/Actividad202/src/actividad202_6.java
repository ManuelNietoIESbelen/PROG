import java.util.Scanner;

public class actividad202_6 {

  public static void main(String[] args) {
    Persona persona1= new Persona();
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Introduce la edad de la persona");
    persona1.edad=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el numero de hijos");
    persona1.numeroHijos=Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el peso de la persona");
    persona1.peso=Double.parseDouble(sc.nextLine());
    
    
    
    
    System.out.printf("La primera persona tiene %d años, %d hijos y pesa %f kg %n",persona1.edad,persona1.numeroHijos,persona1.peso);

    
    
    
    
  }

}