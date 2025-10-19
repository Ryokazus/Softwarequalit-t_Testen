package Aufgabe_1;

/* Algorithmus:
1. Variablen: current, next, arr[]
2. current auf den ersten Datenpunkt setzen, next auf das nächste (hier schon aufhören, wenn kein next gibt)
3. aufsteigend sortiert: Wenn das erste kleiner als zweite, dann setze current = next und next auf den nächsten Datenpunkt
4. absteigend sortiert: Wenn das erste größer ist als das zweite, dann setze current = next und next auf den nächsten Datenpunkt
-> ist dies nicht der fall, wird abgebrochen und es steht fest, dass es nicht sortiert ist
-> wenn es aber funktioniert hat, tut man es  so lange, bis es kein next mehr gibt
*/
public class Aufgabe1_1 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {};
        int[] arr3 = {1};
        int[] arr4 = {2, 1, 3, 4};

        Integer current = null;
        Integer next = null;
        boolean sortiert = true;
        boolean aufsteigend = true;

        int[] arr = arr4;
        int size = arr.length - 1;

        if (size < 1)  {
            System.out.print ("Der Array kann nicht geprüft werden, weil er zu kurz ist");
            System.exit(0);
        }

        for (int i = 0; i < size; i++) {
            current = arr[i];
            next = arr[i+1];

            if ((current > next && aufsteigend) || (current < next && !aufsteigend)) {
                sortiert = false;
                break;
            }
        }

        System.out.print("Der Array ist sortiert: " + sortiert);
    }
}