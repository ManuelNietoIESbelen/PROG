package prog.unidad04.practica406.libreria;

public class Automovil {
  // PARÁMETROS
  // Matricula del automovil
  public String matricula;
  // Fecha de matriculacion del automovil
  public Fecha fechaMatricualcion;
  // Color del automovil
  public String color;
  // Numero de plazas del automovil
  public int plazas;

  public Automovil(String matricula, Fecha fechaMatricualcion, String color, int plazas) {
    this.matricula = matricula;
    this.fechaMatricualcion = fechaMatricualcion;
    this.color = color;
    this.plazas = plazas;
  }

  
  
  
  
  
  
  public boolean comprobarColor(Automovil auto) {
    if (color.equals("blanco") || color.equals("negro") || color.equals("azul")) {
      return true;
    }
    return false;

  }

  public boolean comprobarMatricula(Automovil auto) {
    return true;

  }

  public boolean comprobarPlazas(Automovil auto) {
    if (plazas <= 0) {
      return false;
    }
    return true;
  }

}
