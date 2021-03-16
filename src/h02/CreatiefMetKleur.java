package h02;

import java.applet.Applet;
import java.awt.*;

public class CreatiefMetKleur extends Applet {


    public void init() {
        setSize(500, 500);
        setBackground(Color.RED);
    }


    public void paint(Graphics g) {

        // de tekst "welkom bij roc-dev"
        g.setColor(Color.WHITE);
        g.drawString("Welkom bij ROC-DEV", 50, 50);

        // Blauwe omlijsting
        g.setColor(Color.blue);
        g.fillRect(50, 70, 140, 140);

        // Achtergrond van het logo
        g.setColor(Color.white);
        g.fillRect(60,80,120,120);

        // De delen van het logo
        g.setColor(Color.green);
        g.fillArc(70,90,100,100,180,90);
        g.setColor(Color.yellow);
        g.fillArc(70,90,100,100,270,90);
        g.setColor(Color.red);
        g.fillArc(70,90,100,100,0,90);
        g.setColor(Color.blue);
        g.fillArc(70,90,100,100,90,90);

        // schijding tussen de delen van het logo
        g.setColor(Color.white);
        g.fillRect(117,90,6,100);
        g.setColor(Color.white);
        g.fillRect(70,137,100,6);
    }
}
