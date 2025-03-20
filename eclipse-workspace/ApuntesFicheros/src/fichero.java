
public class fichero {

  public static void main(String[] args) {
    List<Empleado> empleados = new ArrayList<>();

    // Leer empleados de los archivos
    empleados.addAll(leerEmpleados("empleados1.dat"));
    empleados.addAll(leerEmpleados("empleados2.dat"));

    // Ordenar por apellido
    empleados.sort(Comparator.comparing(Empleado::getApellidos));

    // Escribir en el archivo de salida
    escribirEmpleados("todos_empleados.dat", empleados);
  }

  private static List<Empleado> leerEmpleados(String fileName) {
    List<Empleado> lista = new ArrayList<>();
    try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
      int cantidad = dis.readInt();
      for (int i = 0; i < cantidad; i++) {
        String nombre = dis.readUTF();
        String apellidos = dis.readUTF();
        String dni = dis.readUTF();
        int edad = dis.readInt();
        double salario = dis.readDouble();
        boolean casado = dis.readBoolean();
        lista.add(new Empleado(nombre, apellidos, dni, edad, salario, casado));
      }
    } catch (IOException e) {
      System.err.println("Error leyendo " + fileName + ": " + e.getMessage());
    }
    return lista;
  }

  private static void escribirEmpleados(String fileName, List<Empleado> empleados) {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
      dos.writeInt(empleados.size());
      for (Empleado emp : empleados) {
        dos.writeUTF(emp.getNombre());
        dos.writeUTF(emp.getApellidos());
        dos.writeUTF(emp.getDni());
        dos.writeInt(emp.getEdad());
        dos.writeDouble(emp.getSalario());
        dos.writeBoolean(emp.isCasado());
      }
    } catch (IOException e) {
      System.err.println("Error escribiendo " + fileName + ": " + e.getMessage());
    }
  }
}

class Empleado {
  private String nombre, apellidos, dni;
  private int edad;
  private double salario;
  private boolean casado;

  public Empleado(String nombre, String apellidos, String dni, int edad, double salario, boolean casado) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.edad = edad;
    this.salario = salario;
    this.casado = casado;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }

  public double getSalario() {
    return salario;
  }

  public boolean isCasado() {
    return casado;
  }
}
