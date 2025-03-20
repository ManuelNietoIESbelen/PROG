package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MiPrimeraVentana {

  private JFrame frmTitulo;
  private JLabel lblNewLabel;
  private JTextField textNombre;
  private JButton btnNewButton;
  private JLabel lblSaludo;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MiPrimeraVentana window = new MiPrimeraVentana();
          window.frmTitulo.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public MiPrimeraVentana() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmTitulo = new JFrame();
    frmTitulo.setTitle("SALUDADOR");
    frmTitulo.setBounds(100, 100, 468, 307);
    frmTitulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lblNewLabel = new JLabel("¿Como te llamas?");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));

    textNombre = new JTextField();
    textNombre.setToolTipText("Introduce tu nombre aquí");
    textNombre.setHorizontalAlignment(SwingConstants.CENTER);
    textNombre.setColumns(10);

    btnNewButton = new JButton("Salúdame");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //Mi codigo aqui (LLamar a un metodo privado)
        saluda();
      }
    });
    btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));

    lblSaludo = new JLabel(" ");
    lblSaludo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
    GroupLayout groupLayout = new GroupLayout(frmTitulo.getContentPane());
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup().addGap(127)
            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblSaludo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                    .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNombre)
                    .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(150, Short.MAX_VALUE)));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel).addGap(26)
            .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(31).addComponent(btnNewButton).addGap(29)
            .addComponent(lblSaludo, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
            .addContainerGap(44, Short.MAX_VALUE)));
    frmTitulo.getContentPane().setLayout(groupLayout);
  }

  protected void saluda() {
    // TODO Auto-generated method stub
    lblSaludo.setText("Hola "+textNombre.getText());
  }
}
