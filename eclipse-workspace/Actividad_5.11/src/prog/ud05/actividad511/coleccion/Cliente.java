package prog.ud05.actividad511.coleccion;

public class Cliente {

  private String nombre;
  private String apellidos;
  private String dni;
  private int edad;

  public Cliente(String nombre, String apellidos, String dni, int edad) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new NullPointerException();
    }

    if (apellidos == null || nombre.trim().isEmpty()) {
      throw new NullPointerException();
    }

    if (dni == null || !dni.matches("\\d{8}[A-Z]")) {
      throw new IllegalArgumentException();
    }
    if (validarDni(dni)) {
      throw new NullPointerException();
    }

    if (edad < 0) {
      throw new IllegalArgumentException();
    }

    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.edad = edad;

  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }

  private boolean validarDni(String dni) {
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    int numero = Integer.parseInt(dni.substring(0, 8));
    char letraCalculada = letras.charAt(numero % 23);
    char letraDni = dni.charAt(8);
    return letraCalculada == letraDni;
  }
}
