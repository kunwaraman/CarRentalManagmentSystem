package Project;



import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Looking implements ActionListener
{
    JFrame f;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JButton b1;

    public static void main (String args[])
    {
        new Looking();
    }
    Looking()
    {
        f=new JFrame("WELCOME TO CAR BOOKING");
        f.setLayout(null);
        f.setSize(600,600);
        l1=new JLabel("Name");
        l1.setBounds(100, 50, 100, 50);
        t1=new JTextField();
        t1.setBounds(220, 50, 100, 50);
        f.add(l1);
        f.add(t1);

        l2=new JLabel("Mobile Number");
        l2.setBounds(100, 100, 100, 50);
        t2=new JTextField();
        t2.setBounds(220, 100, 100, 50);
        f.add(l2);
        f.add(t2);

        l3=new JLabel("Email");
        l3.setBounds(100, 150, 100, 50);
        t3=new JTextField();
        t3.setBounds(220, 150, 100, 50);
        f.add(l3);
        f.add(t3);

        l4=new JLabel("Address");
        l4.setBounds(100, 200, 100, 50);
        t4=new JTextField();
        t4.setBounds(220, 200, 100, 50);
        f.add(l4);
        f.add(t4);


        b1=new JButton("Login Page");
        f.add(b1);
        b1.setBounds(200, 250, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.ITALIC,20));

        b1.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
			/*String a,b,z,d;
			 d=t4.getName();
			 a=t1.getName();
				b=t2.getName();
				z=t3.getName();*/

        if (e.getSource()==b1)
        {
            //JOptionPane.showMessageDialog(f, "Please fill Details First");
            if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") )
            {
                JOptionPane.showMessageDialog(f, "Please fill Details First");
                System.out.println("please ");

            }
            else
            {
                new CarAvail();
            }
        }

					/*else if (t1.getText()!=null || t2.getText()!=null || t3.getText()!=null || t4.getText()!=null)
					{
					 if(e.getSource()==b1)
					{
						new CarAvail();

					}
					}*/





    }
}