package Aufgabe_4;

public interface Sorter <T extends Comparable<T>>{
    public void sort(T[] data);

    public default void swap(T[] data, int i, int j){};

    public default boolean lt(T[] data, int i, int j){};
}
