package woche03.tag01.ClEinfuerungOop.model;

/**
 * <h2>Modellklassen</h2>
 * <p>
 * Solche Klassen werden auch Datenhaltungsklassen oder
 * POJO-Klassen genannt. (Plain Old Java Object).
 * Eine Modellklasse enthält keinerlei Business-Logik.
 * Sie dient als Bauplan für Objekte und in diesen Objekten
 * werden zur Laufzeit bestimmte Daten gespeichert.
 * </p>
 *
 *
 * <h3>Sichtbarkeitsmodifikatoren</h3>
 * <ul>
 *     <li>
 *         public - Jede Klasse aus dem gesamten Projekt hat Zugriff über den Punktoperator
 *     </li>
 *     <li>
 *         private - Nur innerhalb der selben Klasse kann über den Punktoperator darauf zugegriffen werden
 *     </li>
 *     <li>
 *         kein Modifikator - Nur innerhalb des selben Packages kann über den Punktoperator darauf zugegriffen werden
 *     </li>
 *     <li>
 *         protected - Nur innerhalb des selben Packages und auch von abgeleiteten Klassen anderer Packages
 *         kann über den Punktoperator darauf zugegriffen werden
 *     </li>
 * </ul>
 *
 * <h3>Konstruktoren</h3>
 * <p>
 *     Konstruktoren dienen dazu Objekte bei der Erzeugung mit bestimmte Werten zu initialisieren.
 *     Sie werden bei der Instanziierung einer Klasse aufgerufen. Pro Klasse kann es mehrere Konstruktoren
 *     geben, welche aber eine unterschiedliche Parameterliste haben müssen, d.h. Anzahl oder Reihenfolge
 *     der Parameter müssen sich unterscheiden. Dieser Vorgang kann auch bei normalen Methoden genutzt werden
 *     und nennt sich in Java "Überladung".
 * </p>
 *
 * <h3>Getter und Setter</h3>
 * <p>
 *     Getter und Setter stellen eine öffentliche Schnittstelle dar, d.h. es sind
 *     öffentliche Methoden um Attribute von Objekten einzusehen und zu verändern.
 * </p>
 * TODO 1 Modellklasse für Häuser anlegen (Eigenschaften, Konstruktoren, Getter und Setter, toString)
 * TODO 2 Sichtbarkeitsmodifikatoren ausprobieren
 */
public class House {

    //region Konstanten
    public static final double DEF_DOUBLE_VALUE = -1d;
    public static final int DEF_INT_VALUE = -1;
    public static final String DEF_STRING_VALUE = ">noValueSetYet<";
    //endregion

    //region Attribute
    private double length;
    private double width;
    private double height;

    private int floorCount;

    private String fassadeColor;
    //endregion

    //region Konstruktor

    /**
     * Standardkonstruktor
     * Existiert auch, wenn er nicht definiert wurde.
     * Dieser Konstruktor initialisiert die Attribute mit
     * selbst definierten Standardwerten.
     */
    public House() {
        length = DEF_DOUBLE_VALUE;
        width = DEF_DOUBLE_VALUE;
        height = DEF_DOUBLE_VALUE;
        floorCount = DEF_INT_VALUE;
        fassadeColor = DEF_STRING_VALUE;
    }

    /**
     * 1. Überladener Konstruktor
     * initialisiert Länge und Fassadenfarbe mit übergebenen Werten
     * und den Rest mit den definierten Standartwerten durch einen Aufruf
     * des Standardkonstruktors
     *
     * @param length : double : Länge des Hauses
     * @param fassadeColor : {@link String} : Fassadenfarbe des Hauses
     */
    public House(double length, String fassadeColor) {
        this();
        this.length = length;
        this.fassadeColor = fassadeColor;
    }

    /**
     * 2. Überladener Konstruktor
     * initialisiert die Attribute mit übergebenen Werten
     *
     * @param length : double : Länge des Hauses
     * @param width : double : Breite des Hauses
     * @param height : double : Höhe des Hauses
     * @param floorCount : int : Stockwerkanzahl des Hauses
     * @param fassadeColor : {@link String} : Fassadenfarbe des Hauses
     */
    public House(double length, double width, double height, int floorCount, String fassadeColor) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.floorCount = floorCount;
        this.fassadeColor = fassadeColor;
    }
    //endregion

    //region Methoden

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public String getFassadeColor() {
        return fassadeColor;
    }

    public void setFassadeColor(String fassadeColor) {
        this.fassadeColor = fassadeColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", floorCount=" + floorCount +
                ", fassadeColor='" + fassadeColor + '\'' +
                '}' + super.toString();
    }

    //endregion
}
