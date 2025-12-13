import javax.swing.*;
import java.awt.*;

public class Practica6 {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ventana Practica 6");
    ventana.setSize(500,200);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new BorderLayout());

    ventana.add(new JLabel("Bienvenido al Sistema",JLabel.CENTER), BorderLayout.NORTH);
    ventana.add(new JButton("Entrar"), BorderLayout.SOUTH);

    JPanel panelDatos = new JPanel();
    panelDatos.setBackground(Color.GRAY);
    panelDatos.setLayout(new GridLayout(2,2,20,20));
    panelDatos.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    panelDatos.add(new JLabel("Usuario"));
    panelDatos.add(new JTextField());
    panelDatos.add(new JLabel("Password"));
    panelDatos.add(new JPasswordField());
    


    ventana.add(panelDatos,BorderLayout.CENTER);


    ventana.setVisible(true);
  }
}
