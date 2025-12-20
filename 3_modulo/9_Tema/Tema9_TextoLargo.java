import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tema9_TextoLargo {

  public static void main(String[] args) {
    // Creando ventana principal
    JFrame ventana = new JFrame("Mini Chat");
    ventana.setLayout(new BorderLayout());
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(400, 500);

    // Creando el text area con su configuracion
    JTextArea areaChat = new JTextArea();
    areaChat.setEditable(false);
    areaChat.setWrapStyleWord(true);
    areaChat.setLineWrap(true);

    // Creando el JScrollPane y añadiendole el areaChat
    JScrollPane scrollPrincipal = new JScrollPane(areaChat);

    // Configuracion opcional del scrollPrincipal
    scrollPrincipal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Creando el panel del sur que servira para poner la caja de texto y el boton
    JPanel panelSur = new JPanel();
    panelSur.setLayout(new BorderLayout());

    // Creando la caja de texto y el boton
    JTextField txtMensaje = new JTextField();
    JButton btnSubmit = new JButton("Enviar");

    // Añadiendo los elementos al panelSur
    panelSur.add(txtMensaje, BorderLayout.CENTER);
    panelSur.add(btnSubmit, BorderLayout.EAST);

    // Creando logica para añadirselo al boton
    ActionListener enviarAccion = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String message = txtMensaje.getText();
        if (!message.isEmpty()) {
          areaChat.append(String.format("Angelo: %s\n", message));
          txtMensaje.setText("");
        }
      }
    };

    // Añadiendo logica al boton enviar
    btnSubmit.addActionListener(enviarAccion);

    // Hacer que sea posible que al dar en enter tambien se envie el mensaje
    txtMensaje.addActionListener(enviarAccion);

    // Añadiendo elementos a la ventana principal
    ventana.add(scrollPrincipal, BorderLayout.CENTER);
    ventana.add(panelSur, BorderLayout.SOUTH);

    // Dejar visible la ventana
    ventana.setVisible(true);

  }
}
