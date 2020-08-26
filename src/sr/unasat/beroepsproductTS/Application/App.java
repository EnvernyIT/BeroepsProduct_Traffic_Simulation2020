package sr.unasat.beroepsproductTS.Application;

import sr.unasat.beroepsproductTS.Models.Voertuig;
import sr.unasat.beroepsproductTS.Models.Wegdek;
import sr.unasat.beroepsproductTS.Services.SimulatieVerkeerService;

public class App {
    public static final Wegdek[] WEGDEK = {new Wegdek("Noorden", 0), new Wegdek("Zuiden", 1), new Wegdek("Oosten", 2), new Wegdek("Westen", 3)};


    public static void main(String[] args) {
        int wegdekRondeTeller;
        System.out.println("--------------------BEGIN TEMPORARY SIMULATION--------------------");
        System.out.println(" ");
        //Noorden Wegdek
        WEGDEK[0].insertVoertuig(new Voertuig(1, 4));
        WEGDEK[0].insertVoertuig(new Voertuig(2, 4));
        WEGDEK[0].insertVoertuig(new Voertuig(3, 3));
        WEGDEK[0].insertVoertuig(new Voertuig(4, 4));

        //Zuiden Wegdek
        WEGDEK[1].insertVoertuig(new Voertuig(1, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(2, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(3, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(4, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(5, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(6, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(7, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(8, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(9, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(10, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(11, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(12, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(13, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(14, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(15, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(16, 4));
        WEGDEK[1].insertVoertuig(new Voertuig(17, 2));
        WEGDEK[1].insertVoertuig(new Voertuig(18, 4));

        //Oosten Wegdek
        WEGDEK[2].insertVoertuig(new Voertuig(1, 4));
        WEGDEK[2].insertVoertuig(new Voertuig(2, 4));
        WEGDEK[2].insertVoertuig(new Voertuig(3, 4));
        WEGDEK[2].insertVoertuig(new Voertuig(4, 4));
        WEGDEK[2].insertVoertuig(new Voertuig(5, 4));

        //Westen Wegdek
        WEGDEK[3].insertVoertuig(new Voertuig(1, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(2, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(3, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(4, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(5, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(6, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(7, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(8, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(9, 1));
        WEGDEK[3].insertVoertuig(new Voertuig(10, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(11, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(12, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(13, 4));
        WEGDEK[3].insertVoertuig(new Voertuig(14, 4));

        SimulatieVerkeerService svs = new SimulatieVerkeerService();
        System.out.println("Aantal voertuigen van Wegdek " + WEGDEK[0].getWegdekNaam() + " is " + WEGDEK[0].getAantalVoertuigen());
        System.out.println("Aantal voertuigen van Wegdek " + WEGDEK[1].getWegdekNaam() + " is " + WEGDEK[1].getAantalVoertuigen());
        System.out.println("Aantal voertuigen van Wegdek " + WEGDEK[2].getWegdekNaam() + " is " + WEGDEK[2].getAantalVoertuigen());
        System.out.println("Aantal voertuigen van Wegdek " + WEGDEK[3].getWegdekNaam() + " is " + WEGDEK[3].getAantalVoertuigen());
        System.out.println(" ");
        //Display Voertuigen Queue
        svs.displayVoertuigenQueue(WEGDEK[0]);
        svs.displayVoertuigenQueue(WEGDEK[1]);
        svs.displayVoertuigenQueue(WEGDEK[2]);
        svs.displayVoertuigenQueue(WEGDEK[3]);
        //Oprijden Voertuigen met hoge priority
        System.out.println(" ");
        System.out.println("---------------De Politie zal eerst op rijden---------------");
        System.out.println("---------------De Brandweer zal eerst op rijden---------------");
        System.out.println("---------------De Ambulance zal eerst op rijden---------------");
        System.out.println(" ");
        svs.oprijdenPolitie(WEGDEK[3]);
        svs.oprijdenBrandweer(WEGDEK[1]);
        svs.oprijdenAmbulance(WEGDEK[0]);
        //Display Voertuigen Queue
        svs.displayVoertuigenQueue(WEGDEK[0]);
        svs.displayVoertuigenQueue(WEGDEK[1]);
        svs.displayVoertuigenQueue(WEGDEK[2]);
        svs.displayVoertuigenQueue(WEGDEK[3]);

        while(WEGDEK[0].getAantalVoertuigen()>0||WEGDEK[1].getAantalVoertuigen()>0||WEGDEK[2].getAantalVoertuigen()>0||WEGDEK[3].getAantalVoertuigen()>0){
            svs.runTraffic(WEGDEK[0]);
            svs.runTraffic(WEGDEK[1]);
            svs.runTraffic(WEGDEK[2]);
            svs.runTraffic(WEGDEK[3]);
        }

        //Display Voertuigen Queue
        svs.displayVoertuigenQueue(WEGDEK[0]);
        svs.displayVoertuigenQueue(WEGDEK[1]);
        svs.displayVoertuigenQueue(WEGDEK[2]);
        svs.displayVoertuigenQueue(WEGDEK[3]);

        int i = svs.getWegdekRondeTeller();
        int k = svs.getWegdekOverslaanTeller();
        double j = k / 2;
        System.out.println(" ");
        System.out.println("Totale Rondes: " + j + " keren.");
        System.out.println("Aantal keren dat de stoplichten zijn gegaan: " + i);
        System.out.println(" ");
        System.out.println("-------------------------Einde Traffic Simulation-------------------------");
        System.out.println(" ");

        //Reverse Play-----------------------------------------------------------------------------------------------

        System.out.println(" ");
        System.out.println("--------------------Begin Reverse Traffic Simulation Play-------------------- ");
        System.out.println(" ");
        System.out.println(" ");

        svs.terugOprijdenAmbulanceStack(WEGDEK[0]);
        svs.terugOprijdenBrandweerStack(WEGDEK[1]);
        svs.terugOprijdenPolitieStack(WEGDEK[3]);

        while(WEGDEK[3].getAantalVoertuigenStack()>0||WEGDEK[2].getAantalVoertuigenStack()>0||WEGDEK[1].getAantalVoertuigenStack()>0||WEGDEK[0].getAantalVoertuigenStack()>0) {
            svs.runReverseTraffic(WEGDEK[3]);
            svs.runReverseTraffic(WEGDEK[2]);
            svs.runReverseTraffic(WEGDEK[1]);
            svs.runReverseTraffic(WEGDEK[0]);
        }
        //Einde Reverse
       svs.eindeReverse();
    }
}
