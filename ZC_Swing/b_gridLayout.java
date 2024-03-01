package ZC_Swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class b_gridLayout {
    JFrame frame;
    b_gridLayout(){
        frame = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");


        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);

        frame.setLayout(new GridLayout());
        frame.setLayout(new GridLayout(2,4));
        frame.setSize(400, 200);
    }
}
