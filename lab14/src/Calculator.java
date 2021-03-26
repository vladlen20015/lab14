import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {

    private Toolkit toolkit;

    public Calculator() {
        setTitle("Sum of two digits");
        setSize(300, 200);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height -getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        JLabel lbl1 = new JLabel("a");
        lbl1.setBounds(30,20,80,30);
        JLabel lbl2 = new JLabel("b");
        lbl2.setBounds(30,55,110,30);
        JLabel lbl3 = new JLabel("Sum");
        lbl3.setBounds(30,90,80,30);
        final JTextField txt1 = new JTextField(5);
        txt1.setBounds(145,20,70,30);
        txt1.setText("0");
        final JTextField txt2 = new JTextField(5);
        txt2.setBounds(145,55,70,30);
        txt2.setText("0");
        final JTextField txt3 = new JTextField(5);
        txt3.setBounds(145,90,70,30);

        JButton comp = new JButton("Compute");
        comp.setBounds(30, 125, 110, 30);
        comp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                float a1 = Float.parseFloat(txt1.getText());
                float a2 = Float.parseFloat(txt2.getText());
                float a3 = a1 + a2;
                txt3.setText(String.valueOf(a3));
            }
        });

        JButton comp2 = new JButton("Clear");
        comp2.setBounds(160,125,110,30);
        comp2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });
        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(txt1);
        panel.add(txt2);
        panel.add(txt3);
        panel.add(comp);
        panel.add(comp2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}