package JFrametest;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    //init();初始化
    public void init(){
        //顶级弹窗
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBackground(Color.red);
        jf.setBounds(100,100,500,600);
        //设置文字Jlable
        JLabel jLabel = new JLabel("欢迎欢迎");
        jf.add(jLabel);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
