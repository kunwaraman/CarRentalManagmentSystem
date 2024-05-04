package Project;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DebitCard implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;

    public static void main (String args[])
    {
        new DebitCard();
    }

    DebitCard()
    {
        f=new JFrame("Credit Card Payment");
        f.setLayout(null);
        f.setSize(600,600);
        l1=new JLabel("Card Number");
        l1.setBounds(100, 50, 100, 50);
        t1=new JTextField();
        t1.setBounds(220, 50, 100, 50);
        f.add(l1);
        f.add(t1);

        l2=new JLabel("Holder Name");
        l2.setBounds(100, 100, 100, 50);
        t2=new JTextField();
        t2.setBounds(220, 100, 100, 50);
        f.add(l2);
        f.add(t2);

        l3=new JLabel("Expiry");
        l3.setBounds(100, 150, 100, 50);
        t3=new JTextField();
        t3.setBounds(220, 150, 100, 50);
        f.add(l3);
        f.add(t3);

        l4=new JLabel("Cvv");
        l4.setBounds(100, 200, 100, 50);
        t4=new JTextField();
        t4=new JPasswordField();
        t4.setBounds(220, 200, 100, 50);
        f.add(l4);
        f.add(t4);

        b1=new JButton("Make Payment");
        f.add(b1);
        b1.setBounds(200, 250, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.BOLD,20));

        b1.addActionListener(this);

        f.setVisible(true);
    }



    public void actionPerformed (ActionEvent e)
    {

        String a,b,z,d;
        d=t4.getText();
        a=t1.getText();
        b=t2.getText();
        z=t3.getText();


        if (a.equals("") || b.equals("") || z.equals("") || d.equals(""))
        {
            JOptionPane.showMessageDialog(f, "Please fill Details First");
        }
        if (e.getSource()==b1)
        {
            if (a.equals("") || b.equals("") || z.equals("") || d.equals(""))
            {
                JOptionPane.showMessageDialog(f, "Please fill Details First");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"PAYMENT SUCCESSFULL"+"\n"+"YOU'LL RECIEVE A CONFIRMATION MAIL SOON");
            }
        }

    }


}