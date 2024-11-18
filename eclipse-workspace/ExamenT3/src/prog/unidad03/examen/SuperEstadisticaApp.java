package prog.unidad03.examen;

import java.util.Scanner;

public class SuperEstadisticaApp {

  public static void main(String[] args) {

    // Creamos un objeto escaner para recoger los valores de las variables.
    Scanner sc = new Scanner(System.in);

    // Inicializamos las variable necesarias.
    int num = 0;
    int contadorImpares=0;
    double suma=0;
    double media=0;
    boolean terminar=false;

    // Creamos un bucle do/while para pedir el numero hasta que se introduzca 0.
    do {
      //Utilizamos un Try/catch para controlar la excepcion en caso de que no siga el formato de numero
      try {
        // Pedimos los numeros por pantalla.
        System.out.println("Introduce un numero entero");
        num = Integer.parseInt(sc.nextLine());// Recogemos el valor de la variable num.
        //Condicional comprueba si el numero es par o impar
        if(num!=0) {
          if(num%2==0) {
          System.out.println("El numero es par");
          }else {
          System.out.println("El numero es impar");
          //Condicional que comprueba si el numero esta dentro del intervalo
          if(num<=-11 || num>20 || num==-1 || num==-3) {
            contadorImpares++;//Cuenta cuantos numeros impares dentro de los intervalos ha introducido el usuario
            suma+=num;//Calcula la suma total de los numeros impares dentro de los intervalos ha introducido el usuario
            System.out.printf("El numero %d se añade a la media%n",num);
          }
          }
        }
        
        //Condicional comprueba si el numero es positivo o negativo
          if(num>0) {
          System.out.println("El numero es positivo");
          }else if(num<0){
          System.out.println("El numero es negativo");
          }
        
        
        
      
      
      } catch (NumberFormatException e) {
        //Mensaje en caso de que salte el error de excepcion
        System.out.println("El dato introducido no es un numero entero valido");
       
      }
    } while (num != 0);//Fin del bucle
    
    //Calculo de la media
    media=suma/contadorImpares;
    System.out.printf("La media total es: %f%n",media);
    System.out.printf("Has introducido %d numeros impares que esten dentro de los intervalos%n",contadorImpares);
    
  }

}
