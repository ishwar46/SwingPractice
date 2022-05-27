package SwingTasks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterest extends JFrame implements ActionListener {

    JLabel pr,ti,rt,lbl;
    JButton sibt;
    JTextField prtf,titf,rttf;


    SimpleInterest() {
        initalized();
        uiInitalized();
    }

    public void actionPerformed(ActionEvent e) {

        float p = Integer.parseInt(prtf.getText());
        float t = Integer.parseInt(titf.getText());
        float r = Integer.parseInt(rttf.getText());

        if (e.getSource().equals(sibt)) {
            double si = (p*t*r)/100;
            lbl.setText(String.valueOf(si));
        }
    }
    public  void initalized(){
        setTitle("SimpleInterest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 800, 800);
        setResizable(false);
        setLayout(null);
        setBackground(Color.gray);
    }
    public  void uiInitalized(){

        pr = new JLabel("Enter the principle: ");
        pr.setBounds(50, 10, 150, 30);
        add(pr);

        prtf = new JTextField();
        prtf.setBounds(180, 10, 100, 30);
        add(prtf);



        ti= new JLabel("Enter the Time:");
        ti.setBounds(50, 80, 150, 30);
        add(ti);

        titf = new JTextField();
        titf.setBounds(180, 80, 100, 30);
        add(titf);


        rt= new JLabel("Enter the Rate:");
        rt.setBounds(50, 130, 150, 30);
        add(rt);

        rttf = new JTextField();
        rttf.setBounds(180, 130, 100, 30);
        add(rttf);

        sibt = new JButton("Simple Interest");
        sibt.setBounds(100, 200, 200, 30);
        add(sibt);

        sibt.addActionListener(this);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);

        lbl= new JLabel("Result :");
        lbl.setBounds(100, 300, 150, 30);
        add(lbl);

    }

    public static void main(String args[]) {
        SimpleInterest simpleinterest = new SimpleInterest();
    }
}