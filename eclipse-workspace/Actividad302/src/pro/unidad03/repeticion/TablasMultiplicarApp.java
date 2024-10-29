package pro.unidad03.repeticion;

public class TablasMultiplicarApp {

  public static void main(String[] args) {
    
    for(int i=1;i<=10;i++) {
      System.out.printf("%nTabla del %d %n %n",i);
      for(int j=1; j<=10; j++) {
        
        System.out.printf("%d x %d = %d %n",i,j,i*j);
      }
    }
  }

}
