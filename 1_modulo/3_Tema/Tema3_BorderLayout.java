import javax.swing.*;
import java.awt.BorderLayout;

public class Tema3_BorderLayout {
  public static void main(String[] args) {

    JFrame ventana = new JFrame("Diseño BorderLayout");
    ventana.setSize(500,400);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new BorderLayout(50,50));
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton btnNorte = new JButton("Norte: Encabezado");
    JButton btnSur = new JButton("Sur: Pie de Pagina");
    JButton btnEste = new JButton("Este: Detalles");
    JButton btnOeste = new JButton("Oeste: Menu");
    JButton btnCentro = new JButton("Centro: Body");

    ventana.add(btnNorte, BorderLayout.NORTH);
    ventana.add(btnSur, BorderLayout.SOUTH);
    ventana.add(btnEste, BorderLayout.EAST);
    ventana.add(btnOeste, BorderLayout.WEST);
    ventana.add(btnCentro, BorderLayout.CENTER);

    ventana.setVisible(true);
  }
}
