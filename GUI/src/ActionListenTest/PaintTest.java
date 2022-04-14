package ActionListenTest;

import java.awt.*;

public class PaintTest {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame {
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(100,100,100,100);
        g.drawOval(300,300,10,10);
        g.setColor(Color.black);
    }
}
