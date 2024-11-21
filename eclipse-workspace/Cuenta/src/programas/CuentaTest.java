/**
 * 
 */
package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class CuentaTest {

  /**
   * Test method for {@link programas.Cuenta#getSaldo()}.
   */
  @Test
  void testGetSaldo() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link programas.Cuenta#setSaldo(float)}.
   */
  @Test
  void testSetSaldo() {
    Cuenta cuenta1 = new Cuenta("ccc-01",(float) 1000.1);
    
    float saldo = cuenta1.getSaldo();
    
    assertEquals (1000,saldo);
    //fail("Not yet implemented");
  }

  /**
   * Test method for {@link programas.Cuenta#ingresarDinero(float)}.
   */
  @Test
  void testIngresarDinero() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link programas.Cuenta#extraerDinero(float)}.
   */
  @Test
  void testExtraerDinero() {
    try{
      Cuenta cuenta1 = new Cuenta("ccc-14233",100);
      cuenta1.extraerDinero(120);
      fail("ERROR");
    }catch(ArithmeticException e) {
      assertEquals("Saldo negativo",e.getMessage());
    }
    
    
    
  }

}
