package de.schoenercode.settings;

/**
 * Stellt alle Nutzerbefehle als öffentliche Konstanten zur Verfügung.
 * Deswegen kann auch kein Objekt dieser Klasse von aussen generiert werden.
 */
public class Nutzerbefehle {

    //region Konstanten
    public static final int KONTAKT_HINZUFUEGEN = 1;
    public static final int TELEFONBUCH_ANZEIGEN = 2;
    public static final int KONTAKTE_NACH_TELEFONNUMMER_SUCHEN = 3;
    public static final int KONTAKTE_NACH_TELEFONNUMMER_BEARBEITEN = 4;
    public static final int KONTAKTE_NACH_TELEFONNUMMER_LOESCHEN = 5;
    public static final int TELEFONBUCH_SPEICHERN = 6;
    public static final int PROGRAMM_BEENDEN = 7;
    //endregion

    //region Konstruktor
    private Nutzerbefehle() {

    }
    //endregion

}