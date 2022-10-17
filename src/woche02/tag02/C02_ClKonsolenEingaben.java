package woche02.tag02;

import de.rhistel.logic.ConsoleReader;

import java.util.Scanner;

/**
 * <h2>Eingaben von der Konsole einlesen</h2>
 *
 * <h3>Standardmöglichkeiten</h3>
 * <ul>
 *     <li>
 *         {@link System#in}: Standardeingabestrom, liest nur rohe Bytes von der Konsole:
 *         für unsere Zwecke eher ungeeignet
 *     </li>
 *     <li>
 *         {@link java.util.Scanner}: Um diese richtig nutzen zu können
 *         muss man Grundwissen über die OOP (Objektorientierte Programmierung) besitzen.
 *         Des Weiteren hat diese Möglichkeit keine eigene Fehlerbehandlung, sondern man muss diese selbst
 *         durchführen.
 *         Die Klasse {@link java.util.Scanner} nutzt bei der Instanziierung eines Objektes den Stadnard-Eingabestrom
 *         {@link System#in} um Dinge einzulesen und ist automatisch auf den Sprachraum des Systems angepasst,
 *         d.h. Kommazahlen können mit einem Komma anstelle eines Punktes eingegeben werden.
 *         Die Nutzung von der Klasse {@link java.util.Scanner} bietet sich daher eher für erfahrene Benutzer an.
 *     </li>
 * </ul>
 *
 * <h3>ConsoleReaderLib.jar</h3>
 * <ol>
 *     <li>libs.zip vom Datenaustausch herunterladen</li>
 *     <li>Entpacken in C:\libs\ConsoleReaderLib.jar</li>
 *     <li>File -> Project Structure -> Libraries -> + -> Java auswählen -> Pfad zur ConsoleReaderLib.jar angeben -> Ok</li>
 * </ol>
 *
 * <h4>Hotkeys</h4>
 * <ul>
 *     <li>Strg + B (oder Mausrad-Klick) : In Definition oder Nutzung springen</li>
 *     <li>Strg + Alt + C : Konstante auslagern</li>
 *     <li>Strg + Alt + M : Methode auslagern</li>
 * </ul>
 */
public class C02_ClKonsolenEingaben {

