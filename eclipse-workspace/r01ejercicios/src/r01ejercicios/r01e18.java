package r01ejercicios;

import java.util.*;
public class r01e18 {

  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("¿Escribe la nota de tu primer examen?");
    double nota1= Double.parseDouble(sc.nextLine());
    System.out.println("¿Escribe la nota de tu segundo  examen?");
    double nota2= Double.parseDouble(sc.nextLine());
    System.out.println("¿Escribe la nota de tu tercer  examen?");
    double nota3= Double.parseDouble(sc.nextLine());
    
    System.out.println("¿Escribe la nota de tu tercer  examen?");
    double notaExamenFinal= Double.parseDouble(sc.nextLine());
    
    System.out.println("¿Escribe tu nota de clase?");
    double notaClase= Double.parseDouble(sc.nextLine());
    
    double notaFinal= (((nota1+nota2+nota3)/3)*0.55)+(notaExamenFinal*0.3)+(notaClase*0.15);
      
    System.out.printf("La nota final el: %f ",notaFinal);
    
    

  }

}
