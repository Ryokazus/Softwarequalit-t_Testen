package Aufgabe_3;

public class ArrayStack<T> implements Stack<T>{
    private T[] storage;
    private int n = 0;


    public ArrayStack(){
        storage = (T[])new Object[10];
    }
    public void push(T item){
        if(n >= storage.length) {
            resize(storage.length * 2);
        }
        storage[n] = item;
        n++;
    }

    @Override
    public T pop() {
        n--;
        T item = storage[n];
        storage[n] = null;

        if(n > 0 && (storage.length / 4 == n)){
            resize(storage.length / 2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    public void resize(int capacity){
        T[]copy = (T[]) new Object[capacity];
        for(int i = 0; i < n;i++){
            copy[i] = storage[i];
        }
        storage = copy;
    }

    public T view(){
        if (n == 0)return null;
        return storage[n - 1];
    }
}
