package prog.unidad05.arrayuni.ej4;

public class UtilidadesArrays {

  public static void main(String[] args) {
    int[] lista = { 5, 6, 2, 1 };

    System.out.println(getMinimoArrayEnter(lista));
  }

  public static int getMinimoArrayEnter(int[] array) {
    int numeroMenor = 0 ;
    int numeroAux = 1;
    for (int numero : array) {
      if (numero < numeroMenor) {
        numeroMenor = numero;
      }
    }

    return numeroMenor;
  }

  public static int getMaximoArrayEnter(int[] array) {

    return 2;
  }

}
