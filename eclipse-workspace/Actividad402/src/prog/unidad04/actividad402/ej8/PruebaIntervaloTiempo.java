package prog.unidad04.actividad402.ej8;

import prog.unidad04.actividad402.ej8a.IntervaloTiempo;


public class PruebaIntervaloTiempo {

  public static void main(String[] args) {
    IntervaloTiempo intervalo1 = new IntervaloTiempo(1, 40, 30);
    IntervaloTiempo intervalo2 = new IntervaloTiempo(2, 20, 30);

    IntervaloTiempo salida = intervalo2.resta(intervalo1);
    System.out.println(salida.obtenerCadena());
    System.out.println(intervalo1.obtenerCadena());
    System.out.println(intervalo2.obtenerCadena());

  }

}
