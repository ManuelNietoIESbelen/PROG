package prog.unidad06.gui.ejercicio10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioRegistroSwingApp {

  private JFrame frame;
  private JTextField txtNombre;
  private JTextField txtContrasenia;
  private JTextField txtContrasenia2;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  private JTextArea textArea;
  private JRadioButton rbTitulo1;
  private JRadioButton rbTitulo2;
  private JComboBox<String> cbCiclos;
  private DefaultComboBoxModel<String> modeloComboCalificacion;
  private JCheckBox cbDocumento1;
  private JCheckBox cbDocumento2;
  private JCheckBox cbDocumento3;
  private JCheckBox cbDocumento4;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FormularioRegistroSwingApp window = new FormularioRegistroSwingApp();
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
  public FormularioRegistroSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 462, 538);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lblNombre = new JLabel("Nombre de Usuario:");
    lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    txtNombre = new JTextField();
    txtNombre.setText("paco");
    txtNombre.setColumns(10);
    
    JLabel lblContrasenia = new JLabel("Password: ");
    lblContrasenia.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    txtContrasenia = new JTextField();
    txtContrasenia.setText("Malaga");
    txtContrasenia.setColumns(10);
    
    JLabel lblContrasenia2 = new JLabel("Repite Pasword: ");
    lblContrasenia2.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    txtContrasenia2 = new JTextField();
    txtContrasenia2.setText("Malaga");
    txtContrasenia2.setColumns(10);
    
    JLabel lblCiclo = new JLabel("Ciclo al que se presenta: ");
    lblCiclo.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    cbCiclos = new JComboBox();
    cbCiclos.setFont(new Font("Tahoma", Font.BOLD, 11));
    cbCiclos.setModel(new DefaultComboBoxModel(new String[] {"DAM", "DAW", "ASIR"}));
    
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder(null, "Titulación que presenta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    
    JPanel panel_1 = new JPanel();
    panel_1.setBorder(new TitledBorder(null, "Documentación que aporta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    
    JButton btnRegistrar = new JButton("Registrar");
    btnRegistrar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nombre = txtNombre.getText();
        
        if(nombre.length() < 1 ||nombre.length()  > 8) {
          JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener entre 1 y 8 caracteres");
          return;
        }
        String contrasenia1 = txtContrasenia.getText();
        String contrasenia2 = txtContrasenia2.getText();
        if(contrasenia1.length() < 5 || contrasenia1.length() > 10) {
          JOptionPane.showMessageDialog(null, "La contraseña del usuario debe tener entre 5 y 10 caracteres");
          return;
        }
        
        if(!contrasenia1.equals(contrasenia2)) {
          JOptionPane.showMessageDialog(null, "La contraseña del usuario debe ser igual en ");
          return;
        }
        
        String ciclo = cbCiclos.getItemAt(cbCiclos.getSelectedIndex());
        String texto = String.format("Registro %n Nombre de Usuario: %s%n Contraseña: %s%n Ciclo en el que se matricula: %s%n Titulación que presenta: %s%n Documentos que presenta: %s",
                                      txtNombre.getText(), txtContrasenia.getText(),ciclo ,elegirTitulacion(),mostrarDocumentos());
        textArea.setText(texto);
      }
    });
    btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    JScrollPane scrollPane = new JScrollPane();
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addContainerGap()
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
                .addGroup(groupLayout.createSequentialGroup()
                  .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblContrasenia))
                  .addGap(11)
                  .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(groupLayout.createSequentialGroup()
                      .addComponent(txtContrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                      .addGap(18)
                      .addComponent(lblContrasenia2)
                      .addGap(18)
                      .addComponent(txtContrasenia2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addGroup(groupLayout.createSequentialGroup()
                  .addComponent(lblCiclo)
                  .addGap(18)
                  .addComponent(cbCiclos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)))
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(176)
              .addComponent(btnRegistrar))
            .addGroup(groupLayout.createSequentialGroup()
              .addContainerGap()
              .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(142, Short.MAX_VALUE))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblNombre)
            .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(lblContrasenia)
            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
              .addComponent(txtContrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
              .addComponent(lblContrasenia2)
              .addComponent(txtContrasenia2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
          .addGap(27)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblCiclo)
            .addComponent(cbCiclos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addGap(26)
          .addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
          .addGap(18)
          .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(btnRegistrar)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
          .addContainerGap(23, Short.MAX_VALUE))
    );
    
    textArea = new JTextArea();
    scrollPane.setViewportView(textArea);
    
    cbDocumento2 = new JCheckBox("Certificado Notas");
    cbDocumento2.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    cbDocumento1 = new JCheckBox("Titulo Oficial");
    cbDocumento1.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    cbDocumento3 = new JCheckBox("Convalidación");
    cbDocumento3.setFont(new Font("Tahoma", Font.BOLD, 11));
    
    cbDocumento4 = new JCheckBox("DNI");
    cbDocumento4.setFont(new Font("Tahoma", Font.BOLD, 11));
    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
    gl_panel_1.setHorizontalGroup(
      gl_panel_1.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel_1.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addComponent(cbDocumento1)
            .addComponent(cbDocumento2))
          .addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
          .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addComponent(cbDocumento4)
            .addComponent(cbDocumento3))
          .addContainerGap(56, Short.MAX_VALUE))
    );
    gl_panel_1.setVerticalGroup(
      gl_panel_1.createParallelGroup(Alignment.TRAILING)
        .addGroup(gl_panel_1.createSequentialGroup()
          .addContainerGap(33, Short.MAX_VALUE)
          .addComponent(cbDocumento4)
          .addContainerGap())
        .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
          .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
            .addComponent(cbDocumento1)
            .addComponent(cbDocumento3))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(cbDocumento2)
          .addContainerGap())
    );
    panel_1.setLayout(gl_panel_1);
    
    rbTitulo2 = new JRadioButton("Prueba de acceso");
    rbTitulo2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       
      }

      
    });
    buttonGroup.add(rbTitulo2);
    
    rbTitulo1 = new JRadioButton("Bachillerato");
    rbTitulo1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    buttonGroup.add(rbTitulo1);
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(rbTitulo2)
            .addComponent(rbTitulo1))
          .addContainerGap(308, Short.MAX_VALUE))
    );
    gl_panel.setVerticalGroup(
      gl_panel.createParallelGroup(Alignment.TRAILING)
        .addGroup(gl_panel.createSequentialGroup()
          .addComponent(rbTitulo1)
          .addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
          .addComponent(rbTitulo2)
          .addContainerGap())
    );
    panel.setLayout(gl_panel);
    frame.getContentPane().setLayout(groupLayout);
  }
  private String elegirTitulacion() {
    if(rbTitulo1.isSelected()) {
      return "Bachillerato";
    }else if(rbTitulo2.isSelected()) {
      return "prueba de Acceso";
    }
     return "";
   }
  
  private String elegirDocumentos() {
    
    return "";
  }
  
  private String mostrarDocumentos() {
    String documentos ="";
    if(cbDocumento1.isSelected()) {
      documentos = "Titulo Oficial";
      
    }
    if(cbDocumento2.isSelected()) {
      if(documentos.length() > 0) {
        documentos += ", ";
      }
      documentos += "Certificado de Notas";
    }
    if(cbDocumento3.isSelected() ) {
      if(documentos.length() > 0) {
        documentos += ", ";
      }
      documentos += "Convalidación";
    }
    if(cbDocumento4.isSelected()) {
      if(documentos.length() > 0) {
        documentos += ", ";
      }
      documentos += "DNI";
    }
    return documentos;
  }
  
}
