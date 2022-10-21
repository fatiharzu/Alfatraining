package woche03.tag05.ClBerndsNotizen.model;





/**
 * Diese Klasse stellt eine Notiz aus der realen Welt dar.
 * Sie enthält Titel, Inhalt und eine Flag, welche anzeigt,
 * ob die Notiz wichtig ist oder nicht.
 */
public class Note {

    //region Konstanten
    public static final String DEFAULT_STRING_VALUE = ">noValueSetYet<";
    private static final boolean DEFAULT_BOOL_VALUE = false;
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
     * TODO 4.1 Konstruktor anlegen, welcher Attribute anhand einer CSV-Zeile initialisiert
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
     * TODO 3 Methode um Csv-String zu erzeugen implementieren
     */
    public String getAttributesAsCsvLine() {
        return title + FileHandler.DELIMITER + content + FileHandler.DELIMITER + isImportant + "\n";
    }

    /**
     * Befüllt alle Attribute mittels eines Csv-Strings
     *
     * @param csvLine : {@link String} : Csv-String mit Attributwerten
     * TODO 4 Methode zum Befüllen der Attribute anhand eines CSV-String implementieren
     */
    public void setAttributesFromCsvLine(String csvLine) {
        String[] allAttributes = csvLine.split(FileHandler.DELIMITER);

        title = allAttributes[0];
        content = allAttributes[1];
        isImportant = Boolean.parseBoolean(allAttributes[2]);
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
