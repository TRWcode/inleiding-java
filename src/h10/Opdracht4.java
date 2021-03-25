package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    TextField tekstvak;
    TextField tekstvakjaar;

    Label label;

    String datum;

    String tekstjaar;



    public void init() {
        tekstvakjaar = new TextField("",8);
        tekstvakjaar.addActionListener(new enter());
        add(tekstvakjaar);



        tekstvak = new TextField("",8);
        tekstvak.addActionListener(new enter());
        add(tekstvak);

        label = new Label("Jaar en dan maand nummmerin 1 t/m 12: ");
        add(label);
        tekstjaar = "";
        datum = "";
    }


    public void paint(Graphics g) {
        label.setLocation(20,20);
        tekstvakjaar.setLocation(20,40);

        tekstvak.setLocation(100,40);

        g.drawString(tekstjaar,20,100);
        g.drawString(datum,20,120);


    }

    class enter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            int invoermaanden = Integer.parseInt(invoer);

            String invoerjaargetal = tekstvakjaar.getText();
            int invoerjaar = Integer.parseInt(invoerjaargetal);


            switch (invoermaanden) {
                case 1 : datum = "Januari heeft 31 dagen"; break;
                case 2 : datum = "Februari heeft 28 dagen"; break;
                case 3 : datum = "Maart heeft 31 dagen"; break;
                case 4 : datum = "April heeft 30 dagen"; break;
                case 5 : datum = "Mei heeft 31 dagen"; break;
                case 6 : datum = "Juni heeft 30 dagen"; break;
                case 7 : datum = "Juli heeft 31 dagen"; break;
                case 8 : datum = "Augustus heeft 31 dagen"; break;
                case 9 : datum = "September heeft 30 dagen"; break;
                case 10 : datum = "Oktober heeft 31 dagen"; break;
                case 11 : datum = "November heeft 30 dagen"; break;
                case 12 : datum = "December heeft 31 dagen"; break;
                default: datum = "foutje probeer opnieuw";
            }

            if ( (invoerjaar % 4 == 0 && !(invoerjaar % 100 == 0)) || invoerjaar % 400 == 0 ) {
                tekstjaar = " " + invoerjaar + "is een schrikkeljaar";
                if (invoermaanden == 2) {
                    datum = "Februari heeft 29 dagen";
                }

            }
            else {
                tekstjaar = " " + invoerjaar + "is geen schrikkeljaar";
            }
            tekstvak.setText("");
            repaint();


        }
    }
}

