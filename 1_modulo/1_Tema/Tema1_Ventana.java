import javax.swing.JFrame;

public class Tema1_Ventana {
  public static void main(String[] args) {
    JFrame miVentana = new JFrame();
    miVentana.setTitle("Sistema Angelo");
    miVentana.setSize(400,300);
    miVentana.setLocationRelativeTo(null);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miVentana.setVisible(true);

    System.out.println("Mostrar miVentana");
  }
}
