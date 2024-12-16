package prog.unidad04.practica406.libreria;

import java.time.LocalDate;

public class Fecha {
  // Constante que representa el año actual
  private static final int ANYO_FECHA_ACTUAL = LocalDate.now().getYear();

  // Dia de la fecha
  private int dia;
  // Mes de la fecha
  private int mes;
  // Año de la fecha
  private int anyo;

  /**
   * Constructor de la clase Fecha.
   * 
   * @param dia  Día de la fecha.
   * @param mes  Mes de la fecha (1-12).
   * @param anyo Año de la fecha (1900 - año actual).
   * @throws IllegalArgumentException Si alguno de los parámetros no es válido.
   */
  public Fecha(int dia, int mes, int anyo) {
    if (anyo < 1900 || anyo > ANYO_FECHA_ACTUAL) {
      throw new IllegalArgumentException();
    }

    if (mes < 1 || mes > 12) {
      throw new IllegalArgumentException();
    }

    if (dia < 1 || dia > 31) {
      throw new IllegalArgumentException();
    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
      throw new IllegalArgumentException();
    } else if (mes == 2 && ((dia > 29) || (dia == 29 && !esBisiesto(anyo)))) {
      throw new IllegalArgumentException();
    }
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;

  }

  // Metodos publicos

  /**
   * Devuelve el día de la fecha.
   * 
   * @return Día de la fecha.
   */
  public int getDia() {
    return dia;
  }

  /**
   * Devuelve el mes de la fecha.
   * 
   * @return Mes de la fecha.
   */
  public int getMes() {
    return mes;
  }

  /**
   * Devuelve el año de la fecha.
   * 
   * @return Año de la fecha.
   */
  public int getAnyo() {
    return anyo;
  }

  /**
   * Calcula la cantidad de días entre esta fecha y otra proporcionada.
   * 
   * @param fecha La fecha con la que calcular la diferencia.
   * @return Número de días entre las dos fechas.
   * @throws FechaException Si la fecha proporcionada es anterior a la actual.
   */
  public long diasEntre(Fecha fecha) {
    if (0 > fecha.compara(fecha)) {
      throw new FechaException("Error en la fecha");
    }

    int totalDias = 0;

    totalDias += AnyosEnDias(anyo, fecha.anyo);
    totalDias += diasTranscurridosEnAnyo(fecha.dia, fecha.mes, fecha.anyo) - (diasTranscurridosEnAnyo(dia, mes, anyo));

    return Math.abs(totalDias);
  }

  /**
   * Compara esta fecha con otra proporcionada.
   * 
   * @param fecha La fecha a comparar.
   * @return Valor negativo, cero o positivo dependiendo de si esta fecha es
   *         anterior, igual o posterior a la fecha proporcionada.
   */
  public int compara(Fecha fecha) {

    if (this.anyo != fecha.anyo) {
      return this.anyo - fecha.anyo;
    } else if (this.mes != fecha.mes) {
      return this.mes - fecha.mes;
    } else if (this.dia != fecha.dia) {
      return this.dia - fecha.dia;
    } else {
      return 0;
    }
  }

  /**
   * Devuelve una representación en cadena de la fecha.
   * 
   * @return Fecha por pantalla
   */
  public String toString() {
    String mesEscrito = "";
    if (mes <= 12 && mes >= 1) {
      switch (mes) {
      case 1:
        mesEscrito = "enero";
      case 2:
        mesEscrito = "febrero";
      case 3:
        mesEscrito = "marzo";
      case 4:
        mesEscrito = "abril";
      case 5:
        mesEscrito = "mayo";
      case 6:
        mesEscrito = "junio";
      case 7:
        mesEscrito = "julio";
      case 8:
        mesEscrito = "agosto";
      case 9:
        mesEscrito = "septiembre";
      case 10:
        mesEscrito = "octubre";
      case 11:
        mesEscrito = "noviembre";
      case 12:
        mesEscrito = "diciembre";
      }
      return dia + "/" + mesEscrito + "/" + anyo;
    } else {
      throw new FechaException("");
    }

  }

  /**
   * Calcula los días transcurridos desde el 1 de enero de 1900 hasta esta fecha.
   * 
   * @return Número de días transcurridos.
   */
  public long diasTranscurridos(Fecha fecha) {
    // Calcular la diferencia de días entre la fecha actual y el 1 de enero del 1900

    Fecha fechaInicial = new Fecha(1, 1, 1900);
    return fechaInicial.diasEntre(this);
  }

  // Metodos privados

  /**
   * Verifica si un año es bisiesto.
   * 
   * @param anyo Año a verificar.
   * @return True si el año es bisiesto, false en caso contrario.
   */
  private boolean esBisiesto(int anyo) {
    if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Calcula los días que tiene un mes dado en un año.
   * 
   * @param mes  Mes a evaluar.
   * @param anyo Año en cuestión.
   * @return Número de días del mes.
   */
  private int diasDelMes(int mes, int anio) {
    switch (mes) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      return 31;
    case 4:
    case 6:
    case 9:
    case 11:
      return 30;
    case 2:
      if (esBisiesto(anyo)) {
        return 29;
      } else {
        return 28;
      }
    default:
      return 0;
    }

  }

  /**
   * Calcula los días equivalentes entre dos años completos.
   * 
   * @param anyo  Inicio del rango de años.
   * @param anyo2 Fin del rango de años.
   * @return Número de días entre los dos años completos.
   */
  public int AnyosEnDias(int anyo, int anyo2) {
    int dias = 0;
    for (int i = anyo; i < anyo2; i++) {
      dias += esBisiesto(i) ? 366 : 365;
    }
    return dias;
  }

  /**
   * Calcula los días transcurridos en un año hasta un mes y día determinados.
   * 
   * @param dia  Día del mes.
   * @param mes  Mes del año.
   * @param anyo Año correspondiente.
   * @return Número de días transcurridos en el año.
   */
  private int diasTranscurridosEnAnyo(int dia, int mes, int anyo) {
    int dias = 0;
    for (int i = 1; i < mes; i++) {
      dias += diasDelMes(i, anyo);
    }
    return dias + dia;
  }

}
