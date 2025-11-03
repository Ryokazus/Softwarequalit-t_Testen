package Aufgabe_4;

public class BubbleSorter <T extends Comparable<T>> implements Sorter<T>{

    @Override
    public void sort(T[] data) {
        for(int i = data.length; i > 0; i--){
            boolean swapped = false;
            for(int j = 1;j< i;j++){
                if(lt(data,j, j-1)){
                    swap(data, j, j-1);
                    swapped =true;
                }
            }
            if(!swapped) return;
        }
    }
}
