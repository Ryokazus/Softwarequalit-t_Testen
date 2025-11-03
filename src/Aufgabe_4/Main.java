package Aufgabe_4;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] a1 = TestDriver.generateData(1000, 42);
        Double[] a2 = new Double[1000];
        Double[] a3 = new Double[1000];
        Double[] a4 = new Double[1000];
        for (int i = 0; i < 1000;i++){
            a2[i] = (double)i;
            a3[i] =(double) 1000 + i;
            a4[i] = (double)42;
        }



        Duration t1 = TestDriver.measure(new InsertionSorter<Double>(), a1, 10);
        System.out.println("Array 1: "+ t1.toSeconds());
        Duration t2 = TestDriver.measure(new InsertionSorter<Double>(), a2, 10);
        Duration t3 = TestDriver.measure(new InsertionSorter<Double>(), a3, 10);
        Duration t4 = TestDriver.measure(new InsertionSorter<Double>(), a4, 10);
    }
}
