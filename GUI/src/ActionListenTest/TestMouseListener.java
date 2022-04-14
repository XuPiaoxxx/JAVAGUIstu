package ActionListenTest;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame1("鼠标画图");
    }
}

class MyFrame1 extends Frame{
    ArrayList points;

    public MyFrame1(String title){
        super(title);
        setBounds(200,200,600,600);
        points = new ArrayList<>();
        MyMouseListener myMouseListener = new MyMouseListener();
        this.addMouseListener(myMouseListener);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x,point.y,20,20);
        }
    }

    public void addPaint(Point point){
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame1 frame = (MyFrame1) e.getSource();
            frame.addPaint(new Point(e.getX(), e.getY()));

            frame.repaint();
        }
    }
}
