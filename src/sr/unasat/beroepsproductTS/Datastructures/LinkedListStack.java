package sr.unasat.beroepsproductTS.Datastructures;

import sr.unasat.beroepsproductTS.Models.Voertuig;

public class LinkedListStack {
    private LinkedList theList;

    public LinkedListStack(){
        theList = new LinkedList();
    }

    public void push(Voertuig voertuig){
        theList.insertFirst(voertuig);
    }

    public Voertuig pop(){
        return theList.deleteFirst();
    }

    public void peek(){
        theList.displayLink();
    }

    public void priorityPop(int i){
        theList.deletePriority(i);
    }

    public boolean isEmpty(){
        return (theList.isEmpty());
    }

    public void displayStack(){
        theList.displayList();
    }
}
