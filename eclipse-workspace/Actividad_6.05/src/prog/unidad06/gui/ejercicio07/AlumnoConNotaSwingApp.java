package prog.unidad06.gui.ejercicio07;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AlumnoConNotaSwingApp {

  private static final int NOTA_MIN = 0;
  private static final int NOTA_MAX = 10;
  private static final int NUMERO_ALUMNOS = 30;
  private JFrame frame;
  private JLabel lblMensajeNota;
  private DefaultListModel<String> modeloListaCalificaciones;
  private JList listNotas;
  private JComboBox<String> cbCalificaciones;
  private DefaultComboBoxModel<String> modeloComboCalificacion;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AlumnoConNotaSwingApp window = new AlumnoConNotaSwingApp();
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
  public AlumnoConNotaSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JScrollPane scrollPane = new JScrollPane();
    
    cbCalificaciones = new JComboBox();
    cbCalificaciones.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
    cbCalificaciones.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        contarCalificaciones();
      }
    });
    
    
    lblMensajeNota = new JLabel("                         ");
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(groupLayout.createSequentialGroup()
              .addComponent(cbCalificaciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
              .addGap(155)
              .addComponent(lblMensajeNota)))
          .addContainerGap())
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
          .addGap(18)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(cbCalificaciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(lblMensajeNota))
          .addContainerGap(69, Short.MAX_VALUE))
    );
    
    modeloListaCalificaciones = new DefaultListModel<String>();
    
    rellenarModeloLista(modeloListaCalificaciones);
    
    scrollPane.setViewportView(listNotas);
    frame.getContentPane().setLayout(groupLayout);
    
    // Mostramos las apariciones del valor seleccionado por defecto en el combo box
    contarCalificaciones();

    
    listNotas = new JList();
    scrollPane.setViewportView(listNotas);
    frame.getContentPane().setLayout(groupLayout);
  }
  
  private void rellenarModeloLista(DefaultListModel<String> modeloLista) {
    Random random = new Random();
    for(int i = 0; i <= NUMERO_ALUMNOS; i++) {
      int calificacion = random.nextInt(NOTA_MIN, NOTA_MAX + 1);
      modeloLista.addElement(String.valueOf(calificacion));
    }
  }
  
  
  private void contarCalificaciones() {
    // Obtiene la calificacion seleccionada en el combo box
    String calificacion = cbCalificaciones.getItemAt(cbCalificaciones.getSelectedIndex());
    
    // Cuenta cuantas veces aparece la calificacion en el modelo de la lista
    int apariciones = 0;
    for (int i = 0; i < modeloListaCalificaciones.size(); i++) {
      if (modeloListaCalificaciones.get(i).equals(calificacion)) {
        apariciones++;
      }
    }
    // Muestra en la etiqueta la cantidad
    lblMensajeNota.setText(String.format("Hay %d alumnos con una calificación de %s", apariciones, calificacion));
  }

}