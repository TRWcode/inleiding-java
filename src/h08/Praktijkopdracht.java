package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    Button keerknop, delenknop, plusknop, minknop;

    TextField tekstvak1, tekstvak2;


    double uitkomst;


    public void init() {
        //knoppen
        keerknop = new Button("*");
        add(keerknop);
        keerknop.addActionListener(new keerKnop());

        delenknop = new Button("/");
        add(delenknop);
        delenknop.addActionListener(new delenKnop());

        plusknop = new Button("+");
        add(plusknop);
        plusknop.addActionListener(new plusKnop());

        minknop = new Button("-");
        add(minknop);
        minknop.addActionListener(new minKnop());

        //invul vakken
        tekstvak1 = new TextField("",10);
        add(tekstvak1);

        tekstvak2 = new TextField("",10);
        add(tekstvak2);

    }


    public void paint(Graphics g) {
        keerknop.setLocation(220,20);

        delenknop.setLocation(240,20);

        plusknop.setLocation(260,20);

        minknop.setLocation(280,20);

        //invulvakken

        tekstvak1.setLocation(20,20);
        tekstvak1.setText("");

        tekstvak2.setLocation(120,20);


    }


    class keerKnop implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            String input1 = tekstvak1.getText();
            double input1Double = Double.parseDouble(input1);

            String input2 = tekstvak2.getText();
            double input2Double = Double.parseDouble(input2);
            uitkomst = input1Double * input2Double;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class delenKnop implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input1 = tekstvak1.getText();
            double input1Double = Double.parseDouble(input1);

            String input2 = tekstvak2.getText();
            double input2Double = Double.parseDouble(input2);
            uitkomst = input1Double / input2Double;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class plusKnop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak1.getText();
            double input1Double = Double.parseDouble(input1);

            String input2 = tekstvak2.getText();
            double input2Double = Double.parseDouble(input2);
            uitkomst = input1Double + input2Double;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class minKnop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak1.getText();
            double input1Double = Double.parseDouble(input1);

            String input2 = tekstvak2.getText();
            double input2Double = Double.parseDouble(input2);
            uitkomst = input1Double - input2Double;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

}
