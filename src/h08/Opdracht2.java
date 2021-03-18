package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    //titel
    Label titel ;
    //buttons
    Button aantalmannen;
    Button aantalvrouwen;
    Button potentielevrouwen;
    Button potentielemannen;

    //labels

    Label labelmannen;
    Label labelvrouwen;
    Label labelpmannen;
    Label labelpvrouwen;

    //uitkomsten
    int uitkomstmannen, uitkomstvrouwen, uitkomstpmannen, uitkomstpvrouwen;


    public void init() {
        //uitkomsten
        uitkomstmannen = 1;
        uitkomstvrouwen = 1;
        uitkomstpmannen = 1;
        uitkomstpvrouwen = 1;

        //aantal mannen
        aantalmannen = new Button("Mannen");
        add(aantalmannen);
        aantalmannen.addActionListener(new Mannenknop());

        //aantavrouwen
        aantalvrouwen = new Button("Vrouwen");
        add(aantalvrouwen);
        aantalvrouwen.addActionListener(new Vrouwenknop());

        //potentielemannen
        potentielemannen = new Button("Potentiele mannen");
        add(potentielemannen);
        potentielemannen.addActionListener(new Pmannenknop());

        potentielevrouwen = new Button("Potentiele vrouwen");
        add(potentielevrouwen);
        potentielevrouwen.addActionListener(new Pvrouwenknop());


        //labels
        labelmannen = new Label("Mannen: 0");
        add(labelmannen);
        labelvrouwen = new Label("Vrouwen: 0");
        add(labelvrouwen);
        labelpmannen = new Label("Potentiele mannen: 0");
        add(labelpmannen);
        labelpvrouwen = new Label("Potentiele vrouwen: 0");
        add(labelpvrouwen);

    }


    public void paint(Graphics g) {
        //buttons
        aantalmannen.setLocation(10,20);
        aantalmannen.setSize(60,20);

        aantalvrouwen.setLocation(80,20);
        aantalvrouwen.setSize(60,20);

        potentielemannen.setLocation(150,20);
        potentielemannen.setSize(110,20);

        potentielevrouwen.setLocation(270,20);

        //labels
        labelmannen.setLocation(10,60);
        labelmannen.setText("Mannen 0");

        labelvrouwen.setLocation(10,80);
        labelvrouwen.setText("Vrouwen 0");

        labelpmannen.setLocation(10,100);
        labelpmannen.setText("Potentiele mannen 0");

        labelpvrouwen.setLocation(10,120);
        labelpvrouwen.setText("Potentiele vrouwen 0");

    }
//mannen
    class Mannenknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            labelmannen.setText("Mannen " + uitkomstmannen);
            uitkomstmannen++;
        }
    }

    class Vrouwenknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            labelvrouwen.setText("Vrouwen " + uitkomstvrouwen);
            uitkomstvrouwen++;


        }
    }

    class Pmannenknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            labelmannen.setText("Mannen " + uitkomstmannen);
            labelpmannen.setText("Potentiele mannen " + uitkomstpmannen);
            uitkomstmannen++;
            uitkomstpmannen++;
        }
    }

    class Pvrouwenknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            labelvrouwen.setText("Vrouwen " + uitkomstvrouwen);
            labelpvrouwen.setText("Potentiele vrouwen " + uitkomstpvrouwen);
            uitkomstvrouwen++;
            uitkomstpvrouwen++;
        }
    }
}
