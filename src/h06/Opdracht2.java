package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int seconde, minuut, uur, dag, jaar;


        public void init() {
            seconde = 1;
            minuut = 60 * seconde;
            uur = 60 * minuut;
            dag = 24 * uur;
            jaar = 365 * dag;
            System.out.println(jaar);



        }

        public void paint(Graphics g) {
            //uurberekening
            g.drawString("Secondes uitrekenen",20,20);
            g.drawString("uitrekenen van minuut: " + seconde + " * " + "60" + "= " + minuut,20,60);
            g.drawString("uitrekenen van uur: " + minuut + " * " + "60" + "= " + uur ,20,80);
            g.drawString("uitrekenen van dag: " + uur + " * " + "24" + "= " + dag,20,100);
            g.drawString("uitrekenen van jaar: " + dag + " * " + "365" + "= " + jaar,20,120);


           // dag berekening


    }

}
