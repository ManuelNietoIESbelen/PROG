package prog.unidad07.relacion02.ejercicio1;

public class Main {
  public static void main(String[] args) {
    
    
    Profesor profe = new Profesor("Luis", "87654321B", "casado", 2005, "B2","hoa");
    Estudiante est = new Estudiante("Ana", "11111111C", "soltero", "2º ESO");
    Personal p = new Personal("Juan", "12345678A", "soltero", 2010, "A1", "RRHH");
    
    
    
    System.out.println(p+"\n");
    
    System.out.println(est+"\n");
    
    System.out.println(profe+"\n");
    
    
    p.trasladarSeccion("Contabilidad");
    profe.cambiarDepartamento("Matemáticas");
    est.cambiarCurso("3º ESO");
    est.cambiarEstadoCivil("divorcidado");
    
      
    
    
    
    System.out.println(p+"\n");
    
    System.out.println(est+"\n");
    
    System.out.println(profe+"\n");
    
    
  
    
    
    
  }

}
