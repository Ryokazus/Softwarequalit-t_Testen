package Aufgabe_3;

public interface Deque <T>{
    boolean isEmpty();
    int size();
    void pushLeft(T item);
    void pushRight(T item);
    T popLeft();
    T popRight();
}
