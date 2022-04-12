package ActionListenTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCal {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

    }
}

class Calculator extends Frame{
    public Calculator(){
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        MyCalculatorListener myCalculatorListener = new MyCalculatorListener(num1,num2,num3);
        Button btn = new Button("=");
        btn.addActionListener(myCalculatorListener);
        Label label = new Label("+");

        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(btn);
        add(num3);

        setVisible(true);
        pack();
    }
}

class MyCalculatorListener implements ActionListener{

    private TextField num1,num2,num3;

    public MyCalculatorListener(TextField num1,TextField num2, TextField num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        num3.setText(String.valueOf(n1+n2));

        num1.setText("");
        num2.setText("");
    }
}
