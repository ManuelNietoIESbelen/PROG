package prog.unidad07.ejercicio3;

public abstract class Cuenta {
  private static final double PORCENTAJE_COMISION = 0.1;
  private static final int COMISION_MAXIMA = 10;
  //Atributos
  //Nombre
  protected String nombre; 
  //Dni
  protected String dni;
  //Saldo
  protected double saldo;

  
  public Cuenta(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
    this.saldo=0;
  }

  public void ingresar(double cantidad ) {
    if(cantidad>0) {
       saldo +=cantidad;
    }
  }
  
  public void retirar(double cantidad) {
    if(cantidad>0) {
      saldo-=cantidad;
    }
  }
  
  public void actualiza() {
    double interes = getInteres();
    double comision =getComision();
    double penalizacion=getPenalizacion();
    saldo+= interes - comision - penalizacion;
  }
 
  public double getComision() {
    double porcentaje = saldo * PORCENTAJE_COMISION;
    if (porcentaje < COMISION_MAXIMA ) {
      return porcentaje;
    }else {
     return COMISION_MAXIMA; 
    }
  }
  

  
  public double getPenalizacion() {
    return 0;
    
  }
  
  public double getInteres() {
    return 0; 
  }
  
}
