package woche04.tag01.ClBerndsNotizen.settings;

/**
 * Diese Klasse stellt alle Programmtexte als öffentliche Konstanten zur Verfügung.
 * Von dieser Klasse kann kein Objekt erzeugt werden.
 */
public class AppTexts {

    //region Konstanten
    public static final String MAIN_MENU_SHOW = "\n[\t" + AppCommands.USER_CMD_SHOW + "\t] Notizen anzeigen";
    public static final String MAIN_MENU_CREATE = "[\t" + AppCommands.USER_CMD_CREATE + "\t] Notiz anlegen";
    public static final String MAIN_MENU_EDIT = "[\t" + AppCommands.USER_CMD_EDIT + "\t] Notiz bearbeiten";
    public static final String MAIN_MENU_DELETE = "[\t" + AppCommands.USER_CMD_DELETE + "\t] Notiz löschen";
    public static final String MAIN_MENU_EXIT = "[\t" + AppCommands.USER_CMD_EXIT + "\t] Programm beenden";
    public static final String MSG_USER_CHOICE = "\nWählen sie eine der obigen Optionen aus:";
    public static final String MSG_INVALID_CHOICE = "\nUngültige Eingabe!";
    public static final String MSG_CHOOSE_INDEX_DELETE = "\nWählen sie bitte eine Notiz zum Löschen aus:";
    public static final String MSG_DELETE_SUCCESSFUL = "\nNotiz wurde erfolgreich gelöscht.";
    public static final String MSG_INPUT_NOTE_DATA = "\nGeben sie bitte folgende Informationen der Notiz ein:";
    public static final String MSG_INPUT_TITLE = "Titel:";
    public static final String MSG_INPUT_CONTENT = "Inhalt:";
    public static final String MSG_INPUT_IMPORTANT = "Wichtig?";
    public static final String MSG_CHOOSE_INDEX_EDIT = "\nWählen sie bitte eine Notiz zum Bearbeiten aus.";
    public static final String MSG_INVALID_TITLE = "\nUngültiger Titel. Der Titel muss zwischen %d und %d Zeichen haben.";
    public static final String MSG_IVALID_CONTENT = "\nUngültiger Inhalt. Der Inhalt darf maximal %d Zeichen haben.";
    public static final String MSG_NOTE_CREATION_SUCCESSFUL = "\nNotiz wurde erfolgreich angelegt.";
    public static final String MSG_NOTE_EDIT_SUCCESSFUL = "\nNotiz wurde erfolgreich bearbeitet.";
    public static final String FORMAT_STRING_NOTE = "%5d %20s %100s %10s\n";
    public static final String FORMAT_STRING_NOTE_HEADER = "\n%5s %20s %100s %10s\n";
    public static final String INDEX = "Index";
    public static final String CONTENT = "Inhalt";
    public static final String IMPORTANT = "Wichtig";
    public static final String TITLE = "Titel";
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor

    /**
     * Privater Konstruktor um Objekterzeugung von außen zu verhindern.
     */
    private AppTexts() {}
    //endregion

    //region Methoden
    //endregion
}
