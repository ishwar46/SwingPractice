package Login;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class LoginPage  extends JFrame implements ActionListener {

 Container cont;
 JLabel lbl_Title;
 JLabel lbl_Username;
 JLabel lbl_Password;
 JLabel lbl_Footer;

 JLabel lblMessage;
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
  try {
   setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resourses//bgimage.png")))));
  }
  catch (Exception e){
   e.printStackTrace();
  }

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
  lbl_Title.setForeground(Color.white);
  cont.add(lbl_Title);

  //Username Label

  lbl_Username = new JLabel("Username");
  lbl_Username.setFont(new Font("San Serif",Font.BOLD,13));
  lbl_Username.setBounds(200,100,100,20);
  lbl_Username.setForeground(Color.white);
  cont.add(lbl_Username);

  //TextBoxUsername

  txt_user = new JTextField();
  txt_user.setBounds(200,130,200,25);
  cont.add(txt_user);

  //Password

  lbl_Password = new JLabel("Password");
  lbl_Password.setFont(new Font("San Serif",Font.BOLD,13));
  lbl_Password.setBounds(200,170,100,20);
  lbl_Password.setForeground(Color.white);
  cont.add(lbl_Password);

  //PasswordTextBox

  password = new JPasswordField();
  password.setBounds(200,200,200,25);
  cont.add(password);

  //Checkbox

  checkBox_Password = new JCheckBox();
  checkBox_Password.setBounds(200,235,20,20);
  cont.add(checkBox_Password);
  //cont.setBackground(Color.);
  //checkBox_Password.setBackground(Color.GRAY);

  //Checkbox label

  lbl_showPass = new JLabel("Show Password");
  lbl_showPass.setBounds(220,235,200,20);
  lbl_showPass.setForeground(Color.white);
  cont.add(lbl_showPass);

  //Note

  lbl_Footer = new JLabel("Don't have an account? SignUp");
  lbl_Footer.setFont(new Font("San Serif",Font.BOLD,12));
  lbl_Footer.setBounds(200,270,200,20);
  lbl_Footer.setForeground(Color.white);
  cont.add(lbl_Footer);

  //Login Button

  btn_login = new JButton("Login");
  btn_login.setBounds(200,300,80,30);
  btn_login.setForeground(Color.white);
  btn_login.setBackground(Color.CYAN);
  cont.add(btn_login);
  btn_login.addActionListener(this::actionPerformed);

  //SignUp Button

  btn_signup = new JButton("SignUp");
  btn_signup.setBounds(300,300,80,30);
  btn_signup.setForeground(Color.white);
  btn_signup.setBackground(Color.green);
  cont.add(btn_signup);

  lblMessage = new JLabel("");
  lblMessage.setBounds(250,350,200,30);
  cont.add(lblMessage);


 }

 public static void main(String[] args) {

  new LoginPage().setVisible(true);
 }


 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource().equals(btn_login)){
   lblMessage.setText("Login Sucessfull!");
  }
 }
}
