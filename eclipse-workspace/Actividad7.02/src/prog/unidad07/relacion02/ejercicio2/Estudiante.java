package prog.unidad07.relacion02.ejercicio2;

public class Estudiante extends Persona {
  private String curso;
  
  
  public Estudiante(String nombre, String dni, String estadoCivil, String curso) {
    super(nombre, dni, estadoCivil);
    this.curso = curso;
    
 
  }

  public void cambiarCurso(String nuevoCurso) {
    curso = nuevoCurso;
  }
  
  public String toString() {
    return super.toString() + "\nCurso: " + curso;
  }
  
}
