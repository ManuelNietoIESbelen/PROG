import java.util.Scanner;

public class A205 {

  public static void main(String[] args) {
   
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce una cadena");
    String cadena1 =sc.nextLine();
    System.out.println("Introduce otra cadena");
    String cadena2 =sc.nextLine();
    
    
    System.out.println("La cadena 1 mide "+cadena1.length());
    System.out.println("La cadena 2 mide "+cadena2.length());
    

   System.out.println("¿Cadena1 esa vacia? "+cadena1.isEmpty());
   System.out.println("¿Cadena2 esa vacia? "+cadena2.isEmpty());
   System.out.println("¿Cadena1  esta vacia o contiene espacios? "+cadena1.isBlank());
   System.out.println("¿Cadena2  esta vacia o contiene espacios? "+cadena2.isBlank());
    
   System.out.println("La concatenación de las dos cadenas es: "+cadena1+cadena2);
   
   System.out.println("¿Las cadenas son iguales incluido mayusculas? "+cadena1.equals(cadena2));
   System.out.println("¿Las cadenas son iguales ignorando las mayusculas? "+cadena1.equalsIgnoreCase(cadena2));

   System.out.println("Valor alfabetico incluido las mayusculas "+cadena1.compareTo(cadena2));
   System.out.println("Valor alfabetico ignorando las mayusculas "+cadena1.compareToIgnoreCase(cadena2));

   System.out.println("¿La cadena 1 contiene a la cadena dos? "+cadena1.contains(cadena2));
   System.out.println("¿La cadena 1 empieza por  la cadena dos? "+cadena1.startsWith(cadena2));
   System.out.println("¿La cadena 1 termina por  la cadena dos? "+cadena1.endsWith(cadena2));
   
   
   System.out.println(cadena1.charAt(0));
   System.out.println(cadena1.charAt(cadena1.length()-1));
   
   System.out.println(cadena1.substring(1));
   System.out.println(cadena1.toUpperCase());
   System.out.println(cadena1.toLowerCase());
   
   
  }

}
