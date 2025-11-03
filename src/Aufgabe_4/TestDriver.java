package Aufgabe_4;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
/**
 * Eine Sammlung statischer Methoden zur Untersuchung von Sortierfunktionen.
 * @author Sven Karol
 */
public class TestDriver {
/**
 * Erzeugt ein Array mit pseudo-zufällig generierten Double-Werten.
 * @param count Länge des Arrays
 * @param seed Startpunkt für den Zufallszahlengenerator
 * @return
 */
    public static Double[] generateData(int count, long seed) {
        Random r = new Random(seed);
        Double data[] = new Double[count];
        for (int i = 0; i < count; i++) {
            data[i] = r.nextDouble();
            }
        return data;
        }
/**
 * Erzeugt, sortiert und prüft ein zufällig erzeugtes Array.
 * @param count Größe des Arrays
 * @param sort die Sortierfunktion
 * @return true, wenn eine korrekte Sortierung erzeugt wurde
 */
    public static boolean testSort(int count, Sorter<Double> sort) {
        Double data[] = generateData(count, System.currentTimeMillis());
        sort.sort(data);
        for (int i = 1; i < count; i++) {
            if (data[i - 1] > data[i])
                return false;
            }
        return true;
        }
/**
 * Sortiert Kopien eines gegebenen Arrays n-Mal, misst dabei jeweils die
 * Ausführungszeit und gibt den Mittelwert der Messungen als Zeitspane zurück.
 * @param <T> der Typ der zu sortierenden Daten (z.B. Double)
 * @param sort die zu untersuchende Sortierfunktion
 * @param data ein initialer Satz Daten
 * @param n die Anzahl der Testläufe
 * @return
 */
   public static <T extends Comparable<T>> Duration measure(Sorter<T> sort, T[] data, int n) {
        Duration tspan = Duration.ZERO;
        for (int i = 0; i < n; i++) {
            T copy = data.clone();
            Duration start = Instant.now();
            sort.sort(copy);
            Duration end = Instant.now();
            tspan = tspan.plus(Duration.between(start, end));
            }
        return tspan.dividedBy(n);
        }
}
