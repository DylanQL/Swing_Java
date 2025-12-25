import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;


public class ProyectoFinal {
  public static void main(String[] args){

    // Creando y configurando la ventana
    JFrame ventana = new JFrame("Gestion de inventario v1");
    ventana.setSize(800,500);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new BorderLayout());

    // Creando el modelo, table y el scrollpane
    DefaultTableModel modeloInventarios = new DefaultTableModel(){
      @Override
      public boolean isCellEditable(int row, int column){
        return false;
      }
    };
    modeloInventarios.addColumn("Producto");
    modeloInventarios.addColumn("Categoria");
    modeloInventarios.addColumn("Precio");

    JTable tablaInventarios = new JTable(modeloInventarios);
    JScrollPane scrollInventarios = new JScrollPane(tablaInventarios);

    // Creando el panel izquierdo
    JPanel panelIzquierdo = new JPanel();
    panelIzquierdo.setLayout(new GridLayout(8,1,10,10));
    panelIzquierdo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panelIzquierdo.setPreferredSize(new Dimension(250,0));

    // Creando componentes del formulario lateral izquierdo
    JLabel lblNombreProducto = new JLabel("Nombre del Producto");
    JTextField txtNombreProducto = new JTextField();

    JLabel lblCategoria = new JLabel("Categoria");
    String[] arrayCategorias = new String[]{"Electronica","Ropa","Alimentos","Hogar"};
    JComboBox<String> comboCategoria = new JComboBox<String>(arrayCategorias);
    comboCategoria.setSelectedIndex(-1);

    JLabel lblPrecio = new JLabel("Precio");
    JTextField txtPrecio = new JTextField();

    JButton btnAdd = new JButton("Agregar Producto");
    btnAdd.setBackground(Color.GREEN);
    btnAdd.setForeground(Color.WHITE);
    btnAdd.setFocusPainted(false);

    JButton btnDelete = new JButton("Eliminar Seleccionado");
    btnDelete.setBackground(Color.RED);
    btnDelete.setForeground(Color.WHITE);
    btnDelete.setFocusPainted(false);

    //Añadir elementos al panel izquierdo
    panelIzquierdo.add(lblNombreProducto);
    panelIzquierdo.add(txtNombreProducto);
    panelIzquierdo.add(lblCategoria);
    panelIzquierdo.add(comboCategoria);
    panelIzquierdo.add(lblPrecio);
    panelIzquierdo.add(txtPrecio);
    panelIzquierdo.add(btnAdd);
    panelIzquierdo.add(btnDelete);


    //Logica de los botones Agregar y Eliminar
    btnAdd.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        String nombre = txtNombreProducto.getText();
        String categoria = (String)comboCategoria.getSelectedItem();
        String precio = txtPrecio.getText();
        try {
          double precioNumero = Double.parseDouble(precio);
          if (!nombre.trim().isEmpty() && !precio.trim().isEmpty() && categoria!=null) {
            String[] arrayProduct = {nombre, categoria, precio};
            modeloInventarios.addRow(arrayProduct);
            //Limpiando seleccion
            txtNombreProducto.setText("");
            txtPrecio.setText("");
            comboCategoria.setSelectedIndex(-1);
          }else{
            JOptionPane.showMessageDialog(null,"Todos los campos deben de estar completos");
          }
        } catch (NumberFormatException a) {
          JOptionPane.showMessageDialog(null,"Precio no puede ser un texto");
        }
      }
    });

    btnDelete.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int[] seleccionFilas = tablaInventarios.getSelectedRows();
        for (int i = seleccionFilas.length -1; i >=0; i--) {
          int seleccionModelo = tablaInventarios.convertRowIndexToModel(seleccionFilas[i]);
          modeloInventarios.removeRow(seleccionModelo);
        }
        if (seleccionFilas.length == 0) {
          JOptionPane.showMessageDialog(null,"No hay filas seleccionadas");
        }
      }
    });

    //Agregando a la ventana los elementos
    ventana.add(panelIzquierdo,BorderLayout.WEST);
    ventana.add(scrollInventarios, BorderLayout.CENTER);

    JMenuBar barPrincipal = new JMenuBar();
    JMenu menuPrincipal = new JMenu("Archivo");
    JMenuItem itemSalir = new JMenuItem("Salir");
    JMenuItem itemNew= new JMenuItem("NewDoc");

    barPrincipal.add(menuPrincipal);
    menuPrincipal.add(itemSalir);
    menuPrincipal.addSeparator();
    menuPrincipal.add(itemNew);


    //Añadiendo logica a los menuItem
    itemSalir.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int seleccion = JOptionPane.showConfirmDialog(null,"¿Seguro que quieres salir?");
        if (seleccion==0) {
          System.exit(0); 
        }
      }
    });

    itemNew.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int seleccion = JOptionPane.showConfirmDialog(null,"¿Seguro que quieres borrar todo?");
        if (seleccion == 0) {
          modeloInventarios.setRowCount(0);
        } 
      }
    });

    ventana.setJMenuBar(barPrincipal);

    // Haciendo visible la ventana
    ventana.setVisible(true);
  }
}
