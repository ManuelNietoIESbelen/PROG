
public class Actividad203_3_3 {

  public static void main(String[] args) {
    Punto punto1 = new Punto(25,55);

    Lapiz lapiz1 = new Lapiz();
    
    lapiz1.mueve(punto1);
    lapiz1.baja();
    lapiz1.desplaza(20);
    lapiz1.gira(108);
    lapiz1.desplaza(20);
    lapiz1.gira(108);
    lapiz1.desplaza(20);
    lapiz1.gira(108);
    lapiz1.desplaza(20);
    lapiz1.gira(108);
    lapiz1.desplaza(20);
    lapiz1.sube();

   
    Linea linea1 = lapiz1.getTrazo(1);
    Linea linea2 = lapiz1.getTrazo(2);
    Linea linea3 = lapiz1.getTrazo(3);
    Linea linea4= lapiz1.getTrazo(4);
    Linea linea5 = lapiz1.getTrazo(5);
    
    
   System.out.println(lapiz1.getNumTrazos());
    
    
    
  
  }

}
