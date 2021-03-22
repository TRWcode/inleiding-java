package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double cijfer1, cijfer2,cijfer3, aantalcijfers;
    double gemiddelde;
    double afgerond;
    int tien, keer10;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        aantalcijfers = 3;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / aantalcijfers;
        tien = 10;

        keer10 = (int) gemiddelde * tien;

        afgerond = keer10 / tien;




    }

    public void paint(Graphics g) {
        g.drawString("" + cijfer1,20,20);
        g.drawString("" + cijfer2,50,20);
        g.drawString("" + cijfer3,80,20);
        g.drawString("Gemiddelde cijfer: " + gemiddelde,20,60);
        g.drawString("Gemiddelde cijfer afgerond: " + afgerond,20,80);



    }
}
