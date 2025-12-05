import javax.swing.*;
import java.awt.BorderLayout;

public class Practica3 {
 public static void main(String[] args) {
    JFrame ventana = new JFrame("Venta de Practica 3");
    ventana.setSize(600,500);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new BorderLayout(20,50));
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton btnSur = new JButton("Guardar");
    JLabel lbNorte = new JLabel("Sistema de Facturación", JLabel.CENTER);
    JButton btnOeste = new JButton("Menu");
    //JButton btnEste = new JButton("Detalles");
    JTextArea txtCentro = new JTextArea("Texto por defecto");

    ventana.add(btnSur,BorderLayout.SOUTH);
    ventana.add(lbNorte, BorderLayout.NORTH);
    ventana.add(btnOeste, BorderLayout.WEST);
    //ventana.add(btnEste, BorderLayout.EAST);
    ventana.add(txtCentro, BorderLayout.CENTER);

    ventana.setVisible(true);
  } 
}
