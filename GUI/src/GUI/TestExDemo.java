package GUI;

import java.awt.*;

public class TestExDemo {
    public static void main(String[] args) {
        Frame frame =new Frame("ExDemo");

        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setBackground(new Color(0,0,0));
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        p1.add(new Button("East1"),BorderLayout.EAST);
        p1.add(new Button("Wast1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn1"));
        p2.add(new Button("p2-btn2"));
        p1.add(p2,BorderLayout.CENTER);

        p3.add(new Button("East2"),BorderLayout.EAST);
        p3.add(new Button("West2"),BorderLayout.WEST);
        for(int i=0;i<4;i++){
            p4.add(new Button("forbtn"+i));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

    }
}
