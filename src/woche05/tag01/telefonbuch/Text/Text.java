package woche05.tag01.telefonbuch.Text;

public class Text {

    //region 0. Allgemein
    public static final String APPLICATION_NAME = "\n\n#######################"
            + "\n# Mein Telefonbuch ##"
            + "\n#######################\n\n";

    public static final String MENUE_AUSWAHL = "Menu" +" \n\n1.Kontakt hinzufügen \n2.Alle Kontakte anzeigen \n3.Einen Kontakt suchen \n4.Kontakt löschen \n5.Daten in Csv Datei speichern \n6.Exit";
    public static final String WUNSCH = "\nWählen Sie Bitte ein Zahl von 1 bis 6 :";


    //endregion

    /**
     * Kann nicht mit new instanziiert
     * werden. Da diese Klasse nur Konstanten enthaelt
     */

    private Text(){

    }
}
