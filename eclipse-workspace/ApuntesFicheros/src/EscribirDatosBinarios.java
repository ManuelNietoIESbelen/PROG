import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirDatosBinarios {
  public static void main(String[] args) {
    String rutaArchivo = "datos.bin";

    try (FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
      String texto = "Hola me llamo manuel";
      fos.write(texto.getBytes()); // Convierte el String a bytes y los escribe
      System.out.println("Archivo binario escrito correctamente.");
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo binario.");
    }
  }
}
