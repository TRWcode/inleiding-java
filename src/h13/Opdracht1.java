package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        tekenDriehoek(g, 120, 170, 120,170,170,120);

    }

    public void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1,y1,220,170);
        g.drawLine(x2,y2,170,120);
        g.drawLine(x3,y3,220,170);

    }
}