package prog.unidad05.arrayuni.ej4.EstadisticasNotas;

import java.util.Scanner;

public class EstadisticasNotas {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Quieres introducir una nota");
    int nota1=Integer.parseInt(sc.nextLine());
   
   
    
    
  }

 

  public void addCalificacion(int calificacion) {
    int[] notas = new int[11];
    for (int i = 0; i < notas.length; i++) {
      if (i == calificacion) {
        notas[i]++;
      }

    }
  }

  public double calificacionMedia(int[] array) {
    int total=0;
    int cantidad = 0;
    for (int i = 0; i < array.length; i++) {
       cantidad=+array[i];
    }
    for (int i = 0; i < array.length; i++) {
      int num = array[i];
       total=(num*i);
    }
    
    
    return total/cantidad;
  }

  public int calificacionModa(int[] array) {
    int mayor=array[0];
    int i = 0;
    for (i = 0; i < array.length; i++) {
        if(mayor<array[i]) {
          array[i]=mayor;
        }
      }
    return i;
    
  }

}
