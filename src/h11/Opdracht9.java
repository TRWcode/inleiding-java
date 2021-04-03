package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {

    @Override
    public void init() {
        setSize(1000, 900);
        setBackground(Color.gray);

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

        //rij 2
        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }
        //rij3
        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }
        //rij 4

        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

        //rij 5

        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

        //rij 6
        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

        //rij 7

        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

        //rij 8
        x = 50;
        y += 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 100, 100);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 100, 100);
            }
            x += 100;
        }

    }
}
