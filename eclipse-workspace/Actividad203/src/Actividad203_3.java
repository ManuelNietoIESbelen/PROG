
public class Actividad203_3 {

  public static void main(String[] args) {

    Lapiz lapiz1 = new Lapiz();

    lapiz1.baja();
    lapiz1.desplaza(20);
    lapiz1.gira(90);
    lapiz1.desplaza(20);
    lapiz1.gira(90);
    lapiz1.desplaza(20);
    lapiz1.gira(90);
    lapiz1.desplaza(20);
    lapiz1.sube();

    Linea linea1 = lapiz1.getTrazo(1);
    Linea linea2 = lapiz1.getTrazo(2);
    Linea linea3 = lapiz1.getTrazo(3);
    Linea linea4 = lapiz1.getTrazo(4);
    
    System.out.println(lapiz1.getNumTrazos());
    
 
  
    
    
  }
}
