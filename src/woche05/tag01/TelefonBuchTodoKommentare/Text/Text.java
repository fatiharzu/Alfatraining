package woche05.tag01.TelefonBuchTodoKommentare.Text;
//TODO 9 Kein Klassenkommentar
//TODO 10 Package-Namen werden klein geschrieben
//TODO 10.1 Klassenname ist nicht sprechend genug
public class Text {

    //region 0. Allgemein
    //TODO 11 String als Textblock darstellen
    public static final String APPLICATION_NAME = "\n\n#######################"
            + "\n# Mein Telefonbuch ##"
            + "\n#######################\n\n";

    public static final String MENUE_AUSWAHL = "Menu" +" \n\n1.Kontakt hinzufügen " +
            "\n2.Alle Kontakte anzeigen " +
            "\n3.Einen Kontakt suchen " +
            "\n4.Kontakt löschen " +
            "\n5.Daten in Csv Datei speichern " +
            "\n6.Exit";
    public static final String WUNSCH = "\nWählen Sie Bitte ein Zahl von 1 bis 6 :";


    //endregion

    /**
     * Kann nicht mit new instanziiert
     * werden. Da diese Klasse nur Konstanten enthaelt
     */

    private Text(){

    }
}
