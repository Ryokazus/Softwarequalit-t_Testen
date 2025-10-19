package Aufgabe_1;

public class verketteteListe {

    //Aufgabe 1-3.1:
    private static class Node<T> {
        T item;
        Node<T> next;
    }

    private static class DoubleNode<T> {
        T item;
        DoubleNode<T> previous;
        DoubleNode<T> next;
    }

    public static void main(String[] args) {
        Node first = new Node<String>();
        first.item = "the first";

        Node second = new Node<String>();
        first.next = second;
        second.item = ",";

        Node last = new Node<String>();
        last.item = "the last";

        main2();
        main3(first, last);
    }

    public static void main2() {
        DoubleNode first = new DoubleNode<String>();
        first.item = "the first";

        DoubleNode second = new DoubleNode <String>();
        first.next = second;
        second.previous = first;
        second.item = ",";

        DoubleNode last = new DoubleNode <String>();
        second.next = last;
        last.previous= second;
        second.item = "the last";
    }

    public static void main3(Node first, Node last) {
        AddBorder (true, new Node<String>(), "Ein Note an der Grenze (Anfang)");

        RemoveBorder(true, first, last);

        Node newNode = new Node<String>();
        newNode.item = "neuer Knoten";
        AddNode(newNode);

        RemoveNode(first, first.next);
    }

/*Aufgabe 1-3.2:
-> second next wird auf ein neues Node gesetzt.
Da keins mehr auf last zeigt, wird es vom Garbagecollector später vernichtet
*/

//Aufgabe1-3.5:
    /**
     * Funktion um Knoten am Anfang oder Ende einzufügen
     *
     * @param begin Ort wo eigefügt werden soll (true-> Anfang, false -> Ende)
     * @param knoten der Anfangsknoten oder Endknoten, je nach Auswahl von 'begin'
     * @param data String als Inhalt für neuen Knoten
     */
private static void AddBorder(boolean begin, Node knoten, String data) {
    if (begin) {
        Node newfirst= new Node <String>();
        newfirst.next = knoten;
        newfirst.item = data;
    } else {
        Node newold = new Node <String>();
        knoten.next = newold;
        newold.item = data;
    }
}

    /**
     * @param begin true -> Anfang, false -> Ende
     * @param first first Knoten
     * @param last first Knoten
     */
    private static void RemoveBorder(boolean begin, Node first, Node last) {
        if (begin) {
            first = first.next;
        } else {
            Node vorletzte = first;
            while (first.next.next != null) {
                vorletzte = vorletzte.next;
            }
            vorletzte.next = null;
        }
    }

    private static void AddNode(Node node) {
        Node newNode = new Node<String>();
        newNode.next = node.next;
        node.next = newNode;
    }

    /**
     * Funktion zum löschen von Nodes zwischen dem first und last Node
     * @param first first Node
     * @param toRemove Node, der entfernt werden soll
     */
    private static void RemoveNode(Node first, Node toRemove) {
        Node current = new Node<String> ();
        current = first;
        while(current.next != toRemove) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}