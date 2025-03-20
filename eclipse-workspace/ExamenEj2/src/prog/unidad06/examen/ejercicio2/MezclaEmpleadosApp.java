package prog.unidad06.examen.ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MezclaEmpleadosApp {
  public static void main(String[] args) {
    List<Empleado> listaEmpleados = new ArrayList<>(); 
    
    listaEmpleados.addAll(leerEmpleados("Empleados1.dat"));
    listaEmpleados.addAll(leerEmpleados("Empleados2.dat"));
    
    listaEmpleados.sort(Comparator.comparing(Empleado::getApellidos));
    
    escribirEmpleados("todos_empleados.dat",listaEmpleados);
    
  }
  
  
  private static List<Empleado> leerEmpleados(String ruta) {
    List<Empleado> lista = new ArrayList<>();
    try (DataInputStream lector = new DataInputStream(new FileInputStream(ruta))) {
      int cantidad = lector.readInt();
      for (int i = 0; i < cantidad; i++) {
        String nombre = lector.readUTF();
        String apellidos = lector.readUTF();
        String dni = lector.readUTF();
        int edad = lector.readInt();
        double salario = lector.readDouble();
        boolean casado = lector.readBoolean();
        lista.add(new Empleado(nombre, apellidos, dni, edad, salario, casado));
      }
    } catch (IOException e) { 
      System.out.println("Error");
    }
    return lista;
  }
  
  private static void escribirEmpleados(String ruta, List<Empleado> empleados) {
    try (DataOutputStream escritor = new DataOutputStream(new FileOutputStream(ruta))) {
      escritor.writeInt(empleados.size());
      for (Empleado empleado : empleados) {
        escritor.writeUTF(empleado.getNombre());
        escritor.writeUTF(empleado.getApellidos());
        escritor.writeUTF(empleado.getDni());
        escritor.writeInt(empleado.getEdad());
        escritor.writeDouble(empleado.getSalario());
        escritor.writeBoolean(empleado.isCasado());
      }
    } catch (IOException e) {
      System.out.println("Error");
    }
  }
  
}
