import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica6 {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ventana Practica 6");
    ventana.setLayout(new BorderLayout());
    ventana.setSize(500,250);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);

    JLabel lbTitulo = new JLabel("Bienvenido al Sistema", JLabel.CENTER);
    Font fontTitulo = new Font("Arial",Font.BOLD,20);
    lbTitulo.setFont(fontTitulo);
    ventana.add(lbTitulo,BorderLayout.NORTH);

    JButton btnLogin = new JButton("Entrar");
    ventana.add(btnLogin, BorderLayout.SOUTH);

    JPanel panelLogin = new JPanel();
    panelLogin.setLayout(new GridLayout(2,2,20,20));
    panelLogin.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    panelLogin.setBackground(Color.GRAY);
    ventana.add(panelLogin, BorderLayout.CENTER);

    JLabel lbUsuario = new JLabel("Usuario");
    JLabel lbPassword = new JLabel("Password");
    JTextField txtUsuario = new JTextField();
    JPasswordField txtPassword = new JPasswordField();

    panelLogin.add(lbUsuario);
    panelLogin.add(txtUsuario);
    panelLogin.add(lbPassword);
    panelLogin.add(txtPassword);



    //Logica de Login

    String username = "123";
    String password = "123";


    ActionListener btnLoginListener = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        String stringUsuario;
        String stringPassword;
        stringUsuario = txtUsuario.getText();
        stringPassword = new String(txtPassword.getPassword());

        System.out.println(String.format("Username:%s \nPassword:%s",stringUsuario,stringPassword));
        if (stringUsuario.equals(username)  && stringPassword.equals(password)) {
          JOptionPane.showMessageDialog(null,"Contraseña Correcta");
          ventana.remove(panelLogin);
          ventana.remove(btnLogin);
          JLabel lbBienvenido = new JLabel("Bienvenido Administrador", JLabel.CENTER);
          ventana.add(lbBienvenido, BorderLayout.CENTER);
          ventana.revalidate();
          ventana.repaint();
        }else{
          JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
        }
      }
    };


    btnLogin.addActionListener(btnLoginListener);

    ventana.setVisible(true);
  }
}
