package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    TextField tekstvak;

    Label label;

    String tekst;

    int hoogstegetal;





    public void init() {
        tekstvak = new TextField("",2);
        tekstvak.addActionListener(new tekstVak());
        add(tekstvak);

        label = new Label("druk op enter om uw hoogste getal bij te houden");
        add(label);
        tekst = "";

    }


    public void paint(Graphics g) {
        tekstvak.setLocation(20,10);

        label.setLocation(20,40);

        g.drawString(tekst,20,80);


    }


    class tekstVak implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoergetal = tekstvak.getText();
            int invoergetalInt = Integer.parseInt(invoergetal);

            label.setText("" + invoergetal);

            if (hoogstegetal <= invoergetalInt) {
                hoogstegetal = invoergetalInt;
                tekst = "" + invoergetalInt;
            }
            repaint();










        }
    }
}
