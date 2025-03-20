package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Prueba {

  private JFrame frame;
  // Declaracion de la lista con genericos y sus modelo
  private JList<String> listNombres;
  private DefaultListModel<String> listNombresModelo;
  private JButton btnMostrar;
  private JButton btnEliminar;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Prueba window = new Prueba();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Prueba() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Creacion de la lista y su modelo(Enlazarlos, Manipular contenido usar el
    // modelo)(Para ver el contenido de la lista se usa la lista)
    listNombresModelo = new DefaultListModel<>();
    listNombres = new JList(listNombresModelo);
    // Evento que se activa cuando cambia la seleccion
    listNombres.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        cambiaSeleccion();
      }
    });
    rellenaLista();

    btnMostrar = new JButton("Mostrar");
    btnMostrar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        mostrarNombre();
      }
    });
    btnMostrar.setEnabled(false);
    
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        eliminarUsuario();
      }
    });

    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.TRAILING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap(37, Short.MAX_VALUE)
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(130)
              .addComponent(btnMostrar)
              .addGap(26)
              .addComponent(btnEliminar)
              .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
              .addComponent(listNombres, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
              .addGap(32))))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(listNombres, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
          .addGap(27)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(btnMostrar)
            .addComponent(btnEliminar))
          .addContainerGap(24, Short.MAX_VALUE))
    );
    frame.getContentPane().setLayout(groupLayout);
  }

  protected void mostrarNombre() {
    String nombre = listNombres.getSelectedValue();
    JOptionPane.showMessageDialog(null, "La perosna seleccionada es " + nombre, "Mostrar Nombre", JOptionPane.INFORMATION_MESSAGE, null);
  }
  
  protected void eliminarUsuario() {
   
    int posicion = listNombres.getSelectedIndex();
    if(posicion != -1) {
     int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que deseas eliminar el usuario?", "Eliminar Usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
    
     if(respuesta == JOptionPane.YES_OPTION) {
       //Borro
       listNombresModelo.remove(posicion);
     }
    }
    
   
    
  }

  protected void cambiaSeleccion() {
    int posicion = listNombres.getSelectedIndex();
    if (posicion != -1) {
      btnMostrar.setEnabled(true);
    } else {
      btnMostrar.setEnabled(false);
    }
  }


  private void rellenaLista() {
    listNombresModelo.addElement("Martin");
    listNombresModelo.addElement("Ramon");
    listNombresModelo.addElement("Raul");
    listNombresModelo.addElement("Pablo");
  }
}
