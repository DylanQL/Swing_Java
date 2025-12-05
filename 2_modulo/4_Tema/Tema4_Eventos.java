import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tema4_Eventos {
  static int contador = 0;
  static JLabel etiqueta = new JLabel();
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Sistema contador de clics");
    ventana.setSize(500,400);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(new FlowLayout());
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton btnClicPlus = new JButton("+1");
    JButton btnClicMinus = new JButton("-1");
    etiqueta.setText(String.format("Valor de contador: %d",contador));

    ActionListener oyenteBtnPlus = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        contador++;
        etiqueta.setText(String.format("Valor de contador: %d",contador));
        System.out.println(String.format("Valor de contador: %d",contador));
      }
    };

    ActionListener oyenteBtnMinus = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        contador--;
        etiqueta.setText(String.format("Valor de contador: %d",contador));
        System.out.println(String.format("Valor de contador: %d", contador));
      }
    };

    btnClicPlus.addActionListener(oyenteBtnPlus);
    btnClicMinus.addActionListener(oyenteBtnMinus);

    ventana.add(btnClicMinus);
    ventana.add(etiqueta);
    ventana.add(btnClicPlus);
    ventana.setVisible(true);

  }
}
