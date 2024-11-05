package pro.unidad03.repeticion;

public class CuadriculaDiezPorDiezApp {

  public static void main(String[] args) {
    for(int j=1; j<=10000;j++) {
      System.out.printf("%d \t",j);
      if (j%10==0) {
        System.out.printf("%n");
      }
      
    }
    }
  }


