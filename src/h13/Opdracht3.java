package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    Button rodemuur = new Button("Rood");

    Button grijzemuur = new Button("Grijs");

    int x = 0;
    int x2 = 0;
    int x3 = 0;

    int y = 0;
    int y2 = 0;
    int y3 = 0;

    int width = 0;
    int height = 0;

   Color kleurrood, kleurgrijs;



    public void init() {
        setSize(1000,800);
        kleurrood = Color.red;
        kleurgrijs = Color.gray;

        add(rodemuur);
        rodemuur.addActionListener(new rood());
        add(grijzemuur);

        grijzemuur.addActionListener(new grijs());


    }


    public void paint(Graphics g) {
        muurmaken(g);



    }


    public void muurmaken (Graphics g){


        for (int i = 0; i <3 ; i++) {
            g.setColor(kleurrood);
            g.fillRect(x,y,width,height);
            g.setColor(Color.black);
            g.drawRect(x,y,width,height);
            x += 100;
        }

        for (int i2 = 0; i2 <5 ; i2++) {
            g.setColor(kleurrood);
            g.fillRect(x2,y2,width,height);
            g.setColor(Color.black);
            g.drawRect(x2,y2,width,height);

            x2 += 100;


        }

        for (int i3 = 0; i3 <7 ; i3++) {
            g.setColor(kleurrood);
            g.fillRect(x3, y3, width, height);
            g.setColor(Color.black);
            g.drawRect(x3, y3,width,height);

            x3 += 100;

        }
    }



    class rood implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x = 300;
            x2 = 200;
            x3 = 100;
            y = 100;
            y2 = 140;
            y3 = 180;

            width = 100;
            height = 40;


            repaint();
        }
    }

    class grijs implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            x = 300;
            x2 = 200;
            x3 = 100;
            y = 100;
            y2 = 180;
            y3 = 260;


            width = 100;
            height = 80;

            kleurrood = kleurgrijs;






            repaint();
        }

    }

}
