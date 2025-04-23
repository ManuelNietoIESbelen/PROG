package poblaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class ConsultaPoblacionesApp {

  private static final String URL = "jdbc:sqlite:db/poblaciones.db";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduza los parametros de busqueda");
    System.out.println("Nombre:");
    String nombre = sc.nextLine();
    System.out.println("Poblacion minima:");
    int poblacionMin = sc.nextInt();
    System.out.println("Poblacion maxima:");
    int poblacionMax = sc.nextInt();

    try (Connection conexion = DriverManager.getConnection(URL);
        PreparedStatement sentencia = conexion.prepareStatement(
            "SELECT * FROM poblaciones WHERE nombre LIKE ? AND poblacionMin <= ? AND poblacionMax >= ?")) {

      sentencia.setString(1, "%" + nombre + "%");
      sentencia.setInt(2, poblacionMin);
      sentencia.setInt(3, poblacionMax);

      try (ResultSet rs = sentencia.executeQuery()) {
        boolean hayResultados = false;
        System.out.println("\nResultados de la búsqueda:");
        while (rs.next()) {
          System.out.println("Nombre: " + rs.getString("nombre") + ", Población: " + rs.getInt("poblacion"));
          hayResultados = true;
        }

        if (!hayResultados) {
          System.out.println("No se encontraron resultados.");
        }
      }

    } catch (Exception e) {
      System.out.println("Error en la consulta: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
