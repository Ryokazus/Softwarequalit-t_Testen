package Aufgabe_4;

public class InsertionSorter implements  Sorter<T>{
    @Override
    public void sort(T[] data) {
        for(int i = 1; i < data.length; i++){
            for(int j = i-1; j > 0; j--){
                if(lt(data, i, j)){
                    swap(data, i ,j);
                }
                else break;
            }
        }
    }

    @Override
    public void swap(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    @Override
    public boolean lt(T[] data, int i, int j) {
        return data[j] > data[i];
    }
}
