import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Practica8 {

  public static void main(String[] args) {

    // Creando ventana principal
    JFrame ventana = new JFrame("Cambiador de colores");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(400, 500);
    ventana.setLayout(new BorderLayout());

    // Creando panel principal
    JPanel panelPrincipal = new JPanel();
    panelPrincipal.setLayout(new FlowLayout());
    panelPrincipal.setOpaque(false);

    // Creando elementos para el panel principal
    String[] arrayColores = { "Rojo", "Verde", "Azul" };
    JComboBox<String> comboColores = new JComboBox<>(arrayColores);
    JButton btnSubmit = new JButton("Cambiar color");

    // Añadiendo interaccion al boton Cambiar color
    btnSubmit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String colorSeleccion = (String) comboColores.getSelectedItem();
        switch (colorSeleccion) {
          case "Rojo":
            ventana.getContentPane().setBackground(Color.RED);
            break;
          case "Verde":
            ventana.getContentPane().setBackground(Color.GREEN);
            break;
          case "Azul":
            ventana.getContentPane().setBackground(Color.BLUE);
            break;
          default:
            JOptionPane.showMessageDialog(null, "Error en logica del boton");
            break;
        }
      }
    });

    // Añadiendo elementos al panel principal
    panelPrincipal.add(comboColores);
    panelPrincipal.add(btnSubmit);

    // Añadiendo elementos a la ventana principal
    ventana.add(panelPrincipal, BorderLayout.NORTH);

    // Mostrar la ventana
    ventana.setVisible(true);
  }
}
