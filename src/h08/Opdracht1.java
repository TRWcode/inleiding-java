package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    //tekst vak
    TextField textvak;

    //label
    Label label;


    //knoppen
    Button okbutton;
    Button resetbutton;


    public void init() {
        //tekst vak
        textvak = new TextField("", 30);
        add(textvak);
        //label
        label = new Label("Klik op Ok om uw tekst te laten zien");
        add(label);
        //okknop
        okbutton = new Button("klik hier");
        add(okbutton);
        okbutton.addActionListener(new Knopsettingsok());
        //resetbutton
        resetbutton = new Button("Reset hier");
        add(resetbutton);
        resetbutton.addActionListener(new Knopsettingsreset());


    }


    public void paint(Graphics g) {
        //tekst vak
        textvak.setLocation(20, 60);
        textvak.setSize(300, 30);
        textvak.setText("type hier");
        // label
        label.setLocation(20, 100);
        //okknop
        okbutton.setLocation(20, 20);
        okbutton.setLabel("Ok");
        okbutton.setSize(80, 30);

        //resetbutton
        resetbutton.setLocation(20, 140);
    }

    class Knopsettingsok implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //label tekstdie verschijnt
            String tekst = textvak.getText();
            label.setText(tekst);
        }
    }

    class Knopsettingsreset implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            repaint();
            label.setText("Klik op Ok om uw tekst te laten zien");
            //volgens mij werkt het! alleen wil weten of ik het hadniger kon doen.
        }
    }
}

