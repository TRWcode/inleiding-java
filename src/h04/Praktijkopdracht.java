package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    public void init(){
        setSize(1000,500);
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
       // lijn
        g.setColor(Color.black);
        g.drawLine(20,20,220,20);
        g.drawString("Lijn",100,40);

        //rechthoek
        g.drawRect(20,50,200,100);
        g.drawString("Rechthoek",90,170);

        //afgeronde rechthoek
        g.drawRoundRect(20,180,200,100,30,30);
        g.drawString("Afgeronde rechthoek",60,300);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(230,50,200,100);
        g.setColor(Color.black);
        g.drawOval(230,50,200,100);
        g.drawString("Gevulde rechthoek met ovaal",250,170);

        // gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(230,180,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",290,300);

        //taartpunt met ovaal
        g.drawOval(440,50,200,100);
        g.setColor(Color.magenta);
        g.fillArc(440,50,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",460,170);

        // cirkel
        g.drawOval(490,180,100,100);
        g.drawString("Cirkel",525,300);
    }
}
