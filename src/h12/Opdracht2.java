package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    Button [] buttons = new Button[25];



    public void init() {
        setSize(1000,800);

            for (int i = 0; i <buttons.length ; i++) {

                buttons[i] = new Button("25 knoppen");
                add(buttons[i]);
            }

    }

    @Override
    public void paint(Graphics g) {

    }
}

