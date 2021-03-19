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

    Label uitkomstlabel;

    int btw;
    double uitkomst;

    public void init() {
        tekstvak = new TextField("21% BTW uitrekenen");
        add(tekstvak);

        okbutton = new Button("Ok");
        add(okbutton);
        okbutton.addActionListener(new Knopje());

        uitkomstlabel = new Label("hier komt de uitkomst");
        add(uitkomstlabel);

        btw = 21;

    }


    public void paint(Graphics g) {

        tekstvak.setLocation(20,20);
        tekstvak.setSize(130,20);

        okbutton.setLocation(170,20);
        okbutton.setSize(30,20);

        uitkomstlabel.setLocation(20,50);
    }

    // ok knop
    class Knopje implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String input = tekstvak.getText();
            uitkomst = Double.parseDouble(input + "/" + btw);
            uitkomstlabel.setText("" + uitkomst);


        }
    }
}
