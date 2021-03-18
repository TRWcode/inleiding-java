package h06;

import java.awt.*;
import java.applet.Applet;


public class Opdracht1 extends Applet {
    //personen
    double jan, ali , jeannette, thomas;
    //uitkomst
    double uitkomst;

    public void init() {
        jan = 28.25 ;
        ali = 28.25 ;
        jeannette = 28.25;
        thomas = 28.25;
        //uitkomst
        uitkomst = jan + ali + jeannette + thomas;
    }

    public void paint(Graphics g) {
        //rekensom
        String optelsomString = jan + " + " + ali + " + " + jeannette + " + " + thomas + " = " + uitkomst;
        g.drawString(optelsomString,50,50);
        //jan
        g.drawString("Jan: " + jan,50,90);

        //ali
        g.drawString("Ali: " + ali,50,110);

        //jeannette
        g.drawString("Jeannette: " + jeannette,50,130);

        //thomas
        g.drawString("Thomas: " + thomas,50,150);
    }
}

