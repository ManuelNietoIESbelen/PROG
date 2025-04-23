package prog.unidad07.relacion02.ejercicio2;

public class Main {
  public static void main(String[] args) {
    Centro c = new Centro();
    
    
    Profesor profe = new Profesor("Luis", "87654321B", "casado", 2005, "B2","hoa");
    Profesor profe2 = new Profesor("Pedro", "87654321B", "casado", 2005, "B2","hoa");
    
    
    Estudiante est = new Estudiante("Ana", "11111111C", "soltero", "2º ESO");
    Estudiante est2 = new Estudiante("Antonio", "15215111C", "divociado", "2º ESO");
    
    Personal p = new Personal("Juan", "12345678A", "soltero", 2010, "A1", "RRHH");
    Personal p2 = new Personal("eqweq", "12421789A", "soltero", 2010, "A1", "RRHH");
    
    
    c.darAltaProfesor(profe);
    c.darAltaProfesor(profe2);
    c.darAltaEstudiante(est);
    c.darAltaEstudiante(est2);
    c.darAltaPersonal(p);
    c.darAltaPersonal(p2);
    
   
    
    
    
    System.out.println(c);
    
    
  }

}
