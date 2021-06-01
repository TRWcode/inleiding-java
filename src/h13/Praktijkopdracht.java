package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {




    public void init() {
        setSize(1000,800);

    }


    public void paint(Graphics g) {
        meerbomenmaken(g,3,4);

    }

    public void boomtekenen (Graphics g, int x, int x2, int y, int y2) {
        g.setColor(Color.black);
        g.fillRect(x,y,50,200);
        g.setColor(Color.green);
        g.fillOval(x2,y2,100,100);

    }

    public void meerbomenmaken (Graphics g, int aantalbomen, int aantalrijen) {

        int xwaarde = 50;
        int ywaarde = 100;

        int x2waarde = 25;
        int y2waarde = 50;



        for (int i = 0; i <aantalrijen ; i++) {
            for (int j = 0; j <aantalbomen ; j++) {
                boomtekenen(g,xwaarde,x2waarde,ywaarde,y2waarde);

                xwaarde += 200;
                x2waarde += 200;
            }

            ywaarde += 300;
            y2waarde += 300;
            xwaarde = 50;
            x2waarde = 25;

        }






    }
}
