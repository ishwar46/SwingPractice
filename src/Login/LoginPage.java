package Login;

import javax.swing.*;
import java.awt.*;

class LoginPage  extends JFrame {

 /*JFrame frame = new JFrame();
 ImageIcon bgImage;*/




 Container cont;
 JLabel lbl_Title;
 JLabel lbl_Username;
 JLabel lbl_Password;
 JLabel lbl_Footer;
 JTextField txt_user;
 JPasswordField password;
 JRadioButton btn_Male;
 JRadioButton btn_Female;
 JButton btn_login;
 JButton btn_signup;
 JCheckBox checkBox_Password;
 JLabel lbl_showPass;

 public LoginPage(){

  //bgImage = new ImageIcon(this.getClass().getResource("/bg.png"));

  setTitle("Student Login");
  setSize(600,500);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setResizable(false);

  cont = getContentPane();
  cont.setLayout(null);
  cont.setBackground(Color.GRAY);

  //Content Title
  lbl_Title = new JLabel("WELCOME TO LOGIN PAGE");
  lbl_Title.setBounds(165,-20,400,100);
  lbl_Title.setFont(new Font("San Serif",Font.BOLD,20));
  lbl_Title.setForeground(Color.CYAN);
  cont.add(lbl_Title);

  //Username Label

  lbl_Username = new JLabel("Username");
  lbl_Username.setBounds(200,80,100,20);
  cont.add(lbl_Username);

  //TextBoxUsername

  txt_user = new JTextField();
  txt_user.setBounds(200,130,200,20);
  cont.add(txt_user);

  //Password

  lbl_Password = new JLabel("Password");
  lbl_Password.setBounds(200,150,100,20);
  cont.add(lbl_Password);

  //PasswordTextBox

  password = new JPasswordField();
  password.setBounds(200,170,200,20);
  cont.add(password);

  //Checkbox

  checkBox_Password = new JCheckBox();
  checkBox_Password.setBounds(200,200,20,20);
  cont.add(checkBox_Password);

  //Checkbox label

  lbl_showPass = new JLabel("Show Password");
  lbl_showPass.setBounds(250,200,200,20);
  cont.add(lbl_showPass);





 }

 public static void main(String[] args) {

  new LoginPage().setVisible(true);
 }


}
