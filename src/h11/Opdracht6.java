package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {

        int xy = 100;
        int wh = 10;


        for (int i = 0; i <5; i++) {
            g.drawOval(xy,xy,wh,wh);
            xy = xy -5;
            wh = wh + 10;
        }


    }


}
