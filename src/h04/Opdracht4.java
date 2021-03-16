package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        //grafiek opzet
        g.setColor(Color.black);
        g.drawRect(80,50,300,40);
        g.drawRect(80,90,300,40);
        g.drawRect(80,130,300,40);
        g.drawRect(80,170,300,40);
        g.drawRect(80,210,300,40);
        g.drawRect(80,250,300,40);

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
        g.setColor(Color.red);
        g.fillRect(110,210,30,80);

        // Jeroen
        g.setColor(Color.orange);
        g.fillRect(210,90,30,200);

        //Hans
        g.setColor(Color.green);
        g.fillRect(310,130,30,160);
    }
}
