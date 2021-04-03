package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstveld;

    Button okbutton;

    double optellenvancijfer = 0.0;
    double ingevoerdecijfer = 0.0;

    int aantalcijfers = 0;

    String resultaat = "";


    public void init() {
        tekstveld = new TextField("",5);
        add(tekstveld);
        tekstveld.addActionListener(new tekstVeld());

        okbutton = new Button("Ok");
        add(okbutton);
        okbutton.addActionListener(new tekstVeld());



    }


    public void paint(Graphics g) {
        tekstveld.setLocation(20,20);

        okbutton.setLocation(100,20);

        double gemiddeld = Math.round((optellenvancijfer / aantalcijfers) * 100);
        gemiddeld /= 100;

        g.drawString("Het cijfer is: " + ingevoerdecijfer + " het gemiddelde is: " + gemiddeld,20,100);
        g.drawString("dit is een: " + resultaat,20,120);
    }

    class tekstVeld implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            ingevoerdecijfer = Double.parseDouble(tekstveld.getText());
            optellenvancijfer = optellenvancijfer + ingevoerdecijfer;
            aantalcijfers++;
            if (optellenvancijfer / aantalcijfers >= 5.5) {
                resultaat = "Voldoende";
            } else {
                resultaat = "Onvoldoende";
            }

            tekstveld.setText("");
            repaint();

        }
    }
}
