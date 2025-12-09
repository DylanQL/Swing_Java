import javax.swing.*;
import java.awt.*;

public class Tema6_Paneles {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Mi ventana tema 5");
    JTextArea areaTexto = new JTextArea();
    JPanel panelBotones = new JPanel();
    JButton btnCancelar = new JButton("Cancelar");
    JButton btnAceptar= new JButton("Aceptar");
    JButton btnAyuda= new JButton("Ayuda");

    //Configuracion de la ventana
    ventana.setSize(600,500);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new BorderLayout());
    ventana.setVisible(true);

    //Configuracion del panel
    panelBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
    panelBotones.setBackground(Color.LIGHT_GRAY);

    //Añadir elementos a la ventana
    ventana.add(new JLabel("Sistema de fomulario"),BorderLayout.NORTH);
    ventana.add(areaTexto,BorderLayout.CENTER);
    ventana.add(panelBotones,BorderLayout.SOUTH);
    
    //Añadir elementos al panel
    panelBotones.add(btnCancelar);
    panelBotones.add(btnAceptar);
    panelBotones.add(btnAyuda);
  }
}
