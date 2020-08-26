package sr.unasat.beroepsproductTS.Datastructures;

import sr.unasat.beroepsproductTS.Models.Voertuig;

public class LinkedListQueue {
    private LinkedList theList;
    int Items;
    public LinkedListQueue(){
        theList = new LinkedList();
        Items = 0;
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void insert(Voertuig voertuig){
        theList.insertLast(voertuig);
        Items++;
    }

    public Voertuig remove(){
        return theList.deleteFirst();
    }

    public Link removePriority(int key){
        return theList.deletePriority(key);
    }

    public void displayQueue(){
        theList.displayList();
    }

    public void displayVoertuig(){
        theList.displayLink();
    }

    public LinkedList getTheList() {
        return theList;
    }

    public void setTheList(LinkedList theList) {
        this.theList = theList;
    }

    public int getItems() {
        return Items;
    }

    public void setItems(int items) {
        Items = items;
    }
}
