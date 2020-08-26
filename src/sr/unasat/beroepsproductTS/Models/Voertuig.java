package sr.unasat.beroepsproductTS.Models;

public class Voertuig {
    private int volgNummer;
    private String kenTekenNummer;
    private int priority;
    private static int kentekenNummerBegin = 2020;
    public int stackSize = 0;

    public int getStackSize() {
        return stackSize;
    }

    public String createKentekenNummer(){
        if(priority<=3){
            switch (priority){
                case 1: kenTekenNummer = "POLITIE";
                    break;
                case 2: kenTekenNummer = "BRANDWEER";
                    break;
                case 3: kenTekenNummer = "AMBULANCE";
                    break;
            }
            return kenTekenNummer;
        }
        String kenTekenNm = "SU-"+kentekenNummerBegin;
        return kenTekenNm;
    }

    public Voertuig(int volgNummer, int priority) {
        this.volgNummer = volgNummer;
        this.priority = priority;
        this.kentekenNummerBegin = kentekenNummerBegin+5;
        this.kenTekenNummer = createKentekenNummer();
    }

    public int getVolgNummer() {
        return volgNummer;
    }

    public void setVolgNummer(int volgNummer) {
        this.volgNummer = volgNummer;
    }

    public String getKenTekenNummer() {
        return kenTekenNummer;
    }

    public void setKenTekenNummer(String kenTekenNummer) {
        this.kenTekenNummer = kenTekenNummer;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


}
