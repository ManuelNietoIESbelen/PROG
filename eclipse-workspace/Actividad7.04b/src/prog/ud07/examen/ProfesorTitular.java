package prog.ud07.examen;

public class ProfesorTitular extends Profesor {
  /**
   * Constantes para el calculo del salario y seguro anual.
   */
  private static final double PORCENTAJE_INCREMENTO_POR_ANYO = 0.05;
  private static final int SEGURO = 1500;
  private static final int SALARIO_MINIMO = 3000;

  /**
   * Constructor de la clase ProfesorTitular.
   * 
   * @param dni            
   * @param nombre
   * @param anyosAntiguedad 
   */
  public ProfesorTitular(String dni, String nombre, int anyosAntiguedad) {
    super(dni, nombre, anyosAntiguedad);

  }

  /**
   * Metodo que calcula el salario mensual.
   * 
   * @return Salario mensual.
   */
  @Override
  public double getSalarioMensual() {
    return SALARIO_MINIMO + SALARIO_MINIMO * PORCENTAJE_INCREMENTO_POR_ANYO * getAniosAntiguedad();
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
