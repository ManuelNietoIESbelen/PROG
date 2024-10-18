import java.util.Scanner;

public class Actividad203_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la parte real de un numero complejo");
    double parteReal1 = Double.parseDouble(sc.nextLine());

    System.out.println("Introduce la parte imaginaria de un numero complejo");
    double parteIma1 = Double.parseDouble(sc.nextLine());

    System.out.println("Introduce la parte real de un numero complejo");
    double parteReal2 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la parte imaginaria de un numero complejo");
    double parteIma2 = Double.parseDouble(sc.nextLine());

    Complejo comp1 = new Complejo(parteReal1, parteIma1);
    Complejo comp2 = new Complejo(parteReal2, parteIma2);


    System.out.println("suma: " + comp1.sumar(comp2));
    System.out.println("resta: " + comp1.restar(comp2));
    System.out.println("producto: " + comp1.multiplicar(comp2));
    System.out.println("cociente: " + comp1.dividir(comp2));
  }

}
