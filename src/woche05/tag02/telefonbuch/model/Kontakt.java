package de.schoenercode.model;

/**
 * Diese Modellklasse
 * repräsentiert einen einzelnen
 * Kontakt innerhalb eines {@link Telefonbuch}s
 */
public class Kontakt {

    //region Konstanten
    private static final String STANDARD_WERT_STRINGS = ">nochKeinWertGesetzt<";

    private static final String TRENNZEICHEN = ";";

    private static final int INDEX_VORNAMEN = 0;
    private static final int INDEX_NACHNAMEN = 1;
    private static final int INDEX_EMAIL = 2;
    private static final int INDEX_TELEFONNUMMER = 3;
    //endregion

    //region Attribute
    private String vorname;
    private String name;
    private String email;

    private String telefonnummer;
    //endregion

    //region Konstruktor
    public Kontakt() {
        this.vorname = STANDARD_WERT_STRINGS;
        this.name = STANDARD_WERT_STRINGS;
        this.email = STANDARD_WERT_STRINGS;

        this.telefonnummer = STANDARD_WERT_STRINGS;
    }
    //endregion


    //region Getter & Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String strVorname) {
        this.vorname = strVorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String strNachname) {
        this.name = strNachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String strEmail) {
        this.email = strEmail;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String lngTelefonnummer) {
        this.telefonnummer = lngTelefonnummer;
    }

    public String getAlleAttributeAlsCsvZeile() {
        return this.vorname + TRENNZEICHEN
                + this.name + TRENNZEICHEN
                + this.email + TRENNZEICHEN
                + this.telefonnummer + "\n";
    }

    public void setAlleAttributeDurchCsvZeile(String strCsvZeile) {
        String[] strAlleAttribute = strCsvZeile.split(TRENNZEICHEN);

        this.vorname = strAlleAttribute[INDEX_VORNAMEN];
        this.name = strAlleAttribute[INDEX_NACHNAMEN];
        this.email = strAlleAttribute[INDEX_EMAIL];

        this.telefonnummer = strAlleAttribute[INDEX_TELEFONNUMMER];
    }
    //endregion

    //region toString

    @Override
    public String toString() {
        return "Kontakt{" +
                "vorname='" + vorname + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }

    //endregion
}
