package AWTDemo;

import java.awt.*;

public class AWT_Example_2 {
    AWT_Example_2() {

        Frame frame = new Frame();

        TextField tf = new TextField();
        tf.setBounds(10,40,100,30);
        frame.add(tf);

        Button btn = new Button("Greet...");
        btn.setBounds(150,40,100,30);
        frame.add(btn);

        frame.setSize(600,500);
        frame.setResizable(false);
        frame.setTitle("AWT Demo...");
        frame.setLayout(null);
        frame.setBackground(Color.RED);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        AWT_Example_2 obj = new AWT_Example_2();
    }
}
