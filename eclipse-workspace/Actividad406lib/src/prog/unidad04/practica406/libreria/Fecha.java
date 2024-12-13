package prog.unidad04.practica406.libreria;

import prog.unidad04.practica406.libreria.Fecha;
import java.time.LocalDate;

public class Fecha {
  // Parametros
  private int dia;
  private int mes;
  private int anyo;

  // Constructor
  public Fecha(int dia, int mes, int anyo) {
    if (!comprobarFecha(dia, mes, anyo)) {
      //throw new IllegalArgumentException("");
    }
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;

  }

  //Metodos publicos
  
  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAnyo() {
    return anyo;
  }

  public long diasEntre(Fecha fecha){
//    if (esAnterior(fecha)) {
//        throw new FechaException("error");
//   }

    int totalDias = 0;
    Fecha fechaTemporal = new Fecha(anyo, mes, dia);

    while (!fechaTemporal.equals(fecha)) {
        totalDias++;
        fechaTemporal.incrementarDia();
    }

    return totalDias;
}
  
  
  @Override
  public String toString() {
    return dia + "/" + mes + "/" + anyo;
  }

  
  
  //Metodos privados
  private boolean esBisiesto(int anyo) {
    if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  private boolean comprobarFecha(int dia, int mes, int anio) {
    try {
      LocalDate.of(anio, mes, dia);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

 
  private int diasDelMes(int mes, int anio) {
    switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            if(esBisiesto(anyo)) {
              return 29;
            }else {
              return 28;
            }
        default:
            throw new IllegalArgumentException("Mes erroneo: " + mes);
    }
}
  
  private boolean esAnterior(Fecha fecha) {
    if (this.anyo < fecha.anyo) {
      return true;
    }else if (this.anyo == fecha.anyo && this.mes < fecha.mes) {
      return true;
    }else if(this.anyo == fecha.anyo && this.mes == fecha.mes && this.dia < fecha.dia) {
      return true;
    }else {
      return false;
    }
    
}
  
  private void incrementarDia() {
    this.dia++;
    if (this.dia > diasDelMes(this.mes, this.anyo)) {
        this.dia = 1;
        this.mes++;
        if (this.mes > 12) {
            this.mes = 1;
            this.anyo++;
        }
    }
}


}
