package prog.unidad04.actividad402.ej8;

public class IntervaloTiempo {
  // Constantes
  // Cantidad de segundos por minuto
  private static final int SEGUNDOS_POR_MINUTOS = 60;
  // atributos
  private int horas;
  private int minutos;
  private int segundos;

  public IntervaloTiempo(int horas, int minutos, int segundos) {
    // ajustamos los segundos
    minutos += segundos / SEGUNDOS_POR_MINUTOS;
    segundos = segundos % SEGUNDOS_POR_MINUTOS;
    // ajustamos por el metodo MANOLO
    horas += minutos / SEGUNDOS_POR_MINUTOS;
    minutos = minutos % SEGUNDOS_POR_MINUTOS;

    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;

  }

  public IntervaloTiempo suma(IntervaloTiempo otro) {
    // sumamos los segundos
    int segundosTemporales = segundos + otro.segundos;
    // ajustamos los segundos
    int segundosReales = segundosTemporales % SEGUNDOS_POR_MINUTOS;
    // calculamos los minutos extra
    int minutosExtra = segundosTemporales / SEGUNDOS_POR_MINUTOS;

    // sumamos los minutos
    int minutosTemporales = minutos + otro.minutos + minutosExtra;
    int minutosReales = minutosTemporales % SEGUNDOS_POR_MINUTOS;
    int horasExtra = minutosTemporales / SEGUNDOS_POR_MINUTOS;

    // Calculamos las horas
    int horasReales = horas + otro.horas + horasExtra;

    IntervaloTiempo resultado = new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    return resultado;

  }

  public IntervaloTiempo resta(IntervaloTiempo otro) {
    // calculamos los segundos
    int segundosTemporales = segundos - otro.segundos;
    int minutosExtra = segundosTemporales / SEGUNDOS_POR_MINUTOS;
    int segundosReales = 1;
    if (segundosTemporales < 0) {
      segundosReales = segundosTemporales + SEGUNDOS_POR_MINUTOS;
    }

    // calculamos minutos
    int minutosTemporales = minutos - otro.minutos - minutosExtra;
    int horasExtra = minutosTemporales / SEGUNDOS_POR_MINUTOS;
    int minutosReales = 1;
    if (minutosTemporales < 0) {
      minutosReales = minutosTemporales + SEGUNDOS_POR_MINUTOS;
    }

    // calculamos horas
    int horasReales = horas - otro.horas - horasExtra;

    if (horasReales < 0) {
      System.out.println("No se pueden restar los intervalos puesto que el resultado es negativo");
      return null;
    } else {
      return new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    }

  }

  public String obtenerCadena() {

    return "horas " + horas + " minutos " + minutos + " segundos " + segundos;
  }
}
