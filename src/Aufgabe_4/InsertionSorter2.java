package Aufgabe_4;

public class InsertionSorter2 <T extends Comparable<T>> implements Sorter<T>{
    @Override
    public void sort(T[] data) {
        for(int i = 0; i < data.length - 1;i++){
            int j = i + 1;
            T temp = data[i];
            for(; j < data.length;j++){
                if(lt(data, j, i)){
                    continue;
                }
                else{
                    swap(data, i , j);
                    break;
                }
            }
            data[--j] = temp;
        }
    }
}
