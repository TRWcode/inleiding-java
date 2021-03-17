package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    //Breedte van de vormen
    int breedte, hoogte;

    //breedte en hoogte voor cirkel
    int cirkelB, cirkelH;

    //kleur van de tekening
    Color vulling = Color.magenta;
    Color tekstenlijnen = Color.black;


    public void init(){
        setSize(1000,500);
        setBackground(Color.white);
        breedte = 200;
        hoogte = 100;
        cirkelB = 100;
        cirkelH = 100;
    }


    public void paint(Graphics g) {
        // lijn
        g.setColor(tekstenlijnen);
        g.drawLine(20,20,220,20);
        g.drawString("Lijn",100,40);

        //rechthoek
        g.drawRect(20,50,breedte,hoogte);
        g.drawString("Rechthoek",90,170);

        //afgeronde rechthoek
        g.drawRoundRect(20,180,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",60,300);

        //gevulde rechthoek met ovaal
        g.setColor(vulling);
        g.fillRect(230,50,breedte,hoogte);
        g.setColor(tekstenlijnen);
        g.drawOval(230,50,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",250,170);

        // gevulde ovaal
        g.setColor(vulling);
        g.fillOval(230,180,breedte,hoogte);
        g.setColor(tekstenlijnen);
        g.drawString("Gevulde ovaal",290,300);

        //taartpunt met ovaal
        g.drawOval(440,50,breedte,hoogte);
        g.setColor(vulling);
        g.fillArc(440,50,breedte,hoogte,0,45);
        g.setColor(tekstenlijnen);
        g.drawString("Taartpunt met ovaal eromheen",460,170);

        // cirkel
        g.drawOval(490,180,cirkelB,cirkelH);
        g.drawString("Cirkel",525,300);
    }
}


