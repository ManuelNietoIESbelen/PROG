package prog.unidad04.practica406.libreria;

import prog.unidad04.practica406.libreria.Motocicleta;

public class Motocicleta extends Vehiculo implements MaquinaConDistintivoAmbiental {
  public String matricula;
  public Fecha fechaMatriculacion;
  public int cilindrada;

  public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindrada) {
    super(matricula, fechaMatriculacion);
    this.matricula = matricula;
    this.fechaMatriculacion = fechaMatriculacion;
    this.cilindrada = cilindrada;

    if (cilindrada < 50) {
      throw new IllegalArgumentException("El valor de la cilindrada no es valido");
    }

  }

  
  public int getCilindrada() {
    return cilindrada;
  }

  public String toString() {
    return super.toString() + " Cilindrada:" + this.cilindrada;
  }
  
  public String getDistintivo() {
    if (cilindrada == 75) {
        return "0";
    }

    if (cilindrada <= 125) {
        return "ECO";
    }

    if (cilindrada <= 500) {
        return "A";
    }
    
    return "B";
}


}