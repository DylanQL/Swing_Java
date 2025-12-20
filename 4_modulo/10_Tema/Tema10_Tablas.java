import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tema10_Tablas {

  public static void main(String[] args) {

    // Creando la ventana principal
    JFrame ventana = new JFrame("Mi primera tabla");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(500, 400);
    ventana.setLayout(new BorderLayout());

    // Creando el modelo el cerebro de todo
    DefaultTableModel modeloPrincipal = new DefaultTableModel();

    // Añadiendo columnas al modelo
    modeloPrincipal.addColumn("Nombre");
    modeloPrincipal.addColumn("Genero");
    modeloPrincipal.addColumn("Año");

    // Añadiendo filas al modelo uando array Object
    modeloPrincipal.addRow(new Object[] { "Inception", "Suspenso", 2010 });
    modeloPrincipal.addRow(new Object[] { "The Dark Knight", "Accion", 2008 });
    modeloPrincipal.addRow(new Object[] { "Interstellar", "Ciencia ficción", 2014 });
    modeloPrincipal.addRow(new Object[] { "Forrest Gump", "Romance", 1994 });

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
