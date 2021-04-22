package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    @Override
    public void init() {
        setSize(700,500);

    }

    @Override
    public void paint(Graphics g) {
        rodebaksteenTekenen(g);

    }

    public void rodebaksteenTekenen (Graphics g) {
        int x = 200;
        int x2 = 100;
        int x3 = 0;
        for (int i = 0; i <3 ; i++) {
            g.setColor(Color.red);
            g.fillRect(x,50,100,40);
            g.setColor(Color.black);
            g.drawRect(x,50,100,40);
            x += 100;
        }

        for (int i2 = 0; i2 <5 ; i2++) {
            g.setColor(Color.red);
            g.fillRect(x2,90,100,40);
            g.setColor(Color.black);
            g.drawRect(x2,90,100,40);
            x2 += 100;

        }

        for (int i3 = 0; i3 <7 ; i3++) {
            g.setColor(Color.red);
            g.fillRect(x3,130,100,40);
            g.setColor(Color.black);
            g.drawRect(x3,130,100,40);
            x3 += 100;

        }


    }

}
