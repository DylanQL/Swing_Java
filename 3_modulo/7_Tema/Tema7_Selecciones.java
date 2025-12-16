import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Tema7_Selecciones {

  public static void main(String[] args) {
    JFrame ventana = new JFrame("Encuesta Dev");
    ventana.setSize(600, 500);
    ventana.setLayout(new FlowLayout());
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);

    // Creando el label con checkboxs
    JLabel lblLenguajes = new JLabel("¿Qué lenguajes te gustan");
    JCheckBox checkJava = new JCheckBox("Java");
    JCheckBox checkPython = new JCheckBox("Python");
    JCheckBox checkJS = new JCheckBox("JS");

    // Creando el label con los radiobutton
    JLabel lblOS = new JLabel("¿Qué usas principalmente");
    JRadioButton radioLinux = new JRadioButton("Linux");
    JRadioButton radioWindows = new JRadioButton("Windows");
    JRadioButton radioMac = new JRadioButton("Mac");

    // Crando el buttongroup
    ButtonGroup groupOS = new ButtonGroup();
    groupOS.add(radioLinux);
    groupOS.add(radioWindows);
    groupOS.add(radioMac);

    // Boton para ver los resultados
    JButton btnSubmit = new JButton("Enviar");

    // Creando logica del boton Enviar
    btnSubmit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String message = "Lenguajes:";
        if (checkJava.isSelected())
          message += " Java";
        if (checkPython.isSelected())
          message += " Python";
        if (checkJS.isSelected())
          message += " JS";
        message += "  OS:";
        if (radioLinux.isSelected())
          message += " Linux";
        if (radioWindows.isSelected())
          message += " Windows";
        if (radioMac.isSelected())
          message += " Mac";

        JOptionPane.showMessageDialog(null, message);
      }
    });

    ventana.add(lblLenguajes);
    ventana.add(checkJava);
    ventana.add(checkPython);
    ventana.add(checkJS);
    ventana.add(Box.createHorizontalStrut(400));
    ventana.add(lblOS);
    ventana.add(radioLinux);
    ventana.add(radioWindows);
    ventana.add(radioMac);
    ventana.add(Box.createHorizontalStrut(400));
    ventana.add(btnSubmit);
    ventana.setVisible(true);

  }
}
