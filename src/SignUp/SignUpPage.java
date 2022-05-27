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
    JLabel lblBatch;

    //TextFields, Radio Button, Combobox, Buttons
    JTextField txtName;
    JPasswordField password;
    JTextField email;

    JTextField phone;

    JTextField address;
    JRadioButton btn_Male;
    JRadioButton btn_Female;

    JButton btn_login;
    JButton btn_signup;
    JComboBox cob_Batch;

    String batch[]={"31B","31A","30A","30B"};

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
       lblPassword.setBounds(130,160,100,20);
       lblPassword.setForeground(Color.white);
        cont.add(lblPassword);

        //Password field
        password = new JPasswordField();
        password.setBounds(250,160,200,25);
        password.setForeground(Color.white);
        cont.add(password);

        //Gender
        lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("San Serif",Font.BOLD,13));
        lblGender.setBounds(130,210,200,20);
        lblGender.setForeground(Color.white);
        cont.add(lblGender);

        //Radio Button
        btn_Male = new JRadioButton("Male");
        btn_Male.setBounds(250,210,80,20);
        btn_Male.setBackground(Color.gray);
        cont.add(btn_Male);

        btn_Female = new JRadioButton("Female");
        btn_Female.setBounds(350,210,80,20);
        btn_Female.setBackground(Color.gray);
        cont.add(btn_Female);

        //Address
        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("San Serif",Font.BOLD,13));
        lblAddress.setBounds(130,250,200,20);
        lblAddress.setForeground(Color.white);
        cont.add(lblAddress);

        //textbox TextField
        address = new JTextField();
        address.setBounds(250,250,200,25);
        cont.add(address);

        lblPhone = new JLabel("Phone Number");
        lblPhone.setFont(new Font("San Serif",Font.BOLD,13));
        lblPhone.setBounds(130,300,200,20);
        lblPhone.setForeground(Color.white);
        cont.add(lblPhone);

        //textbox TextField
         phone= new JTextField();
        phone.setBounds(250,300,200,25);
        cont.add(phone);


        lblBatch = new JLabel("Batch");
        lblBatch.setFont(new Font("San Serif",Font.BOLD,13));
        lblBatch.setBounds(130,350,200,20);
        lblBatch.setForeground(Color.white);
        cont.add(lblBatch);

        cob_Batch = new JComboBox(batch);
        cob_Batch.setFont(new Font("San Serif",Font.BOLD,13));
        cob_Batch.setBounds(250,350,200,20);
        cont.add(cob_Batch);

        //Login Button

        btn_login = new JButton("SignUp");
        btn_login.setBounds(250,400,80,30);
        btn_login.setForeground(Color.white);
        btn_login.setBackground(Color.CYAN);
        cont.add(btn_login);

        btn_signup = new JButton("Cancel");
        btn_signup.setBounds(350,400,80,30);
        btn_signup.setForeground(Color.white);
        btn_signup.setBackground(Color.green);
        cont.add(btn_signup);
    }

    public static void main(String[] args) {
        new SignUpPage().setVisible(true);
    }
}