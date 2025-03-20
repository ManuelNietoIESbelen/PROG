import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LeerObjetosValor {
//Ruta del fichero
String rutaFichero = "miFichero.obj";

  try(
      DataInputStream flujoEntrada = new DataInputStream(new FileInputStream(rutaFichero)))
  {
    // Leer el número de objetos almacenados
    int numObjetos = flujoEntrada.readInt();

    for (int i = 0; i < numObjetos; i++) {
      Usuario usuario = new Usuario();
      usuario.setNombre(flujoEntrada.readUTF());
      usuario.setEdad(flujoEntrada.readInt());
      usuario.setPeso(flujoEntrada.readDouble());
      usuario.setHijos(flujoEntrada.readInt());
      usuario.setCasado(flujoEntrada.readBoolean());

      // Procesar el usuario leído
      System.out.println(usuario.getNombre() + " - " + usuario.getEdad());
    }
  }catch(FileNotFoundException e)
  {
    System.out.println("El fichero no existe.");
  }catch(
  IOException e)
  {
    System.out.println("Error de lectura.");
  }

}}
