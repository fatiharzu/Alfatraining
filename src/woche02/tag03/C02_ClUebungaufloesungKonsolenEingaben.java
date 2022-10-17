package woche02.tag03;

import de.rhistel.logic.ConsoleReader;

public class C02_ClUebungaufloesungKonsolenEingaben {


    //region Konstanten
    //Definieren eines Textblocks
    public static final String TXT_APP_NAME_VENDING_MACHINE = """
            XXXXXXXXXXXXXXXXXXXXXX
            XX ClVendingMachine XX
            XXXXXXXXXXXXXXXXXXXXXX
            """;

    public static final double PRODUCT_PRICE = 2;
    public static final String TXT_PURCHASE_DRINK = "\nWählen sie bitte ein Getränk der Liste aus.";
    public static final String TXT_PURCHASE_SUCCESS = "\nEntnehmen sie ihr Getränk";
    public static final String TXT_PURCHASE_SUCCESS_WITH_CHANGE = TXT_PURCHASE_SUCCESS + " und das Rückgeld im Wert von ";
    public static final String TXT_PURCHASE_MISSING_MONEY = "\nEs fehlt noch folgender Betrag zum Kauf: ";
    public static final String TXT_INVALID_CHOICE = "\nUngültige Auswahl!";
    public static final String TXT_INSERT_MONEY = "\nWerfen sie bitte genügend Geld ein.";

    public static final String TXT_APP_NAME_SONGLIST = """
            XXXXXXXXXXXXXXXX
            XX ClSonglist XX
            XXXXXXXXXXXXXXXX
            """;

    public static final int SONGLIST_LENGTH = 10;
    public static final String TXT_IVALID_SONG = "Falsche Eingabe. Song muss mehr als 2 Zeichen haben. Bitte erneut eingeben!";
    public static final String TXT_INPUT_SONG = "Geben sie den %d. Song ein:\n";
    //endregion

    //region Attribute
    private static String[] products = {
            "Cola",
            "Fanta",
            "Mezzo Mix",
            "Sprite"
    };

    private static String[] songs = new String[SONGLIST_LENGTH];
    //endregion

    //region Konstruktor
    //region

    //region Methoden

    /**
     * Einstiegspunkt ins Programm.
     * Je nach Startparameter wird ClVendingMachine order ClSonglist gestartet.
     *
     * @param args : {@link String[]} : Startparameter - "vendingmachine" oder leer / "songlist"
     */
    public static void main(String[] args) {
        if (args.length > 0) {

            if (args[0].equals("vendingmachine")) startApplicationVendingMachine();
            else if (args[0].equals("songlist")) startApplicationSongList();
            else System.out.println("Falscher Parameter!");

        } else {
            startApplicationVendingMachine();
        }
    }

    private static void startApplicationVendingMachine() {
        printAppName(TXT_APP_NAME_VENDING_MACHINE);
        printMainMenu();
        handlePurchase();
    }

    private static void printAppName(String appName) {
        System.out.println(appName);
    }

    private static void printMainMenu() {
        for (int i = 0; i < products.length; i++) {
            System.out.println("[ " + i + " ] " + products[i]);
        }
    }

    /**
     * Liest einen Index über die Konsole ein.
     * Dieser wird auf Gültigkeit geprüft (0 <= index < products.length).
     * Danach wird Geld über die Konsole eingelesen und geprüft ob der Nutzer
     * genügend Geld eingeworfen hat. Je nach Menge wird eine passende Meldung ausgegeben.
     */
    private static void handlePurchase() {
        System.out.println(TXT_PURCHASE_DRINK);

        int purchaseIndex = ConsoleReader.in.readPositivInt();

        if (purchaseIndex < products.length) {
            //gültiger Index
            System.out.println(TXT_INSERT_MONEY);
            double moneyGiven = ConsoleReader.in.readPositivDouble();

            if (moneyGiven > PRODUCT_PRICE) {
                System.out.println(TXT_PURCHASE_SUCCESS_WITH_CHANGE + (moneyGiven - PRODUCT_PRICE));
            } else if (moneyGiven == PRODUCT_PRICE) {
                System.out.println(TXT_PURCHASE_SUCCESS);
            } else {
                System.out.println(TXT_PURCHASE_MISSING_MONEY + (PRODUCT_PRICE - moneyGiven));
            }

        } else {
            //ungültiger Index
            System.out.println(TXT_INVALID_CHOICE);
        }
    }

    private static void startApplicationSongList() {
        printAppName(TXT_APP_NAME_SONGLIST);
        readSongsFromConsole();
        printSongList();
    }

    /**
     * Liest Songs über die Konsole ein.
     * Wenn ein Song falsch eingegeben wurde (Songlänge <= 2),
     * dann wird er erneut eingelesen (i--).
     */
    private static void readSongsFromConsole() {
        for (int i = 0; i < SONGLIST_LENGTH; i++) {

            System.out.printf(TXT_INPUT_SONG, (i + 1));
            String song = ConsoleReader.in.readMandatoryString();

            if (song.length() >= 2) {
                songs[i] = song;
            } else {
                System.out.println(TXT_IVALID_SONG);
                i--;
            }
        }
    }

    private static void printSongList() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
    }
    //endregion
}
