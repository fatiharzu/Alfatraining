package woche04.tag01.ClBerndsNotizen.model;


import woche04.tag01.ClBerndsNotizen.logic.FileHandler;

/**
 * Diese Klasse stellt eine Notiz aus der realen Welt dar.
 * Sie enthält Titel, Inhalt und eine Flag, welche anzeigt,
 * ob die Notiz wichtig ist oder nicht.
 */
public class Note {

    //region Konstanten
    public static final String DEFAULT_STRING_VALUE = ">noValueSetYet<";
    private static final boolean DEFAULT_BOOL_VALUE = false;
    public static final int INDEX_TITLE = 0;
    public static final int INDEX_CONTENT = 1;
    public static final int INDEX_IS_IMPORTANT = 2;
    //endregion

    //region Attribute
    private String title;
    private String content;
    private boolean isImportant;
    //endregion

    //region Konstruktor

    /**
     * Standardkonstruktor, welcher Eigenschaften mit eigenen
     * Standardwerten initialisiert.
     */
    public Note() {
        title = DEFAULT_STRING_VALUE;
        content = DEFAULT_STRING_VALUE;
        isImportant = DEFAULT_BOOL_VALUE;
    }

    public Note(String title, String content) {
        this();
        this.title = title;
        this.content = content;
    }

    public Note(String title, String content, boolean isImportant) {
        this.title = title;
        this.content = content;
        this.isImportant = isImportant;
    }

    /**
     * Überladener Konstruktor, welcher ine CSV-Zeile entgegennimmt
     * und über eine passende Methode alle Attribute initialisiert.
     *
     * @param csvLine : {@link String} : Csv-Zeile mit Attributen
     */
    public Note(String csvLine) {
        setAttributesFromCsvLine(csvLine);
    }

    //endregion

    //region Methoden

    /**
     * Liefert ale Attribute als Csv-String zurück.
     * D.h. ein String mit Attributwerten getrennt durch ein bestimmtes Trennzeichen
     *
     * @return {@link String} : Csv-Zeile
     */
    public String getAttributesAsCsvLine() {
        return title + FileHandler.DELIMITER + content + FileHandler.DELIMITER + isImportant + "\n";
    }

    /**
     * Befüllt alle Attribute mittels eines Csv-Strings
     *
     * @param csvLine : {@link String} : Csv-String mit Attributwerten
     */
    private void setAttributesFromCsvLine(String csvLine) {
        String[] allAttributes = csvLine.split(FileHandler.DELIMITER);

        title = allAttributes[INDEX_TITLE];
        content = allAttributes[INDEX_CONTENT];
        isImportant = Boolean.parseBoolean(allAttributes[INDEX_IS_IMPORTANT]);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isImportant=" + isImportant +
                '}';
    }

    //endregion
}
