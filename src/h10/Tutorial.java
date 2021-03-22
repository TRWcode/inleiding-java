package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends Applet {

    TextField tekstvak;
    String greeting;


    public void init() {

        tekstvak = new TextField("", 30);
        add(tekstvak);
        tekstvak.addActionListener(new groetlistener());
        greeting = "....";
    }


    public void paint(Graphics g) {

        tekstvak.setLocation(50,100);
        g.drawString("Kies uit de worden: ochtend, middag, avond, nacht.",50,50);

        g.drawString(greeting,50,160);

    }

    class groetlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //tekst vak uitlezen
            String userinput = tekstvak.getText();
//            if (userinput.equals("ochtend")) {
//                greeting = "Goedemorgen Wereld!";
//            } else if (userinput.equals("middag")) {
//                greeting = "Goedemiddag";
//            } else if (userinput.equals("avond")) {
//                greeting = "Goedeavond";
//            } else if (userinput.equals("nacht")) {
//                greeting = "Goedenacht";
//
//            } else {
//                greeting = "type fout";
//            }

            // keuze maken uit verschilende teksten
            switch (userinput) {
                case "ochtend": greeting = "Goedemorgen"; break;
                case "middag": greeting = "Goedemiddag"; break;
                case "avond": greeting = "Goedenavond"; break;
                case "nacht": greeting = "Goedenacht"; break;
                default: greeting = "type fout";
            }

            tekstvak.setText("");

            repaint();

        }
    }

}
