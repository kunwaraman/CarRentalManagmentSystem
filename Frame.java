

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame implements ActionListener {
    JFrame j = new JFrame("WELCOME");
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;

    public static void main(String[] args) {
        new Frame();
    }

    public Frame() {
        this.j.setLayout((LayoutManager)null);
        this.j.setSize(500, 500);
        this.l1 = new JLabel("INPUT 1");
        this.l1.setBounds(100, 50, 100, 50);
        this.t1 = new JTextField(10);
        this.t1.setBounds(220, 50, 100, 50);
        this.j.add(this.l1);
        this.j.add(this.t1);
        this.l2 = new JLabel("INPUT 2");
        this.l2.setBounds(100, 100, 100, 50);
        this.t2 = new JTextField(10);
        this.t2.setBounds(220, 100, 100, 50);
        this.j.add(this.l2);
        this.j.add(this.t2);
        this.l3 = new JLabel("OUTPUT");
        this.l3.setBounds(100, 150, 100, 50);
        this.t3 = new JTextField(10);
        this.t3.setBounds(220, 150, 100, 50);
        this.j.add(this.l3);
        this.j.add(this.t3);
        this.b1 = new JButton("ADD");
        this.b1.setBounds(220, 200, 100, 50);
        this.j.add(this.b1);
        this.b2 = new JButton("SUB");
        this.b2.setBounds(220, 250, 100, 50);
        this.j.add(this.b2);
        this.b3 = new JButton("MULT");
        this.b3.setBounds(220, 300, 100, 50);
        this.j.add(this.b3);
        this.b4 = new JButton("DIV");
        this.b4.setBounds(220, 350, 100, 50);
        this.j.add(this.b4);
        this.b5 = new JButton("PERCENTAGE");
        this.b5.setBounds(220, 400, 100, 50);
        this.j.add(this.b5);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.j.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a;
        int b;
        int c;
        if (e.getSource() == this.b1) {
            a = Integer.parseInt(this.t1.getText());
            b = Integer.parseInt(this.t2.getText());
            c = a + b;
            this.t3.setText(Integer.toString(c));
        }

        if (e.getSource() == this.b2) {
            a = Integer.parseInt(this.t1.getText());
            b = Integer.parseInt(this.t2.getText());
            c = a - b;
            this.t3.setText(Integer.toString(c));
        }

        if (e.getSource() == this.b3) {
            a = Integer.parseInt(this.t1.getText());
            b = Integer.parseInt(this.t2.getText());
            c = a * b;
            this.t3.setText(Integer.toString(c));
        }

        if (e.getSource() == this.b4) {
            a = Integer.parseInt(this.t1.getText());
            b =Integer.parseInt(this.t2.getText());
           c = a / b;
            this.t3.setText(Float.toString(c));
        }

        if (e.getSource() == this.b5) {
            a = Integer.parseInt(this.t1.getText());
            b = Integer.parseInt(this.t2.getText());
            c = a / b * 100;
            this.t3.setText(Integer.toString(c));
        }

    }
}
