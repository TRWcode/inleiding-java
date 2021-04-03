package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int aantal = 10;
        int eerstenummer = 3;

        int y = 20;

        for (int i = 1; i <= aantal ; ++i) {
            g.drawString(i + " * " + eerstenummer + " = " + eerstenummer * i,20,y);
            y += 20;
        }


    }
}
