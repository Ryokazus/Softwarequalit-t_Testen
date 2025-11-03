package Aufgabe_4;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] a1 = TestDriver.generateData(10000, 42);
        Double[] a2 = new Double[10000];
        Double[] a3 = new Double[10000];
        Double[] a4 = new Double[10000];

        for (int i = 0; i < 10000;i++){
            a2[i] = (double)i;
            a3[i] =(double) 10000 - i;
            a4[i] = (double)42;
        }

        InsertionSorter inSorter = new InsertionSorter<Double>();
        System.out.println("Zeiten in ms bei InsertionSort:");
        Duration t1 = TestDriver.measure(inSorter, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        Duration t2 = TestDriver.measure(inSorter, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        Duration t3 = TestDriver.measure(inSorter, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        Duration t4 = TestDriver.measure(inSorter, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();
/**
        SelectionSorter selSorter = new SelectionSorter<Double>();
        System.out.println("Zeiten in ms bei SelectionSort:");
        t1 = TestDriver.measure(selSorter, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        t2 = TestDriver.measure(selSorter, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        t3 = TestDriver.measure(selSorter, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        t4 = TestDriver.measure(selSorter, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();

        BubbleSorter bubSorter = new BubbleSorter<Double>();
        System.out.println("Zeiten in ms bei BubbleSort:");
        t1 = TestDriver.measure(bubSorter, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        t2 = TestDriver.measure(bubSorter, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        t3 = TestDriver.measure(bubSorter, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        t4 = TestDriver.measure(bubSorter, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();

        SelectionSorter2 selSorter2 = new SelectionSorter2<Double>();
        System.out.println("Zeiten in ms bei verbesserten SelectionSort:");
        t1 = TestDriver.measure(selSorter2, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        t2 = TestDriver.measure(selSorter2, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        t3 = TestDriver.measure(selSorter2, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        t4 = TestDriver.measure(selSorter2, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();

        InsertionSorter2 inSorter2 = new InsertionSorter2<Double>();
        System.out.println("Zeiten in ms bei verbesserten Insertionsort:");
        t1 = TestDriver.measure(inSorter2, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        t2 = TestDriver.measure(inSorter2, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        t3 = TestDriver.measure(inSorter2, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        t4 = TestDriver.measure(inSorter2, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();
 **/

        InsertionSorter3 inSorter3 = new InsertionSorter3<Double>();
        System.out.println("Zeiten in ms bei verbesserten Insertionsort:");
        t1 = TestDriver.measure(inSorter3, a1, 10);
        System.out.println("Zufällig: "+ t1.toMillis());
        t2 = TestDriver.measure(inSorter3, a2, 10);
        System.out.println("Aufsteigend: "+ t2.toMillis());
        t3 = TestDriver.measure(inSorter3, a3, 10);
        System.out.println("Absteigend: "+ t3.toMillis());
        t4 = TestDriver.measure(inSorter3, a4, 10);
        System.out.println("Gleich: "+ t4.toMillis());
        System.out.println();
    }
}
