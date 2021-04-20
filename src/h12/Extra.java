package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Extra extends Applet {

    TextField tekstvak = new TextField("",20);
   int[] getallen = {20,20,11,30,1,4};


    public void init() {
        add(tekstvak);
        tekstvak.addActionListener(new ok());


    }


    public void paint(Graphics g) {

    }

    class ok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            int inputgetal = Integer.parseInt(input);

            System.out.println(getallen[inputgetal]);


        }
    }
}
