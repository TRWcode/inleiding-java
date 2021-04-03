package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        int x = 50;

        for (int i = 0; i < 5 ; i++) {
            g.drawRect(x,y,50,50);
            y+=50;
            x+=50;
        }
    }
}
