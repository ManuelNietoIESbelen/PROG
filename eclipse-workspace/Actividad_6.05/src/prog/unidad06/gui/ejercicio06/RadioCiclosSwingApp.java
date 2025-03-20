package prog.unidad06.gui.ejercicio06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioCiclosSwingApp {

  private JFrame frame;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  private JRadioButton rbASIR;
  private JRadioButton rbDAM;
  private JRadioButton rbDAW;
  private JLabel lblCurso;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          RadioCiclosSwingApp window = new RadioCiclosSwingApp();
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
  public RadioCiclosSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder(null, "Ciclo a cursar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    
    JLabel lbltexto = new JLabel("El ciclo que quieres cursar es: ");
    lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 11));
    
    lblCurso = new JLabel("                ");
    lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(lbltexto)
            .addComponent(lblCurso))
          .addContainerGap())
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(panel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(lbltexto)
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(lblCurso)
          .addContainerGap(46, Short.MAX_VALUE))
    );
    
    rbASIR = new JRadioButton("Administración de Sistemas informaticos y Redes");
    rbASIR.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        marcarCurso();
      }
    });
    rbASIR.setFont(new Font("Tahoma", Font.BOLD, 11));
    buttonGroup.add(rbASIR);
    
    rbDAM = new JRadioButton("Desarrollo de Aplicaciones Multimedia");
    rbDAM.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        marcarCurso();
      }
    });
    rbDAM.setFont(new Font("Tahoma", Font.BOLD, 11));
    buttonGroup.add(rbDAM);
    
    rbDAW = new JRadioButton("Desarrollo de Aplicaciones Web");
    rbDAW.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        marcarCurso();
      }
    });
    rbDAW.setFont(new Font("Tahoma", Font.BOLD, 11));
    buttonGroup.add(rbDAW);
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(rbASIR)
            .addComponent(rbDAM)
            .addComponent(rbDAW))
          .addContainerGap(293, Short.MAX_VALUE))
    );
    gl_panel.setVerticalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addComponent(rbASIR)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(rbDAM)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(rbDAW)
          .addContainerGap(68, Short.MAX_VALUE))
    );
    panel.setLayout(gl_panel);
    frame.getContentPane().setLayout(groupLayout);
  }
  
  private void marcarCurso() {
    if(rbASIR.isSelected()) {
      lblCurso.setText("ASIR");
    }else if(rbDAM.isSelected()) {
      lblCurso.setText("DAM");
    }else if(rbDAW.isSelected()) {
      lblCurso.setText("DAW");
    }
  }
}
