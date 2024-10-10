import java.util.Locale;
import java.util.Scanner;
public class CalculoVertical {

  private static final double PIES_POR_METRO = 3.28; //Declaracion de constante de pies por metro
  private static final double ACELERACION_GRAVEDAD = 9.8; //Declaracion de constante de aceleracion de gravedad

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("EXAMEN DE MANUEL ÁNGEL NIETO JIMÉNEZ. CALCULO DE LANZAMIENTO VERTICAL");
    System.out.println("¿Cuanto es el valor de la velocidad inicial en m/s?"); //Pedimos por pantalla el valor de la velocidad
    double velocidadInicial=Double.parseDouble(sc.nextLine()); //Recogemos el valor con un Scanner
    
    double tiempo= velocidadInicial/ACELERACION_GRAVEDAD; //Calculo del tiempo
    
    double altura= (velocidadInicial*tiempo) - ((ACELERACION_GRAVEDAD*tiempo*tiempo)/2); //Calculo de la altura
  
    double alturaPies= altura*PIES_POR_METRO; //Cambio de unidades de metros a pies 
  
  System.out.printf(Locale.US,"La altura máxima en metros es de %f ",altura); //Mostramos por pantalla los datos
  System.out.println("");
  System.out.printf(Locale.US,"Esta altura equivale a %d pies",(int)alturaPies);//Mostramos por pantalla los datos , en este caso cambiando el tipo de variable
  System.out.println("");
  System.out.printf(Locale.US,"El tiempo necesario es %f  segundos",tiempo);//Mostramos por pantalla los datos
  
  }

}
