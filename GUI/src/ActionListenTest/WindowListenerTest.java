package ActionListenTest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerTest {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{

    public WindowFrame(){
        setBackground(Color.blue);
        setBounds(100,100,500,500);
        setVisible(true);

        this.addWindowListener(
                //匿名内部类
                new WindowAdapter() {
                    //关闭窗口
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("window closing");
                        System.exit(0);
                    }
                    @Override
                    public void  windowActivated(WindowEvent e){
                        WindowFrame source = (WindowFrame) e.getSource();
                        source.setTitle("我被激活了");
                        System.out.println("window activated");
                    }
                }
        );
    }
}
