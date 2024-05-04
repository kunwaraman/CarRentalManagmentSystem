package Project;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaymentPage implements ActionListener
{

    JFrame f;
    JButton b1,b2;
    JLabel l1;
    public static void main (String args[])
    {
        new   PaymentPage();
    }
    PaymentPage()
    {
        f=new JFrame("Payment Page");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(600,600);

        l1=new JLabel("Payments");
        l1.setBounds(250, 70, 100, 50);
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        f.add(l1);

        b1=new JButton("Credit Card");
        f.add(b1);
        b1.setBounds(200, 300, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.BOLD,20));

        b2=new JButton("Debit Card");
        f.add(b2);
        b2.setBounds(200, 400, 200, 50);
        b2.setFont(new Font("Times new Roman",Font.BOLD,20));

        b1.addActionListener(this);
        b2.addActionListener(this);
    }


    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            CreditCard y=new CreditCard();
        }
        if (e.getSource()==b2)
        {
            DebitCard w=new DebitCard();
        }
    }
}