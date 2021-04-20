package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    int [] salaris = { 10,20,30,40,50,60,70,80,90,100 };


    public void init() {



    }


    public void paint(Graphics g) {
        int y = 20;
        double som = 0;
        for (int i = 0; i < salaris.length; i++) {
            g.drawString("" + salaris[i],50,y);
            som += salaris[i];
            y += 20;
        }

        double gemiddelde = som / salaris.length;
        g.drawString("gemiddelde is: " + gemiddelde ,20,y);




    }

    
}
