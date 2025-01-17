package prog.unidad05.arraysmulti.ejercicio2;

public class TablaEnteraConTotales {

  private int[][] tabla;

  public TablaEnteraConTotales(int filas, int columnas) {
    if (filas <= 0 || columnas <= 0) {
      throw new IllegalArgumentException();
    }

    tabla = new int[filas][columnas];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.printf("%5d", tabla[i][j]);
      }
      System.out.println("");
    }

  }

  public void setCasilla(int fila, int columna, int valor) {
    if (fila < 0 || fila > tabla.length || columna < 0 || columna > tabla.length) {
      throw new ArrayIndexOutOfBoundsException();
    }

    tabla[fila][columna] = valor;
  }

  public int getCasilla(int fila, int columna) {
    if (fila < 0 || fila > tabla.length || columna < 0 || columna > tabla.length) {
      throw new ArrayIndexOutOfBoundsException();
    }

    return tabla[fila][columna];
  }

  public int getTotalFila(int fila) {
    int totalFila = 0;
    if (fila < 0 || fila > tabla.length) {
      throw new ArrayIndexOutOfBoundsException();
    }

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j] += totalFila;
      }
    }
    return totalFila;
  }

  public int getTotalColumna(int columna) {
    if (columna < 0 || columna > tabla.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int totalColumna = 0;
    for (int i = 0; i < tabla.length; i++) {
      tabla[i][columna] += totalColumna;
    }
    return totalColumna;
  }

  public int getTotalTabla() {
    int totalTabla = 0;

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j] += totalTabla;
      }
    }
    return totalTabla;
  }

}
