package prog.unidad07.relacion02.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Centro {
  private List<Profesor> listaProfesores;
  private List<Estudiante> listaEstudiantes;
  private List<Personal> listaPersonal;
  private boolean centroFlag=false;

  
  
  public Centro() {
    this.listaProfesores = new ArrayList<Profesor>();
    this.listaEstudiantes = new ArrayList<Estudiante>();
    this.listaPersonal = new ArrayList<Personal>();
  }

  
  
  public void darAltaProfesor(Profesor profesor) {
    listaProfesores.add(profesor);
  }

  
  
  public void darAltaEstudiante(Estudiante estudiante) {
    listaEstudiantes.add(estudiante);
  }

  
  
  public void darAltaPersonal(Personal personal) {
    listaPersonal.add(personal);
  }

  
  
  public void darBajaPersona(String dni) {
    
    
    for (int i = 0; i < listaProfesores.size(); i++) {
      if (listaProfesores.get(i).getDni().equals(dni)) {
        listaProfesores.remove(i);
        centroFlag=true;
      }
    }
    
    
    for (int i = 0; i < listaEstudiantes.size(); i++) {
      if (listaEstudiantes.get(i).getDni().equals(dni)) {
        listaEstudiantes.remove(i);
        centroFlag=true;
      }
    }
    
    
    for (int i = 0; i < listaPersonal.size(); i++) {
      if (listaPersonal.get(i).getDni().equals(dni)) {
        listaPersonal.remove(i);
        centroFlag=true;
      }
    }
  }
  
  public String toString() 
  {
   
      return "Profesores: \n" + listaProfesores  + "\nEstudiantes: " + listaEstudiantes + "\nPersonal: " + listaPersonal;
    
  }
  
}
