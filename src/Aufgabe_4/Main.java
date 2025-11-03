package Aufgabe_4;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSorter sorter = new InsertionSorter<Double>();
        Double[] a1 = TestDriver.generateData(1000, 42);
        Double[] a2 = new Double[1000];
        Double[] a3 = new Double[1000];
        Double[] a4 = new Double[1000];

        for (int i = 0; i < 1000;i++){
            a2[i] = (double)i;
            a3[i] =(double) 1000 - i;
            a4[i] = (double)42;
        }


        System.out.println("Zeiten bei InsertionSort:");
        Duration t1 = TestDriver.measure(sorter, a1, 10);
        System.out.println("Zufällig: "+ t1.toSeconds());
        Duration t2 = TestDriver.measure(sorter, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toSeconds());
        Duration t3 = TestDriver.measure(sorter, a3, 10);
        System.out.println("Abstigend: "+ t3.toSeconds());
        Duration t4 = TestDriver.measure(sorter, a4, 10);
        System.out.println("Gleich: "+ t4.toSeconds());
        System.out.println();
    }
}
