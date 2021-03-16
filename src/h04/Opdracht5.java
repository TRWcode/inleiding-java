package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.blue);
    }


    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,50,0,360);
    }
}
