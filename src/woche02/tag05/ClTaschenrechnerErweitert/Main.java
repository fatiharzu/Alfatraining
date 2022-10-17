import de.rhistel.logic.ConsoleReader;

/**
 * Dieses Programm stellt einen kleinen Taschenrechner mit
 * vordefinierten Zahlen dar.
 */
public class Main {

    private static final String APP_NAME = """
    =================================
    === ClTaschenrechnerErweitert ===
    =================================
    """;
    private static final String MENU_ENTRY_TEMPLATE = "[\t%d\t] %s\n";
    private static final String TXT_ADDITION = "\tAddition";
    private static final String TXT_SUBTRACTION = "\tSubtraktion";
    private static final String TXT_MULTIPLICATION = "\tMultiplikation";
    private static final String TXT_DIVISION = "\tDivision";
    public static final String TXT_CHOOSE_OPERATION = "Wählen sie eine der folgenden Rechenarten:";
    public static final String TXT_INPUT_FIRST_OPERAND = "Eingabe der ersten Zahl:";
    public static final String TXT_INPUT_SECOND_OPERAND = "Eingabe der zweiten Zahl:";
    public static final String TXT_INVALID_INPUT = "Ungültige Eingabe!";

    private static final int USER_OPTION_ADD = 1;
    private static final int USER_OPTION_SUB = 2;
    private static final int USER_OPTION_MUL = 3;
    private static final int USER_OPTION_DIV = 4;

    public static final int INDEX_FIRST_OPERAND = 0;
    public static final int INDEX_SECOND_OPERAND = 1;

    /**
     * Einstiegspunkt in die Applikation
     *
     * @param args : Startparameter
     */
    public static void main(String[] args) {
        startApplication();
    }

    /**
     * Leitet die Programmlogik ein
     */
    private static void startApplication() {
        printAppName();
        startCalculation();
    }

    /**
     * Ausgabe des Hauptmenüs zur Auswahl der Rechenarten
     */
    private static void printMainMenu() {
        System.out.println(TXT_CHOOSE_OPERATION);
        System.out.printf(MENU_ENTRY_TEMPLATE, USER_OPTION_ADD, TXT_ADDITION);
        System.out.printf(MENU_ENTRY_TEMPLATE, USER_OPTION_SUB, TXT_SUBTRACTION);
        System.out.printf(MENU_ENTRY_TEMPLATE, USER_OPTION_MUL, TXT_MULTIPLICATION);
        System.out.printf(MENU_ENTRY_TEMPLATE, USER_OPTION_DIV, TXT_DIVISION);
    }

    /**
     * Gibt den Applikationsnamen auf der Konsole aus
     */
    private static void printAppName() {
        System.out.println(APP_NAME);
    }

    /**
     * Führt die Berechnungen aus
     */
    private static void startCalculation() {
        printMainMenu();

        int userChoice = ConsoleReader.in.readPositivInt();

        double calculationResult = 0;

        switch (userChoice) {
            case USER_OPTION_ADD -> calculationResult = add();
            case USER_OPTION_SUB -> calculationResult = subtract();
            case USER_OPTION_MUL -> calculationResult = multiply();
            case USER_OPTION_DIV -> calculationResult = divide();
            default -> System.out.println(TXT_INVALID_INPUT);
        }

        System.out.println("Ergebnis: " + calculationResult);
;
    }

    /**
     * Addiert zwei übergebene Zahlen miteinander
     * und gibt das Ergebnis zurück
     *
     * @return : double : Ergebnis der Berechnung
     */
    private static double add() {
        double[] operands = readDoublesFromConsole();
        return operands[INDEX_FIRST_OPERAND] + operands[INDEX_SECOND_OPERAND];
    }

    /**
     * Subtrahiert zwei übergebene Zahlen voneinander
     * und gibt das Ergebnis zurück
     *
     * @return : double : Ergebnis der Berechnung
     */
    private static double subtract() {
        double[] operands = readDoublesFromConsole();
        return operands[INDEX_FIRST_OPERAND] - operands[INDEX_SECOND_OPERAND];
    }

    /**
     * Multipliziert zwei übergebene Zahlen miteinander
     * und gibt das Ergebnis zurück
     *
     * @return : double : Ergebnis der Berechnung
     */
    private static double multiply() {
        double[] operands = readDoublesFromConsole();
        return operands[INDEX_FIRST_OPERAND] * operands[INDEX_SECOND_OPERAND];
    }

    /**
     * Dividiert zwei übergebene Zahlen durcheinander
     * und gibt das Ergebnis zurück
     *
     * @return : double : Ergebnis der Berechnung
     */
    private static double divide() {
        double[] operands = readDoublesFromConsole();
        return operands[INDEX_FIRST_OPERAND] / operands[INDEX_SECOND_OPERAND];
    }

    /**
     * Liest zwei double-Werte von der Konsole ein und gibt
     * diese als Array zurück
     *
     * @return : double[] : Array mit beiden Operanden
     */
    private static double[] readDoublesFromConsole() {
        System.out.println(TXT_INPUT_FIRST_OPERAND);
        double firstOperand = ConsoleReader.in.readDouble();

        System.out.println(TXT_INPUT_SECOND_OPERAND);
        double secondOperand = ConsoleReader.in.readDouble();

        return new double[] {
                firstOperand,
                secondOperand
        };
    }
}