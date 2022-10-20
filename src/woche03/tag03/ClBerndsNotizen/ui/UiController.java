package woche03.tag03.ClBerndsNotizen.ui;


import de.rhistel.logic.ConsoleReader;
import woche03.tag03.ClBerndsNotizen.model.Note;

import woche03.tag03.ClBerndsNotizen.settings.AppCommands;
import woche03.tag03.ClBerndsNotizen.settings.AppTexts;
import woche03.tag03.ClBerndsNotizen.test.TestData;

/**
 * Implementiert die Interaktion zwischen UI (User Interface / Benutzeroberfläche) und dem Benutzer.
 * Anhand von Nutzereingaben wird dann weitere Logik eingeleitet.
 * TODO 2 Erstellen und implementieren der UiController Klasse (soweit wie in diesem Projekt)
 * TODO 9 !OPTIONAL! Implementieren der Methode delete()
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    private Note[] notes;
    //endregion

    //region Konstruktor
    //endregion

    //region Methoden
    public void startUi() {
        initialize();
        printAppName();
        handleUserInteraction();
    }

    private void initialize() {
//        notes = new Note[10];
        notes = TestData.getTestNotes();
    }

    private void printAppName() {
        System.out.println("""
                ===================
                = ClBerndsNotizen =
                ===================""");
    }

    /**
     * Gibt das Hauptmenü aus, erwartet eine Nutzereingabe, wertet diese aus
     * und leitet weiter Logik ein.
     * Die Interaktion mit dem Hauptmenü ist fortlaufend über eine
     * while-Schleife realisiert.
     */
    private void handleUserInteraction() {
        boolean exitApplication = false;

        //Normale while Schleife
//        while (!exitApplication) {
//            printMainMenu();
//
//            int userChoice = ConsoleReader.in.readPositivInt();
//
//            switch (userChoice) {
//                case AppCommands.USER_CMD_SHOW -> show();
//                case AppCommands.USER_CMD_CREATE -> create();
//                case AppCommands.USER_CMD_EDIT -> edit();
//                case AppCommands.USER_CMD_DELETE -> delete();
//                case AppCommands.USER_CMD_EXIT -> exitApplication = true;
//                default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
//            }
//        }

        //do-while Schleife
        do {
            //Ausgabe des Hauptmenüs
            printMainMenu();

            //Einlesen der Nutzereingabe
            int userChoice = ConsoleReader.in.readPositivInt();

            //Auswerten der Nutzereingabe und einleiten weiterer Logik
            switch (userChoice) {
                case AppCommands.USER_CMD_SHOW -> show();
                case AppCommands.USER_CMD_CREATE -> create();
                case AppCommands.USER_CMD_EDIT -> edit();
                case AppCommands.USER_CMD_DELETE -> delete();
                case AppCommands.USER_CMD_EXIT -> exitApplication = true;
                default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
            }
        } while (!exitApplication);
    }

    private void printMainMenu() {
        System.out.println(AppTexts.MAIN_MENU_SHOW);
        System.out.println(AppTexts.MAIN_MENU_CREATE);
        System.out.println(AppTexts.MAIN_MENU_EDIT);
        System.out.println(AppTexts.MAIN_MENU_DELETE);
        System.out.println(AppTexts.MAIN_MENU_EXIT);
        System.out.println(AppTexts.MSG_USER_CHOICE);
    }

    /**
     * Zeigt alle gespeicherten Notizen auf der Konsole an
     */
    private void show() {
        System.out.println();
        for (int i = 0; i < notes.length; i++) {
            System.out.println(i + " - " + notes[i]);
        }
        System.out.println("\nTODO Notizen ordentlich anzeigen");
    }

    private void create() {
        System.out.println("\nTODO Notiz anlegen");
    }

    private void edit() {
        System.out.println("\nTODO Notiz bearbeiten");
    }

    private void delete() {
        System.out.println("\nTODO Notiz löschen");
    }
    //endregion
}
