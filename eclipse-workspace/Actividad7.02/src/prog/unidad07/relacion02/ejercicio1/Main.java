package prog.unidad07.relacion02.ejercicio1;

public class Main {
  public static void main(String[] args) {
    
    
    
    Personal p = new Personal("Juan", "12345678A", "soltero", 2010, "A1", "RRHH");
    System.out.println(p+"\n");
    p.trasladarSeccion("Contabilidad");
    System.out.println(p+"\n");
    
    Profesor profe = new Profesor("Luis", "87654321B", "casado", 2005, "B2","hoa");
    Estudiante est = new Estudiante("Ana", "11111111C", "soltero", "2º ESO");
    
    System.out.println(profe+"\n");
    profe.cambiarDepartamento("Matemáticas");
    System.out.println(est+"\n");
    System.out.println(profe+"\n");
    
    
  }

}
