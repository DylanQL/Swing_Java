import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tema8_ComboBox {

  public static void main(String[] args) {
    JFrame ventana = new JFrame("Mi nivel de programación");
    ventana.setSize(400, 300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new FlowLayout());

    // Creando el label de pregunta
    JLabel lblPregunta = new JLabel("Cual es tu nivel?");

    // Creando el ComboBox con sus opciones
    JComboBox<String> comboRangos = new JComboBox<>();
    comboRangos.addItem("Programador Junior");
    comboRangos.addItem("Programador Senior");
    comboRangos.addItem("Arquitecto de Software");
    comboRangos.addItem("Dios del codigo");

    // Creando el label de respuesta y el boton
    JLabel lblResultado = new JLabel("Analizando . . .");
    JButton btnVer = new JButton("Ver Salario");

    // Añadiendo interactividad al boton de Ver
    btnVer.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String seleccion = (String) comboRangos.getSelectedItem();
        int posicion = comboRangos.getSelectedIndex();
        lblResultado.setText(String.format("Eres: %s - (Opcion #%d)", seleccion, posicion));
        if (seleccion.equals("Dios del codigo")) {
          JOptionPane.showMessageDialog(null, "No podriamos con tanta eminencia");
        }
      }
    });

    // Añadiendo elementos a la ventana
    ventana.add(lblPregunta);
    ventana.add(comboRangos);
    ventana.add(btnVer);
    ventana.add(lblResultado);

    // Volviendo visible la ventana
    ventana.setVisible(true);

  }
}
