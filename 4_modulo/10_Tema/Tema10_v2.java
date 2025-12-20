import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tema10_v2 {

  public static void main(String[] args) {

    // Creando la ventana principal
    JFrame ventana = new JFrame("Mi primera tabla");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(500, 400);
    ventana.setLayout(new BorderLayout());

    // Añadiendo columnas al modelo
    String[] encabezado = new String[] { "A", "B", "C" };
    Object[][] informacion = new Object[][] {
        { "Inception", "Suspenso", 2010 },
        { "Inception", "Suspenso", 2010 },
        { "Inception", "Suspenso", 2010 }
    };

    // Creando el modelo el cerebro de todo
    DefaultTableModel modeloPrincipal = new DefaultTableModel(informacion, encabezado) {
      @Override
      public boolean isCellEditable(int row, int colum) {
        return false;
      }
    };

    // Creando la vista table
    JTable tablePeliculas = new JTable(modeloPrincipal);

    // Creando el scroll de forma OBLIGATORIA
    JScrollPane scrollTabla = new JScrollPane(tablePeliculas);

    // Añadiendo la tabla a la ventana a traves del scroll
    ventana.add(scrollTabla, BorderLayout.CENTER);

    // Activar visibilidad a la ventana
    ventana.setVisible(true);

  }
}
