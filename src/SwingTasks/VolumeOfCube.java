package SwingTasks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCube extends JFrame implements ActionListener {

    JLabel pr,lbl;
    JButton sibt;
    JTextField prtf;


    VolumeOfCube() {
        initalized();
        initalizedUi();
        handleAction();
    }
    public  void handleAction(){
        sibt.addActionListener(this);
    }
    public Object calculate(){
        float p = Integer.parseInt(prtf.getText());
        double si = (p*p*p);

        return si;
    }
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(sibt)) {
//                calculate();
            lbl.setText(String.valueOf(calculate()));
        }
    }
    public  void initalized(){

        setTitle("Volume Of Cube");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 800, 800);
        setResizable(false);
        setLayout(null);
        setBackground(Color.gray);
        //getContentPane().setBackground(c);
    }
    public  void initalizedUi(){


        pr = new JLabel("Enter the length of the cube: ");
        pr.setBounds(20, 10, 250, 30);
        add(pr);

        prtf = new JTextField();
        prtf.setBounds(200, 10, 100, 30);
        add(prtf);



        sibt = new JButton("Calculate");
        sibt.setBackground(Color.blue);
        sibt.setForeground(Color.WHITE);
        sibt.setBounds(100, 200, 150, 30);
        add(sibt);

//            sibt.addActionListener(this);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);

        lbl= new JLabel("Result :");
        lbl.setBounds(100, 300, 150, 30);
        add(lbl);
    }

    public static void main(String args[]) {
        VolumeOfCube voc = new VolumeOfCube();
    }
}