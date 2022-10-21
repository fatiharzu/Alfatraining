package woche03.tag05.ClBerndsNotizen.ui;


import de.rhistel.logic.ConsoleReader;
import woche03.tag05.ClBerndsNotizen.model.Note;
import woche03.tag05.ClBerndsNotizen.settings.AppCommands;
import woche03.tag05.ClBerndsNotizen.settings.AppTexts;
import woche03.tag05.ClBerndsNotizen.test.TestData;

import java.util.List;

/**
 * Implementiert die Interaktion zwischen UI (User Interface / Benutzeroberfläche) und dem Benutzer.
 * Anhand von Nutzereingaben wird dann weitere Logik eingeleitet.
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    private final List<Note> noteList;

    private final UiInputHandler inputHandler;
    //endregion

    //region Konstruktor
    //TODO 1 Sortierung nach initialisieren der Liste ausführen
    public UiController() {
        noteList = TestData.getTestNotes();
        sortByImportanceAndTitle();
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
     */
    private void show() {
        System.out.printf(AppTexts.FORMAT_STRING_NOTE_HEADER,
                AppTexts.INDEX, AppTexts.TITLE, AppTexts.CONTENT, AppTexts.IMPORTANT);
        for (int i = 0; i < noteList.size(); i++) {
            Note currentNote = noteList.get(i);
            System.out.printf(AppTexts.FORMAT_STRING_NOTE,
                    i, currentNote.getTitle(), currentNote.getContent(), currentNote.isImportant());
        }
    }

    /**
     * Legt eine neue Notiz anhand von Nutzereingaben an
     * und fügt sie der Liste hinzu.
     */
    private void create() {
        //Notiz einlesen
        Note note = inputHandler.getNoteFromConsole();
        //Notiz der Liste hinzufügen
        noteList.add(note);

        System.out.println(AppTexts.MSG_NOTE_CREATION_SUCCESSFUL);
    }

    /**
     * Lässt den Nutzer eine Notiz zum Bearbeiten auswählen.
     * Danach werden neue Daten eingelesen und die Notiz abgeändert.
     */
    private void edit() {
        //Liste anzeigen
        System.out.println(AppTexts.MSG_CHOOSE_INDEX_EDIT);
        show();

        //Index zum Bearbeiten einlesen
        int indexToUpdate = ConsoleReader.in.readPositivInt();

        //Index überprüfen
        if (indexToUpdate < noteList.size()) {
            //Notiz einlesen
            Note note = inputHandler.getNoteFromConsole();
            //Notiz ersetzen
            noteList.set(indexToUpdate, note);

            System.out.println(AppTexts.MSG_NOTE_EDIT_SUCCESSFUL);
        } else {
            //Fehlermeldung bei ungültigem Index
            System.out.println(AppTexts.MSG_INVALID_CHOICE);
        }
    }

    /**
     * Löscht ein Element aus der Liste anhand einer Nutzereingabe für
     * den Index.
     */
    private void delete() {
        //Liste anzeigen
        System.out.println(AppTexts.MSG_CHOOSE_INDEX_DELETE);
        show();

        //Index zum Löschen einlesen
        int indexToDelete = ConsoleReader.in.readPositivInt();

        //Index überprüfen
        if (indexToDelete < noteList.size()) {
            //Notiz löschen
            noteList.remove(indexToDelete);

            System.out.println(AppTexts.MSG_DELETE_SUCCESSFUL);
        } else {
            //Fehlermeldung bei ungültigem Index
            System.out.println(AppTexts.MSG_INVALID_CHOICE);
        }
    }

    /**
     * Sortiert die Notizliste primär absteigend nach Wichtigkeit
     * und sekundär aufsteigend nach Titel.
     * TODO 0 Sortierung der Liste implementieren
     */
    public void sortByImportanceAndTitle() {

        //Lambda Ausdruck (x,y) -> {Anweisung; ...};
        noteList.sort((firstNote, secondNote) -> {

            //Sortieren nach Wichtigkeit absteigend (true > false)
            Boolean firstNoteImportant = firstNote.isImportant();
            Boolean secondNoteImportant = secondNote.isImportant();

            int boolCompare = firstNoteImportant.compareTo(secondNoteImportant);

            /*
            true = 1
            false = 0
            firstNoteImportant - secondNoteImportant
            true - false = 1    tauschen
            false - true = -1   richtig sortiert
            true - true = 0     reihenfolge egal
            false - false = 0   reihenfolge egal

            1 - 2   = -1    richtig sortiert
            2 - 1   = 1     tauschen
            1 - 1   = 0     reihenfolge egal
            2 - 2   = 0     reihenfolge egal
             */

            if (boolCompare != 0) {
                return -boolCompare;
            }

                String firstNoteTitle = firstNote.getTitle();
                String secondNoteTitle = secondNote.getTitle();

                int stringCompare = firstNoteTitle.compareTo(secondNoteTitle);

                return stringCompare;
        });

        //        list.sort(new Comparator<Note>() {
//            @Override
//            public int compare(Note firstNote, Note secondNote) {
//
//                //Sortieren nach Wichtigkeit absteigend (true > false)
//                Boolean firstNoteImportant = firstNote.isImportant();
//                Boolean secondNoteImportant = secondNote.isImportant();
//
//                int boolCompare = firstNoteImportant.compareTo(secondNoteImportant);
//
//                if (boolCompare != 0) {
//                    return -boolCompare;
//                }
//
//                String firstNoteTitle = firstNote.getTitle();
//                String secondNoteTitle = secondNote.getTitle();
//
//                int stringCompare = firstNoteTitle.compareTo(secondNoteTitle);
//
//                return -stringCompare;
//            }
//        });
    }
    //endregion
}
