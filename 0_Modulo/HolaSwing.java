import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaSwing {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Mi primera ventana");    
    JLabel etiqueta = new JLabel("Hola Mundo", JLabel.CENTER);

    ventana.setSize(400,300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ventana.add(etiqueta);

    ventana.setVisible(true);
  }
}
