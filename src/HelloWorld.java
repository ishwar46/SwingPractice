import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        JFrame frame;
        JLabel label;

        frame = new JFrame();
        label = new JLabel("Hello Ishu");

        label.setBounds(130,100,100,60); // x-axis, y-axis, width, height
        frame.add(label);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
