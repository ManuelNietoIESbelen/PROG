package prog.unidad04.practica406.libreria;

public class Automovil {
 //PARÁMETROS
  //Matricula del automovil
  String matricula;
  //Fecha de matriculacion del automovil
  Fecha fechaMatricualcion;
  //Color del automovil
  String color;
  //Numero de plazas del automovil
  int plazas;
  
  
  public Automovil(String matricula, Fecha fechaMatricualcion, String color, int plazas) {
    this.matricula = matricula;
    this.fechaMatricualcion = fechaMatricualcion;
    this.color = color;
    this.plazas = plazas;
  }
  
  
 
}
