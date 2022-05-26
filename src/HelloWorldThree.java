import javax.swing.*;
import java.awt.*;

public class HelloWorldThree extends JFrame {
        JLabel labelHello;
        public HelloWorldThree(){
            setTitle("Welcome");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(400,150,600,400);
            setResizable(false);


            // for welcome
            labelHello=new JLabel("Hello World");

            labelHello.setForeground(Color.BLACK);
            labelHello.setFont(new Font("Arial", Font.BOLD,20));
            labelHello.setBounds(0,0,100,25);
            add(labelHello);
        }

    public static void main(String[] args) {
        new HelloWorldThree().setVisible(true);
    }
}
