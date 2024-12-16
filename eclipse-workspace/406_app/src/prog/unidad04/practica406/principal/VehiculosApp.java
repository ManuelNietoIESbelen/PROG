package prog.unidad04.practica406.principal;

import java.time.LocalDate;
import java.util.Scanner;

import prog.unidad04.practica406.libreria.Automovil;
import prog.unidad04.practica406.libreria.Fecha;
import prog.unidad04.practica406.libreria.Motocicleta;

public class VehiculosApp {

  public static void main(String[] args) {

    final int ANYO_FECHA_ACTUAL = LocalDate.now().getYear();
    int vehiculosMatriculados=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("PRÁCTICA DE MANUEL ÁNGEL NIETO JIMÉNEZ. GESTIÓN DE VEHÍCULOS");
    System.out.println("Introduce la matrícula del automovil(4 números, 0 o más espacios y tres letras mayúsculas): ");
    String matriculaAutomovil = sc.nextLine();

    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
    int diaAutomovil = Integer.parseInt(sc.nextLine());

    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
    int mesAutomovil = Integer.parseInt(sc.nextLine());

    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
    int anyoAutomovil = Integer.parseInt(sc.nextLine());
    
    Fecha automovilFechaMatriculacion = new Fecha(diaAutomovil, mesAutomovil, anyoAutomovil);

    System.out.println("Introduzca el color del automovil (blanco, negro o azul)");
    String colorAutomovil = sc.nextLine();

    System.out.println("Introduzca el numero de plazas del automovil(1 o mas)");
    int plazasAutomovil = Integer.parseInt(sc.nextLine());

    System.out
        .println("Introduzca la matrícula de la motocicleta (4 números, 0 o mas espacios y tres letras mayúsculas):");
    String matriculaMotocicleta = sc.nextLine();

    System.out.println("Introduzca el día de la fecha de matriculación de la motocicleta:");
    int diaMotocicleta = Integer.parseInt(sc.nextLine());

    System.out.println("Introduzca el mes de la fecha de matriculación de la motocicleta:");
    int mesMotocicleta = Integer.parseInt(sc.nextLine());

    System.out.println("Introduzca el año de la fecha de matriculación de la motocicleta:");
    int anyoMotocicleta = Integer.parseInt(sc.nextLine());

    System.out.println("Introduzca la cilindrada de la motocicleta (50 o mas):");
    int cilindradaMotocicleta = Integer.parseInt(sc.nextLine());

    Fecha motocicletaFechaMatriculacion = new Fecha(diaMotocicleta, mesMotocicleta, anyoMotocicleta);
   

    
    try {
      Automovil automovil = new Automovil(matriculaAutomovil, automovilFechaMatriculacion, colorAutomovil,
          plazasAutomovil);
      vehiculosMatriculados++;
      Motocicleta motocicleta = new Motocicleta(matriculaMotocicleta, motocicletaFechaMatriculacion,
          cilindradaMotocicleta);
      vehiculosMatriculados++;
      
      long diasMatriculadosAutovil = automovilFechaMatriculacion.AnyosEnDias(anyoAutomovil, ANYO_FECHA_ACTUAL);
      long diasMatriculadosMotocicleta = motocicletaFechaMatriculacion.AnyosEnDias(anyoMotocicleta, ANYO_FECHA_ACTUAL);
      
      System.out.println("Los datos del automóvil son:");
      System.out
          .println("Matrícula: " + automovil.getMatricula() + " Fecha Matriculación: " + automovilFechaMatriculacion);
      System.out.println("Color: " + automovil.getColor() + " Num. Plazas: " + automovil.getPlazas());
      System.out.println("Distintivo ambiental: " + automovil.getDistintivo());

      System.out.println("\nLos datos de la motocicleta son:");
      System.out
          .println("Matrícula: " + motocicleta.getMatricula() + " Fecha Matriculación: " + motocicletaFechaMatriculacion);
      System.out.println("Cilindrada: " + cilindradaMotocicleta);
      System.out.println("Distintivo ambiental: " + motocicleta.getDistintivo());

      System.out.println("\nEl automóvil lleva matriculado " + diasMatriculadosAutovil + " días");
      System.out.println("La motocicleta lleva matriculada " + diasMatriculadosMotocicleta + " días");
      System.out.println("Vehiculos matriculados: "+ vehiculosMatriculados);

      
    } catch (IllegalArgumentException e) {
      System.out.println("ERROR:Introduce los datos de nuevo");
      
      System.out.println("Introduce la matrícula del automovil(4 números, 0 o más espacios y tres letras mayúsculas): ");
       matriculaAutomovil = sc.nextLine();

      System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
      diaAutomovil = Integer.parseInt(sc.nextLine());

      System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
       mesAutomovil = Integer.parseInt(sc.nextLine());

      System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
       anyoAutomovil = Integer.parseInt(sc.nextLine());
      
       automovilFechaMatriculacion = new Fecha(diaAutomovil, mesAutomovil, anyoAutomovil);

      System.out.println("Introduzca el color del automovil (blanco, negro o azul)");
       colorAutomovil = sc.nextLine();

      System.out.println("Introduzca el numero de plazas del automovil(1 o mas)");
       plazasAutomovil = Integer.parseInt(sc.nextLine());

      System.out
          .println("Introduzca la matrícula de la motocicleta (4 números, 0 o mas espacios y tres letras mayúsculas):");
       matriculaMotocicleta = sc.nextLine();

      System.out.println("Introduzca el día de la fecha de matriculación de la motocicleta:");
       diaMotocicleta = Integer.parseInt(sc.nextLine());

      System.out.println("Introduzca el mes de la fecha de matriculación de la motocicleta:");
       mesMotocicleta = Integer.parseInt(sc.nextLine());

      System.out.println("Introduzca el año de la fecha de matriculación de la motocicleta:");
      anyoMotocicleta = Integer.parseInt(sc.nextLine());

      System.out.println("Introduzca la cilindrada de la motocicleta (50 o mas):");
       cilindradaMotocicleta = Integer.parseInt(sc.nextLine());

      motocicletaFechaMatriculacion = new Fecha(diaMotocicleta, mesMotocicleta, anyoMotocicleta);
      
      Automovil automovil = new Automovil(matriculaAutomovil, automovilFechaMatriculacion, colorAutomovil,
          plazasAutomovil);
      vehiculosMatriculados++;
      Motocicleta motocicleta = new Motocicleta(matriculaMotocicleta, motocicletaFechaMatriculacion,
          cilindradaMotocicleta);
      vehiculosMatriculados++;
      
      long diasMatriculadosAutovil = automovilFechaMatriculacion.AnyosEnDias(anyoAutomovil, ANYO_FECHA_ACTUAL);
      long diasMatriculadosMotocicleta = motocicletaFechaMatriculacion.AnyosEnDias(anyoMotocicleta, ANYO_FECHA_ACTUAL);
      
      System.out.println("Los datos del automóvil son:");
      System.out
          .println("Matrícula: " + automovil.getMatricula() + " Fecha Matriculación: " + automovilFechaMatriculacion);
      System.out.println("Color: " + automovil.getColor() + " Num. Plazas: " + automovil.getPlazas());
      System.out.println("Distintivo ambiental: " + automovil.getDistintivo());

      System.out.println("\nLos datos de la motocicleta son:");
      System.out
          .println("Matrícula: " + motocicleta.getMatricula() + " Fecha Matriculación: " + motocicletaFechaMatriculacion);
      System.out.println("Cilindrada: " + cilindradaMotocicleta);
      System.out.println("Distintivo ambiental: " + motocicleta.getDistintivo());

      System.out.println("\nEl automóvil lleva matriculado " + diasMatriculadosAutovil + " días");
      System.out.println("La motocicleta lleva matriculada " + diasMatriculadosMotocicleta + " días");
      System.out.println("Vehiculos matriculados: "+ vehiculosMatriculados);
    }
   
    

    
  }

}
