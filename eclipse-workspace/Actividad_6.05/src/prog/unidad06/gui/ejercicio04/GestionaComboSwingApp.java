package prog.unidad06.gui.ejercicio04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GestionaComboSwingApp {

  private JFrame frame;
  private JComboBox comboBox;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GestionaComboSwingApp window = new GestionaComboSwingApp();
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
  public GestionaComboSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 263);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    comboBox = new JComboBox();
    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
    
    textField = new JTextField();
    textField.setColumns(10);
    
    JButton btnAniadir = new JButton("Añadir");
    btnAniadir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String texto = textField.getText();
        
        if(!texto.isBlank()) {
          DefaultComboBoxModel<String> modelo = (DefaultComboBoxModel<String>) comboBox.getModel();
          
          modelo.addElement(texto);
        }
      }
    });
    
    JButton btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        if(comboBox.getSelectedIndex() >= 0) {
          
          DefaultComboBoxModel<String> modelo = (DefaultComboBoxModel<String>) comboBox.getModel();
          
          modelo.removeElementAt(comboBox.getSelectedIndex());
        }
      }
    });
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
            .addComponent(btnEliminar)
            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
              .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
              .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                .addComponent(textField)
                .addGap(18)
                .addComponent(btnAniadir))))
          .addContainerGap(13, Short.MAX_VALUE))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
          .addGap(39)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAniadir))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(btnEliminar)
          .addContainerGap(133, Short.MAX_VALUE))
    );
    frame.getContentPane().setLayout(groupLayout);
  }
}
