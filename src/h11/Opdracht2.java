package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller= 20; teller > 9 ; teller -=1) {
            y += 20;
            g.drawString("" +teller,20,y);

        }


    }
}
