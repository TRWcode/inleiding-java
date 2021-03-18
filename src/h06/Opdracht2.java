package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int seconde, uur, dag, jaar;
    int secondeuitkomstuur, secondeuitkomstdag, secondeuitkomstjaar;


        public void init() {
            seconde = 1;
            uur = 3600;
            dag = 86400;
            jaar = 31536000;
            secondeuitkomstuur = uur / seconde;
            secondeuitkomstdag = dag / seconde;
            secondeuitkomstjaar = jaar / seconde;
        }

        public void paint(Graphics g) {
            //uurberekening
            String uurberekening = uur + "/" + seconde + "=" + secondeuitkomstuur;
            g.drawString(uurberekening,20,20);
           // dag berekening
            String dagberekening = dag + "/" + seconde + "=" + secondeuitkomstdag;
            g.drawString(dagberekening,20,40);

            // jaar berkening
            String jaarberekening = jaar + "/" + seconde + "=" + secondeuitkomstjaar;
            g.drawString(jaarberekening,20,60);


            // OPMERKING ik denk niet dat ik het goed heb gedaan.
            // volgens mij willen jullie andere berekeningen ook zien maar weet niet prcies wat jullie kwa berekingening willen zien. en wat ik allemaal moet bijvoegen.
            // Ik laat het maar even zo want verspeel denk mijn tijd en denk te moeilijk :D
            // Ik neem het wel mee voor maandag 22/03/2021 opschool want wil het graag goed begrijpen
            // Ik ga nu door met H7 en H8 want kom er ook niet helemaal uit met opdracht 3 en de praktijkopdracht.
        }
    }
