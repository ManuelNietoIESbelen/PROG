package prog.unidad04.practica406.libreria;

public class Automovil extends Vehiculo implements MaquinaConDistintivoAmbiental{

// Constantes para los colores permitidos del automóvil
  public static final String COLOR_NEGRO = "negro";
  public static final String COLOR_AZUL = "azul";
  public static final String COLOR_BLANCO = "blanco";

  // PARÁMETROS
  // Color del automovil
  public String color;
  // Numero de plazas del automovil
  public int plazas;

  /**
     * Constructor de la clase Automovil.
     * @param matricula Matrícula del automóvil.
     * @param fechaMatriculacion Fecha de matriculación del automóvil.
     * @param color Color del automóvil. Negro/Azul/Blanco.
     * @param plazas Número de plazas del automóvil.
     * @throws IllegalArgumentException Excepcion si el color no es uno de los colores permitidos.
     */
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) {
    super(matricula,fechaMatriculacion);
    this.color = color;
    this.plazas = plazas;
    
    if (!(color.equals(COLOR_BLANCO) || color.equals(COLOR_AZUL) || color.equals(COLOR_NEGRO))) {
      throw new IllegalArgumentException("El color no es valido");
    }
  }

  /**
   * Devuelve el distintivo ambiental del automóvil según el número de plazas.
   * 
   * @return Distintivo ambiental del automóvil.
   */
  public String getDistintivo() {
    switch (plazas) {
    case 1:
      return "0";
    case 2:
    case 3:
      return "ECO";
    case 4:
    case 5:
      return "A";
    default:
      return "B";
    }
  }

  /**
   * Obtiene el color del automóvil.
   * 
   * @return Color del automóvil.
   */
  public String getColor() {
    return color;
  }

  /**
   * Obtiene el número de plazas del automóvil.
   * 
   * @return Número de plazas del automóvil.
   */
  public int getPlazas() {
    return plazas;
  }

  /**
   * Devuelve una cadena con la informacion del automóvil.
   * 
   * @return Cadena con información del automóvil.
   */
  public String toString() {
    return super.toString() + " Color del automovil: " + this.color + " Num. Plazas del automovil: " + this.plazas;
  }

}
