import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tema5_Input {
  public static void main(String[] args) {
    //Mala practica hacer lo siguiente, crear una subclase(Clase anonima) y luego usar los metodos
    JFrame ventana = new JFrame(){{
      setTitle("Mi ventana Tema 5");
      setSize(600,500);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
    }};
    
    JTextField txtNumber = new JTextField(10);
    JButton btnTimes = new JButton("x2");
    JLabel etiqueta = new JLabel("Resultado x2");

    btnTimes.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int number;
        number = Integer.parseInt(txtNumber.getText());
        etiqueta.setText(String.format("Valor: %d",number*2));
      }
    });
    ventana.add(new JLabel("Multiplicar x2"));
    ventana.add(txtNumber);
    ventana.add(btnTimes);
    ventana.add(etiqueta);
  }
}
