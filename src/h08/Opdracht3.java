package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    //tekst vak
    TextField tekstvak;

    //knop
    Button okbutton;
    Button resetbutton;

    Label uitkomstlabel;

    double btw;
    double uitkomst;

    public void init() {
        tekstvak = new TextField("21% BTW uitrekenen");
        add(tekstvak);
        tekstvak.addActionListener(new Knopje());

        okbutton = new Button("Ok");
        add(okbutton);
        okbutton.addActionListener(new Knopje());

        uitkomstlabel = new Label("hier komt de uitkomst");
        add(uitkomstlabel);

        btw = 0.21;
        resetbutton = new Button("Reset");
        add(resetbutton);
        resetbutton.addActionListener(new reset());
    }


    public void paint(Graphics g) {

        tekstvak.setLocation(20,20);
        tekstvak.setSize(130,20);

        okbutton.setLocation(170,20);
        okbutton.setSize(30,20);

        uitkomstlabel.setLocation(20,50);

        resetbutton.setLocation(20,80);

    }

    // ok knop
    class Knopje implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String input = tekstvak.getText();
            double inputDouble = Double.parseDouble(input);
            uitkomst = inputDouble * btw + inputDouble;
            uitkomstlabel.setText("" + uitkomst);
            repaint();


        }
    }

    class reset implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            tekstvak.setText("");
            uitkomstlabel.setText("Nieuw bedrag invoeren");
            repaint();
        }
    }
}
