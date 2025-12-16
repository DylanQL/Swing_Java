import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Practica7 {

  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ventana de Practica 7");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(400, 300);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0, 1));

    JCheckBox checkDark = new JCheckBox("Activar modo oscuro");
    JLabel lblSizeLetter = new JLabel("Tamaño de letra");
    JRadioButton radioSmall = new JRadioButton("Pequeña");
    JRadioButton radioMedium = new JRadioButton("Mediana");
    JRadioButton radioBig = new JRadioButton("Big");
    JButton btnSubmit = new JButton("Aplicar");

    // Creando Group
    ButtonGroup groupLetter = new ButtonGroup();
    groupLetter.add(radioSmall);
    groupLetter.add(radioMedium);
    groupLetter.add(radioBig);

    radioSmall.setSelected(true);

    // Creando logica para el boton Aplicar
    btnSubmit.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String mensaje = "Tamaño de letra: ";
        if (checkDark.isSelected()) {
          panel.setBackground(Color.BLACK);

          checkDark.setForeground(Color.WHITE);
          checkDark.setBackground(Color.BLACK);

          lblSizeLetter.setForeground(Color.WHITE);
          lblSizeLetter.setBackground(Color.BLACK);

          radioSmall.setForeground(Color.WHITE);
          radioSmall.setBackground(Color.BLACK);

          radioMedium.setForeground(Color.WHITE);
          radioMedium.setBackground(Color.BLACK);

          radioBig.setForeground(Color.WHITE);
          radioBig.setBackground(Color.BLACK);

          btnSubmit.setForeground(Color.WHITE);
          btnSubmit.setBackground(Color.BLACK);
        } else {
          panel.setBackground(Color.WHITE);

          checkDark.setForeground(Color.BLACK);
          checkDark.setBackground(Color.WHITE);

          lblSizeLetter.setForeground(Color.BLACK);
          lblSizeLetter.setBackground(Color.WHITE);

          radioSmall.setForeground(Color.BLACK);
          radioSmall.setBackground(Color.WHITE);

          radioMedium.setForeground(Color.BLACK);
          radioMedium.setBackground(Color.WHITE);

          radioBig.setForeground(Color.BLACK);
          radioBig.setBackground(Color.WHITE);

          btnSubmit.setForeground(Color.BLACK);
          btnSubmit.setBackground(Color.WHITE);

        }

        if (radioSmall.isSelected())
          mensaje += "Pequeña";
        if (radioMedium.isSelected())
          mensaje += "Mediana";
        if (radioBig.isSelected())
          mensaje += "Big";

        JOptionPane.showMessageDialog(null, mensaje);
      }
    });
    /*
     * Hacer transparentes los fondos esta es una mejor opcion
     * checkDark.setOpaque(false);
     * radioSmall.setOpaque(false);
     * radioMedium.setOpaque(false);
     * radioBig.setOpaque(false);
     */
    panel.add(checkDark);
    panel.add(lblSizeLetter);
    panel.add(radioSmall);
    panel.add(radioMedium);
    panel.add(radioBig);
    panel.add(btnSubmit);
    ventana.add(panel);

    ventana.setVisible(true);

  }
}
