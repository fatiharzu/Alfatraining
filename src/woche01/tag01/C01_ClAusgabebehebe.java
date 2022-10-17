package woche01.tag01;

/**
 * <h2>Ausgabebefehle</h2>
 * <p>
 *     Dieses Programm zeigt folgende Themengebiete:
 * </p>
 * <ul>
 *     <li>Ausgabebefehle</li>
 *     <li>Escapesequenzen / Whitespace characters</li>
 * </ul>
 *
 * <h2>Zusatzinformationen</h2>
 * <ul>
 *     <li>Strg + Q: Öffnet die Quick-Dokumentation einer Klasse/Methode</li>
 *     <li>Strg + Alt + Q: Schaltet JavaDoc-Kommentar Modus um (Anzeigen <-> Bearbeiten)</li>
 *     <li>Strg + D: Zeile duplizieren</li>
 *     <li>Strg + Y: Zeile löschen // Letzte rückgängig gemachte Änderung wiederherstellen</li>
 *     <li>Strg + Z: Letzte Änderung rückgängig machen</li>
 *     <li>Strg + Shift Z: Letzte rückgängig gemachte Änderung wiederherstellen</li>
 *     <li>Strg + Leertaste: Öffnen der Autovervollständigung</li>
 *     <li>Alt + Shift + Pfeiltaste Oben/Unten: Zeilen nach unten oder oben verschieben</li>
 *     <li>Strg + Shift + F10: Programm zum ersten mal ausführen</li>
 *     <li>Shift + F10: Programm ausführen</li>
 * </ul>
 * <h3>Kommentare</h3>
 * <ul>
 *     <li>
 *         JavaDoc-Kommentar: Eingeleitet durch Schrägstrich und zwei Sterne, beendet durch Stern und Schrägstrich <br>
 *             Diese Kommentare werden in der Dokumentation von Projekten angezeigt.
 *     </li>
 *     <li>
 *         Zeilenkommentar: Eingeleitet durch zwei Schrägstriche
 *     </li>
 *     <li>
 *         Mehrzeilige Kommentare: Eingeleitet durch einen Schrägstrich und ein Stern,
 *         beendet durch ein Stern und einen Schrägstrich
 *     </li>
 * </ul>
 */
public class C01_ClAusgabebehebe {

    /**
     * Wird als Erstes beim Programmstart einer Java-Applikation ausgeführt. Dient also als Einstiegspunkt
     * in unser Programm
     *
     * @param args : Startparameter, Zusatzinfos brauchen wir an dieser Stelle noch nicht
     */
    public static void main(String[] args) {
        //Kommentar: einzeilig!!!

        /*
        Kommentar:
        mehrzeilig
        !!!
         */

        //Drucken eines Textes in Anführungszeichen auf der Standardausgabe / Konsole
        System.out.println("====================");
        System.out.println("= ClAusgabebefehle =");
        System.out.println("====================");

        //Standardausgabe mit Escapesequenzen
        System.out.println("\nAusgabe mit System.out.println(\"Zeichenkette\"); druckt die Zeichenkette genau so," +
                " wie sie in den Anführungszeichen steht.");

        //Auflistung der meistgenutzten Escapesequenzen
        System.out.println("\n-> \\n macht einen Zeilenumbruch");
        System.out.println("-> \\t macht einen Tab");
        System.out.println("-> \\\\ macht einen Backslash");
        System.out.println("-> \\\' macht ein Hochkomma");
        System.out.println("-> \\\" macht ein Anführungszeichen");
    }
}
