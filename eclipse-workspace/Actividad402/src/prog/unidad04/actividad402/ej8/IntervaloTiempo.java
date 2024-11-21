package prog.unidad04.actividad402.ej8;

public class IntervaloTiempo {
//atributos
  private int horas;
  private int minutos; 
  private int segundos;
  
  
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    //ajustamos los segundos
    while(segundos>59) {
      segundos -=60;
      minutos++;
    }
    //ajustamos por el metodo MANOLO
    horas+= minutos/60;
    minutos=minutos%60;   
    
    
    
    this.horas = horas;
    this.minutos=minutos;
    this.segundos=segundos;
    
    
    
    
  }
  
  public IntervaloTiempo suma(IntervaloTiempo otro) {
    return null;
  }
  
  public IntervaloTiempo resta(IntervaloTiempo otro) {
    return null;
  }
  
  public String obtenerCadena() {
    
    return horas+ minutos+segundos
  }
}


