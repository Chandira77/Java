package ZA_Swing;

import javax.swing.JFrame;

public class a_jframe extends JFrame {
    a_jframe(){
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new a_jframe();
    }
}
