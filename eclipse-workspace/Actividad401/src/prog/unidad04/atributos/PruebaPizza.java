package prog.unidad04.atributos;

import java.util.Scanner;

public class PruebaPizza {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("PROGRAMA DE MANEJO DE PIZZAS");
    
    
    
    
    System.out.print("Introduzca la cantidad de pizzas a crear (1 o más): ");
    int cantidad=Integer.parseInt(sc.nextLine());
    
    
    for(int i=1; i<=cantidad;i++) {
      Pizza pizza = new Pizza();
      Pizza.totalCreado++;
      System.out.printf("introduzca el tamaño de la pizza %d (Mediana/Familiar):",i);
      pizza.tamanyo=sc.nextLine();
      System.out.printf("Introduce el tipo de la pizza %d (Margarita/Cuatro quesos/Funghi):",i);
      pizza.tipo=sc.nextLine();
      System.out.println("¿Servir la pizza?(S/N)");
       char estado=sc.nextLine().charAt(0);
       if(estado=='s') {
         pizza.estado="servida";
         Pizza.totalServido++;
       }else {
         pizza.estado="Pedida";
       }
     
      System.out.printf("Tamaño: %s%n",pizza.tamanyo);
      System.out.printf("Tipo: %s%n",pizza.tipo);
      System.out.printf("Estado: %s%n",pizza.estado);
      System.out.printf("Pizzas totales creadas: %s%n",Pizza.totalCreado);
      System.out.printf("Pizzas totales servidas: %s%n%n",Pizza.totalServido);
    }
    
    
    

      
    

 
    
    
  }

}
