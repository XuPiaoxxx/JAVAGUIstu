package ActionListenTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testtext {
    public static void main(String[] args) {
        Myframe frame = new Myframe();
    }
}

class Myframe extends Frame {

    public Myframe(){
        TextField textfield = new TextField();
        add(textfield);

        MyActionListener myActionListener = new MyActionListener();
        textfield.addActionListener(myActionListener);

        textfield.setEchoChar('*');
        setVisible(true);
        pack();


    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
     TextField field = (TextField) e.getSource();
        System.out.println(field.getText());
        field.setText("");
    }
}
