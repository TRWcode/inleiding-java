package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField [] teksvakken = new TextField[5];

    Button button;


    public void init() {
        button = new Button("Ok");
        add(button);
        button.addActionListener(new ok());

        for (int i = 0; i <teksvakken.length ; i++) {
            teksvakken[i] = new TextField("",5);


            teksvakken[i].addActionListener(new ok());
            add(teksvakken[i]);
        }
    }


    public void paint(Graphics g) {
        button.setLocation(20,60);



    }

    class ok implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int [teksvakken.length];
            for (int i = 0; i < teksvakken.length; i++) {
                getallen[i] = Integer.parseInt(teksvakken[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < getallen.length; i++) {
                teksvakken[i].setText("" + getallen[i]);

            }

        }
    }
}
