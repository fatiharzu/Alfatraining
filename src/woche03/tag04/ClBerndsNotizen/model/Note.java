package woche03.tag04.ClBerndsNotizen.model;

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

    //endregion

    //region Methoden

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
