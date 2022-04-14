package JFrametest;

import javax.swing.*;
import java.awt.*;

public class TesttextDemo1 extends JFrame {
    public TesttextDemo1(){
        Container container = this.getContentPane();

        JTextField jTextField = new JTextField("hello");
        JTextField jTextField1 = new JTextField("world",20);

        container.add(jTextField,BorderLayout.NORTH);
        container.add(jTextField1,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TesttextDemo1();
    }
}
