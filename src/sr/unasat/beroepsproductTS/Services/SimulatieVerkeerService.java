package sr.unasat.beroepsproductTS.Services;

import sr.unasat.beroepsproductTS.Models.Wegdek;

public class SimulatieVerkeerService {
    public static final char[] STOPLICHT = {'N', 'Z', 'O', 'W'};
    int wegdekRondeTeller = 0;
    int wegdekOverslaanTeller;

    public int getWegdekOverslaanTeller() {
        return wegdekOverslaanTeller;
    }

    public void runTraffic(Wegdek wegdek) {
        if (wegdek.getWegdekIndex() == 0) {
            sensorNoord(wegdek);
        } else {
            if (wegdek.getWegdekIndex() == 1) {
                sensorZuid(wegdek);
            } else {
                if (wegdek.getWegdekIndex() == 2) {
                    sensorOost(wegdek);
                } else {
                    if (wegdek.getWegdekIndex() == 3) {
                        sensorWest(wegdek);

                    }
                }
            }
        }
    }

    public void runReverseTraffic(Wegdek wegdek) {
        if (wegdek.getWegdekIndex() == 0) {
            noordenReverse(wegdek);
        } else {
            if (wegdek.getWegdekIndex() == 1) {
                zuidenReverse(wegdek);
            } else {
                if (wegdek.getWegdekIndex() == 2) {
                    oostenReverse(wegdek);
                } else {
                    if (wegdek.getWegdekIndex() == 3) {
                        westenReverse(wegdek);

                    }
                }
            }
        }
    }


