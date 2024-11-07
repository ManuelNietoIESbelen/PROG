import java.util.Scanner;

public class EjerciciosTraza {

  public static void main(String[] args) {
    int a, b, menor, mcd;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    a = sc.nextInt();
            
    System.out.print("Introduce un número: ");
    b = sc.nextInt();
    
    // Calculo el menor
    mcd = (a<b) ? a : b;

// Hallo el mcd
    while (mcd>0 && (a%mcd!=0 || b%mcd!=0)){
        mcd--;
    }
    
    System.out.println("El MCD es " + mcd);
}
}
