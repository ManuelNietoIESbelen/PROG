import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivoTexto {
  public static void main(String[] args) {
    String ruta = "salida.txt";

    try (PrintWriter pw = new PrintWriter(new FileWriter(ruta, true))) { // 'true' para añadir al archivo
      pw.println("Hola, este es un mensaje guardado en el archivo.");
      System.out.println("Texto escrito correctamente.");
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }
}
