package prog.unidad04.practica406.principal;
import prog.unidad04.practica406.libreria.Fecha;
import java.time.LocalDate;
import java.util.Scanner;

import prog.unidad04.practica406.libreria.Automovil;
import prog.unidad04.practica406.libreria.Fecha;

public class VehiculosApp {

  public static void main(String[] args) {

    LocalDate currentDate = LocalDate.now();
   
    Scanner sc = new Scanner(System.in);
   System.out.println("PRÁCTICA DE MANUEL ÁNGEL NIETO JIMÉNEZ. GESTIÓN DE VEHÍCULOS");
//    System.out.println("Introduce la matrícula del automovil(4 números, 0 o más espacios y tres letras mayúsculas): ");
//    String matriculaAutomovil = sc.nextLine();
//    
//    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
//    int diaAutomovil = Integer.parseInt(sc.nextLine());
//    
//    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
//    int mesAutomovil = Integer.parseInt(sc.nextLine());
//    
//    System.out.println("Introduzca el dia de la fecha de matriculacion del automovil: ");
//    int anyoAutomovil = Integer.parseInt(sc.nextLine());
//    
//    System.out.println("Introduzca el color del automovil (blanco, negro o azul)");
//    String colorAutomovil = sc.nextLine();
//    
//    System.out.println("Introduzca el numero de plazas del automovil(1 o mas)");
//    int plazas = Integer.parseInt(sc.nextLine());
//    
//    
//    System.out.println("Current Date: " + currentDate);
//
//    Fecha fechaMatriculacion = new Fecha(diaAutomovil,mesAutomovil,anyoAutomovil);
    
    Fecha fechaActual = new Fecha(13,12,2024);
    Fecha fechaActual2 = new Fecha(13,12,2020);

    System.out.println(fechaActual.diasEntre(fechaActual2));
    //Automovil auto = new Automovil(matriculaAutomovil, fechaMatriculacion, colorAutomovil, plazas);

//    System.out.println(auto.toString());
//    System.out.println(auto.comprobarMatricula(auto));
//    System.out.println(auto.comprobarColor(auto));
      fechaActual2.toString();
   
    
  }

}
