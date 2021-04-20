package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    TextField tekstvak = new TextField("",20);

    int[] getallen = {20,30,40,12,50};



    public void init() {
        add(tekstvak);
        tekstvak.addActionListener(new okknop());



    }


    public void paint(Graphics g) {
        tekstvak.setLocation(20,20);


    }

    class okknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            int invoergetal = Integer.parseInt(invoer);



        }

    }
}



