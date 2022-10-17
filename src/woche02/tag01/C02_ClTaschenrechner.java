package woche02.tag01;

/**
 * Dieses Programm stellt einen kleinen Taschenrechner mit
 * vordefinierten Zahlen dar.
 */
public class C02_ClTaschenrechner {

    public static final String APP_NAME = """
            =================================
            === ClTaschenrechnerErweitert ===
            =================================
            """;

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
     * Gibt den Applikationsnamen auf der Konsole aus
     */
    private static void printAppName() {
        System.out.println(APP_NAME);
    }

    /**
     * Führt die Berechnungen aus
     */
    private static void startCalculation() {

        double firstNumber = 1;
        double secondNumber =2;

        System.out.println("\nErste Zahl: " + firstNumber + "\t\tZweite Zahl: " + secondNumber);

        double additionResult = add(firstNumber, secondNumber);
        double subtractionResult = subtract(firstNumber, secondNumber);
        double multiplicationResult = multiply(firstNumber, secondNumber);
        double divisionResult = divide(firstNumber, secondNumber);

        System.out.println("\n" + firstNumber + " + " + secondNumber + " = " + additionResult);
        System.out.println("\n" + firstNumber + " - " + secondNumber + " = " + subtractionResult);
        System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + multiplicationResult);
        System.out.println("\n" + firstNumber + " / " + secondNumber + " = " + divisionResult);
    }

    /**
     * Addiert zwei übergebene Zahlen miteinander
     * und gibt das Ergebnis zurück
     *
     * @param firstOperand : double : Erster Operand der Berechnung
     * @param secondOperand : double : Zweiter Operand der Berechnung
     * @return : double : Ergebnis der Berechnung
     */
    private static double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtrahiert zwei übergebene Zahlen voneinander
     * und gibt das Ergebnis zurück
     *
     * @param firstOperand : double : Erster Operand der Berechnung
     * @param secondOperand : double : Zweiter Operand der Berechnung
     * @return : double : Ergebnis der Berechnung
     */
    private static double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Multipliziert zwei übergebene Zahlen miteinander
     * und gibt das Ergebnis zurück
     *
     * @param firstOperand : double : Erster Operand der Berechnung
     * @param secondOperand : double : Zweiter Operand der Berechnung
     * @return : double : Ergebnis der Berechnung
     */
    private static double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * Dividiert zwei übergebene Zahlen durcheinander
     * und gibt das Ergebnis zurück
     *
     * @param firstOperand : double : Erster Operand der Berechnung
     * @param secondOperand : double : Zweiter Operand der Berechnung
     * @return : double : Ergebnis der Berechnung
     */
    private static double divide(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }
}
