package prog.unidad04.practica406.libreria;
import java.time.LocalDate;  
public class Fecha {
  
  int dia;
  int mes;
  int anyo;
  
  
  
  public Fecha(int dia, int mes, int anyo) {
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
    
  }

    public boolean esBisiesto(Fecha fecha) {
     if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)){
       return true;
     }else {
       return false;
     }
    }
    
    private boolean comprobarFecha(Fecha fecha){
      if(mes==2 && dia<=28 && esBisiesto(fecha)) {
        return true;
      }
      
      return true;
    }
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    
  }
  

