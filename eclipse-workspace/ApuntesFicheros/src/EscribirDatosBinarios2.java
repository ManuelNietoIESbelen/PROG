import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirDatosBinarios2 {
  public static void main(String[] args) {
    String ruta = "datos.bin";

    try (FileOutputStream fos = new FileOutputStream(ruta, true)) { // 'true' para añadir
      for (int i = 0; i < 10; i++) {
        fos.write(i); // Escribimos números del 0 al 9 en el archivo binario
      }
      System.out.println("Archivo binario escrito correctamente.");
    } catch (IOException e) {
      System.out.println("Error al escribir el archivo binario: " + e.getMessage());
    }
  }
}
