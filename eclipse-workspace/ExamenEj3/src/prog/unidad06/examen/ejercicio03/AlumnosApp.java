package prog.unidad06.examen.ejercicio03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlumnosApp {

  private JFrame frmGestinDeAlumnos;
  private JTextField textEdad;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  private JButton btnNuevo;
  private JList<Alumno> listAlumnos;
  private DefaultListModel<String> listAlumnosModelo;
  private JTextField textNombre;
  private JButton btnActualizar;
  private JButton btnEliminar;
  private JButton btnAceptar;
  private JButton btnCancelar;
 
  

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AlumnosApp window = new AlumnosApp();
          window.frmGestinDeAlumnos.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public AlumnosApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmGestinDeAlumnos = new JFrame();
    frmGestinDeAlumnos.setTitle("Gestión de alumnos");
    frmGestinDeAlumnos.setBounds(100, 100, 550, 453);
    frmGestinDeAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lblAlumnos = new JLabel("Alumnos:");
    
    JScrollPane scrollPane = new JScrollPane();
    
    JLabel lblNombre = new JLabel("Nombre:");
    
    textNombre = new JTextField();
    textNombre.setEnabled(false);
    textNombre.setColumns(10);
    
    JLabel lblEdad = new JLabel("Edad:");
    
    textEdad = new JTextField();
    textEdad.setEnabled(false);
    textEdad.setColumns(10);
    
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
    
    btnNuevo = new JButton("Nuevo");
    btnNuevo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        addAlumno();
        
      }
    });
    
    btnActualizar = new JButton("Actualizar");
    btnActualizar.setEnabled(false);
    
    btnEliminar = new JButton("Eliminar");
    btnEliminar.setEnabled(false);
    
    btnAceptar = new JButton("Aceptar");
    btnAceptar.setEnabled(false);
    
    btnCancelar = new JButton("Cancelar");
    btnCancelar.setEnabled(false);
    
    
    
    
    GroupLayout groupLayout = new GroupLayout(frmGestinDeAlumnos.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addContainerGap()
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblAlumnos)
                .addGroup(groupLayout.createSequentialGroup()
                  .addGap(10)
                  .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
                    .addGroup(groupLayout.createSequentialGroup()
                      .addGap(10)
                      .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                          .addComponent(lblNombre)
                          .addPreferredGap(ComponentPlacement.RELATED)
                          .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                          .addGap(32)
                          .addComponent(lblEdad)
                          .addPreferredGap(ComponentPlacement.UNRELATED)
                          .addComponent(textEdad, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))))))
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(155)
              .addComponent(btnNuevo)
              .addGap(18)
              .addComponent(btnActualizar)
              .addGap(18)
              .addComponent(btnEliminar))
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(210)
              .addComponent(btnAceptar)
              .addGap(18)
              .addComponent(btnCancelar)))
          .addContainerGap(20, Short.MAX_VALUE))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(lblAlumnos)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblNombre)
            .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(lblEdad)
            .addComponent(textEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(panel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
          .addGap(18)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(btnNuevo)
            .addComponent(btnActualizar)
            .addComponent(btnEliminar))
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(btnAceptar)
            .addComponent(btnCancelar))
          .addContainerGap(38, Short.MAX_VALUE))
    );
    
    JRadioButton rdbtn1bach = new JRadioButton("Primero de Bachillerato");
    rdbtn1bach.setEnabled(false);
    buttonGroup.add(rdbtn1bach);
    
    JRadioButton rdbtn2bach = new JRadioButton("Segundo de Bachillerato");
    rdbtn2bach.setEnabled(false);
    buttonGroup.add(rdbtn2bach);
    
    JRadioButton rdbtn1grado = new JRadioButton("Primero de grado superior");
    rdbtn1grado.setEnabled(false);
    buttonGroup.add(rdbtn1grado);
    
    JRadioButton rdbtn2grado = new JRadioButton("Segundo de grado superior");
    rdbtn2grado.setEnabled(false);
    buttonGroup.add(rdbtn2grado);
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(rdbtn1bach)
            .addComponent(rdbtn2bach))
          .addGap(73)
          .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(rdbtn1grado)
            .addComponent(rdbtn2grado))
          .addContainerGap(166, Short.MAX_VALUE))
    );
    gl_panel.setVerticalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
            .addComponent(rdbtn1bach)
            .addComponent(rdbtn1grado))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
            .addComponent(rdbtn2bach)
            .addComponent(rdbtn2grado))
          .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panel.setLayout(gl_panel);
    
    listAlumnos = new JList();
    listAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    scrollPane.setViewportView(listAlumnos);
    frmGestinDeAlumnos.getContentPane().setLayout(groupLayout);
    
    
  }

  protected void addAlumno() {
    textNombre.setEnabled(true);
    textEdad.setEnabled(true);
    btnActualizar.setEnabled(true);
    btnEliminar.setEnabled(true);
    btnAceptar.setEnabled(true);
    btnCancelar.setEnabled(true);
    
    textNombre.getInputContext();
    
    
    
    
    
    
  }
  
  
}
