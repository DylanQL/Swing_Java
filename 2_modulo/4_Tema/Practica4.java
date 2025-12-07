import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Practica4 {
  static int contador = 0;
  static JLabel etiqueta;
  public static void main(String[] args) {
    etiqueta = new JLabel(String.format("Contador: %d",contador));

    JFrame ventana = new JFrame("ventana de Practica 4");
    ventana.setSize(400,300);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new FlowLayout());

    JButton btnPlus = new JButton("+1");
    JButton btnMinus = new JButton("-1");

    ActionListener oyentePlus = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        contador++;
        etiqueta.setText(String.format("Contador: %d",contador));
        System.out.println(String.format("Contador: %d",contador));
      }
    };

    ActionListener oyenteMinus = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        if (contador > 0) {
          contador--;
        }
        etiqueta.setText(String.format("Contador: %d",contador));
        System.out.println(String.format("Contador: %d",contador));
      }
    };

    btnPlus.addActionListener(oyentePlus);
    btnMinus.addActionListener(oyenteMinus);

    ventana.add(btnMinus);
    ventana.add(etiqueta);
    ventana.add(btnPlus);
    ventana.setVisible(true);
  }
}