    //region Konstanten
    public static final String APP_NAME = "ClKonsolenEingaben\n==================";
    public static final String USER_INPUT_INTEGER = "\nGeben sie bitte eine Ganzzahl ein:";
    public static final String USER_INPUT_WORD = "\nGeben sie bitte ein Wort ein:";
    public static final String USER_INPUT_STRING = "\nGeben sie bitte einen String ein:";
    public static final String USER_INPUT_DOUBLE = "\nGeben sie eine Kommazahl ein:";
    public static final String USER_INPUT_BOOLEAN = "\nGeben sie bitte einen Boolean ein:";
    public static final String TXT_FORMAT_OUTPUT = "Eingegeben: [ %s ]";
    public static final String TXT_BUFFER_OUTPUT = "Noch vorhanden: [ %s ]";
    public static final String USER_INPUT_POSITIVE_INTEGER = "\nGeben sie bitte eine positive Ganzzahl ein:";
    public static final String USER_INPUT_NEGATIVE_INTEGER = "\nGeben sie bitte eine negative Ganzzahl ein:";
    public static final String USER_INPUT_POSITIVE_DOUBLE = "\nGeben sie bitte eine positive Kommazahl ein:";
    public static final String USER_INPUT_NEGATIVE_DOUBLE = "\nGeben sie bitte eine negative Kommazahl ein:";
    public static final String USER_INPUT_BINARY_QUESTION = "\nWollen sie diesen Eintrag wirklich löschen?";
    public static final String TXT_ENTRY_DELETED = "Eintrag wurde erfolgreich gelöscht.";
    public static final String TXT_ENTRY_KEPT = "Eintrag wird beibehalten.";
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        showHowScannerWorks();
        showHowConsoleReaderWorks();

    }


    private static void printApplicationName() {
        System.out.println(APP_NAME);
    }

    /**
     * Zeigt wie über die Klasse Scanner Eingaben von der Konsole
     * gelesen werden können.
     */
    private static void showHowScannerWorks() {
        //Scanner-Objekt erzeugen und Eingabestrom übergeben
        Scanner scanner = new Scanner(System.in);

        //Ganzzahl
        System.out.println(USER_INPUT_INTEGER);
        int intInput = scanner.nextInt();
        System.out.printf(TXT_FORMAT_OUTPUT, intInput);

        //String bis zum ersten Leerzeichen
        System.out.println(USER_INPUT_WORD);
        String strInput = scanner.next();
        System.out.printf(TXT_FORMAT_OUTPUT, strInput);

        //String bis zum ersten Zeilenumbruch
        strInput = scanner.nextLine();
        System.out.printf(TXT_BUFFER_OUTPUT, strInput);
        System.out.println(USER_INPUT_STRING);
        strInput = scanner.nextLine();
        System.out.printf(TXT_FORMAT_OUTPUT, strInput);

        //Kommazahl
        System.out.println(USER_INPUT_DOUBLE);
        double dblInput = scanner.nextDouble();
        System.out.printf(TXT_FORMAT_OUTPUT, dblInput);

        //Boolean
        System.out.println(USER_INPUT_BOOLEAN);
        boolean boolInput = scanner.nextBoolean();
        System.out.printf(TXT_FORMAT_OUTPUT, boolInput);
    }

    /**
     * Zeigt wie Eingaben über die Bibliothek ConsoleReaderLib
     * von der Konsole eingelesen werden können
     */
    private static void showHowConsoleReaderWorks() {
        readIntegersFromConsole();
        readDoubleValuesFromConsole();
        readStringValuesFromConsole();
        readBooleanValueFromConsole();
    }

    private static void readIntegersFromConsole() {
        System.out.println(USER_INPUT_INTEGER);
        int intInput = ConsoleReader.in.readInt();
        System.out.printf(TXT_FORMAT_OUTPUT, intInput);

        System.out.println(USER_INPUT_POSITIVE_INTEGER);
        intInput = ConsoleReader.in.readPositivInt();
        System.out.printf(TXT_FORMAT_OUTPUT, intInput);

        System.out.println(USER_INPUT_NEGATIVE_INTEGER);
        intInput = ConsoleReader.in.readNegativInt();
        System.out.printf(TXT_FORMAT_OUTPUT, intInput);
    }

    private static void readDoubleValuesFromConsole() {
        System.out.println(USER_INPUT_DOUBLE);
        double dblInput = ConsoleReader.in.readDouble();
        System.out.printf(TXT_FORMAT_OUTPUT, dblInput);

        System.out.println(USER_INPUT_POSITIVE_DOUBLE);
        dblInput = ConsoleReader.in.readPositivDouble();
        System.out.printf(TXT_FORMAT_OUTPUT, dblInput);

        System.out.println(USER_INPUT_NEGATIVE_DOUBLE);
        dblInput = ConsoleReader.in.readNegativDouble();
        System.out.printf(TXT_FORMAT_OUTPUT, dblInput);
    }

    private static void readStringValuesFromConsole() {
        System.out.println(USER_INPUT_STRING);
        String strInput = ConsoleReader.in.readString();
        System.out.printf(TXT_FORMAT_OUTPUT, strInput);

        System.out.println(USER_INPUT_STRING);
        strInput = ConsoleReader.in.readMandatoryString();
        System.out.printf(TXT_FORMAT_OUTPUT, strInput);
    }

    private static void readBooleanValueFromConsole() {
        System.out.println(USER_INPUT_BINARY_QUESTION);
        boolean boolInput = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
        if (boolInput) System.out.println(TXT_ENTRY_DELETED);
        else System.out.println(TXT_ENTRY_KEPT);
    }
    //endregion
}







