package woche05.tag01.TelefonBuchTodoKommentare.badcode;


import woche05.tag01.TelefonBuchTodoKommentare.Text.Text;
import woche05.tag01.TelefonBuchTodoKommentare.logic.CsvFileHandler;
import woche05.tag01.TelefonBuchTodoKommentare.model.Kontakte;
import woche05.tag01.TelefonBuchTodoKommentare.model.Telefonbuch;

import java.util.*;

//TODO 12 Nicht objektorientiert programmiert und Verstoß gegen das Single-Responsibility-Prinzip
//TODO 12.1 UiController
public class Main
{

    //TODO 28 NumberFormatExceptions nicht abgefangen (Eingaben werden nicht überprüft)
    //TODO 29 while-Schleife mit boolean-Variable und Abbruch auch durch diese Variable
    //TODO 30 Endlos-while-Schleife und Programm wird "hart" abgebrochen
    //TODO 31 User-Kommandos sind unwartbar durch fehlende Konstanten
    //TODO 31.1 Das Prüfen der Nutzereingabe kann durch ein Switch-Case-Statement realisiert werden
    //TODO 32 Auslesen der CSV-Datei fehlt
    //TODO 33 Verbessern der Kontaktsuche (Falscheingabe liefert null-Kontakt)
    //TODO 34 Automatisches Speichern bei Änderungen fehlt
    //TODO 35 Bearbeiten von Kontakten implementieren
    public static void main(String args[]) {

        //TODO 13 Scanner kann durch ConsoleReader ersetzt werden
        Scanner scanner = new Scanner(System.in);
        // Mithilfe der Klasse Scanner könne Daten von der Konsole oder aus einer Datei lesen?

        //TODO 14 unaussagekräftiger Name (nur 2 Buchstaben)
        Telefonbuch tb = new Telefonbuch();


        int i=0;

        //TODO 15 Klammer hinter die Schleifenbedingung
        while(i==0)

        {
            //Hauptmenu auf der Konsole ausgeben lassen
            //TODO 16 unnötiger Anweisungsblock
            {
                System.out.println(Text.APPLICATION_NAME);
                System.out.println(Text.MENUE_AUSWAHL);
                System.out.println(Text.WUNSCH);

                //TODO 17 unaussagekräftiger Name
                int n = Integer.parseInt(scanner.nextLine());

                // region 0. Kontakt Hinzufügen

                if (n == 1) {

                    //TODO 18 unaussagekräftiger Name
                    Kontakte obj = new Kontakte();

                    //TODO 199 Texte als Konstanten auslagern
                    System.out.println("Kontakt hinzufügen: ");
                    
                    System.out.println("Vorname eingeben: ");
                    obj.setStrVorname(scanner.nextLine());
                    
                    System.out.println("Nachname eingeben: ");
                    obj.setStrNachname(scanner.nextLine());
                    
                    System.out.println("Telefonnummer eingeben. : ");
                    obj.setlTelefonnummer(Long.parseLong(scanner.nextLine()));
                    
                    System.out.println("Email eingeben: ");
                    obj.setStrEmail(scanner.nextLine());
                    
                    tb.addContact(obj);

                }
                //endregion

                //region 1. Kontakte Anzeigen
    
                if (n == 2) {
                    System.out.println("Die Kontakte in der Liste sind:");
    
//                    List<Kontakte> kontakte = tb.getAlleKontakte();
                    //TODO 20 Name nicht aussagekräftig
                    List<Kontakte> obj = tb.viewAllContacts();

                    //TODO 21 Name nicht aussagekräftig
                    for (Kontakte temp : obj) {
                        System.out.println("Vorname:" + temp.getStrVorname());
                        System.out.println("Nachname:" + temp.getStrNachname());
                        System.out.println("Telefonnummer.:" + temp.getlTelefonnummer());
                        System.out.println("Email:" + temp.getStrEmail());
                    }
                }
                //endregion

                // Region 2. Kontakte mit Hilfe Telefonnummer suchen
                if (n == 3) {
                    
                    System.out.println("Geben Sie die Telefonnummer für die Kontaktsuche ein:");

                    //TODO 22 Name nicht aussagekräftig
                    Long ln1 = Long.parseLong(scanner.nextLine());

                    //TODO 23 Name nicht aussagekräftig
                    Kontakte obj1 = tb.viewContactGivenPhone(ln1);
                    
                    System.out.println("Der Kontakt ist:");
                    System.out.println("Vorname:" + obj1.getStrVorname());
                    System.out.println("Nachname:" + obj1.getStrNachname());
                    System.out.println("Telefonnummer.:" + obj1.getlTelefonnummer());
                    System.out.println("Email:" + obj1.getStrEmail());
                }

                //endregion

                // region 3. Telefone nummer löschen
                if (n == 4) {
                    System.out.println("Geben Sie die zu entfernende Rufnummer ein:");

                    //TODO 24 Name nicht aussagekräftig
                    Long ln1 = Long.parseLong(scanner.nextLine());
                    System.out.println("Möchten Sie den Kontakt entfernen (J/N):");

                    //TODO 25 Name nicht aussagekräftig
                    char cChar = scanner.nextLine().charAt(0);
                    if (cChar =='J' ) {

                        //TODO 26 Name nicht aussagekräftig
                        boolean f1 = tb.removeContact(ln1);
                        if (f1)
                            System.out.println("Der Kontakt wird erfolgreich gelöscht");
                        else
                            System.out.println("Kontakt wird nicht gefunden");
                    }
                    if (cChar == 'N') {
                        System.out.println("ok");
                    }

                }
                // endregion

                //region 4. Csv Datei erstellen
                if (n == 5) {
                    //TODO 27 Name nicht aussagekräftig
                    CsvFileHandler csv = new CsvFileHandler();
                    csv.createCSVFile(tb);
                }
                //endregion

                // region 5. Programm beenden
                if(n==6){
                    System.exit(0);
                }
            }
        }
    }
}
