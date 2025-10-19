package Aufgabe_1;

public class Student {
    private final int age;
    private final int matNr;
    private final String name;

    public Student(int age, int matNr, String name) {
        this.age = age;
        this.matNr = matNr;
        this.name = name;
    }

    public static void main(String[] args) {
        boolean aufsteigend = true;
        Boolean[] sortiert = {null, null, null}; // [0]=age, [1]=matNr, [2]=name; null = unsortiert, true = aufsteigend, false = absteigend

        Student[] studenten = {
                new Student(21, 123456, "Karl"),
                new Student(20, 222222, "Alex"),
                new Student(19, 333333, "Basti")
        };
        int n = studenten.length;
        if (n < 2) {
            System.out.print("Der Array ist zu klein um festzustellen, ob er sortiert ist");
            return;
        }


        int[] ages = new int[n];
        int[] matNrs = new int[n];
        String[] names = new String[n];

        for(int i = 0; i < n;i++){
            ages[i] = studenten[i].age;
            matNrs[i] = studenten[i].matNr;
            names[i] = studenten[i].name;
        }

        sortiert[0] = compareInt(ages, true);
        sortiert[0] = compareInt(ages, false);
        sortiert[1] = compareInt(matNrs, true);
        sortiert[1] = compareInt(matNrs, false);
        sortiert[2] = compareStr(names, true);
        sortiert[2] = compareStr(names, false);
        Bericht(sortiert);
    }

    private static Boolean compareInt(int[] arr, boolean aufsteigend) {
        int n = arr.length -1;
        if (aufsteigend) {
            for (int i = 0; i < n; i++){
                if (arr[i] > arr[i+1]){
                    return null;
                }
            }
        }
        else {
            for (int i = 0; i < n; i++){
                if (arr[i] < arr[i+1]){
                    return null;
                }
            }
        }
        return aufsteigend;
    }

    private static Boolean compareStr(String[] arr, boolean aufsteigend) {
        int n = arr.length -1;
        if (n < 2) {
            return null;
        }

        for (int i = 0; i < n; i++) {
            if (aufsteigend) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    return null;
                }
            }
            else {
                if (arr[i].compareTo(arr[i + 1]) < 0) {
                    return null;
                }
            }
        }
        return aufsteigend;
    }

    private static void Bericht(Boolean[] sortiert){
        for(int j = 0; j < 3; j++){
            String criteria = "";
            switch(j) {
                case 0:
                    criteria = "Alter";
                    break;
                case 1:
                    criteria = "Matrikelnummer";
                    break;
                case 2:
                    criteria = "Namen";
                    break;
            }

            if (sortiert[j] == null) {
                System.out.println("Die Studenten sind nicht nach " + criteria + " sortiert");
            }
            else {
                if(sortiert[j] == true) {
                    System.out.println("Die Studenten sind nach " + criteria + " aufsteigend sortiert");
                }
                else {
                    System.out.println("Die Studenten sind nach " + criteria + " absteigend sortiert");
                }
            }
        }
    }
}