package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    TextField tekstvak;

    Label label;

    String datum;



    public void init() {
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new enter());
        add(tekstvak);

        label = new Label("Voer maand nummmer in 1 t/m 12: ");
        add(label);

        datum = "...";
    }


    public void paint(Graphics g) {
        label.setLocation(20,20);

        tekstvak.setLocation(20,40);

        g.drawString(datum,20,100);


    }

    class enter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            int invoergetal = Integer.parseInt(invoer);


            switch (invoergetal) {
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
            tekstvak.setText("");
            repaint();


        }
    }
}
