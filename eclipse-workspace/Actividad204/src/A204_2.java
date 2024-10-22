import java.util.Scanner;


import paquete1.Fraccion;

public class A204_2 {

  public static void main(String[] args) {
    
   Scanner sc= new Scanner(System.in);
   System.out.println("Introduce el numerador");
   int numerador1=Integer.parseInt(sc.nextLine());
   System.out.println("Introduce el denominador");
   int denominador1=Integer.parseInt(sc.nextLine());
   System.out.println("Introduce el numerador");
   int numerador2=Integer.parseInt(sc.nextLine());
  System.out.println("Introduce el denominador");
  int denominador2=Integer.parseInt(sc.nextLine());
  
  
  Fraccion fr1 = new Fraccion(numerador1,denominador1);
  Fraccion fr2 = new Fraccion(numerador2,denominador2);
              
  
Fraccion suma= fr1.suma(fr2);
Fraccion resta= fr1.resta(fr2);
Fraccion producto= fr1.producto(fr2);
Fraccion division= fr1.division(fr2);

paquete2.Fraccion suma2 = new paquete2.Fraccion(suma.getNumerador(), suma.getDenominador());
paquete2.Fraccion resta2 = new paquete2.Fraccion(resta.getNumerador(), resta.getDenominador());
paquete2.Fraccion producto2 = new paquete2.Fraccion(producto.getNumerador(), producto.getDenominador());
paquete2.Fraccion division2 = new paquete2.Fraccion(division.getNumerador(), division.getDenominador());

paquete2.Fraccion simpl1 = suma2.simplifica();
paquete2.Fraccion simpl2 = resta2.simplifica();
paquete2.Fraccion simpl3 = producto2.simplifica();
paquete2.Fraccion simpl4 = division2.simplifica();

System.out.println("RESULTADO DE LA SUMA:");
System.out.println(suma.getNumerador() +"/"+suma.getDenominador());


System.out.println("RESULTADO DE LA SUMA SIMPLIFICADA:");
System.out.println(simpl1.getNum()+"/"+simpl1.getDen());

 
System.out.println("RESULTADO DE LA RESTA");
System.out.println(resta.getNumerador()+"/"+resta.getDenominador());

System.out.println("RESULTADO DE LA RESTA SIMPLIFICADA:");
System.out.println(simpl2.getNum()+"/"+simpl2.getDen());

System.out.println("RESULTADO DE LA PRODUCTO");
System.out.println(producto.getNumerador()+"/"+producto.getDenominador());


System.out.println("RESULTADO DE LA PRODUCTO SIMPLIFICADA:");
System.out.println(simpl3.getNum()+"/"+simpl3.getDen());

System.out.println("RESULTADO DE LA DIVISION");
System.out.println(division.getNumerador()+"/"+division.getDenominador());

System.out.println("RESULTADO DE LA DIVISION SIMPLIFICADA:");
System.out.println(simpl4.getNum()+"/"+simpl4.getDen());






  }

}
