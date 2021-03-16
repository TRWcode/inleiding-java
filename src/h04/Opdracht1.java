package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {


    public void init(){
        setSize(500,500);
        setBackground(Color.black);
    }


    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(50,120,100,70);
        g.drawLine(50,120,150,120);
        g.drawLine(150,120,100,70);
    }
}
