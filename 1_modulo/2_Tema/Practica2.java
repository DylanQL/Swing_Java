import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Practica2 {
  public static void main(String[] args) {
    JFrame ventana = new JFrame();
    ventana.setTitle("Ventana de Practica Tema 2");
    ventana.setSize(600,500);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new FlowLayout());

    JLabel etiqueta = new JLabel("Bienvenido Angelo");
    JButton boton = new JButton("Salir");
    ventana.add(etiqueta);
    ventana.add(boton);

    ventana.setVisible(true);
  }
}
