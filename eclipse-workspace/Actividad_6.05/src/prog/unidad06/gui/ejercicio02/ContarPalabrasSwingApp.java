package prog.unidad06.gui.ejercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class ContarPalabrasSwingApp {

  private JFrame frame;
  private JLabel lblNewLabel;
  private JTextArea textArea;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          ContarPalabrasSwingApp window = new ContarPalabrasSwingApp();
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
  public ContarPalabrasSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DefaultListModel<String> listaPalabras = new DefaultListModel<>();
    listaPalabras.addElement("Carrio");
    JScrollPane scrollPane = new JScrollPane();

    JButton btnContar = new JButton("Contar");
    btnContar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String palabra = textArea.getText();
        
        lblNewLabel.setText(contarPalabras(palabra));
      }
    });

    lblNewLabel = new JLabel("La palabra mas frecuente es:");
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
        .createSequentialGroup().addContainerGap()
        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(groupLayout.createSequentialGroup().addComponent(btnContar).addGap(18).addComponent(lblNewLabel)))
        .addContainerGap()));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup().addContainerGap()
            .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE).addGap(18)
            .addGroup(
                groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnContar).addComponent(lblNewLabel))
            .addContainerGap(41, Short.MAX_VALUE)));

    textArea = new JTextArea();
    scrollPane.setViewportView(textArea);
    frame.getContentPane().setLayout(groupLayout);
  }

  private String contarPalabras(String texto) {

    String[] palabras = texto.split("\\s+");

    Map<String, Integer> contadorPalabras = new HashMap<>();

    for (String palabra : palabras) {
      if (!contadorPalabras.containsKey(palabra)) {
        contadorPalabras.put(texto, 0);
      } else {
        contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
      }

    }
    if (contadorPalabras.size() > 0) {
      String palabraFrecuente = null;
      int frecuencia = 0;
      for (String palabra : palabras) {
        if (frecuencia < contadorPalabras.get(contadorPalabras)) {
          palabraFrecuente = palabra;
          frecuencia = contadorPalabras.get(palabra);

        }
      }

      return String.format("La palabra mas frecuente es: %s (%d)", palabraFrecuente, frecuencia);
    } else {
      return "No hay palabras";
    }

  }
}
