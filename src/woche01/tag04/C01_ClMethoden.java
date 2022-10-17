package woche01.tag04;

/**
 * <h2>Methoden und Funktionen</h2>
 *
 * <p>
 * Dieses Programm zeigt wie Methoden und Funktionen in Java
 * definiert und verwendet werden;
 * </p>
 */
public class C01_ClMethoden
{

    /**
     * Einstiegspunkt ins Programm
     *
     * @param args : Startparameter
     */
    public static void main(String[] args) {
        runApplication();
    }

    /**
     * Methode ohne Rückgabe.
     * Führt alle anderen Methoden des Programmablaufs aus.
     */
    private static void runApplication() {
        printApplicationName();
        showHowMethodsWork();
        showHowMethodsWithParametersWork(5, "abc");
//        double result = showHowFunctionsWork();
//        System.out.println("Ergebnis: " + result);
        System.out.println("\tErgebnis: " + showHowFunctionsWork());
        System.out.println("\tErgebnis: " + showHowFunctionsWithParametersWork(5, 10));;
        System.out.println("\nProgrammende");


        add(5, 1);

        int result = addition(5, 1);
    }

    /**
     * Gibt den Applikationsnamen auf der Konsole aus
     */
    public static void printApplicationName() {
        System.out.println("=======================\nMethoden und Funktionen\n=======================");
    }

    private static void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;

    }

    private static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


    /**
     * Ist ein Methode ohne Rückgabe und ohne Parameter.
     * Sie zeigt, wie Methoden funktionieren.
     */
    private static void showHowMethodsWork() {
        System.out.println("\n# So funktionieren Methoden #\n");
        System.out.println("o-> \tMain.showHowMethodsWork() wurde von Main.runApplication() aufgerufen");
        System.out.println("o-> \tEine Methode macht nur das, was zwischen den { } steht (Methodenkörper)");
        System.out.println("o-> \tSie könnte irgendwelche Dinge berechnen, z.B. 1 + 1 = " + (1 + 1));
        System.out.println("o-> \tSie könnte Daten beschaffen oder verändern etc.");
        System.out.println("o-> \tSie zentralisiert bestimmte Aufgaben des Programms");
        System.out.println("o-> \tSie ist auf Mehrfachverwendung ausgelegt");
    }

    /**
     * Ist eine Methode ohne Rückgabe aber mit Parametern
     * @param intParam : int : Eine Zahl
     * @param stringParam : {@link String} : Eine Zeichenkette
     */
    private static void showHowMethodsWithParametersWork(int intParam, String stringParam) {
        System.out.println("\n# So funktionieren Methoden mit Parametern #\n");
        System.out.println("o-> \tMain.showHowMethodsWithParametersWork() wurde von Main.runApplication() aufgerufen");
        System.out.println("o-> \tBeim Methodenaufruf müssen die definierten Parameter in der richtigen Reihenfolge" +
                " mitgegeben werden");
        System.out.println("o-> \tshowHowMethodsWithParametersWork(15, \"Ein Text\")");

        if (!stringParam.isEmpty()) {
            int result = 2 * intParam + intParam;
            System.out.println("\n\t" + stringParam + " - Ergebnis von 2 * " + intParam + " + " + intParam + " = " + result);
        }
    }

    /**
     * Zeigt wie Methoden mit Rückgabe (Funktion) funktionieren
     *
     * @return : double : Die Zahl 0.0
     */
    private static double showHowFunctionsWork() {
        System.out.println("\n# So funktionieren Funktionen #\n");
        System.out.println("o-> \tMain.showHowFunctionsWork() wurde von Main.runApplication() aufgerufen");
        System.out.println("o-> \tEine Funktion macht nur das, was zwischen den { } steht (Funktionskörper)");
        System.out.println("o-> \tSie könnte irgendwelche Dinge berechnen, z.B. 1 + 1 = " + (1 + 1));
        System.out.println("o-> \tSie könnte Daten beschaffen oder verändern etc.");
        System.out.println("o-> \tSie zentralisiert bestimmte Aufgaben des Programms");
        System.out.println("o-> \tSie ist auf Mehrfachverwendung ausgelegt");
        System.out.println("o-> \tSie hat einen Rückgabetyp und einen Rückgabewert.");

        return 12.34;
    }

    /**
     * Zeigt wie Funktionen mit Parametern funktionieren
     *
     * @param firstNumber : double : Erster Operand
     * @param secondNumber : double : Zweiter Operand
     *
     * @return : double : Ergebnis der Addition beider Operanden
     */
    private static double showHowFunctionsWithParametersWork(double firstNumber, double secondNumber) {

        double result = firstNumber + secondNumber;

        System.out.println("\n# So funktionieren Funktionen mit Parametern #\n");
        System.out.println("o-> \tMain.showHowMethodsWithParametersWork() wurde von Main.runApplication() aufgerufen.");
        System.out.println("o-> \tBeim Aufruf müssen die definierten Parameter in der richtigen Reihenfolge übergeben werden.");
        System.out.println("o-> \tshowHowMethodsWithParametersWork(15.0, 5.0)");


        if (result > 10) return result;

        System.out.println("\tUngültiges Ergebnis");
        return -1;
    }
}