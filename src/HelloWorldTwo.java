import javax.swing.*;

public class HelloWorldTwo {

    JFrame frame;
    HelloWorldTwo(){
        frame = new JFrame();
        JLabel label = new JLabel("Hello Ishu");
        label.setBounds(130,100,100,40);
        frame.add(label);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorldTwo();
    }

}
