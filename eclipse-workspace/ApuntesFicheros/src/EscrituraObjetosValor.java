import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraObjetosValor {
//Ruta del fichero
String rutaFichero = "miFichero.obj";

try (DataOutputStream flujoSalida = new DataOutputStream(new FileOutputStream(rutaFichero))) {
   // Número de objetos a almacenar
   flujoSalida.writeInt(2);
   
   // Crear y escribir primer usuario
   Usuario usuario1 = new Usuario("Paco", 25, 76.5, 2, true);
   flujoSalida.writeUTF(usuario1.getNombre());
   flujoSalida.writeInt(usuario1.getEdad());
   flujoSalida.writeDouble(usuario1.getPeso());
   flujoSalida.writeInt(usuario1.getHijos());
   flujoSalida.writeBoolean(usuario1.isCasado());

   // Crear y escribir segundo usuario
   Usuario usuario2 = new Usuario("Paqui", 52, 63.2, 0, false);
   flujoSalida.writeUTF(usuario2.getNombre());
   flujoSalida.writeInt(usuario2.getEdad());
   flujoSalida.writeDouble(usuario2.getPeso());
   flujoSalida.writeInt(usuario2.getHijos());
   flujoSalida.writeBoolean(usuario2.isCasado());
   
} catch (IOException e) {
   System.out.println("Error al escribir en el archivo.");
}

}
