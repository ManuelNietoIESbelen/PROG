package prog.unidad05.arrayuni.ej4;

public class ej5 extends UtilidadesArrays {

  public static void main(String[] args) {
    int[] numAleatorios = generarArrayEnteroAleatorio(150, 1, 300);
    
      System.out.println(getMinimoArrayEntero(numAleatorios));
      System.out.println(getMaximoArrayEntero(numAleatorios));
      System.out.println(enteroApareceEnArray(numAleatorios,getMinimoArrayEntero(numAleatorios)));
      System.out.println(enteroApareceEnArray(numAleatorios,getMaximoArrayEntero(numAleatorios)));

  }

}
