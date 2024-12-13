package prog.unidad04.practica406.libreria;
import prog.unidad04.practica406.libreria.Motocicleta;

public class Motocicleta {
  String matricula;
  Fecha fechaMatriculacion;
  int cilindrada;
  
  
  
  public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindrada) {
    this.matricula = matricula;
    this.fechaMatriculacion = fechaMatriculacion;
    this.cilindrada = cilindrada;
  } 
  
  public int getCilindrada() {
    return cilindrada;
  }
  
  
}
