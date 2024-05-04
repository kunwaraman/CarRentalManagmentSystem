package Project;


import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CostSix implements ActionListener
{
    JFrame f;
    JTextField t1;
    JLabel l1;
    JButton b1;
    public static void main (String args[])
    {
        new CostSix();
    }
    CostSix()
    {

        f=new JFrame("Costs For 6 Wheeler");
        f.setVisible(true);
        f.setLayout(null);

        l1=new JLabel("Dist (km)");
        l1.setBounds(100, 50, 100, 50);
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        f.add(l1);

        t1=new JTextField();
        t1.setBounds(200, 50, 100, 50);
        f.add(t1);

        b1=new JButton("Display Cost");
        f.add(b1);
        b1.setBounds(200, 250, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.BOLD,20));

        b1.addActionListener(this);
        f.setVisible(true);

        f.setSize(600, 600);
    }
    public void actionPerformed (ActionEvent e)
    {

        if (e.getSource()==b1)
        {
            String c1;
            int cost;
            int initialcost=150;
            c1=t1.getText();
            cost=Integer.parseInt(c1);
            int finalcost=cost*initialcost;
            JOptionPane.showMessageDialog(f,"Cost is :"+finalcost+"rs");
        }
    }
}
