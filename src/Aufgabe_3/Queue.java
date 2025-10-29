package Aufgabe_3;

public interface Queue <T> {
    void enqueue(T item);
    T dequeue();
    boolean isFull();
    boolean isEmpty();
    int size();
}
