package prog.unidad02.actividad206;

import java.util.Scanner;
import java.lang.String;
import es.iespablopicasso.programacion.bloque02.figuras.Paralelogramo;

import java.util.Random;

public class ParalelogramosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("EXAMEN DE: Manuel Ángel Nieto Jiménez");
    System.out.println("Introduce un numero real para el valor del lado horizontal(Mayor que 0)");
    double ladoHorizontal = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce los limites de un intervalo");
    System.out.println("incio:");
    double inicio = Double.parseDouble(sc.nextLine());
    System.out.println("final:");
    double fin = Double.parseDouble(sc.nextLine());

    Random numRam = new Random();
    double ladoVertical = numRam.nextDouble(inicio, fin);
    System.out.printf("El valor del lado generado de forma aleatoria es: %f %n", ladoVertical);

    Paralelogramo paralelogramo1 = new Paralelogramo(ladoHorizontal, ladoVertical);

    String puntoComa = ";";
    String areaPe = paralelogramo1.getAreaPerimetro();
    
    
    System.out.println(areaPe);
    System.out.println(areaPe.split(puntoComa));
    
    System.out.println("Introduce un valor real para la escala");
    double escala = Double.parseDouble(sc.nextLine());

  }

}
