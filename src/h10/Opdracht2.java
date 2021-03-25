package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    TextField tekstvak;

    Label label;

    int hoogstegetal;
    int laagstegetal;

    String hoogstegetaltekst ,laagstegetaltekst;


    public void init() {

        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new tekstVak());
        add(tekstvak);

        label = new Label("ingevoerde getal");
        add(label);
    }


    public void paint(Graphics g) {
        tekstvak.setLocation(20,20);

        label.setLocation(20,50);

        g.drawString("Hier komt het hoogste getal dat je heb ingevoerd: " + hoogstegetal,20,90);
        g.drawString("Hier komt het laagste getal dat je heb ingevoerd: " + laagstegetal,20,110);

    }

    class tekstVak implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoergetal = tekstvak.getText();
            int invoergetalInt = Integer.parseInt(invoergetal);

            label.setText("" + invoergetal);

            if (invoergetalInt >= hoogstegetal) {
                hoogstegetal = invoergetalInt;
                hoogstegetaltekst = "" + invoergetalInt;
            }
            else if (invoergetalInt <= laagstegetal) {
                laagstegetal = invoergetalInt;
                laagstegetaltekst = "" + invoergetalInt;
            }
            tekstvak.setText("");
            repaint();
        }
    }
}
