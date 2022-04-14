package JFrametest;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo2 extends JFrame {
    public TestTextDemo2(){
        Container container = this.getContentPane();

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setBounds(100,100,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo2();
    }
}
