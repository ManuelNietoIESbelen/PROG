package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class radioButton {

  private JFrame frame;
  private final ButtonGroup buttonGroup = new ButtonGroup();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          radioButton window = new radioButton();
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
  public radioButton() {
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
    panel.setBorder(new TitledBorder(null, "Elige una Opcion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addGap(45)
          .addComponent(panel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
          .addContainerGap(44, Short.MAX_VALUE))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addGap(45)
          .addComponent(panel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
          .addContainerGap(84, Short.MAX_VALUE))
    );
    
    JRadioButton rdbtnOpciondawdadadwad = new JRadioButton("Opcion");
    buttonGroup.add(rdbtnOpciondawdadadwad);
    
    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opcion 2");
    buttonGroup.add(rdbtnNewRadioButton_1);
    
    JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Opcion 3");
    buttonGroup.add(rdbtnNewRadioButton_2);
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(rdbtnOpciondawdadadwad, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
            .addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
            .addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
          .addContainerGap(138, Short.MAX_VALUE))
    );
    gl_panel.setVerticalGroup(
      gl_panel.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel.createSequentialGroup()
          .addContainerGap()
          .addComponent(rdbtnOpciondawdadadwad)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(rdbtnNewRadioButton_1)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(rdbtnNewRadioButton_2)
          .addContainerGap(34, Short.MAX_VALUE))
    );
    panel.setLayout(gl_panel);
    frame.getContentPane().setLayout(groupLayout);
  }
}
