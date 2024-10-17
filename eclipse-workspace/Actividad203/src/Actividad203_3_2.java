
public class Actividad203_3_2 {

  public static void main(String[] args) {
    Punto punto1 = new Punto(20,35);

    Lapiz lapiz1 = new Lapiz();
    
    lapiz1.mueve(punto1);
    lapiz1.baja();
    lapiz1.desplaza(30);
    lapiz1.gira(60);
    lapiz1.desplaza(30);
    lapiz1.gira(60);
    lapiz1.desplaza(30);
    lapiz1.sube();

    Linea linea1 = lapiz1.getTrazo(1);
    Linea linea2 = lapiz1.getTrazo(2);
    Linea linea3 = lapiz1.getTrazo(3);
  
    System.out.println(lapiz1.getNumTrazos());
  }

}
