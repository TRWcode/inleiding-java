package h06;

import java.awt.*;
import java.applet.Applet;


public class Opdracht1 extends Applet {
    //personen
    double euro, personen;
    //uitkomst
    double uitkomst;

    public void init() {

        euro = 113;
        personen = 4;

        //uitkomst
        uitkomst = euro / personen;
    }

    public void paint(Graphics g) {
        //rekensom
        String optelsomString = euro + "/" + personen + "=" + uitkomst;
        g.drawString(optelsomString,50,50);
        //jan
        g.drawString("Jan: " +uitkomst ,50,90);

        //ali
        g.drawString("Ali: " +uitkomst ,50,110);

        //jeannette
        g.drawString("Jeannette: " +uitkomst ,50,130);

        //thomas
        g.drawString("Thomas: " +uitkomst ,50,150);
    }
}

