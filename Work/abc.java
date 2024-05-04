package Work;

import javax.swing.*;
import java.awt.*;

public class abc extends JFrame {


    JFrame frame = new JFrame("WorkClass");
    JLabel label = new JLabel("any");



    JTextField field = new JTextField("Name");
    JTextField field2 = new JTextField("Roll");
    JTextField filed3 = new JTextField("st");
    public abc(JFrame frame) throws HeadlessException {
        this.frame = frame;
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }




    public static void main(String[] args) {

    }
}
