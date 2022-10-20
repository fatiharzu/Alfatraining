package woche03.tag04.ClBerndsNotizen.ui;

import de.rhistel.logic.ConsoleReader;
import woche03.tag04.ClBerndsNotizen.model.Note;
import woche03.tag04.ClBerndsNotizen.settings.NoteSettings;

/**
 * Dies ist eine unterstüzende Helferklasse für {@link UiController}.
 * Sie liest die Eingaben des Benutzers ein und stellt ihre Gültigkeit sicher.
 * Die gültigen Eingaben werden zurück an {@link UiController} geliefert.
 * Vorgaben zur Gültigkeit befinden sich in der Klasse {@link woche03.tag04.ClBerndsNotizen.settings.NoteSettings}
 * TODO 4 UiInputHandler Klasse implementieren
 * TODO 4.1 Wertvalidation beim Einlesen implementieren (getValidTitle und getValidContent)
 */
public class UiInputHandler {

    //region Methoden

    /**
     * Liest eine Notiz über die Konsole ein und liefert
     * sie zurück.
     *
     * @return {@link Note} : Eingelesene Notiz
     * TODO 4.2 Methode zum Einlesen der Notizinformationen implementieren
     */
    public Note getNoteFromConsole() {
        System.out.println(UiController.MSG_INPUT_NOTE_DATA);

        String title = getValidTitle();
        String content = getValidContent();

        System.out.println(UiController.MSG_INPUT_IMPORTANT);
        boolean isImportant = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

        return new Note(title, content, isImportant);
    }

    /**
     * Liest einen Titel einer Notiz über die Konsole ein
     * und prüft ihn auf Gültigkeit. Der Nutzer muss so lange einen Titel eingeben,
     * bis dieser gültig ist.
     *
     * @return {@link String} : Titel der Notiz
     */
    private String getValidTitle() {
        String title = Note.DEFAULT_STRING_VALUE;

        boolean isValid = false;

        while (!isValid) {

            System.out.println(UiController.MSG_INPUT_TITLE);
            title = ConsoleReader.in.readMandatoryString();

            if (title.length() >= NoteSettings.MIN_LENGTH_TITLE && title.length() <= NoteSettings.MAX_LENGTH_TITLE) {
                isValid = true;
            } else {
                System.out.printf("\nUngültiger Titel. Der Titel muss zwischen %d und %d Zeichen haben.",
                        NoteSettings.MIN_LENGTH_TITLE, NoteSettings.MAX_LENGTH_TITLE);
            }
        }

        return title;
    }

    /**
     * Liest einen Inhalt einer Notiz über die Konsole ein
     * und prüft ihn auf Gültigkeit. Der Nutzer muss so lange einen Inhalt eingeben,
     * bis dieser gültig ist.
     *
     * @return {@link String} : Inhalt der Notiz
     */
    private String getValidContent() {
        String content = Note.DEFAULT_STRING_VALUE;

        boolean isValid = false;

        while (!isValid) {

            System.out.println(UiController.MSG_INPUT_CONTENT);
            content = ConsoleReader.in.readMandatoryString();

            if (content.length() <= NoteSettings.MAX_LENGTH_CONTENT) {
                isValid = true;
            } else {
                System.out.printf("\nUngültiger Inhalt. Der Inhalt darf maximal %d Zeichen haben.",
                        NoteSettings.MAX_LENGTH_CONTENT);
            }
        }

        return content;
    }
    //endregion
}
