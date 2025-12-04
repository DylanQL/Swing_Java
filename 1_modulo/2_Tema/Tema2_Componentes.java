import javax.swing.*;
import java.awt.FlowLayout;

public class Tema2_Componentes {
  public static void main(String[] args) {
    JFrame ventana = new JFrame();
    ventana.setTitle("Mi ventana tema 2");
    ventana.setSize(300,500);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    
    JLabel etiqueta = new JLabel("Usuario");
    JButton boton = new JButton("Entrar al sistema");
    
    ventana.setLayout(new FlowLayout());
    ventana.add(etiqueta);
    ventana.add(boton);

    ventana.setVisible(true);
  }
}
