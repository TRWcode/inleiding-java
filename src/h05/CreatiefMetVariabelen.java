package h05;

import java.applet.Applet;
import java.awt.*;

public class CreatiefMetVariabelen extends Applet {

    //int is stukje geheugen voor een geheel getal
    int getal1, getal2, optelsom;


    //een double is een stukje gehuegen voor een kommagetal

    double factor1, factor2, product;

    // varialbelen voor rechthoek
    int breedte, hoogte;

    // kleuren varialbelen
    Color rechthoekKleur = Color.pink;

    public void init() {
        setBackground(Color.darkGray);
        getal1 = 3;
        getal2 = 4;
        factor1 = 11.345;
        factor2 = 47.36;
        optelsom = getal1 + getal2 ;
        product = factor1 * factor2;
    }


    public void paint(Graphics g) {
       // pak de witte verf
        g.setColor(Color.white);
        // optelsom
        String optelsomString = getal1 + "+" + getal2 + " = " + optelsom;
        g.drawString(optelsomString,50,50);

        //keersom
        String keersomString = factor1 + "x" + factor2 + "=" + product;
        g.drawString(keersomString,50,70);

        // rechthoek
        g.setColor(rechthoekKleur);
        g.fillRect(50,90,200,80);
    }
}
