package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    @Override
    public void init() {
        setSize(1000,1000);

    }

    @Override
    public void paint(Graphics g) {
        int xy = 500;
        int wh = 5;

        for (int i = 0; i <100 ; i++) {
            g.drawOval(xy,xy,wh,wh);

            xy = xy -5;
            wh = wh +10;

        }

    }
}
