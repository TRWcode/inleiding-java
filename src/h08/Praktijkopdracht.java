package h08;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    Button keerknop, delenknop, plusknop, minknop;

    TextField tekstvak1, tekstvak2;


    public void init() {
        //knoppen
        keerknop = new Button("*");
        add(keerknop);

        delenknop = new Button("/");
        add(delenknop);

        plusknop = new Button("+");
        add(plusknop);

        minknop = new Button("-");
        add(minknop);

        //invul vakken
        tekstvak1 = new TextField("",10);
        add(tekstvak1);
        tekstvak2 = new TextField("",10);
        add(tekstvak2);

    }


    public void paint(Graphics g) {
        keerknop.setLocation(220,20);

        delenknop.setLocation(240,20);

        plusknop.setLocation(260,20);

        minknop.setLocation(280,20);

        //invulvakken

        tekstvak1.setLocation(20,20);

        tekstvak2.setLocation(120,20);



    }
}
