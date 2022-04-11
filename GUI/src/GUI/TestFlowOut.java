package GUI;

import java.awt.*;

public class TestFlowOut {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("one");
        Button button2 = new Button("two");
        Button button3 = new Button("three");

        frame.setLayout(new FlowLayout());

        frame.setSize(200,200);
        frame.setLocation(100,100);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
