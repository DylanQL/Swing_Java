import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tema11_Menus {
  public static void main(String[] args){

    // Creando ventana co sus configuraciones basicas
    JFrame ventana = new JFrame("Mi ventana con menus");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(500,400);
    ventana.setLayout(new BorderLayout());

    //Creando el modelo
    DefaultTableModel modeloTabla = new DefaultTableModel(){
      @Override
      public boolean isCellEditable(int column, int row){
        return false;
      }
    };
    modeloTabla.addColumn("Nombre Completo");

    // Creando la tabla contenedora del modelo
    JTable tablaPrincipal = new JTable(modeloTabla);

    // Creando el contenedor Scroll
    JScrollPane scrollPrincipal = new JScrollPane(tablaPrincipal);

    // Creando el textfield y el boton agregar
    JTextField txtNombreCompleto = new JTextField();
    JButton btnAdd = new JButton("Agregar");
    
    // Quitando bordes de seleccion al boton
    btnAdd.setFocusPainted(false);

    // Creando el panel principal 
    JPanel panelSouth= new JPanel();
    panelSouth.setLayout(new BorderLayout());

    // Añadiendo los elementos al panelSouth 
    panelSouth.add(txtNombreCompleto,BorderLayout.CENTER);
    panelSouth.add(btnAdd, BorderLayout.EAST);

    // Creando el menu bar
    JMenuBar menuBar = new JMenuBar();

    // Creando el menu
    JMenu menuArchivo = new JMenu("Archivo");
    JMenu menuAyuda = new JMenu("Ayuda");

    //Creando los menu items
    JMenuItem itemNuevo = new JMenuItem("Nuevo(Borrar)");
    JMenuItem itemSalir = new JMenuItem("Salir");
    JMenuItem itemAcerca = new JMenuItem("Acerca de...?");

    //Organizando el menu bar con sus elementos
    menuBar.add(menuArchivo);
    menuBar.add(menuAyuda);

    // Organizando el menu con sus items
    menuArchivo.add(itemNuevo);
    menuArchivo.addSeparator();
    menuArchivo.add(itemSalir);
    menuAyuda.add(itemAcerca);

    // Añadiendo el menu bar a la ventana
    ventana.setJMenuBar(menuBar);

    // CREANDO LOGICA PARA EL BOTON AÑADIR Y LOS MENU ITEMS
    ActionListener actionAgregar= new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        String nombreCompleto = txtNombreCompleto.getText();
        Object[] nombrec = new Object[]{nombreCompleto};
        if (!nombreCompleto.trim().isEmpty()) {
          modeloTabla.addRow(nombrec);
          txtNombreCompleto.setText("");
          txtNombreCompleto.requestFocus();
        } else {
          JOptionPane.showMessageDialog(null,"Debes de completar el campo");
        }
      }
    };

    btnAdd.addActionListener(actionAgregar);
    txtNombreCompleto.addActionListener(actionAgregar);

    itemNuevo.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int respuesta = JOptionPane.showConfirmDialog(null,"¿Estas seguro que quieres borrar todo?");
        if (respuesta == 0) {
          modeloTabla.setRowCount(0) ; 
        }
      }
    });

    itemSalir.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?");
        if (respuesta==0) {
          System.exit(0);
        }
      }
    });

    itemAcerca.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Creado por Angelo\nDurante las clases de Swing");
      }
    });




    // Añadiendo el panel y la tabla a la ventana 
    ventana.add(panelSouth,BorderLayout.SOUTH);
    ventana.add(scrollPrincipal,BorderLayout.CENTER);

    // Haciendo visible la ventana
    ventana.setVisible(true);


  }
}
