package Project;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CarAvail implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JComboBox cb;
    JRadioButton rb1,rb2;
    JButton b1,b2;
    String d[]= {"1","2","4","6","8"};
    public static void main (String args[])
    {
        new CarAvail();
        System.out.println( new Font("Times new Roman",Font.ROMAN_BASELINE,20));
    }

    CarAvail()
    {
        f=new JFrame("Select car on basis of Number of Passengers");
        f.setLayout(null);
        f.setSize(600,600);

        l1=new JLabel("Passengers");
        l1.setBounds(100, 50, 100, 50);
        l1.setFont(new Font("Times New Roman",Font.ITALIC,20));
        f.add(l1);



        cb=new JComboBox(d);
        cb.setBounds(220, 50, 100, 50);
        f.add(cb);

        l3=new JLabel("Wheeler");
        l3.setBounds(100, 200, 100, 50);
        l3.setFont(new Font("Times New Roman",Font.ITALIC,20));
        f.add(l3);

        rb1=new JRadioButton("4");

        rb1.setBounds(210, 200, 100, 50);

        rb2=new JRadioButton("6");

        rb2.setBounds(320, 200, 100, 50);

        b1=new JButton("4 Wheeler Cars");
        f.add(b1);
        b1.setBounds(200, 300, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.ITALIC,20));

        b2=new JButton("6 Wheeler Cars");
        f.add(b2);
        b2.setBounds(200, 400, 200, 50);
        b2.setFont(new Font("Times new Roman",Font.ITALIC,20));

        f.add(rb1);
        f.add(rb2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource()==b1)
        {
            CostFour z=new CostFour();
        }
        else if (e.getSource()==b2)
        {
            Cars c=new Cars();
        }



    }
}
