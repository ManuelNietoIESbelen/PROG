package MaximoMinimoTablaAleatoriaApp;

import java.util.Iterator;

public class MaximoMinimoTablaAleatorioApp {
  public static void main(String[] args) {
    int[][] tabla= new int[6][10];

    int filaMax=0;
    int filaMin=0;
    int colMax=0;
    int colMin=0;
    System.out.println("MAXIMO Y MINIMO TABLA ALEATORIA");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j]=(int)(Math.random()*999);
        System.out.printf("%5d",tabla[i][j]);
      }
      System.out.println("");
    }
    
    
    int menor = tabla[0][0];
    int mayor = tabla[0][0];
    
    
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
       
        if(mayor<tabla[i][j]) {
          mayor=tabla[i][j];
          filaMax=i;
          colMax=j;
        }
        if(menor>tabla[i][j]) {
          menor=tabla[i][j];
          filaMin=i;
          colMin=j;
        }
        
      }
    }
    
    
    System.out.println("-------------------------------------------------");
    System.out.printf("El maximo vale %d y esta localizado en la fila %d, columna %d%n",mayor,filaMax+1,colMax+1 );
    System.out.printf("El minimo vale %d y esta localizado en la fila %d, columna %d",menor,filaMin+1,colMin+1);
    
    
  }
  
  
  
  
  
}
