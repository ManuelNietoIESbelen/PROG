package prog.unidad07.relacion02.ejercicio2;

import java.util.ArrayList;
import java.util.List;



public class Centro {
  private List<Profesor> listaProfesores;
  private List<Estudiante> listaEstudiantes;
  private List<Personal> listaPersonal;
  
   public Centro() {
      this.listaProfesores = new ArrayList<Profesor>();
      this.listaEstudiantes = new ArrayList<Estudiante>();
      this.listaPersonal = new ArrayList<Personal>();
    }
  
  public void darAltaProfesor(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String departamento) {
    Profesor profesor = new Profesor(nombre, dni, estadoCivil, añoIncorporacion, codDespacho, departamento);
    listaProfesores.add(profesor);
  }
  
  public void darAltaEstudiante(String nombre, String dni, String estadoCivil, String curso) {
    Estudiante estudiante = new Estudiante(nombre, dni, estadoCivil, curso);
    listaEstudiantes.add(estudiante);
  }
  
  public void darAltaPersonal(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String seccion) {
    Personal personal = new Personal(nombre, dni, estadoCivil, añoIncorporacion, codDespacho, seccion);
    listaPersonal.add(personal);
  }
  
  public void darBajaProfesor(String dni) {
    for (Profesor profesor : listaProfesores) {
      if (profesor.getDni().equals(dni)) {
        listaProfesores.remove(profesor);
      }
    }
  }
  
  

}
