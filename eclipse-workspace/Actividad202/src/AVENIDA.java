import java.util.Scanner;
public class AVENIDA {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Persona suj1 = new Persona();
    Persona suj2 = new Persona();
    Persona suj3 = new Persona();
    
    String nombre1,nombre2,nombre3;
    
    System.out.println("Nombre:");
    nombre1=sc.nextLine();
    System.out.println("Edad:");
    suj1.edad=Integer.parseInt(sc.nextLine());
    System.out.println("peso:");
    suj1.peso=Integer.parseInt(sc.nextLine());
    System.out.println("Nombre:");
    nombre2=sc.nextLine();
    System.out.println("Edad:");
    suj2.edad=Integer.parseInt(sc.nextLine());
    System.out.println("peso:");
    suj2.peso=Integer.parseInt(sc.nextLine());
    System.out.println("Nombre:");
    nombre3=sc.nextLine();
    System.out.println("Edad:");
    suj3.edad=Integer.parseInt(sc.nextLine());
    System.out.println("peso:");
    suj3.peso=Integer.parseInt(sc.nextLine());
    
    System.out.printf(" %s tiene %d años y pesa %f kg %n",nombre1,suj1.edad,suj1.peso);
    System.out.printf(" %s tiene %d años y pesa %f kg %n",nombre2,suj2.edad,suj2.peso);
    System.out.printf(" %s tiene %d años y pesa %f kg %n",nombre3,suj3.edad,suj3.peso);

    
    

    
  }

}
