package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    TextField tekstvak = new TextField("",20);

    Button okknop = new Button("Ok");

    int[] getallen = {32,22,11,23,399};
    String uitkomst;

    public void init() {
        add(okknop);
        okknop.addActionListener(new ok());


        add(tekstvak);
        tekstvak.addActionListener(new ok());
        uitkomst = "";

    }


    public void paint(Graphics g) {
        g.drawString("type een getal 1 t/m 5",20,20);
        g.drawString("" + uitkomst,20,100);
        okknop.setLocation(20,40);
        tekstvak.setLocation(60,40);

    }

    class ok implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            int inputgetal = Integer.parseInt(input);

            for (int i = 0; i <getallen.length ; i++) {
                if (getallen[i] == inputgetal) {
                    uitkomst = "" + i;
                }
            }
            tekstvak.setText("");
            repaint();
        }
    }
}
