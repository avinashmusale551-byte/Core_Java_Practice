import javax.swing.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b;

    StudentForm() {
        JLabel l1 = new JLabel("Roll No:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Percentage:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b = new JButton("Display");
        b.addActionListener(this);

        setLayout(new java.awt.FlowLayout());

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String r = t1.getText();
        String n = t2.getText();
        String p = t3.getText();

        JOptionPane.showMessageDialog(this,
                "Roll No: " + r + "\nName: " + n + "\nPercentage: " + p);
    }

    public static void main(String args[]) {
        new StudentForm();
    }
}
