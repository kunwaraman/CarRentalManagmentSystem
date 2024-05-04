package Project;



import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cars implements ActionListener
{
    JFrame f;
    JComboBox cb;
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    String d[]= {"Yellow Fox","Mercedes G63 AMG 6X6","Land Rover 6×6","Willy’s Jeep"};
    public static void main(String args[])
    {
        new Cars();
    }
    Cars()
    {
        f=new JFrame("6 Wheeler Cars");
        f.setVisible(true);
        f.setLayout(null);

        l1=new JLabel("Select Car");
        l1.setBounds(100, 100, 100, 50);
        l1.setFont(new Font("Times New Roman",Font.ITALIC,20));
        f.add(l1);

        cb=new JComboBox(d);
        cb.setBounds(200,75, 100, 50);
        f.add(cb);



		/*l2=new JLabel("Enter Distance");
		l2.setBounds(100, 150, 100, 50);
		l2.setFont(new Font("Times New Roman",Font.ITALIC,20));
		f.add(l2);

		t1=new JTextField();
		t1.setBounds(200, 150, 100, 50);
		f.add(t1);*/

        b1=new JButton("Get Cost");
        f.add(b1);
        b1.setBounds(200, 250, 200, 50);
        b1.setFont(new Font("Times new Roman",Font.BOLD,20));

        b1.addActionListener(this);


        f.setSize(600, 600);
    }

    public  void actionPerformed (ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            CostSix s=new CostSix();
        }
    }
}
