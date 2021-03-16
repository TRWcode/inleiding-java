package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    public void init() {
        setSize(500,500);
        setBackground(Color.black);
    }


    public void paint(Graphics g) {
        //rood
        g.setColor(Color.red);
        g.fillRect(60,50,100,35);
        //wit
        g.setColor(Color.white);
        g.fillRect(60,85,100,35);
        //blauw
        //ik snap niet waarom het blauwe gedeelte niet netjes aansluit links. want alle X zijn 60px maar als nog komt het niet overheen
        g.setColor(Color.blue);
        g.fillRect(60,120,100,35);

        //stok
        g.setColor(Color.gray);
        g.fillRect(40,50,20,200);
    }
}


