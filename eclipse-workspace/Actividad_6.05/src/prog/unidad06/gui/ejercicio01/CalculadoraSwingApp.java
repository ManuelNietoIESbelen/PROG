package prog.unidad06.gui.ejercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraSwingApp {

  private JFrame frame;
  private JTextField txtUno;
  private JTextField txtDos;
  private JLabel lblResultado;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CalculadoraSwingApp window = new CalculadoraSwingApp();
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
  public CalculadoraSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lblUno = new JLabel("Primer operando:");
    
    txtUno = new JTextField();
    txtUno.setText("0");
    txtUno.setColumns(10);
    
    JLabel lblDos = new JLabel("Segundo operando:");
    
    txtDos = new JTextField();
    txtDos.setText("0");
    txtDos.setColumns(10);
    
    JButton btnSuma = new JButton("Suma");
    btnSuma.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        Double opUno = Double.parseDouble(txtUno.getText());
        
        double opDos = Double.parseDouble(txtDos.getText());
        
        double suma = opUno + opDos;
        
        lblResultado.setText("Resultado: " + suma);
      }
    });
    
    JButton btnResta = new JButton("Resta");
    btnResta.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        Double opUno = Double.parseDouble(txtUno.getText());
        
        double opDos = Double.parseDouble(txtDos.getText());
        
        double suma = opUno - opDos;
        
        lblResultado.setText("Resultado: " + suma);
      }
    });
    
    JButton btnProducto = new JButton("Producto");
    btnProducto.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        Double opUno = Double.parseDouble(txtUno.getText());
        
        double opDos = Double.parseDouble(txtDos.getText());
        
        double suma = opUno * opDos;
        
        lblResultado.setText("Resultado: " + suma);
        
      }
    });
    
    JButton btnDivision = new JButton("División");
    btnDivision.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Double opUno = Double.parseDouble(txtUno.getText());
        
        double opDos = Double.parseDouble(txtDos.getText());
        
        double suma = opUno / opDos;
        
        lblResultado.setText("Resultado: " + suma);
      }
    });
    
    lblResultado = new JLabel("Resultado: 0.0");
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
            .addComponent(btnDivision)
            .addGroup(groupLayout.createSequentialGroup()
              .addComponent(lblResultado)
              .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnProducto))
            .addGroup(groupLayout.createSequentialGroup()
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblUno)
                .addComponent(lblDos))
              .addGap(18)
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                .addGroup(groupLayout.createSequentialGroup()
                  .addComponent(txtDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnResta))
                .addGroup(groupLayout.createSequentialGroup()
                  .addComponent(txtUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addGap(87)
                  .addComponent(btnSuma)))))
          .addContainerGap(98, Short.MAX_VALUE))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblUno)
            .addComponent(txtUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSuma))
          .addGap(18)
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblDos)
            .addComponent(txtDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnResta))
          .addGap(18)
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addComponent(btnProducto)
              .addGap(18)
              .addComponent(btnDivision))
            .addComponent(lblResultado))
          .addContainerGap(122, Short.MAX_VALUE))
    );
    frame.getContentPane().setLayout(groupLayout);
  }
}
