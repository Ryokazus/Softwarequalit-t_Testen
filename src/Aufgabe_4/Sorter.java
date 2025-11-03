package Aufgabe_4;

public interface Sorter <T extends Comparable<T>>{
    void sort(T[] data);

    public default void swap(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public default boolean lt(T[] data, int i, int j) {
        return data[i].compareTo(data[j]) < 0;
    }
}
