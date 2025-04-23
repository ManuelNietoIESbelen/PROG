package prog.unidad06.examen.ejercicio2;

public class apuntes {
  package prog.ud07.examen;

//INTERFACES
public interface ConSeguro {
   double getImporteSeguroAnual();
}

//CLASE ABSTRACTA COMÚN
public abstract class MiembroComunidad {
   private final String nombre;
   private final String dni;

   public MiembroComunidad(String nombre, String dni) {
       if (nombre == null || nombre.isEmpty()) {
           throw new IllegalArgumentException("El nombre no puede estar vacío");
       }
       if (!dni.matches("\\d{8}[A-Z]")) {
           throw new IllegalArgumentException("DNI inválido");
       }
       this.nombre = nombre;
       this.dni = dni;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }
}

//CLASE ABSTRACTA PARA PERSONAL
public abstract class Personal extends MiembroComunidad implements ConSeguro {
   private final int aniosAntiguedad;

   public Personal(String nombre, String dni, int aniosAntiguedad) {
       super(nombre, dni);
       if (aniosAntiguedad < 0) {
           throw new IllegalArgumentException("La antigüedad no puede ser negativa");
       }
       this.aniosAntiguedad = aniosAntiguedad;
   }

   public int getAniosAntiguedad() {
       return aniosAntiguedad;
   }

   public abstract double getSalarioMensual();
}

//CLASES CONCRETAS DE PERSONAL
public final class ProfesorTitular extends Personal {
   public ProfesorTitular(String nombre, String dni, int aniosAntiguedad) {
       super(nombre, dni, aniosAntiguedad);
   }

   @Override
   public double getSalarioMensual() {
       return 3000 + 3000 * 0.05 * getAniosAntiguedad();
   }

   @Override
   public double getImporteSeguroAnual() {
       return 1500;
   }
}

public final class ProfesorAsociado extends Personal {
   public ProfesorAsociado(String nombre, String dni, int aniosAntiguedad) {
       super(nombre, dni, aniosAntiguedad);
   }

   @Override
   public double getSalarioMensual() {
       return 2500 + 100 * getAniosAntiguedad();
   }

   @Override
   public double getImporteSeguroAnual() {
       return 1500;
   }
}

//CLASE ABSTRACTA PARA ESTUDIANTES
public abstract class Estudiante extends MiembroComunidad {
   private final double notaMedia;

   public Estudiante(String nombre, String dni, double notaMedia) {
       super(nombre, dni);
       if (notaMedia < 0 || notaMedia > 10) {
           throw new IllegalArgumentException("Nota media fuera de rango");
       }
       this.notaMedia = notaMedia;
   }

   public double getNotaMedia() {
       return notaMedia;
   }

   public abstract boolean puedeTitular();
}

//CLASES CONCRETAS DE ESTUDIANTES
public final class EstudiantePregrado extends Estudiante {
   public EstudiantePregrado(String nombre, String dni, double notaMedia) {
       super(nombre, dni, notaMedia);
   }

   @Override
   public boolean puedeTitular() {
       return getNotaMedia() >= 5.0;
   }
}

public final class EstudiantePosgrado extends Estudiante implements ConSeguro {
   public EstudiantePosgrado(String nombre, String dni, double notaMedia) {
       super(nombre, dni, notaMedia);
   }

   @Override
   public boolean puedeTitular() {
       return getNotaMedia() >= 7.5;
   }

   @Override
   public double getImporteSeguroAnual() {
       return 2000;
   }
}
}
