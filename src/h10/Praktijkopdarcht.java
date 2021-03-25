package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdarcht extends Applet {

    TextField tekstvak;

    String uitslag;

    @Override
    public void init() {

        tekstvak = new TextField("",10);
        add(tekstvak);
        tekstvak.addActionListener(new enter());


        uitslag = "hier komt uitslag";


    }

    @Override
    public void paint(Graphics g) {

        tekstvak.setLocation(20,20);

        g.drawString(uitslag,20,90);

    }

    class enter implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input = tekstvak.getText();
            int inputnumber = Integer.parseInt(input);

            switch (inputnumber) {
                case 1: uitslag = "slecht"; break;
                case 2: uitslag = "slecht"; break;
                case 3: uitslag = "slecht"; break;
                case 4: uitslag = "onvoldoende"; break;
                case 5: uitslag = "matig"; break;
                case 6: uitslag = "voldoende"; break;
                case 7: uitslag = "voldoende"; break;
                case 8: uitslag = "goed"; break;
                case 9: uitslag = "goed"; break;
                case 10: uitslag = "goed"; break;
                default: uitslag = "verkeerd cijfer ingevoerd";
            }
            tekstvak.setText("");
            repaint();
        }
    }
}
