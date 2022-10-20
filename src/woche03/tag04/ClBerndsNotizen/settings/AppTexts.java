package woche03.tag04.ClBerndsNotizen.settings;

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
