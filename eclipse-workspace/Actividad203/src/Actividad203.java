

public class Actividad203 {

  public static void main(String[] args) {
    String indicador = "1111";
    CuentaCorriente cuenta1 = new CuentaCorriente(indicador);

    System.out.println(cuenta1.getNumero());

    cuenta1.ingresar(1000);

    System.out.println(cuenta1.getSaldo());

    cuenta1.retirar(1100);
    System.out.println(cuenta1.getSaldo());
    cuenta1.retirar(900);
    System.out.println(cuenta1.getSaldo());
    cuenta1.retirar(100);

    cuenta1.ingresar(350);
    System.out.println(cuenta1.getSaldo());

    cuenta1.retirar(400);
    System.out.println(cuenta1.getSaldo());

  }

}
