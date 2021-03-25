package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstveld;

    Button okbutton;


    String tekst;


    public void init() {
        tekstveld = new TextField("",5);
        add(tekstveld);
        tekstveld.addActionListener(new tekstVeld());

        okbutton = new Button("Ok");
        add(okbutton);
        okbutton.addActionListener(new tekstVeld());

        tekst = "";

    }


    public void paint(Graphics g) {
        tekstveld.setLocation(20,20);

        okbutton.setLocation(100,20);

        g.drawString("" + tekst,20,100);

    }

    class tekstVeld implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input = tekstveld.getText();
            int inputCijfer = Integer.parseInt(input);

            switch (inputCijfer) {
                case 1:
                case 2:
                case 3:
                case 4: tekst = "onvoldoende"; break;
                case 5: tekst = "voldoende"; break;
                case 6: tekst = "voldoende"; break;
                case 7: tekst = "voldoende"; break;
                case 8: tekst = "voldoende"; break;
                case 9: tekst = "voldoende"; break;
                case 10: tekst = "voldoende"; break;


            }
            tekstveld.setText("");
            repaint();

        }
    }
}
