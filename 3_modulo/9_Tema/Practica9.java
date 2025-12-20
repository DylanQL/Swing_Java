import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Practica9 {

  public static void main(String[] args) {
    // Creando ventana principal con su configuracion
    JFrame ventana = new JFrame("Block de Notas");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setSize(500, 400);
    ventana.setLayout(new BorderLayout());

    // Creando el text area
    JTextArea areaNotas = new JTextArea();
    areaNotas.setWrapStyleWord(true);
    areaNotas.setLineWrap(true);

    // Creando el JScrollPane
    JScrollPane scrollNotas = new JScrollPane(areaNotas);
    scrollNotas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Creando el panel para el boton y la etiqueta
    JPanel panelNorte = new JPanel();
    panelNorte.setLayout(new BorderLayout());

    // Creando elementos para el panel
    JButton btnBorrar = new JButton("Limpiar");
    btnBorrar.setFocusPainted(false);
    JButton btnContar = new JButton("Contar");
    btnContar.setFocusPainted(false);
    JLabel lblContador = new JLabel("Caracteres: 0", JLabel.CENTER);

    // Añadiendo elementos al panel
    panelNorte.add(btnContar, BorderLayout.WEST);
    panelNorte.add(lblContador, BorderLayout.CENTER);
    panelNorte.add(btnBorrar, BorderLayout.EAST);

    // Añadiendo logica al boton Contar
    btnContar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int contador = areaNotas.getText().replaceAll("\\s+", "").length();
        lblContador.setText(String.format("Caracteres: %d", contador));
      }
    });

    // Añadiendo logica al boton Borrar
    btnBorrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        areaNotas.setText("");
      }
    });

    // Añadiendo el JScrollPane a la ventana
    ventana.add(scrollNotas, BorderLayout.CENTER);
    ventana.add(panelNorte, BorderLayout.NORTH);

    // Haciendo visible la ventana
    ventana.setVisible(true);

  }
}
