import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame {

    Container c;

    JLabel lblTitle;
    JLabel lblUsername;
    JLabel lblPassword;
    JTextField txt_user;
    //JTextField text_pass;

    JPasswordField password;
    JButton btn_login;

    JButton btn_signup;

    public LoginForm(){
        setTitle("Login Page");
        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);


        lblTitle = new JLabel("Login Form");
        lblTitle.setBounds(150,-20,90,100);
        c.add(lblTitle);

        lblUsername = new JLabel("Username");
        lblUsername.setBounds(10,50,100,20);
        c.add(lblUsername);
        txt_user = new JTextField();
        txt_user.setBounds(120,50,120,20);
        c.add(txt_user);


        lblPassword = new JLabel("Password");
        lblPassword.setBounds(10,100,100,20);
        c.add(lblPassword);
        password = new JPasswordField();
        password.setBounds(120,100,120,20);
        c.add(password);



        btn_login = new JButton("Login");
        btn_login.setBounds(100,150,70,20);
        btn_login.setBackground(Color.green);
        c.add(btn_login);


        setVisible(true);

    }

    public static void main(String[] args) {
        LoginForm frame = new LoginForm();
    }

}
