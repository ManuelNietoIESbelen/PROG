package prog.unidad05.arrayuni.ej4.EstadisticasNotas;

public class UtilidadesArrays {

  public static void main(String[] args) {
    int[] lista = { 5, 19, 2, 1, 5, 5, 5 };
    int[] lista2 = {};

    System.out.println(getMinimoArrayEntero(lista));
    System.out.println(getMaximoArrayEntero(lista2));
    System.out.println(enteroApareceEnArray(lista, 5));
  }

  public static int[] generarArrayEnteroAleatorio(int longitud, int valorMinimo, int valorMaximo) {
   
    if(longitud<1) {
      throw new IllegalArgumentException();
    }
    
    if(valorMaximo<valorMinimo) {
      throw new IllegalArgumentException();
    }
    
    int[] numeros = new int[longitud];
    int rango = (valorMaximo - valorMinimo) + 1;

    for (int i = 0; i < numeros.length; i++) {
      int random = (int) (Math.random() * rango) + valorMinimo;
      numeros[i] = random;
    }

    return numeros;
  }

  public static int getMinimoArrayEntero(int[] array) {

    if (array == null || array.length == 0) {
      throw new IllegalArgumentException();
    }
    int menor = array[0];
    for (int i = 0; i < array.length; i++) {
      if (menor > array[i]) {
        menor = array[i];
      }

    }
    return menor;

  }

  public static int getMaximoArrayEntero(int[] array) {

    if (array == null || array.length == 0) {
      throw new IllegalArgumentException();
    }

    int mayor = array[0];
    for (int i = 0; i < array.length; i++) {
      if (mayor < array[i]) {
        mayor = array[i];
      }
    }

    return mayor;
  }

  public static int enteroApareceEnArray(int[] array, int valor) {

    int contador = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == valor)
        contador++;
    }

    return contador;
  }
}
