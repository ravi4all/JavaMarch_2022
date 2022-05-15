package AWTDemo;

import java.awt.*;

public class AWT_Example_1 extends Frame {
    AWT_Example_1() {

        Button btn = new Button("Greet...");
        btn.setBounds(10,40,100,30);
        add(btn);

        setSize(300,300);
        setTitle("AWT Demo...");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWT_Example_1 obj = new AWT_Example_1();
    }
}
