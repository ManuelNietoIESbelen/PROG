package prog.ud07.examen;

public class ProfesorAsociado extends Profesor {
  /**
   * Constantes para el calculo del salario y el seguro anual.
   */
  private static final int INCREMENTO_POR_ANYO = 100;
  private static final int SALARIO_MINIMO = 2500;
  private static final int SEGURO = 1500;

  /**
   * Constructor de la clase ProfesorAsociado.
   * 
   * @param dni
   * @param nombre
   * @param anyosAntiguedad .
   */
  public ProfesorAsociado(String dni, String nombre, int anyosAntiguedad) {
    super(dni, nombre, anyosAntiguedad);
  }

  /**
   * Metodo que calcula el salario mensual.
   * 
   * @return Salario mensual.
   */
  @Override
  public double getSalarioMensual() {
    return SALARIO_MINIMO + INCREMENTO_POR_ANYO * getAniosAntiguedad();
  }

  /**
   * Metodo que calcula el importe del seguro anual.
   * 
   * @return Importe del seguro anual.
   */
  @Override
  public double getSeguroAnual() {
    return SEGURO;
  }

}
