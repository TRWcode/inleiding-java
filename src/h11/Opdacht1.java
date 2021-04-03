package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdacht1 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;

        for (teller = 1; teller <11; teller++) {
        y += 20;
        g.drawLine(20,y,120,y);
        g.drawString("" + teller, 300,y );
        }
    }
}
