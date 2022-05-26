import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JLabel label;
    JButton button;
    JTextField textField;
    JPasswordField passwordField;

    public Test(){
        setTitle("Welcome to Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,100,600,400);
        setResizable(false);

        label= new JLabel("Login");
        label.setForeground(Color.PINK);
        label.setFont(new Font("Time New Roman",Font.BOLD,20));
        label.setBounds(100,200,100,50);
        add(label);

        textField= new JTextField("Username");
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Times New Roman",Font.PLAIN, 15));
        textField.setBounds(10, 50, 100, 30);
        add(textField);

        button= new JButton("Login");
        button.setForeground(Color.GRAY);
        button.setFont(new Font("Times New Roman",Font.PLAIN, 15));
        button.setBounds(10, 50, 100, 10);
        add(button);
    }

    public static void main(String[] args) {
        new Test().setVisible(true);
    }

}