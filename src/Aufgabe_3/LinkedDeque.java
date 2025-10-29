package Aufgabe_3;

import Aufgabe_1.verketteteListe;

import java.util.NoSuchElementException;

public class LinkedDeque<T> implements Deque<T>{
    private DoubleNode<T> first;
    private DoubleNode<T> last;
    private int n = 0;

    public LinkedDeque(){
        first = new DoubleNode<>();
        last = first;
        first.next = last;
        last.previous = first;
    }

    private static class DoubleNode<T> {
        T item;
        DoubleNode<T> previous;
        DoubleNode<T> next;
    }


    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void pushLeft(T item) {
        DoubleNode<T> oldFirst = first;
        first = new DoubleNode<T>();
        first.item = item;
        first.next = oldFirst;
        oldFirst.previous = first;
        n++;
    }

    @Override
    public void pushRight(T item) {
        DoubleNode<T> oldLast = last;
        last = new DoubleNode<T>();
        last.item = item;
        last.previous = oldLast;
        oldLast.next = last;
        n++;
    }

    @Override
    public T popLeft() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        first.next.previous = null;
        first = first.next;
        n--;
        return first.item;
    }

    @Override
    public T popRight() {
        last.previous.next = null;
        last = last.previous;
        n--;
        return last.item;
    }
}
