package Aufgabe_1;

import java.util.Arrays;

public class Primes {
    public static void main(String[] args){
        int[] primeNumbers = primes(19);
        System.out.println(Arrays.toString(primeNumbers));
    }

    static int[] primes(int n){
        boolean[] numbers = sieve(n);
        System.out.println(Arrays.toString(numbers));
        //Primzahlen zählen
        int count = 0;
        for(int i = 0; i <= n; i++){
            if (numbers[i]) count++;
        }
        System.out.println("Es gibt " + count + " Primzahlen von 0 bis " + n );

        // PrimzahlArray erstellen
        int[] primeInt = new int[count];
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]) {
                primeInt[count] = i;
                count++;
            }
        }

        return primeInt;
    }

    static boolean[] sieve(int n) {
        boolean[] numbers = new boolean[n + 1];

        //erstmal ganzen array auf false setzen (werden dann die primzahlen)
        for (int p = 0; p <= n; p++) {
            numbers[p] = true;
        }
        numbers[0] = false;
        numbers[1] = false;

        for (int i = 2; i <=n;){
            //die vielfachen markieren
            if ((i * i) < n) {
                for (int j = i * i; j <= n; j = (j + i)) {
                    numbers[j] = false;
                }
                //kleinste Zahl die noch nicht markiert ist
                for (int k = i; k <= n; k++) {
                    if (numbers[k]) {
                        i = k;
                        break;
                    }
                }
            }
            i++;
        }
        return numbers;
    }
}