    public void displayVoertuigenQueue(Wegdek wegdek) {
        System.out.println("_______________Wegdek " + wegdek.getWegdekNaam() + "'s Queue_______________");
        wegdek.displayWegdek();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" ");
    }

    public void displayVoertuigenStack(Wegdek wegdek) {
        System.out.println("_______________Wegdek " + wegdek.getWegdekNaam() + "'s Stack_______________");
        wegdek.displayWegdekStack();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" ");
    }

    public void oprijdenPolitie(Wegdek wegdek) {
        wegdek.removePriorityVoertuigen(1);
    }

    public void oprijdenBrandweer(Wegdek wegdek) {
        wegdek.removePriorityVoertuigen(2);
    }

    public void oprijdenAmbulance(Wegdek wegdek) {
        wegdek.removePriorityVoertuigen(3);
    }

    public void min(Wegdek wegdek) {
        int i = wegdek.getAantalVoertuigen();
    }

    private void sensorOost(Wegdek wegdek) {
        System.out.println("---------------Sensor 1 verifieert---------------");
        if (wegdek.getAantalVoertuigen() > 0) {
            int i = wegdek.getAantalVoertuigen();
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[2] + " wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else {
            if (wegdek.wegdekEmpty()) {
                System.out.println("---------------Wegdek heeft geen voertuigen---------------");
                System.out.println("---------------Stoplicht" + STOPLICHT[2] + " blijft Rood---------------");
                wegdekOverslaanTeller++;
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println(" ");
            }
        }
    }

    public void sensorZuid(Wegdek wegdek) {
        int i = wegdek.getAantalVoertuigen();
        System.out.println("---------------Sensor 2 verifieert---------------");
        if (wegdek.getAantalVoertuigen() > 10) {
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[1] + " wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden5();
            wegdek.oprijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else if (wegdek.getAantalVoertuigen() >= 5) {
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[1] + " wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else if (wegdek.getAantalVoertuigen() > 0) {
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[1] + " wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden2();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else {
            if (wegdek.wegdekEmpty() && wegdek.getAantalVoertuigen() == 0) {
                System.out.println("---------------Wegdek heeft geen voertuigen---------------");
                System.out.println("---------------Stoplicht " + STOPLICHT[1] + " blijft Rood---------------");
                wegdekOverslaanTeller++;
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println(" ");
            }
        }
    }


    public void sensorWest(Wegdek wegdek) {
        int i = wegdek.getAantalVoertuigen();
        System.out.println("---------------Sensor 3 verifieert---------------");
        if (wegdek.getAantalVoertuigen() > 10) {
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[3] + " Wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden5();
            wegdek.oprijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else if (wegdek.getAantalVoertuigen() > 0) {
            System.out.println("---------------Sensor heeft voertuigen gevonden---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[3] + " Wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden(i);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else {
            if (wegdek.wegdekEmpty()) {
                System.out.println("---------------Wegdek heeft geen voertuigen---------------");
                System.out.println("---------------Stoplicht " + STOPLICHT[3] + " blijft Rood---------------");
                wegdekOverslaanTeller++;
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println(" ");
            }
        }
    }


    private void sensorNoord(Wegdek wegdek) {
        int i = wegdek.getAantalVoertuigen();
        System.out.println("---------------Sensor 4 verifieert---------------");
        if (wegdek.getAantalVoertuigen() > 0) {
            System.out.println("---------------Wegdek heeft voertuigen---------------");
            System.out.println("---------------Stoplicht " + STOPLICHT[0] + " Wordt Groen---------------");
            wegdekRondeTeller++;
            wegdek.oprijden3();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else {
            if (wegdek.wegdekEmpty()) {
                System.out.println("---------------Wegdek heeft geen voertuigen---------------");
                System.out.println("---------------Stoplicht " + STOPLICHT[0] + " Blijft Rood---------------");
                wegdekOverslaanTeller++;
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println(" ");
            }
        }
    }


    //REVERSE PLAY__________________________________________________________________________________
    //REVERSE PLAY__________________________________________________________________________________
    //REVERSE PLAY__________________________________________________________________________________
    //REVERSE PLAY__________________________________________________________________________________

    private void noordenReverse(Wegdek wegdek) {
        System.out.println("---------------Reverse " + wegdek.getWegdekNaam() + " Play Sensor---------------");
        if (wegdek.getAantalVoertuigenStack() == 3) {
            System.out.println("---------------Wegdek " + wegdek.getWegdekNaam() + " Reverse Groep--------------");
            System.out.println("Stoplicht " + wegdek.getWegdekNaam() + "was rood");
            wegdek.terugRijden3();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else if (wegdek.wegdekStackEmpty() || wegdek.getAantalVoertuigenStack() == 0) {
            System.out.println("Wegdek " + wegdek.getWegdekNaam() + " Checkt.");
            System.out.println("---------------Alle voertuigen zijn terug op hun plaats.---------------");
            System.out.println(" ");
        }
    }

    private void westenReverse(Wegdek wegdek){
        System.out.println("---------------Reverse "+wegdek.getWegdekNaam()+" Play Sensor---------------");
        if(wegdek.getAantalVoertuigenStack()==13){
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden3();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        } else if(wegdek.getAantalVoertuigenStack()==10){
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden5();
            wegdek.terugRijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        }
        else{
            if(wegdek.wegdekStackEmpty()||wegdek.getAantalVoertuigenStack()==0){
                System.out.println("Wegdek "+wegdek.getWegdekNaam()+" Checkt.");
                System.out.println("---------------Alle voertuigen zijn terug op hun plaats.---------------");
                System.out.println(" ");
            }
        }

    }

    private void zuidenReverse(Wegdek wegdek){
        System.out.println("---------------Reverse "+wegdek.getWegdekNaam()+" Play Sensor---------------");
        if(wegdek.getAantalVoertuigenStack()==17) {
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden2();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        }  else if(wegdek.getAantalVoertuigenStack()==15){
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        }
        else if(wegdek.getAantalVoertuigenStack()==10){
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden5();
            wegdek.terugRijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        }
        else{
            if(wegdek.wegdekStackEmpty()||wegdek.getAantalVoertuigenStack()==0){
                System.out.println("Wegdek "+wegdek.getWegdekNaam()+" Checkt.");
                System.out.println("---------------Alle voertuigen zijn terug op hun plaats.---------------");
                System.out.println(" ");
            }
        }

    }private void oostenReverse(Wegdek wegdek){
        System.out.println("---------------Reverse "+wegdek.getWegdekNaam()+" Play Sensor---------------");
        if(wegdek.getAantalVoertuigenStack()==5){
            System.out.println("---------------Wegdek "+wegdek.getWegdekNaam()+" Reverse Groep--------------");
            wegdek.terugRijden5();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" ");
        }
        else{
            if(wegdek.wegdekStackEmpty()){
                System.out.println("Wegdek "+wegdek.getWegdekNaam()+" Checkt.");
                System.out.println("---------------Alle voertuigen zijn terug op hun plaats.---------------");
                System.out.println(" ");
            }
        }

    }

    public int getWegdekRondeTeller() {
        return wegdekRondeTeller;
    }

    public void eindeReverse(){
        System.out.println(" ");
        System.out.println("---------------Alle voertuigen zijn terug op hun plaats.---------------");
        System.out.println("---------------------------Einde Reverse.------------------------------");
        System.out.println(" ");
    }

    public void terugOprijdenPolitieStack(Wegdek wegdek) {
        System.out.println("---------------De Politie mag terug op zijn plaats---------------");
        wegdek.removePriorityVoertuigStack(1);
    }

    public void terugOprijdenBrandweerStack(Wegdek wegdek) {
        System.out.println("---------------De Brandweer mag terug op zijn plaats---------------");
        wegdek.removePriorityVoertuigStack(2);
    }

    public void terugOprijdenAmbulanceStack(Wegdek wegdek) {
        System.out.println("---------------De Ambulance mag terug op zijn plaats---------------");
        wegdek.removePriorityVoertuigStack(3);
    }

}
