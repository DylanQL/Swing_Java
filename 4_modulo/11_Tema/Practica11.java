import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Practica11 {
  public static void main(String[] args){

    // Creando la ventana principal con sus configuraciones basicas
    JFrame ventana = new JFrame("Menu de Colores");
    ventana.setSize(400,400);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new FlowLayout());

    // Creando el Menu Bar 
    JMenuBar barPrincipal = new JMenuBar();

    // Creando los Menus
    JMenu menuFondo = new JMenu("Fondo");
    JMenu menuHerramientas= new JMenu("Herramientas");

    // Creando los items de los menu 
    JMenuItem itemRojo = new JMenuItem("Rojo");
    JMenuItem itemVerde = new JMenuItem("Verde");
    JMenuItem itemBlanco = new JMenuItem("Restaurar");
    JMenuItem itemSaludar = new JMenuItem("Saludar");

    // Organizar todo el Menu Bar 
    barPrincipal.add(menuFondo);
    barPrincipal.add(menuHerramientas);

    // Organizar todo el menu
    menuFondo.add(itemRojo);
    menuFondo.addSeparator();
    menuFondo.add(itemVerde);
    menuFondo.addSeparator();
    menuFondo.add(itemBlanco);
    menuHerramientas.add(itemSaludar);

    // Creando logica a los botones
    itemRojo.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ventana.getContentPane().setBackground(Color.RED);
      }
    });

    itemVerde.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ventana.getContentPane().setBackground(Color.GREEN);
      }
    });

    itemBlanco.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ventana.getContentPane().setBackground(Color.WHITE);
      }
    });

    itemSaludar.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        String nombre = JOptionPane.showInputDialog(null,"¿Cómo te llamas?");
        if (nombre!=null && !nombre.isEmpty()) {
          JOptionPane.showMessageDialog(null, String.format("Hello %s!",nombre));
        }
      }
    });

    ventana.setJMenuBar(barPrincipal);
    //Haciendo que la ventana sea visible
    ventana.setVisible(true);
  }
}
