package Aufgabe_4;

public class SelectionSorter2 <T extends Comparable<T>> implements Sorter<T>{
    @Override
    public void sort(T[] data) {
        for(int i = 0; i < data.length-1; i++){
            int min = i;
            int max = i;
            int m = data.length -1;     //Gegenstück zu i
            for(int j = i + 1; j < data.length; j++){
                if(lt(data, j, min)){
                    min = j;
                }
                else{
                    max = j;
                }
            }
            swap(data, i, min);     //kleinste swappen
            swap(data, m, max);     //größte swappen
            m--;
            if(m <= i) return;
        }
    }
}

