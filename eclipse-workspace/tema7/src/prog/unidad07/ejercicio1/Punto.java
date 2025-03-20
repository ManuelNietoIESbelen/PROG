package prog.unidad07.ejercicio1;

public class Punto {
  private double x;
  private double y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distancia(Punto otro) {
    return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
  }

}
