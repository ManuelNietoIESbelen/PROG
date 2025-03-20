package prog.unidad07.ejercicio3;

public class CuentaNormal extends Cuenta {
  private static final int SALDO_MINIMO = 500;
  private static final int PENALIZACION = 10;
  private boolean penaliza;

  public CuentaNormal(String nombre, String dni) {
    super(nombre, dni);
    penaliza = false;

  }

  @Override
  public double getComision() {
    return super.getComision();
  }

  @Override
  public double getPenalizacion() {
    return penaliza ? PENALIZACION : 0;
  }

  @Override
  public double getInteres() {
    return super.getInteres();
  }

  @Override
  public void retirar(double cantidad) {
    super.retirar(cantidad);
    if(saldo<SALDO_MINIMO){
      penaliza=true;
    }
  }

  @Override
  public void actualiza() {
    super.actualiza();
    penaliza = (saldo < SALDO_MINIMO);
  }

  
}
