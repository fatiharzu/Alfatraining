package de.schoenercode.ui;


import de.rhistel.logic.ConsoleReader;
import de.schoenercode.logic.CsvDateiHandler;
import de.schoenercode.model.Kontakt;
import de.schoenercode.model.Telefonbuch;
import de.schoenercode.settings.Programmtexte;
import de.schoenercode.settings.Nutzerbefehle;

/**
 * Diese Klasse zeigt das Auswahlmenue an,
 * wertet die Benutzerauswahl aus und leitet die Logik ein
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    private static UiController instanz;

    private Telefonbuch telefonbuch;

    //endregion

    //region Konstruktor
    private UiController() {
        telefonbuch = CsvDateiHandler.getInstanz().leseTelefonbuchAusCsvDatei();
    }
    //endregion

    //region Methoden
    public static synchronized UiController getInstanz() {
        if (instanz == null) {
            instanz = new UiController();
        }

        return instanz;
    }

    public void starteBenutzeroberflaeche() {
        zeigeHauptmenue();
    }

    private void zeigeHauptmenue() {

        System.out.println(Programmtexte.APPLICATION_NAME);

        boolean beendeProgramm = false;

        while (!beendeProgramm) {

            System.out.println(Programmtexte.HAUPTMENUE);
            System.out.println(Programmtexte.MENUE_AUSWAHL);

            int nutzerBefehl = ConsoleReader.in.readPositivInt();

            switch (nutzerBefehl) {
                case Nutzerbefehle.KONTAKT_HINZUFUEGEN -> kontaktZumTelefonbuchHinzufuegen();
                case Nutzerbefehle.TELEFONBUCH_ANZEIGEN -> telefonbuchAnzeigen();
                case Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_SUCHEN -> kontaktNachTelefonnummerSuchen();
                case Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_BEARBEITEN -> kontaktNachTelefonnummerBearbeiten();
                case Nutzerbefehle.KONTAKTE_NACH_TELEFONNUMMER_LOESCHEN -> kontaktNachTelefonnummerLoeschen();
                case Nutzerbefehle.TELEFONBUCH_SPEICHERN -> telefonbuchSpeichern();
                case Nutzerbefehle.PROGRAMM_BEENDEN -> beendeProgramm = true;
                default -> System.out.println(Programmtexte.FALSCHE_EINGABE);
            }

        }

        System.out.println("Möchten sie die Änderungen am Telefonbuch speichern?");

        if (ConsoleReader.in.readMandatoryAnswerToBinaryQuestion()) {
            telefonbuchSpeichern();
        }
    }

    /**
     * Fügt einen auf der Konsole eingegebenen Kontakt
     * dem Telefonbuch hinzu
     */
    private void kontaktZumTelefonbuchHinzufuegen() {

        Kontakt kontaktZumHinzufuegen = new Kontakt();
        System.out.println(Programmtexte.KONTAKT_HINZUFUEGEN);

        System.out.println(Programmtexte.VORNAME);
        kontaktZumHinzufuegen.setVorname(ConsoleReader.in.readMandatoryString());

        System.out.println(Programmtexte.NAME);
        kontaktZumHinzufuegen.setName(ConsoleReader.in.readMandatoryString());

        System.out.println(Programmtexte.EMAIL);
        kontaktZumHinzufuegen.setEmail(ConsoleReader.in.readMandatoryString());

        System.out.println(Programmtexte.TELEFONNUMMER);
        kontaktZumHinzufuegen.setTelefonnummer(ConsoleReader.in.readMandatoryString());

        this.telefonbuch.kontaktHinzufuegen(kontaktZumHinzufuegen);
    }

    private void telefonbuchAnzeigen() {
        System.out.println(Programmtexte.TELEFONBUCH);

        System.out.printf(Programmtexte.KONTAKT_KOPFZEILE_FORMAT_STRING, Programmtexte.NAME,
                Programmtexte.VORNAME, Programmtexte.EMAIL, Programmtexte.TELEFONNUMMER, Programmtexte.EMAIL_UNTERSTRICH,
                Programmtexte.NAME_UNTERSTRICH, Programmtexte.VORNAME_UNTERSTRICH, Programmtexte.TELEFONNUMMER_UNTERSTRICH);

        for (Kontakt aktuellerKontakt : this.telefonbuch.getAlleKontakte()) {
            System.out.printf(Programmtexte.KONTAKT_FORMAT_STRING, aktuellerKontakt.getName(),
                    aktuellerKontakt.getVorname(), aktuellerKontakt.getEmail(), aktuellerKontakt.getTelefonnummer());
        }
    }

    /**
     * Sucht einen Kontakt anhand einer auf der Konsole
     * eingegebenen Telefonnummer
     */
    private void kontaktNachTelefonnummerSuchen() {
        System.out.println(Programmtexte.GEBEN_SIE_DIE_GESUCHTE_NUMMER_EIN);

        String gesuchteTelefonnummer = ConsoleReader.in.readMandatoryString();

        Kontakt gesuchterKontakt = telefonbuch.sucheKontaktAnhandTelefonnummer(gesuchteTelefonnummer);

        if (gesuchterKontakt != null) {
            System.out.println(Programmtexte.GESUCHTER_KONTAKT);
            System.out.println(Programmtexte.VORNAME + gesuchterKontakt.getVorname());
            System.out.println(Programmtexte.NAME + gesuchterKontakt.getName());
            System.out.println(Programmtexte.EMAIL + gesuchterKontakt.getEmail());
            System.out.println(Programmtexte.TELEFONNUMMER + gesuchterKontakt.getTelefonnummer());
        } else {
            System.out.println(Programmtexte.ES_WURDE_KEIN_KONTAKT_MIT_DIESER_NUMMER_GEFUNDEN);
        }

    }

    /**
     * Bearbeitet einen Kontakt anhand der auf der Konsole
     * eingegebenen Telefonnummer und neuer Werte
     */
    private void kontaktNachTelefonnummerBearbeiten() {
        System.out.println(Programmtexte.GEBEN_SIE_DIE_GESUCHTE_NUMMER_EIN);

        String gesuchteTelefonnummer = ConsoleReader.in.readMandatoryString();

        Kontakt gesuchterKontakt = telefonbuch.sucheKontaktAnhandTelefonnummer(gesuchteTelefonnummer);

        if (gesuchterKontakt != null) {
            System.out.println(Programmtexte.VORNAME);
            String vorname = ConsoleReader.in.readString();

            System.out.println(Programmtexte.NAME);
            String name = ConsoleReader.in.readString();

            System.out.println(Programmtexte.EMAIL);
            String email = ConsoleReader.in.readString();

            System.out.println(Programmtexte.TELEFONNUMMER);
            String telefonnummer = ConsoleReader.in.readString();

            if (!vorname.isEmpty()) gesuchterKontakt.setVorname(vorname);
            if (!name.isEmpty()) gesuchterKontakt.setName(name);
            if (!email.isEmpty()) gesuchterKontakt.setEmail(email);
            if (!telefonnummer.isEmpty()) gesuchterKontakt.setTelefonnummer(telefonnummer);

        } else {
            System.out.println(Programmtexte.ES_WURDE_KEIN_KONTAKT_MIT_DIESER_NUMMER_GEFUNDEN);
        }

    }

    /**
     * Löscht einen Kontakt anhand einer auf der Konsole
     * eingegebenen Telefonnummer
     */
    private void kontaktNachTelefonnummerLoeschen() {
        System.out.println(Programmtexte.GEBEN_SIE_DIE_NUMMER_DES_ZU_LOESCHENDEN_KONTAKTES_EIN);
        String gesuchteTelefonnummer = ConsoleReader.in.readMandatoryString();

        System.out.println(Programmtexte.FRAGE_MOECHTEN_SIE_DEN_KONTAKT_LOESCHEN);
        boolean loescheDenKontakt = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

        if (loescheDenKontakt) {
            boolean geloescht = this.telefonbuch.loescheKontaktAnhandTelefonnummer(gesuchteTelefonnummer);

            if (geloescht) {
                System.out.println(Programmtexte.KONTAKT_ERFOLGREICH_GELOESCHT);
            } else {
                System.out.println(Programmtexte.ES_WURDE_KEIN_KONTAKT_MIT_DIESER_NUMMER_GEFUNDEN);
            }
        }
    }

    private void telefonbuchSpeichern() {
        CsvDateiHandler.getInstanz().speichereTelefonbuchInCsvDatei(telefonbuch);
    }
    //endregion

}