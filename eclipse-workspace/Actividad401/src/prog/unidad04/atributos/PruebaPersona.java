package prog.unidad04.atributos;

import java.util.Scanner;

public class PruebaPersona {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
System.out.println("PROGRAMA DE MANEJO DE PERSONAS");
    
    
    
    
    System.out.print("Introduzca la cantidad de personas a crear (1 o más): ");
    int cantidad=Integer.parseInt(sc.nextLine());
    
    
    for(int i=1; i<=cantidad;i++) {
      Persona persona = new Persona();
      System.out.printf("Introduzca los datos de la persona %d%n",i);
      System.out.printf("Introduzca el nombre de la persona %d%n",i);
      persona.nombre=sc.nextLine();
      System.out.printf("Introduce la edad de la persona %d%n",i);
      persona.edad=Integer.parseInt(sc.nextLine());
      System.out.printf("Introduce el DNI de la persona %d%n",i);
      persona.dni=sc.nextLine();
      System.out.printf("Introduce el sexo de la persona %d%n",i);
      persona.sexo=sc.nextLine().charAt(0);
      System.out.printf("Introduce el peso de la persona %d%n",i);
      persona.peso=Double.parseDouble(sc.nextLine());
      System.out.printf("Introduce la altura de la persona %d%n",i);
      persona.altura=Double.parseDouble(sc.nextLine());
       
   
       
      System.out.printf("Nombre: %s%n",persona.nombre);
      System.out.printf("Edad: %d%n",persona.edad);
      System.out.printf("DNI: %s%n",persona.dni);
      System.out.printf("Sexo: %c%n",persona.sexo);
      System.out.printf("Peso: %f%n",persona.peso);
      System.out.printf("Altura: %f%n",persona.altura);
    }
    
  }

}
