package prog.unidad04.actividad402.ej8a;

/**
 * La clase IntervaloTiempo....
 */
public class IntervaloTiempo {
private static final int SEGUNDOS_POR_HORA = 3600;
//Constantes
 // Cantidad de segundos por minuto
 private static final int SEGUNDOS_POR_MINUTOS = 60;
 // atributos
 private int segundos;
 
 private IntervaloTiempo(int segundos) {
   this.segundos=segundos;
 }

 
 /**
  * Constructor con 3 parametros
  * @param horas Numero de horas del intervalo....
  * @param minutos ...
  * @param segundos ...
  */
 public IntervaloTiempo(int horas, int minutos, int segundos) {
   this.segundos =horas*SEGUNDOS_POR_HORA+SEGUNDOS_POR_MINUTOS*minutos+segundos;

 }
/**
 * 
 * @param otro
 * @return
 */
 public IntervaloTiempo suma(IntervaloTiempo otro) {
   //Se calcula el resultado total de segundos.
   int resultado =this.segundos+otro.segundos;
   return new IntervaloTiempo(resultado);
 }

 public IntervaloTiempo resta(IntervaloTiempo otro) {
   int resultado = this.segundos-otro.segundos;
   
   
   if(resultado<0) {
     System.out.println("ERROR");
     return null;
   }else {
     return new IntervaloTiempo(resultado);
   }
 }

 public String obtenerCadena() {
   int seg = segundos%60;
   int minTemp = segundos/60;
   int min = minTemp%60;
   int horas = minTemp /60;
   return "horas " + horas + " minutos " + min + " segundos " + seg;
 }
}
