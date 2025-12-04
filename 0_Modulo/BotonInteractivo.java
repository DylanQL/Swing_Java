import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonInteractivo {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Mi ventana interactiva");
    ventana.setSize(300,200);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ventana.setLayout(new FlowLayout());

    JLabel etiqueta = new JLabel("Presiona el boton");
    JButton boton = new JButton("Click aqui");

    boton.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        etiqueta.setText("Has presionado el boton");
        JOptionPane.showMessageDialog(null,"Hola desde un Dialog");
      }
    });

    ventana.add(etiqueta);
    ventana.add(boton);

    ventana.setVisible(true);
  }
}

