package programas;

public class Cuenta {
  private String numero;
  private float saldo;

  public Cuenta(String numCta, float saldoCta) {
    numero = numCta;
    saldo = saldoCta;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numCta) {
    numero = numCta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldoCta) {
    saldo = saldoCta;
  }
  
  public void ingresarDinero(float importe) {
    saldo=saldo+importe;
  }
  
  public void extraerDinero(float importe) {
    saldo=saldo-importe;
    
    if (saldo - importe < 0) {
      
    }
  }
  
  public void mostrarCuenta() {
    System.out.println("Nº cuenta: "+getNumero());
    System.out.println("Saldo: " + getSaldo()+"€");
  }
  
  
  

}
