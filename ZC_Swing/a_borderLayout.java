package ZC_Swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class a_borderLayout {
    JFrame frame;
    a_borderLayout(){
        frame = new JFrame();
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.WEST);
        frame.add(b4, BorderLayout.CENTER);
        frame.add(b5, BorderLayout.EAST);

    }
    public static void main(String[] args) {
        new a_borderLayout();
        
    }
}
