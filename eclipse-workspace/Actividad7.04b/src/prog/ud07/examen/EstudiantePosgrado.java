package prog.ud07.examen;

public class EstudiantePosgrado extends Estudiante implements Asegurados {

  /**
   * Constantes del seguro anual y la nota media minima para titular
   */
  private static final double NOTA_MEDIA_MINIMA_PARA_TITULAR = 7.5;
  private static final int SEGURO = 2000;

  /**
   * Constructor de la clase EstudiantePosgrado
   * 
   * @param dni
   * @param nombre
   * @param calificacionMedia
   */
  public EstudiantePosgrado(String dni, String nombre, double calificacionMedia) {
    super(dni, nombre, calificacionMedia);
  }

  /**
   * 
   * @return Devuelve si puede titular
   */
  @Override
  public boolean puedeTitular() {
    return getCalificacionMedia() >= NOTA_MEDIA_MINIMA_PARA_TITULAR;
  }

  /**
   * 
   * @return Devuelve el importe del seguro anual
   */
  @Override
  public double getSeguroAnual() {
    return SEGURO;
  }

}
