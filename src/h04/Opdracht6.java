package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {
    public void init() {
        setSize(500, 500);
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        //bord
        g.setColor(Color.black);
        g.fillRoundRect(50,50,200,400,50,50);

        //Rood
        g.setColor(Color.red);
        g.fillOval(100,90,100,100);

        //Oranje
        g.setColor(Color.orange);
        g.fillOval(100,200,100,100);

        //Groen
        g.setColor(Color.GREEN);
        g.fillOval(100,310,100,100);
    }
}