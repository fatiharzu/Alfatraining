package woche05.tag01.telefonbuch.badcode;


import woche05.tag01.telefonbuch.Text.Text;
import woche05.tag01.telefonbuch.logic.CsvFileHandler;
import woche05.tag01.telefonbuch.model.Kontakte;
import woche05.tag01.telefonbuch.model.Telefonbuch;

import java.util.*;

public class Main
{
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        // Mit Hilfe der Klasse Scanner könne Daten von der Konsole oder aus einer Datei lesen?
        
        Telefonbuch tb = new Telefonbuch();


        int i=0;
        while(i==0)

        {
            //Hauptmenu auf der Konsole ausgeben lassen
            
            {
                System.out.println(Text.APPLICATION_NAME);
                System.out.println(Text.MENUE_AUSWAHL);
                System.out.println(Text.WUNSCH);
    
                int n = Integer.parseInt(scanner.nextLine());

                // region 0. Kontakt Hinzufügen

                if (n == 1) {
    
                    Kontakte obj = new Kontakte();
    
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
                    List<Kontakte> obj = tb.viewAllContacts();
                    
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
                    
                    Long ln1 = Long.parseLong(scanner.nextLine());
                    
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
                    Long ln1 = Long.parseLong(scanner.nextLine());
                    System.out.println("Möchten Sie den Kontakt entfernen (J/N):");
                    char cChar = scanner.nextLine().charAt(0);
                    if (cChar =='J' ) {
    
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
