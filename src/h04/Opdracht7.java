package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.black);
    }


    public void paint(Graphics g) {
        //dobbelsteen
        g.setColor(Color.red);
        g.fillRoundRect(50,50,200,200,50,50);

        //cirkel links boven
        g.setColor(Color.white);
        g.fillOval(80,80,50,50);

        // rechts boven
        g.fillOval(170,80,50,50);

        //links onder
        g.fillOval(80,170,50,50);
        // rechts onder
        g.fillOval(170,170,50,50);
    }
}
