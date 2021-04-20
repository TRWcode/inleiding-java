package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {

    TextField tekstvak = new TextField("", 10);

    Button okknop = new Button("Ok");

    int[] getallen = {2, 2, 2, 300, 300, 300, 100, 100};
    int aantal;

    String uitkomst;

    public void init() {
        add(tekstvak);
        tekstvak.addActionListener(new ok());

        add(okknop);
        okknop.addActionListener(new ok());

        uitkomst = "";




    }


    public void paint(Graphics g) {
        tekstvak.setLocation(20,20);
        okknop.setLocation(150,20);

        g.drawString("" + uitkomst + aantal,20,100);

    }

    class ok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            int inputgetal = Integer.parseInt(input);

            aantal = 0;

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == inputgetal ) {
                    aantal ++;


                }
            }
            repaint();

        }
    }
}


