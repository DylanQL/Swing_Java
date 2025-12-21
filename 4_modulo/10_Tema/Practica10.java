import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica10 {

  public static void main(String[] args) {
    // Creando ventana principal con sus configuraciones
    JFrame ventana = new JFrame("Mis contactos");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(500, 400);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new BorderLayout());

    // Creando el modelo donde se gestionara todo
    DefaultTableModel modeloContactos = new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    modeloContactos.addColumn("Nombre");
    modeloContactos.addColumn("Apellido");
    modeloContactos.addColumn("Email");

    // Creando el table principal
    JTable tablaContactos = new JTable(modeloContactos);

    // Creando el scroll donde estara la tabla
    JScrollPane scrollPane = new JScrollPane(tablaContactos);

    // Creando el panel donde se podran los 3 textfield y el boton agregar
    JPanel panelSouth = new JPanel();
    panelSouth.setLayout(new BorderLayout());

    // Creando el panel adicional dentro del panelSouth
    JPanel panelTextos = new JPanel(new GridLayout(1, 3, 10, 10));

    // Creando los 3 textfield y el boton agregar
    JTextField txtNombre = new JTextField();
    JTextField txtApellido = new JTextField();
    JTextField txtEmail = new JTextField();
    JButton btnAdd = new JButton("Agregar");

    // Añadir los elementos al panelSouth
    panelSouth.add(btnAdd, BorderLayout.EAST);
    panelSouth.add(panelTextos, BorderLayout.CENTER);
    // Añadir los elementos al panelTextos
    panelTextos.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    panelTextos.add(txtNombre);
    panelTextos.add(txtApellido);
    panelTextos.add(txtEmail);

    // Añadir logica al boton agregar
    btnAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String email = txtEmail.getText();

        Object[] contacto = new Object[] { nombre, apellido, email };
        if (!nombre.trim().isEmpty() && !apellido.trim().isEmpty() && !email.trim().isEmpty()) {
          modeloContactos.addRow(contacto);
          txtNombre.setText("");
          txtApellido.setText("");
          txtEmail.setText("");
          txtNombre.requestFocus();
        } else {
          JOptionPane.showMessageDialog(null, "Completa todo los datos");
        }
      }
    });
    // Añadir a la ventana el panelSouth y el scroll
    ventana.add(panelSouth, BorderLayout.SOUTH);
    ventana.add(scrollPane, BorderLayout.CENTER);
    // Haciendo visible la ventana
    ventana.setVisible(true);

  }
}
