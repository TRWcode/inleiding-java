package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    @Override
    public void init() {
        setSize(600,600);

    }


    @Override
    public void paint(Graphics g) {
        int xy = 300;
        int wh= 10;

        for (int i = 0; i <50; i++) {
            g.drawOval(xy,xy,wh,wh);
            xy = xy - 5;
            wh = wh + 10;

        }
    }
}
