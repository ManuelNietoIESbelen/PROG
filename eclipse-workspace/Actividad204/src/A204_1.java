import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class A204_1 {

  public static void main(String[] args) {
    
    
    GranHermano gh1= new GranHermano(10);
    GranHermano gh2= new GranHermano(20);
    GranHermano gh3= new GranHermano(30);
    GranHermano gh4= new GranHermano(40);
    GranHermano gh5= new GranHermano(50);
    
    System.out.println(GranHermano.getNumeroObjetosCreados());  
    
    System.out.println("La edad del primer gran hermano"+gh1.getEdad());
    System.out.println("La edad del segundo gran hermano"+gh2.getEdad());
    System.out.println("La edad del tercer gran hermano"+gh3.getEdad());
    System.out.println("La edad del cuarto gran hermano"+gh4.getEdad());
    System.out.println("La edad del quinto gran hermano"+gh5.getEdad());
    
    
    
    
    
  }

}
