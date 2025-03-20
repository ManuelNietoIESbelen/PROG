package prog.unidad06.gui.ejercicio03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class GestionaListaSwingApp {

  private JFrame frame;
  private JTextField textField;
  private JList list;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GestionaListaSwingApp window = new GestionaListaSwingApp();
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
  public GestionaListaSwingApp() {
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
    
    textField = new JTextField();
    textField.setColumns(10);
    
    JButton btnAniadir = new JButton("Añadir");
    btnAniadir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        String texto = textField.getText();
        if(!texto.isBlank()) {
          
          DefaultListModel<String> modelo = (DefaultListModel<String>) list.getModel();
          //add cuando es una lista... y get cuando es una variable...
          modelo.addElement(texto);
        }
        
      }
    });
    
    JButton btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(list.getSelectedIndex() >= 0) {
          
          DefaultListModel<String> modelo = (DefaultListModel<String>) list.getModel();
          
          modelo.removeElementAt(list.getSelectedIndex());
        }
        
      }
    });
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
              .addComponent(textField, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
              .addGap(18)
              .addComponent(btnAniadir))
            .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminar, Alignment.TRAILING))
          .addContainerGap())
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAniadir))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(btnEliminar)
          .addContainerGap(26, Short.MAX_VALUE))
    );
    
    list = new JList();
    scrollPane.setViewportView(list);
    list.setModel(new DefaultListModel<String>());
    frame.getContentPane().setLayout(groupLayout);
  }
}
