package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init(){
        setSize(500,500);
        setBackground(Color.black);
    }


    public void paint(Graphics g) {
       //dak
        g.setColor(Color.RED);
        g.drawLine(50,120,100,70);
        g.drawLine(50,120,150,120);
        g.drawLine(150,120,100,70);

        //huis(vierkant)
        g.fillRect(50,120,100,100);

        // deur
        g.setColor(Color.blue);
        g.fillRect(60,170,30,50);
       // deur klink
        g.setColor(Color.black);
        g.fillOval(79,197,5,5);
        //brieven bus
        g.setColor(Color.black);
        g.fillRect(68,205,10,3);

        //boven raam
        g.setColor(Color.white);
        g.drawRect(105,140,15,15);
        g.drawRect(120,140,15,15);
        g.drawRect(105,155,15,15);
        g.drawRect(120,155,15,15);

        //onder raam
        g.drawRect(112,185,20,30);
    }
}


