package SwingTasks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMarks extends JFrame implements ActionListener {


    JLabel ls1, ls2, ls3, ls4,ls5,lbl;
    JButton perbt;
    JTextField ls1t,ls2t,ls3t,ls4t,ls5t;


    StudentMarks() {
        initalize();
        uiInitalized();
    }

    public void actionPerformed(ActionEvent e) {

        float a = Integer.parseInt(ls1t.getText());
        float b = Integer.parseInt(ls2t.getText());
        float c = Integer.parseInt(ls3t.getText());
        float d = Integer.parseInt(ls4t.getText());
        float f = Integer.parseInt(ls5t.getText());

        if (e.getSource().equals(perbt)) {
            float si = a+b+c+d+f;

            double pert = (si/500)*100;
            lbl.setText(String.valueOf(pert));
        }
    }
    public void initalize(){

        setTitle("Marks of Student");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 1000, 2000);
        setResizable(false);
        setLayout(null);
        setBackground(Color.gray);

    }
    public  void uiInitalized(){
        ls1 = new JLabel("Java: ");
        ls1.setBounds(40, 10, 200, 30);
        add(ls1);

        ls1t = new JTextField();
        ls1t.setBounds(240, 10, 80, 30);
        add(ls1t);


        ls2 = new JLabel("C Programming: ");
        ls2.setBounds(40, 50, 200, 30);
        add(ls2);

        ls2t = new JTextField();
        ls2t.setBounds(240, 50, 80, 30);
        add(ls2t);


        ls3 = new JLabel("Android: ");
        ls3.setBounds(40, 90, 200, 30);
        add(ls3);

        ls3t = new JTextField();
        ls3t.setBounds(240, 90, 80, 30);
        add(ls3t);


        ls4 = new JLabel("Database:");
        ls4.setBounds(40, 130, 200, 30);
        add(ls4);

        ls4t = new JTextField();
        ls4t.setBounds(240, 130, 80, 30);
        add(ls4t);



        ls5 = new JLabel("Computer Network: ");
        ls5.setBounds(40, 170, 200, 30);
        add(ls5);

        ls5t = new JTextField();
        ls5t.setBounds(240, 170, 80, 30);
        add(ls5t);

        perbt = new JButton("Calculate");
        perbt.setBounds(100, 300, 150, 30);
        add(perbt);

        perbt.addActionListener(this);

        setLayout(null);
        setSize(450, 400);
        setVisible(true);

        lbl = new JLabel("Result :");
        lbl.setBounds(300, 300, 150, 30);
        add(lbl);
    }

    public static void main(String args[]) {
        StudentMarks m = new StudentMarks();
    }
}