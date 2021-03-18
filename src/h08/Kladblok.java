package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kladblok extends Applet {
    //declareren
    Button voorbeeldKnopje;
    TextField voorbeeldTekstvak;
    Label stickertje;
    int counter;
    Color backgroundColor;

    //lijn
    int xwaardeLijn;

    public void init() {
        //initialiseren
        //voorbeeldknop
        voorbeeldKnopje = new Button("Klik mij");
        add(voorbeeldKnopje);
        voorbeeldTekstvak = new TextField("", 30);
        add(voorbeeldTekstvak);
        // stikker
        stickertje = new Label("ik ben een label.");
        add(stickertje);
        //lijn
        xwaardeLijn = 20;

        // aansluiten knopje op ActionListener
        voorbeeldKnopje.addActionListener(new TextToTerminal());
        counter = 1;
        backgroundColor = Color.white;
    }


    public void paint(Graphics g) {
        voorbeeldKnopje.setLocation(20,20);
        voorbeeldKnopje.setLabel("verander mij ");
        voorbeeldKnopje.setSize(300,40);
        setBackground(backgroundColor);
        //tekstvak
        voorbeeldTekstvak.setLocation(20,60);
        voorbeeldTekstvak.setSize(300,40);

        stickertje.setLocation(20,100);
        stickertje.setSize(300,40);

        g.drawLine(xwaardeLijn,20,xwaardeLijn,380);

    }

    class TextToTerminal  implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = voorbeeldTekstvak.getText();
            voorbeeldKnopje.setLabel(message);
            stickertje.setText(message);
            xwaardeLijn += 20;
            repaint();
        }

    }

}
