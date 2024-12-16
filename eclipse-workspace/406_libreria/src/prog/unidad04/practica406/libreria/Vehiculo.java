package prog.unidad04.practica406.libreria;

public class Vehiculo {

  public String matricula;
  public Fecha fechaMatriculacion;

  public int vehiculosMatriculados;

  
  /**
   * Constructor de la clase Vehiculo.
   * Valida la matrícula según el formato esperado y asigna la fecha de matriculación.
   * 
   * @param matricula           Matrícula del vehículo (debe tener 7 caracteres: 4 números y 3 letras mayúsculas).
   * @param fechaMatriculacion  Fecha de matriculación del vehículo.
   * @throws IllegalArgumentException Si la matrícula no cumple con el formato requerido.
   */
  public Vehiculo(String matricula, Fecha fechaMatriculacion) {

    String matriculaTemporal = "";
    //comprueba si la matricula tiene la longitud concorde al formato (7 caracteres)
    if (matricula.length() != 7) {
      throw new IllegalArgumentException();
    }
    //Comprueba si la entrada tiene espacios
    for (int i = 0; i < matricula.length(); i++) {
      char espacio = matricula.charAt(i);
      if (espacio != ' ') {
        matriculaTemporal = matriculaTemporal + espacio;
      }
    }
      //Comprueba si los 4 primeros caracteres son numeros
    for (int i = 0; i < 4; i++) {
      if (!Character.isDigit(matriculaTemporal.charAt(i))) {
        throw new IllegalArgumentException();
      }
    }

      //Comprueba que los 3 ultimos caracteres son letras
    for (int i = 4; i < 7; i++) {
      char letra = matriculaTemporal.charAt(i);
      if (!Character.isLetter(letra) || !Character.isUpperCase(letra)) {
        throw new IllegalArgumentException();
      }
    }

    this.matricula = matricula;
    this.fechaMatriculacion = fechaMatriculacion;
  }

  /**
   * Devuelve la matrícula del vehículo.
   * 
   * @return Matrícula del vehículo.
   */
  public String getMatricula() {
    return matricula;
  }

  /**
   * Devuelve la fecha de matriculación del vehículo.
   * 
   * @return Fecha de matriculación del vehículo.
   */
  public Fecha getFechaMatriculacion() {
    return fechaMatriculacion;
  }
  /**
   * Devuelve una representación en texto del vehículo.
   * 
   * @return String que contiene la matrícula y la fecha de matriculación.
   */
  public String toString() {
    vehiculosMatriculados++;
    return "Matricula: " + this.matricula + " Fecha Matriculación: " + this.fechaMatriculacion.toString();
    
  }

  

}
