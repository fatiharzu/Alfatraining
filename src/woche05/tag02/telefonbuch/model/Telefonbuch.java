package de.schoenercode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Verwaltet eine Liste von {@link de.schoenercode.model.Kontakt}en
 * und bietet Wrapping-Methoden für
 * das Einfügen und Suchen an
 */
public class Telefonbuch {

    //region Konstanten
    private static final int STANDARD_WERT_INDEX = -1;
    //endregion

    //region Attribute
    private List<de.schoenercode.model.Kontakt> alleKontakte;
    //endregion

    //region Konstruktor

    /**
     * Generiert die interene {@link List} von {@link de.schoenercode.model.Kontakt}en
     */
    public Telefonbuch() {
        this.alleKontakte = new ArrayList<>();
    }

    //endregion

    //region Getter & Setter
    public List<de.schoenercode.model.Kontakt> getAlleKontakte() {
        return alleKontakte;
    }
    //endregion

    //region Methoden

    /**
     * Fuegt einen {@link de.schoenercode.model.Kontakt} zu internene Liste hinzu
     *
     * @param kontaktZumHinzufuegen : {@link de.schoenercode.model.Kontakt} : Der hinzugefuegt werden soll
     */
    public void kontaktHinzufuegen(de.schoenercode.model.Kontakt kontaktZumHinzufuegen) {
        this.alleKontakte.add(kontaktZumHinzufuegen);
    }

    /**
     * Sucht den Kontakt auf Basis der uebergebenen Telefonnummer sollte dieser Kontakt
     * auch existieren.
     *
     * @param gesuchteTelefonnummer : {@link String} : Gesuchte Telefonnummer eines Kontaktes
     * @return gesuchterKontakt : {@link de.schoenercode.model.Kontakt} : Gesuchter Eintrag oder null sollte der Kontakt
     * unter der angegebenene Telefonnummer nicht existieren
     */
    public de.schoenercode.model.Kontakt sucheKontaktAnhandTelefonnummer(String gesuchteTelefonnummer) {
        de.schoenercode.model.Kontakt gesuchterKontakt = null;

        int indexDesGesuchtenKontakte = this.getIndexDesGesuchtenKontaktes(gesuchteTelefonnummer);

        if (indexDesGesuchtenKontakte > STANDARD_WERT_INDEX) {
            gesuchterKontakt = this.alleKontakte.get(indexDesGesuchtenKontakte);
        }

        return gesuchterKontakt;
    }

    /**
     * Loescht den Kontakt auf Basis der uebergebenen Telefonnummer sollte dieser Kontakt
     * auch existieren. Ist das nicht der Fall wird der Kontakt nicht geloescht
     *
     * @param gesuchteTelefonnummer : {@link String} : Gesuchte Telefonnummer eines Kontaktes
     */
    public boolean loescheKontaktAnhandTelefonnummer(String gesuchteTelefonnummer) {
        boolean geloescht = false;

        int indexDesZuLoeschendenKontaktes = getIndexDesGesuchtenKontaktes(gesuchteTelefonnummer);

        if (indexDesZuLoeschendenKontaktes > STANDARD_WERT_INDEX) {
            this.alleKontakte.remove(indexDesZuLoeschendenKontaktes);
            geloescht = true;
        }

        return geloescht;
    }

    /**
     * Sucht nach der mitgelieferten Telefonnummer innerhalb der {@link Telefonbuch#alleKontakte}
     * und gibt den Index zurueck
     *
     * @param gesuchteTelefonnummer : {@link String} : Gesuchte Telefonnummer eines Kontaktes
     * @return indexDesGesuchteKontaktes : int : Valider Index oder {@link Telefonbuch#STANDARD_WERT_INDEX} bei nicht
     * gefundenem Kontakt
     */
    private int getIndexDesGesuchtenKontaktes(String gesuchteTelefonnummer) {
        int indexDesGesuchtenKontaktes = STANDARD_WERT_INDEX;

        for (int index = 0; index < this.alleKontakte.size(); index++) {

            de.schoenercode.model.Kontakt aktuellerKontakt = this.alleKontakte.get(index);

            if (aktuellerKontakt.getTelefonnummer().equalsIgnoreCase(gesuchteTelefonnummer)) {
                indexDesGesuchtenKontaktes = index;
            }
        }
        return indexDesGesuchtenKontaktes;
    }
    //endegion
}
