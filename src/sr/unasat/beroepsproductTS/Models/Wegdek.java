package sr.unasat.beroepsproductTS.Models;

import sr.unasat.beroepsproductTS.Datastructures.Link;
import sr.unasat.beroepsproductTS.Datastructures.LinkedListPriorityQueue;
import sr.unasat.beroepsproductTS.Datastructures.LinkedListQueue;
import sr.unasat.beroepsproductTS.Datastructures.LinkedListStack;

public class Wegdek {
    String wegdekNaam;
    int wegdekIndex;
    int aantalVoertuigen;
    int aantalVoertuigenStack;
    LinkedListQueue voertuigenQueue = new LinkedListQueue();
    LinkedListStack voertuigenStack = new LinkedListStack();

    public Wegdek(String wegdekNaam, int wegdekIndex) {
        this.wegdekNaam = wegdekNaam;
        this.wegdekIndex = wegdekIndex;
        aantalVoertuigen = 0;
    }

    public boolean wegdekEmpty(){
        return voertuigenQueue.isEmpty()&&aantalVoertuigen==0;
    }

    public boolean wegdekStackEmpty(){
        return voertuigenStack.isEmpty();
    }

    public void insertVoertuig(Voertuig voertuig){
        voertuigenQueue.insert(voertuig);
        voertuigenStack.push(voertuig);
        aantalVoertuigen++;
        aantalVoertuigenStack++;
    }

    /*public void insertPriorityVoertuigen(Voertuig voertuig){
        voertuigenPriority.insertPriorityQueue(voertuig);
    }*/

    public void removePriorityVoertuigen(int i){
        voertuigenQueue.removePriority(i);
        aantalVoertuigen--;
    }

    public void oprijden(int i) {
            switch (i) {
                case 1:
                    oprijden1();
                    break;
                case 2:
                    oprijden2();
                    break;
                case 3:
                    oprijden3();
                    break;
                case 4:
                    oprijden4();
                    break;
            }
        }


    public void oprijden1(){
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }

    public void oprijden7() {
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }

    public void oprijden5() {
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }

    public void oprijden4(){
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }

    public void oprijden3(){
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }
    public void oprijden2(){
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
        System.out.println("Volgende auto mag oprijden:");
        voertuigenQueue.displayVoertuig();
        voertuigenQueue.remove();
        aantalVoertuigen--;
    }


    public void displayWegdek(){
        voertuigenQueue.displayQueue();
    }

    public void displayWegdekStack(){
        voertuigenStack.displayStack();
    }

    public void terugRijden7(){
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }

    public void terugRijden5(){
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }
    public void terugRijden4(){
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }
    public void terugRijden3(){
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }
    public void terugRijden2(){
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }
    public void terugRijden1() {
        voertuigenStack.peek();
        System.out.println("Mag terug op zijn plaats.");
        voertuigenStack.pop();
    }

    public int getAantalVoertuigen() {
        return aantalVoertuigen;
    }

    public void setAantalVoertuigen(int aantalVoertuigen) {
        this.aantalVoertuigen = aantalVoertuigen;
    }

    public String getWegdekNaam() {
        return wegdekNaam;
    }

    public void setWegdekNaam(String wegdekNaam) {
        this.wegdekNaam = wegdekNaam;
    }

    public int getWegdekIndex() {
        return wegdekIndex;
    }

    public void setWegdekIndex(int wegdekIndex) {
        this.wegdekIndex = wegdekIndex;
    }

    public int getAantalVoertuigenStack() {
        return aantalVoertuigenStack;
    }
}
