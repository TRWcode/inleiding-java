package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvakNamen = new TextField("",20);

    TextField tekstvakNummers = new TextField("",20);

    Button okknop = new Button("Ok");

    String[] namen = new String[10];

    String[] nummers = new String[10];



    int teller;
    int y;

    

    public void init() {
        y = 150;
        teller = 0;
        add(tekstvakNamen);
        tekstvakNamen.addActionListener(new ok());


        add(tekstvakNummers);
        tekstvakNummers.addActionListener(new ok());

        add(okknop);
        okknop.addActionListener(new ok());


    }


    public void paint(Graphics g) {
        tekstvakNamen.setLocation(20,50);
        tekstvakNummers.setLocation(200,50);
        okknop.setLocation(20,80);


        g.drawString("voer naam en telefoon nummer hier onder",20,20);

        if (teller == 10) {
            for (int i = 0; i <teller ; i++) {
                g.drawString("" + namen[i]  ,20,y );
                g.drawString(""+ nummers[i]  ,100,y);

                y +=20;
            }
        }


    }

    class ok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String inputNamen = tekstvakNamen.getText();

            String inputTel = tekstvakNummers.getText();


            namen[teller] = inputNamen;
            nummers[teller] = inputTel;
            teller ++;

            tekstvakNamen.setText("");
            tekstvakNummers.setText("");


            repaint();
        }
    }

}
