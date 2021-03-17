package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

   //opzet van de graviek
    int grafiekopzetB, graviekopzetH;

    //staaf van Valerie
    int valeriestaafB, valeriestaafH;
    //staaf van Jeroen
    int jeroenstaafB, jeroenstaafH;
    //staaf van Hans
    int hansstaafB, hansstaafH;

    //kleuren per persoon
    Color kleurvalerie = Color.red;

    Color kleurjeroen = Color.orange;

    Color kleurhans = Color.green;

    public void init() {
        setSize(500,500);
        setBackground(Color.white);
        // grafiek
        grafiekopzetB = 300;
        graviekopzetH = 40;
        // valarie staaf
        valeriestaafB = 30;
        valeriestaafH = 80;
        // jeroen staaf
        jeroenstaafB = 30;
        jeroenstaafH = 200;
        // hans staaf
        hansstaafB = 30;
        hansstaafH = 160;
    }

    public void paint(Graphics g) {

        //grafiek opzet
        g.setColor(Color.black);
        g.drawRect(80,50,grafiekopzetB,graviekopzetH);
        g.drawRect(80,90,grafiekopzetB,graviekopzetH);
        g.drawRect(80,130,grafiekopzetB,graviekopzetH);
        g.drawRect(80,170,grafiekopzetB,graviekopzetH);
        g.drawRect(80,210,grafiekopzetB,graviekopzetH);
        g.drawRect(80,250,grafiekopzetB,graviekopzetH);

        //getallen
        g.drawString("120",50,50);
        g.drawString("100",50,90);
        g.drawString("80",55,130);
        g.drawString("60",55,170);
        g.drawString("40",55,210);
        g.drawString("20",55,250);
        g.drawString("0",60,290);

        //namen
        g.drawString("Valerie",110,310);
        g.drawString("Jeroen",210,310);
        g.drawString("Hans",310,310);

        //staven
        //Valerie
        g.setColor(kleurvalerie);
        g.fillRect(110,210,valeriestaafB,valeriestaafH);

        // Jeroen
        g.setColor(kleurjeroen);
        g.fillRect(210,90,jeroenstaafB,jeroenstaafH);

        //Hans
        g.setColor(kleurhans);
        g.fillRect(310,130,hansstaafB,hansstaafH);
    }
}

