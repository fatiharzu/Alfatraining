package woche03.tag04.ClBerndsNotizen.settings;

/**
 * Stellt allgemeine Notizwerte zur Verfügung,
 * welche im gesamten Projekt genutzt werden können.
 * Hier werden sie z.B. zur Wertvalidation der Nutzereingaben
 * genutzt.
 * TODO 3 NoteSettings-Klasse implementieren und Wertgrenzen festlegen
 */
public class NoteSettings {

    //region Konstanten
    public static final int MIN_LENGTH_TITLE = 3;
    public static final int MAX_LENGTH_TITLE = 20;

    public static final int MAX_LENGTH_CONTENT = 100;
    //endregion

    //region Konstruktor
    private NoteSettings() {}
    //endregion

}
