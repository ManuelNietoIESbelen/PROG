package prog.unidad04.actividad.ej6;

public class Punto {

 protected double posX;
 protected double posY;
 
 
public double getPosX() {
  return posX;
}
public void setPosX(double posX) {
  this.posX = posX;
}
public double getPosY() {
  return posY;
}
public void setPosY(double posY) {
  this.posY = posY;
}


public Punto(double posX, double posY) {
  this.posX = posX;
  this.posY = posY;
}
 

}
