package de.schoenercode.settings;

/**
 * Stellt alle Programmtext als öffentliche Konstanten zur Verfügung.
 * Deswegen kann auch kein Objekt dieser Klasse von aussen generiert werden.
 */
public class Programmtexte {

    //region Konstanten
    public static final String APPLICATION_NAME = """

			####################
			# Mein Telefonbuch #
			####################
			""";

    public static final String HAUPTMENUE =
            "\nHauptmenü\n=========" + " \n\n" + de.schoenercode.settings.Nutzerbefehle.KONTAKT_HINZUFUEGEN + ". Kontakt hinzufügen" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.TELEFONBUCH_ANZEIGEN + ". Alle Kontakt anzeigen" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_SUCHEN + ". Kontakt suchen" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_BEARBEITEN + ". Kontakt bearbeiten" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_LOESCHEN + ". Kontakt löschen" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.TELEFONBUCH_SPEICHERN + ". Kontakte speichern" +
                    "\n" + de.schoenercode.settings.Nutzerbefehle.PROGRAMM_BEENDEN + ". Beenden";

    public static final String MENUE_AUSWAHL =
            "\nWählen Sie Bitte ein Zahl von " + de.schoenercode.settings.Nutzerbefehle.KONTAKT_HINZUFUEGEN
                    + " bis " + de.schoenercode.settings.Nutzerbefehle.PROGRAMM_BEENDEN + " :";

    public static final String TELEFONBUCH                                           = "\nTelefonbuch:";
    public static final String GEBEN_SIE_DIE_GESUCHTE_NUMMER_EIN                     =
            "Geben Sie die gesuchte Telefonnummer:";
    public static final String GEBEN_SIE_DIE_NUMMER_DES_ZU_LOESCHENDEN_KONTAKTES_EIN =
            "Geben Sie die Rufnummer des zu loeschenden Kontaktes ein:";
    public static final String KONTAKT_HINZUFUEGEN                                   = "Kontakt hinzufügen:\n";
    public static final String GESUCHTER_KONTAKT                                     = "Gesuchter Kontakt:\n";
    public static final String FRAGE_MOECHTEN_SIE_DEN_KONTAKT_LOESCHEN               =
            "Möchten Sie den Kontakt loeschen?";
    public static final String KONTAKT_ERFOLGREICH_GELOESCHT                         = "Kontakt erfolgreich geloescht";

    public static final String KONTAKT_FORMAT_STRING = "%30s %30s %30s %30s %n";
    public static final String KONTAKT_KOPFZEILE_FORMAT_STRING = KONTAKT_FORMAT_STRING + KONTAKT_FORMAT_STRING + " %n";
    public static final String INDEX = "Index";
    public static final String NAME = "Name";
    public static final String VORNAME = "Vorname";
    public static final String EMAIL = "Email";
    public static final String TELEFONNUMMER = "Telefonnummer";
    public static final String NAME_UNTERSTRICH = "====";
    public static final String VORNAME_UNTERSTRICH = "=======";
    public static final String EMAIL_UNTERSTRICH = "=====";
    public static final String TELEFONNUMMER_UNTERSTRICH = "=============";
    public static final String FALSCHE_EINGABE = "Falsche Eingabe";
    public static final String ES_WURDE_KEIN_KONTAKT_MIT_DIESER_NUMMER_GEFUNDEN =
            "Es wurde kein Kontakt mit dieser Nummer gefunden.";


    //endregion

    //region Konstruktor
    private Programmtexte() {

    }
    //endregion
}
