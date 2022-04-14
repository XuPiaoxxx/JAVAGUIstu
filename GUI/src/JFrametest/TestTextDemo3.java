package JFrametest;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo3 extends JFrame {
    public TestTextDemo3(){
        Container container = this.getContentPane();
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("大大撒旦是咳嗽单独");

        JScrollPane jScrollPane = new JScrollPane(textArea);
        container.add(jScrollPane);

        this.setVisible(true);
        this.setBounds(100,100,500,500);
        this.setBackground(Color.yellow);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo3();
    }
}
