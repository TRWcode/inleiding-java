package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Button okbutton;

    int talfelnummer = 0;

    String foutmelding;

    public void init() {
        tekstvak = new TextField("",20);
        add(tekstvak);
        tekstvak.addActionListener(new okknop());

        okbutton = new Button("Ok");
        add(okbutton);
        okbutton.addActionListener(new okknop());

        foutmelding = "";

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y =80;

        tekstvak.setLocation(50,20);
        okbutton.setLocation(250,20);

        for (int tafels = 1; tafels < 11; tafels++) {
            g.drawString(tafels + " X " + talfelnummer + " = " + talfelnummer * tafels,x,y);
            y += 20;



        }
        g.drawString("" + foutmelding,x,y);
    }

    class okknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            int inputnumber = Integer.parseInt(input);


            switch (inputnumber) {
                case 1: talfelnummer = 1; break;
                case 2: talfelnummer = 2; break;
                case 3: talfelnummer = 3; break;
                case 4: talfelnummer = 4; break;
                case 5: talfelnummer = 5; break;
                case 6: talfelnummer = 6; break;
                case 7: talfelnummer = 7; break;
                case 8: talfelnummer = 8; break;
                case 9: talfelnummer = 9; break;
                case 10: talfelnummer = 10; break;
                default: foutmelding = "vul cijfer 1 t/m 10 in het tekstvak";
            }
            tekstvak.setText("");
            repaint();
        }
    }
}
