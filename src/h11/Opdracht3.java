package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {



    public void init() {

    }


    public void paint(Graphics g) {
        int maxnummer = 20;

        int eerstenummer = 1;

        int tweedenummer = 1;
        int y = 30;

        for (int i = 1; i <= maxnummer; ++i) {

            g.drawString(eerstenummer +"",20,y);
            y += 20;

            int sum = eerstenummer + tweedenummer;
            eerstenummer = tweedenummer;
            tweedenummer = sum;
        }


    }
}
