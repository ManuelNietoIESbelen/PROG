package prog.unidad06.consola.ejercicio03;

public class ImpresorTablaReal {
  public static void main(String[] args) {
    ImprimeTabla(3  , 3);
  }

  private static void ImprimeTabla(int filas, int columnas) {
    double[][] tabla = new double[filas][columnas];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j] = (double) Math.random() * 10000 - 5000;
        System.out.printf("%15.2f",tabla[i][j]);
      } 
      System.out.println("");
    }

  }

}
