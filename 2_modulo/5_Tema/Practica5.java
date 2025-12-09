import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practica5 {
  public static void main(String[] args) {
    JFrame ventana = new JFrame();
    ventana.setTitle("Mi ventana Practica5");
    ventana.setSize(500,400);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new FlowLayout());
    ventana.setVisible(true);

    JTextField txtNumber1 = new JTextField(10);
    JTextField txtNumber2 = new JTextField(10);
    JLabel etiquetaResultado = new JLabel("Resultado de la suma es: ¿?");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");

    btnPlus.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int num1;
        int num2;
        num1 = Integer.parseInt(txtNumber1.getText());
        num2 = Integer.parseInt(txtNumber2.getText());
        etiquetaResultado.setText(String.format("Resultado de la suma es: %d",num1+num2));
      }
    });

    btnMinus.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int num1;
        int num2;
        num1 = Integer.parseInt(txtNumber1.getText());
        num2 = Integer.parseInt(txtNumber2.getText());
        etiquetaResultado.setText(String.format("Resultado de la suma es: %d",num1-num2));
      }
    });

    ventana.add(new JLabel("Programa de (+) y (-)"));
    ventana.add(txtNumber1);
    ventana.add(txtNumber2);
    ventana.add(btnPlus);
    ventana.add(btnMinus);
    ventana.add(etiquetaResultado);
  } 
}
