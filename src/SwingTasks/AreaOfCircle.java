/*
package SwingTasks;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AreaOfCircle {
}




public class AreaOfACircle extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_radius;
    private JLabel label_area;
    private JButton button;

    public AreaOfACircle() {
        field_radius = new JTextField(4);
        label_area = new JLabel("", JLabel.RIGHT);
        button = new JButton("Process");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Enter the value of radius:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(field_radius);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Value of area:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(label_area);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double area, radius;
        try {
            radius = Double.parseDouble(field_radius.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        area=Math.PI*radius*radius;
        label_area.setText(String.valueOf(area));
        pack();
    }

    public static void main(String[] args) {
        new AreaOfACircle().setVisible(true);
    }

}*/
