package Aufgabe_3;

public class RingBuffer<T> implements Queue<T> {
    private T[] storage;
    private int start = 0;
    private int end = 0;

    public RingBuffer(int capacity){
        storage = (T[]) new Object [capacity];
    }

    public void enqueue(T item){
        if(isFull()){
            storage[start] = item;
        }
        else {
            storage[end] = item;
            end = (end + 1) % storage.length;
        }
    }

    @Override
    public T dequeue() {
        if(storage[start] != null){
            T item = storage[start];
            storage[start] = null;
            start = (start + 1) % storage.length;
            return item;
        }
        return null;
    }

    public int size(){
        return isFull()? storage.length : (end - start + storage.length) % storage.length;
    }

    @Override
    public boolean isFull() {
        return end == storage.length && storage[start] != null;
    }

    @Override
    public boolean isEmpty() {
        return storage[start] == null;
    }
}
