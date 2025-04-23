package prog.ud07.examen;

public class EstudiantePregrado extends Estudiante {
  /**
   * Constante de la nota media minima para titular
   */
  private static final int NOTA_MEDIA_MINIMA_PARA_TITULAR = 5;

  /**
   * Constructor de la clase EstudiantePregrado
   * 
   * @param dni
   * @param nombre
   * @param calificacionMedia
   */
  public EstudiantePregrado(String dni, String nombre, double calificacionMedia) {
    super(dni, nombre, calificacionMedia);
  }

  /**
   * Devuelve si puede titular
   *
   */
  @Override
  public boolean puedeTitular() {
    return getCalificacionMedia() >= NOTA_MEDIA_MINIMA_PARA_TITULAR;
  }

}
