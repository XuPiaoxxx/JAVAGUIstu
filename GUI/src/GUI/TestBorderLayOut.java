package GUI;

import javax.swing.border.Border;
import java.awt.*;

public class TestBorderLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame("东西南北中");

        Button east = new Button("东");
        Button west = new Button("西");
        Button south = new Button("南");
        Button north = new Button("北");
        Button center = new Button("中");

        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
