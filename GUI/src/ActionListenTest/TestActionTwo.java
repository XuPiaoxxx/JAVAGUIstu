package ActionListenTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("开始与停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);

        frame.pack();
        frame.setVisible(true);

    }


}
class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮："+e.getActionCommand());
    }
}
