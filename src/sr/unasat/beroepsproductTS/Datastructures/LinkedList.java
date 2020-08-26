package sr.unasat.beroepsproductTS.Datastructures;

import sr.unasat.beroepsproductTS.Models.Voertuig;

public class LinkedList {
    private Link first;
    private Link last;
    private int Items;

    public LinkedList() {
        this.first = null;
        this.last = null;
        Items=0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(Voertuig voertuig){
        Link newLink = new Link(voertuig);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public void insertLast(Voertuig voertuig) {
        Link newLink = new Link(voertuig);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
        Items++;
    }

    public void insertFirst(Voertuig voertuig){
        Link newLink = new Link(voertuig);
        newLink.next = first;
        first = newLink;
    }


    public Voertuig deleteFirst(){
        Voertuig vt = first.voertuig;
        if(first.next == null)
            last = null;
        first = first.next;
        return vt;
    }

    public Link deletePriority(int key){
        Link current = first;
        Link previous = first;
        while (current.voertuig.getPriority() != key)
        {
            if(current.next==null)
                return null;
            else
            {
                previous = current;
                current = current.next;
            }
        }
        if(current==first)
            first = first.next;
        else
            previous.next = current.next;
        return current;

    }

    public void displayList(){
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(int key){
        Link current = first;
        while (current.voertuig.getPriority()!= key)
        {
            if (current.next == null)
            current.displayLink();
            else
                current = current.next;
        }
        return current;
    }

    public void displayLink(){
        Link current = first;
        if(current!= null)
        {
            current.displayLink();
        }
    }

    public Voertuig getVoertuig(){
        Voertuig vt = first.getVoertuig();
        return vt;
    }

    /*public void displayPriorityLink(int key){
        Link current = first;
        if(current.voertuig.getPriority()== key)
        {
            System.out.println("Priority Check:");
            current.displayLink();
        }
    }*/

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public Link getLast() {
        return last;
    }

    public void setLast(Link last) {
        this.last = last;
    }

    public int getItems() {
        return Items;
    }

    public void setItems(int items) {
        Items = items;
    }
}

