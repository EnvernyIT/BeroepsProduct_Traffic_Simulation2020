package sr.unasat.beroepsproductTS.Datastructures;

import sr.unasat.beroepsproductTS.Models.Voertuig;

public class Link {
    public Voertuig voertuig;
    public Link next;

    public Link(Voertuig voertuig) {
        this.voertuig = voertuig;
    }

    public void displayLink(){
        System.out.println("Voertuig Volgnumer: "+voertuig.getVolgNummer()+" met de kentekennummer: "+voertuig.getKenTekenNummer()+" en prioriteit: "+voertuig.getPriority());
    }

    public Voertuig getVoertuig() {
        return voertuig;
    }

    public void setVoertuig(Voertuig voertuig) {
        this.voertuig = voertuig;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
