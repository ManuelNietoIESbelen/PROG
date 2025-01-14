
public class arraysbidis {

  
  
    
  
  public static void main(String[] args) {
    
    int[][] tabla= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

    for (int i = 0; i < tabla.length; i++) {
        System.out.println(tabla[i][0]);
        for (int j = 0; j < tabla[i].length; j++) {
          System.out.println(tabla[i][j]);
        }
    }
  }
  
  
}
