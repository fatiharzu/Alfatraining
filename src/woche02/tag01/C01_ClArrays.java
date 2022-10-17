package woche02.tag01;

/**
 * Dieses Programm zeigt die Funktionsweise und die Nutzung von Arrays
 *
 * <p>
 * Arrays werden wie folgt deklariert und initialisiert:<br><br>
 * <p>
 * Datentyp[] arrayName = new Datentyp[Arraygröße];        <br>
 * int[] numbers = new int[5];                               <br><br>
 * <p>
 * Datentyp[] arrayName = {                                <br>
 * wert1,                                               <br>
 * wert2,                                               <br>
 * wert3                                                <br>
 * };                                                       <br><br>
 * <p>
 * Arrays sind statische Datenstrukturen mit folgenden Eigenschaften:
 * </p>
 *
 * <ul>
 *     <li>feste Größe</li>
 *     <li>typsicher</li>
 *     <li>keine automatische Sortierung</li>
 *     <li>lassen sich gut mit Schleifen nutzen/bearbeiten/befüllen/leeren/ausgeben</li>
 * </ul>
 */
public class C01_ClArrays {

    public static final String APPLICATION_NAME = "========\nClArrays\n========";
    public static final String DEFAULT_STRING_VALUE = "$x$";

    public static void main(String[] args) {
        if (args.length != 0) startApplication();
        //  printStringArray(args);
    }

    private static void startApplication() {
        printApplicationName();
        showHowArraysWork();
    }

    private static void printApplicationName() {
        System.out.println(APPLICATION_NAME);
    }

    /**
     * Veranschaulicht, wie Arrays funktionieren
     */
    private static void showHowArraysWork() {
        //Deklarierung und Initialisierung von Arrays
        //int-Array
        int[] numbers = new int[5];

        System.out.println("\nErste Stelle des int-Arrays VOR manueller Wertezuweisung: " + numbers[0]);

        numbers[0] = 1111;
        numbers[1] = 2222;
        numbers[2] = 3333;
        numbers[3] = 4444;
        numbers[4] = 5555;

        System.out.println("Erste Stelle des int-Arrays NACH manueller Wertezuweisung: " + numbers[0]);

        //String-Array
//        String[] employeeNames = new String[2];
//
//        System.out.println("\nErste Stelle des String-Arrays VOR manueller Wertezuweisung: " + employeeNames[0]);
//
//        employeeNames[0] = "Shrek";
//        employeeNames[1] = "Fiona";
//
//        System.out.println("Erste Stelle des String-Arrays NACH manueller Wertezuweisung: " + employeeNames[0]);

        String[] employeeNames = {          //Index     -       Stelle des Arrays
                "Shrek",                    // 0        -       1
                "Fiona",                    // 1        -       2
                DEFAULT_STRING_VALUE,       // 2        -       3
                "Esel",                     // 3        -       4
                "Max",                      // 4        -       5
                "Farquaad",                 // 5        -       6
                "Drache"                    // 6        -       7 (Länge)
        };

        System.out.println("\nAngestellter an der Stelle 2 (also Index 1): " + employeeNames[1]);

        int[] intArray = new int[10];
//        int[] intArray = {15, 27, 654, 654654, 98};
        System.out.println("\nArraygröße mit intArray.length = " + intArray.length + "\n");

        /*
        For-Schleife
            - Ist eine kopfgesteuerte Zählschleife
            - eingeleitet durch das Schlüsselwort "for", gefolgt von
              folgenden Angaben:
                o ( Dekl. und Init. einer Laufvariablen; Laufbedingung; Verändern der Laufvariablen (inkrementieren, dekrementieren, ...) )
         */
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("intArray[" + i + "]: \t" + intArray[i]);
//        }
//
//        System.out.println();

        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("employeeNames[" + i + "]: \t" + employeeNames[i]);

            if (employeeNames[i].equals("Max")) {
                System.out.print("\t<-\tMax gefunden!\n");
            }
        }

        System.out.println();

        /*
        For-Each-Schleife
            - mit Schlüsselwort for eingeleitet, gefolgt von
                o Variablen mit passendem Datentyp : Array des gleichen Datentyps
         */
        //Für jede int-Zahl currentNumber aus dem int-Array numbers
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
        }

//        int index = 0;
//        for (int currentNumber : numbers) {
//            System.out.println(index + " - " + currentNumber);
//            index++;
//        }

        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("[" + i + "]" + " " + numbers[i]);
        }

        System.out.println();

        String nameToInsert = "Blubb";

        printStringArray(employeeNames);

        for (int i = 0; i < employeeNames.length; i++) {
            if (employeeNames[i].equals(DEFAULT_STRING_VALUE)) employeeNames[i] = nameToInsert;
        }

        printStringArray(employeeNames);

        System.out.println("Programmende");
    }

    /**
     * Gibt ein Array auf der Konsole aus
     *
     * @param array : {@link String[]} : Austzugebendes String-Array
     */
    private static void printStringArray(String[] array) {
        System.out.print("\n[");
        for (String string : array) {
            if (string != null) System.out.print(" " + string + " ");
            else System.out.println(" null ");
        }
        System.out.println("]\n");
    }
}
