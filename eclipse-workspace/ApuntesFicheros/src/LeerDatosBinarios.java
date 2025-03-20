import java.io.FileInputStream;
import java.io.IOException;

public class LeerDatosBinarios {
  public static void main(String[] args) {
    String rutaArchivo = "datos.bin";

    try (FileInputStream fis = new FileInputStream(rutaArchivo)) {
      int byteLeido;
      while ((byteLeido = fis.read()) != -1) {
        System.out.print((char) byteLeido); // Convertimos el byte en carácter
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo binario.");
    }
  }
}
