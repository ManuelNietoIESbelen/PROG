package actividad502.prog.unidad05.arraysmulti.ejercicio2;

public class TablaEnteraConTotales {

  public TablaEnteraConTotales(int filas,int columnas) {
   if(filas<=0 || columnas<=0) {
     throw new IllegalArgumentException();
   }
    int[][] tabla = new int[filas][columnas];
  }
  
  public void setCasilla(int fila,int columna,int valor) {
    
    tabla[fila][columna]=valor;
  }
  
  public int getCasilla(int fila, int columna) {
    return tabla[fila][columna];
  }
  
 public int getTotalFila(int fila) {
   return 5;
 }
  
}
