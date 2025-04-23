package prog.ud07.examen;

public abstract class Estudiante extends Persona {
  /**
   * Atributos de la clase Estudiante
   */
  private double calificacionMedia;

  /**
   * Constructor de la clase Estudiante
   * 
   * @param dni
   * @param nombre
   * @param calificacionMedia
   */
  public Estudiante(String dni, String nombre, double calificacionMedia) {
    super(dni, nombre);
    if (calificacionMedia < 0 || calificacionMedia > 10) {
      throw new IllegalArgumentException("Error en la entrada de datos");
    }

    this.calificacionMedia = calificacionMedia;
  }

  /**
   * 
   * @return Devuelve la calificacion media
   */
  public double getCalificacionMedia() {
    return calificacionMedia;
  }

  /**
   * Devuelve si puede titular
   *
   */
  public abstract boolean puedeTitular();

}
