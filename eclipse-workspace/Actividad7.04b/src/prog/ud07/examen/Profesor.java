package prog.ud07.examen;

public abstract class Profesor extends Persona implements Asegurados {
  /**
   * * Atributos de la clase Profesor
   */
  private int anyosAntiguedad;

  /**
   * Constructor de la clase Profesor
   * 
   * @param dni
   * @param nombre
   * @param anyosAntiguedad
   */
  public Profesor(String dni, String nombre, int anyosAntiguedad) {
    super(dni, nombre);
    if (anyosAntiguedad < 0) {
      throw new IllegalArgumentException("Error en la entrada de datos");
    }

    this.anyosAntiguedad = anyosAntiguedad;

  }

  /**
   * 
   * @return Devuelve los anyos de antiguedad
   */
  public int getAniosAntiguedad() {
    return anyosAntiguedad;
  }

  /**
   * Devuelve el importe del seguro anual
   *
   */
  public abstract double getSalarioMensual();
}
