package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
       // Roepnaam
        g.setColor(Color.blue);
        g.drawString("Thomas",50,60);

        // Achternaam
        g.setColor(Color.red);
        g.drawString("Sibbald",50,75);
    }
}
