package prog.ud07.examen;

public abstract class Persona {
  /**
   * Atributos de la clase Persona
   */
  private String dni;
  private String nombre;

  /**
   * Constructor de la clase Persona
   * 
   * @param dni
   * @param nombre
   */
  public Persona(String dni, String nombre) {
    if (nombre == null) {
      throw new NullPointerException("Error en la entrada de datos");
    }
    if (nombre.isEmpty()) {
      throw new IllegalArgumentException("Error en la entrada de datos");
    }

    if (!dni.matches("\\d{8}[A-Z]")) {
      throw new IllegalArgumentException("Error en la entrada de datos");
    }

    this.dni = dni;
    this.nombre = nombre;
  }

  /**
   * 
   * @return Devuelve el dni
   */
  public String getDni() {
    return dni;
  }

  /**
   * 
   * @return Devuelve el nombre
   */
  public String getNombre() {
    return nombre;
  }

}
