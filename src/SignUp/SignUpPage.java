package SignUp;

import javax.swing.*;
import java.awt.*;

class SignUpPage extends JFrame {

    Container cont;
    JLabel lbl_Title;
    JLabel lblName;
    JLabel lblEmail;
    JLabel lblPassword;
    JLabel lblGender;
    JLabel lblAddress;
    JLabel lblPhone;

    //TextFields, Radio Button, Combobox, Buttons
    JTextField txtName;
    JPasswordField password;
    JRadioButton btn_Male;
    JRadioButton btn_Female;
    JButton btn_login;
    JButton btn_signup;
    JComboBox cob_Batch;

    public SignUpPage(){

        setTitle("Student Sign Up");
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        cont = getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.gray);

        //Content Title

        lbl_Title = new JLabel("SIGN UP FOR STUDENT");
        lbl_Title.setBounds(165,-20,400,100);
        lbl_Title.setFont(new Font("San Serif",Font.BOLD,20));
        lbl_Title.setForeground(Color.CYAN);
        cont.add(lbl_Title);


    }

    public static void main(String[] args) {
        new SignUpPage().setVisible(true);
    }
}