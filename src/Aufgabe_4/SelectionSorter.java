package Aufgabe_4;

public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] data) {
        for(int i = 0; i < data.length; i++){
            int min = i;
            for(int j = i + 1; j < data.length; j++){
                if(lt(data, j, min)){
                    min = j;
                }
            }
            swap(data, i, min);
        }
    }
}
