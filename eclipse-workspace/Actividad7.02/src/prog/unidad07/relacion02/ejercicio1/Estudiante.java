package prog.unidad07.relacion02.ejercicio1;

public class Estudiante extends Persona {
  private String curso;
  private boolean cursoFlag = false;
  
  
  public Estudiante(String nombre, String dni, String estadoCivil, String curso) {
    super(nombre, dni, estadoCivil);
    this.curso = curso;
    
 
  }

  public void cambiarCurso(String nuevoCurso) {
    this.curso = nuevoCurso;
    cursoFlag = true;
  }
  
  public String toString() {
    if (cursoFlag) {
      cursoFlag = false;
      return "Estudiante modificado: "+super.toString() + ", Curso: " + curso;
    
    }
    return "Estudiante original: " +super.toString() + ", Curso: " + curso;
  }
  
}
