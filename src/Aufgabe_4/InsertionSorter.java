package Aufgabe_4;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public void sort(T[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (lt(data, j + 1, j)) {
                    swap(data, j + 1, j);
                } else break;
            }
        }
    }
}
