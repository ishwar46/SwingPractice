package SwingTasks;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AreaTriangle extends JFrame implements ActionListener {
    JButton jb1;
    JTextField jt1;
    JTextField jt2;
    JLabel lbl;

    AreaTriangle() {
        setTitle("Area Of Triangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 400, 400);
        setResizable(false);
        setLayout(null);
        setBackground(Color.pink);

        jt1 = new JTextField();
        jt1.setBounds(200, 50, 150, 28);
        add(jt1);
        lbl = new JLabel("Enter the length: ");
        lbl.setBounds(50, 50, 150, 28);
        add(lbl);


        jt2 = new JTextField();
        jt2.setBounds(200, 80, 150, 30);
        add(jt2);
        lbl = new JLabel("Enter the breadth: ");
        lbl.setBounds(50, 80, 150, 30);
        add(lbl);


        lbl= new JLabel("Result :");
        lbl.setBounds(100, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("Calculate");
        jb1.setBackground(Color.green);
        jb1.setForeground(Color.white);
        jb1.setBounds(100, 200, 150, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(400, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float a = Integer.parseInt(jt1.getText());
        float b = Integer.parseInt(jt2.getText());

        if (e.getSource().equals(jb1)) {
            double c = 0.5*(a*b);
            lbl.setText(String.valueOf(c));
        }
    }
    public static void main(String args[]) {
        AreaTriangle t = new AreaTriangle();
    }
}