package AppletsDemo;

import java.applet.Applet;
import java.awt.Graphics;

public class Demo extends Applet {
    String message = "";
    public void init() {
        message = "Hello Everyone..";
    }

    public void start() {
        message = "Applet Started...";
    }

    public void paint(Graphics g) {
        g.drawString("Hello graphics...",50,50);
    }
}
