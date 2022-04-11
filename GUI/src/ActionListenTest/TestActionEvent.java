package ActionListenTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame =new Frame("ActionEvent");

        Button button = new Button("btn");
        MyActionListen myActionListen = new MyActionListen();
        button.addActionListener(myActionListen);

        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        windowClose(frame);
        frame.setVisible(true);

    }

    //关闭窗体事件

    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


//按钮事件监听
class MyActionListen implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击点击点击!");
    }
}


