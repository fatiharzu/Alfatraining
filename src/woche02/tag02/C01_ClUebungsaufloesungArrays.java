package woche02.tag02;


import java.util.Arrays;

/**
 * Auflösung der Übung zu Arrays
 */
public class C01_ClUebungsaufloesungArrays {

    public static final String APP_NAME = "Übungsauflösung Arrays\n======================";

    private static String[] names;
    private static String[] flowers;
    private static double[] doubles;
    private static int[] intArrayOne;
    private static int[] intArrayTwo;
    private static float[] floats;


    /**
     * Einstiegspunkt ins Programm
     *
     * @param args : {@link String[]} : Startparameter
     */
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        initializeArrays();
        testExerciseMethods();
    }

    private static void printApplicationName() {
        System.out.println(APP_NAME);
    }

    /**
     * Initialisiert die als Klassenvariablen (Attribute) deklarierten Arrays
     */
    private static void initializeArrays() {
        names = new String[]{"Florian", "Jane", "Rita", "Merlin"};
        flowers = new String[]{"Lilie", "Tulpe", "Akazie"};

        doubles = new double[]{2, 2, 1, 1};

        intArrayOne = new int[]{1, 6, 2, 5, 5};
        intArrayTwo = new int[]{324, 956, 2, 245, 2, 5};

        floats = new float[]{1.4f, 564.6541f, 1.0f, 7.8f, 1.4f, 1.4f , 1f, 7.8f};
    }

    private static void testExerciseMethods() {
        //Aufgabe 1
        String name = "Rita";
        System.out.println("\nExistiert \"" + name + "\" in " + Arrays.toString(names) + "? "
                + stringArrayContainsValue(names, name));

        //Aufgabe 2
        System.out.println("\nMittelwert von " + Arrays.toString(doubles) + ": " + calculateMeanOfDoubleArray(doubles));

        //Aufgabe 3
        System.out.println("\nUrsprüngliches Array: " + Arrays.toString(intArrayOne) + " - " + intArrayOne);
        int[] intArrayOneCopy = copyIntArray(intArrayOne);
        System.out.println("Kopie des Arrays: " + Arrays.toString(intArrayOneCopy) + " - " + intArrayOneCopy);
        intArrayOneCopy[1] = 10;
        System.out.println("Kopie wurde am Index 1 geändert.");
        System.out.println("Ursprüngliches Array: " + Arrays.toString(intArrayOne) + " - " + intArrayOne);
        System.out.println("Kopie des Arrays: " + Arrays.toString(intArrayOneCopy) + " - " + intArrayOneCopy);

        //Aufgabe 4
        System.out.println("\nErstes Array: " + Arrays.toString(names));
        System.out.println("Zweite Array: " + Arrays.toString(flowers));
//        String[] mergedArray = mergeStringArrays(names, flowers);
//        System.out.println("\nZusammengesetztes Array: " + Arrays.toString(mergedArray));
        System.out.println("Zusammengesetztes Array: " + Arrays.toString(mergeStringArrays(names, flowers)));

        //Aufgabe 5
        String flower = "Akazie";
        System.out.println("\nIndex von " + flower + " in " + Arrays.toString(flowers) + ": "
                + getFirstIndexOfStringArrayElement(flowers, flower));

        //Aufgabe 6
        System.out.println("\n" + Arrays.toString(intArrayOne));
        System.out.println(Arrays.toString(intArrayTwo));
        printCommonElementsOfTwoIntArrays(intArrayOne, intArrayTwo);

        //Aufgabe 7
        System.out.println("\n" + Arrays.toString(floats));
        printDuplicatesOfFloatArray(floats);
    }

    /**
     * Prüft, ob eine Zeichenkette in einem String-Array vorhanden ist und gibt true oder false zurück
     *
     * @param array : {@link String[]} : Array mit Zeichenketten
     * @param value : {@link String} : Zeichenkette
     * @return : boolean : true wenn vorhanden, false wenn nicht
     */
    private static boolean stringArrayContainsValue(String[] array, String value) {
        for (String element : array) {
            if (value.equals(element)) return true;
        }

        return false;
    }

    /**
     * Berechnet den Mittelwert der Elemente eines double-Arrays und gibt ihn zurück
     *
     * @param array : double[] : Array mit double-Werten
     * @return : double : Mittelwert der im Array vorhandene Elemente
     */
    private static double calculateMeanOfDoubleArray(double[] array) {
        double sum = 0;

        for (double number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    /**
     * Kopiert ein beliebiges int-Array und gibt doe Kopie als neues Array zurück
     *
     * @param array : int[] : Array mit int-Werten
     * @return : int[] : Kopie des ursprünglichen int-Arrays
     */
    private static int[] copyIntArray(int[] array) {
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        return arrayCopy;
    }

    /**
     * Fügt zwei übergebene String-Arrays zu einem neuen String-Array zusammen.
     *
     * @param firstArray  : {@link String[]} : Array mit Zeichenketten
     * @param secondArray : {@link String[]} : Array mit Zeichenketten
     * @return : {@link String[]} : Zusammengesetzte Array mit Zeichenketten
     */
    private static String[] mergeStringArrays(String[] firstArray, String[] secondArray) {
        int lengthOfMergedArray = firstArray.length + secondArray.length;
        String[] mergedArray = new String[lengthOfMergedArray];

        int indexOfMergedArray = 0;

        for (String elementOfFirstArray : firstArray) {
            mergedArray[indexOfMergedArray] = elementOfFirstArray;
            indexOfMergedArray++;
        }

        for (String elementOfSecondArray : secondArray) {
            mergedArray[indexOfMergedArray] = elementOfSecondArray;
            indexOfMergedArray++;
        }

        return mergedArray;
    }

    /**
     * Gibt den ersten Index einer übergebenen Zeichenkette in einem übergebenen String-Array zurück
     *
     * @param array : {@link String[]} : Array mit Zeichenketten
     * @param value : {@link String} : gesuchte Zeichenkette
     * @return : int : Index der gesuchten Zeichenkette : -1 wenn nicht gefunden
     *                                                    zwischen 0 und array.length - 1 wenn gefunden
     */
    private static int getFirstIndexOfStringArrayElement(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    /**
     * Gibt gemeinsame Elemente zweier übergebener int-Arrays auf der Konsole aus.
     * Mehrfache Übereinstimmungen werden ignoriert.
     *
     * @param firstArray  : int[] : int-Array
     * @param secondArray : int[] : int-Array
     */
    private static void printCommonElementsOfTwoIntArrays(int[] firstArray, int[] secondArray) {

        String output = "";
        String commonElementString = "";

        for (int elementOfFirstArray : firstArray) {

            commonElementString = "" + elementOfFirstArray + ", ";

            for (int elementOfSecondArray : secondArray) {

                if (elementOfSecondArray == elementOfFirstArray && !output.contains(commonElementString)) {
                    output += commonElementString + " ";
                }
            }
        }
        if (output.length() > 0) System.out.println("Gemeinsame Elemente: " + output);
        else System.out.println("Keine Gemeinsamkeiten gefunden!");
    }

    /**
     * Gibt Duplikate innerhalb eines float-Arrays auf der Konsole aus.
     * Dabei werden mehrfache Übereinstimmungen ignoriert.
     *
     * @param array : float[] : zu prüfendes float-Array
     */
    private static void printDuplicatesOfFloatArray(float[] array) {

        String output = "";
        String duplicateString = "";

        for (int i = 0; i < array.length; i++) {

            duplicateString = "" + array[i] + ",";

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j] && !output.contains(duplicateString)) {
                    output += duplicateString + " ";
                }
            }
        }

        if (output.length() > 0) System.out.println("Duplikate: " + output);
        else System.out.println("Keine Duplikate gefunden");
    }
}
