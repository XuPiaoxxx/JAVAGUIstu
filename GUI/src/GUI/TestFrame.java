package GUI;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个JAVA图像界面窗口");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setBackground(new Color(85,150,65));
        frame.setLocation(200,200);
        frame.setResizable(false);
    }
}
