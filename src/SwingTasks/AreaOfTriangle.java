package SwingTasks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfTriangle extends JFrame implements ActionListener {

    JLabel length,breadth,lblResult;
    JButton btn_area;
    JTextField txtLength,txtbreadth;


    AreaOfTriangle() {

        setTitle("Area of Rectangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 800, 800);
        setResizable(false);
        setLayout(null);


        length = new JLabel("Enter the length: ");
        length.setBounds(50, 10, 150, 30);
        add(length);

        txtLength = new JTextField();
        txtLength.setBounds(180, 10, 30, 30);
        add(txtLength);



        breadth= new JLabel("Enter the breadth:");
        breadth.setBounds(50, 80, 150, 30);
        add(breadth);

        txtbreadth = new JTextField();
        txtbreadth.setBounds(180, 80, 30, 30);
        add(txtbreadth);



        btn_area = new JButton("Area Of Rectangle");
        btn_area.setBounds(100, 200, 180, 20);
        btn_area.setBackground(Color.PINK);
        add(btn_area);

        btn_area.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        lblResult= new JLabel("Result :");
        lblResult.setBounds(50, 300, 150, 30);
        add(lblResult);

    }

    public void actionPerformed(ActionEvent e) {

        float l = Integer.parseInt(length.getText());
        float b = Integer.parseInt(breadth.getText());


        if (e.getSource().equals(btn_area)) {
            double ar = l*b;
            lblResult.setText(String.valueOf(ar));
        }
    }

    public static void main(String args[]) {
        AreaOfTriangle simpleinterest = new AreaOfTriangle();
    }
}