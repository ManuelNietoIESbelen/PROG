package r01ejercicios;

import java.util.*;

public class r01e21 {
  private static final double LITROS_POR_GALON= 3.785;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuantos litros has producido hoy?");
    double litros = Double.parseDouble(sc.nextLine());
    System.out.println("¿Cuanto te pagan por galon?(Euros)");
    double precioGalon=Double.parseDouble(sc.nextLine());
    
    double gananciaTotal=(litros/LITROS_POR_GALON)*precioGalon;
    System.out.printf("Un galon son 3,785 litros asique recibiras: %f €",gananciaTotal);
    
  }
}
