
public class actividad202_3 {

  public static void main(String[] args) {
    Persona persona = new Persona();
    
    persona.edad=33;
    persona.numeroHijos=1;
    persona.peso=80.43;
    
    
    Persona persona2= persona;
    persona2.peso=79.65;
    
    System.out.printf("La primera persona tiene %d años, %d hijos y pesa %f kg %n",persona.edad,persona.numeroHijos,persona.peso);
    System.out.printf("La primera persona tiene %d años, %d hijos y pesa %f kg ",persona2.edad,persona2.numeroHijos,persona2.peso);

  }

}
