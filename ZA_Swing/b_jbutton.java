package ZA_Swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class b_jbutton extends JFrame {
        b_jbutton(){
        JButton b1 = new JButton("Hello");
        JButton b2 = new JButton("Hi");
        setSize(400, 400);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new b_jbutton();
    }
}
