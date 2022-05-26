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
    JTextField email;
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

        //name of student

        lblName = new JLabel("Name of Student");
        lblName.setFont(new Font("San Serif",Font.BOLD,13));
        lblName.setBounds(130,80,150,20);
        lblName.setForeground(Color.white);
        cont.add(lblName);

        //name textbox

        txtName = new JTextField();
        txtName.setBounds(250,78,200,25);
        cont.add(txtName);

        //Email
        lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("San Serif",Font.BOLD,13));
        lblEmail.setBounds(130,120,100,20);
        lblEmail.setForeground(Color.white);
        cont.add(lblEmail);

        //textbox Email
        email = new JTextField();
        email.setBounds(250,120,200,25);
        cont.add(email);

        //Password
       lblPassword = new JLabel("Password");
       lblPassword.setFont(new Font("San Serif",Font.BOLD,13));
       lblPassword.setBounds(130,150,100,20);
       lblPassword.setForeground(Color.white);
        cont.add(lblPassword);

        //Password field
        password = new JPasswordField();
        password.setBounds(250,150,200,25);
        password.setForeground(Color.white);
        cont.add(password);


        lblGender = new JLabel("Gender");
        lblPassword.setFont(new Font("San Serif",Font.BOLD,13));
        lblGender.setBounds(130,200,200,20);
        password.setForeground(Color.white);
        cont.add(lblGender);

        btn_Male = new JRadioButton("Male");
        btn_Male.setBounds(250,200,80,20);
        cont.add(btn_Male);

        btn_Female = new JRadioButton("Female");
        btn_Female.setBounds(350,200,80,20);
        cont.add(btn_Female);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("San Serif",Font.BOLD,13));
        lblAddress.setBounds(130,230,200,20);
        lblAddress.setForeground(Color.white);
        cont.add(lblAddress);











    }

    public static void main(String[] args) {
        new SignUpPage().setVisible(true);
    }
}