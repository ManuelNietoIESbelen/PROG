package prog.unidad07.ejercicio2;

public class Consultor extends Empleado {

    private double tarifa; 
    private int horas; 
    
    
  
  public Consultor(String nombre, String dni, String telefono,double tarifa, int horas) {
      super(nombre, dni, telefono);
      this.tarifa = tarifa;
      this.horas = horas;
  
  }



  @Override
  public double getSalario() {
    return tarifa * horas;
  }

}
