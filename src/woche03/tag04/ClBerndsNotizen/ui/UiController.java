package woche03.tag04.ClBerndsNotizen.ui;


import de.rhistel.logic.ConsoleReader;
import woche03.tag04.ClBerndsNotizen.model.Note;
import woche03.tag04.ClBerndsNotizen.settings.AppCommands;
import woche03.tag04.ClBerndsNotizen.settings.AppTexts;
import woche03.tag04.ClBerndsNotizen.test.TestData;

import java.util.List;


/**
 * Implementiert die Interaktion zwischen UI (User Interface / Benutzeroberfläche) und dem Benutzer.
 * Anhand von Nutzereingaben wird dann weitere Logik eingeleitet.
 * TODO 0 Array von Notizen durch Liste austauschen
 */
public class UiController {
    public static final String MSG_INPUT_NOTE_DATA = "\nGeben sie bitte folgende Informationen der Notiz ein:";
    public static final String MSG_INPUT_TITLE = "Titel:";
    public static final String MSG_INPUT_CONTENT = "Inhalt:";
    public static final String MSG_INPUT_IMPORTANT = "Wichtig?";
    public static final String MSG_CHOOSE_INDEX_EDIT = "\nWählen sie bitte eine Notiz zum Bearbeiten aus.";

    //region Konstanten
    //endregion

    //region Attribute
    private final List<Note> noteList;

    //TODO 5 UiInputHandler Attribut definieren und im Konstruktor initialisieren
    private final woche03.tag04.ClBerndsNotizen.ui.UiInputHandler inputHandler;
    //endregion

    //region Konstruktor
    public UiController() {
        noteList = TestData.getTestNotes();
        inputHandler = new UiInputHandler();
    }
    //endregion

    //region Methoden
    public void startUi() {
        printAppName();
        handleUserInteraction();
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
     * TODO 1 Ausgabe an Liste anpassen
     */
    private void show() {
        System.out.println();
        for (int i = 0; i < noteList.size(); i++) {
            System.out.println(i + " - " + noteList.get(i));
        }
    }

    /**
     * Legt eine neue Notiz anhand von Nutzereingaben an
     * und fügt sie der Liste hinzu.
     * TODO 6 Methode zum anlegen von Notizen implementieren
     */
    private void create() {
        Note note = inputHandler.getNoteFromConsole();
        noteList.add(note);
    }

    /**
     * Lässt den Nutzer eine Notiz zum Bearbeiten auswählen.
     * Danach werden neue Daten eingelesen und die Notiz abgeändert.
     * TODO 7 Methode zum Bearbeiten von Notizen implementieren
     */
    private void edit() {
        System.out.println(MSG_CHOOSE_INDEX_EDIT);
        show();

        int indexToUpdate = ConsoleReader.in.readPositivInt();

        if (indexToUpdate < noteList.size()) {
            Note note = inputHandler.getNoteFromConsole();
            noteList.set(indexToUpdate, note);
        }
    }

    /**
     * Löscht ein Element aus der Liste anhand einer Nutzereingabe für
     * den Index.
     */
    private void delete() {
        System.out.println(AppTexts.MSG_CHOOSE_INDEX_DELETE);
        show();

        int indexToDelete = ConsoleReader.in.readPositivInt();

        if (indexToDelete < noteList.size()) {
            noteList.remove(indexToDelete);
            System.out.println(AppTexts.MSG_DELETE_SUCCESSFUL);
        } else {
            System.out.println(AppTexts.MSG_INVALID_CHOICE);
        }
    }
    //endregion
}
