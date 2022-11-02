package woche05.tag01.TelefonBuchTodoKommentare.logic;

import woche05.tag01.TelefonBuchTodoKommentare.model.Kontakte;
import woche05.tag01.TelefonBuchTodoKommentare.model.Telefonbuch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



//TODO 36 Kein Klassenkommantar
public class CsvFileHandler {

    //TODO 37 KEIN SINGLETON!!! und nicht SYNCHRONIZED!!!
    public CsvFileHandler(){}


    public void createCSVFile(Telefonbuch tb) {
        try {

            //TODO 38 Dateipfad klein schreiben und als Konstante definieren
            //TODO 39 Überprüfen ob Datei existiert, falls nicht -> anlegen
            PrintWriter pw = new PrintWriter(new File("src/de/resource/List.csv"));
            StringBuilder sb = new StringBuilder();

            //TODO 40 Kopfzeile der Csv-Datei ist unnötig
            sb.append("Vorname");
            sb.append(";");
            sb.append("Nachname");
            sb.append(";");
            sb.append("Telefonnummer");
            sb.append(";");
            sb.append("Email\n");

            for (Kontakte kontakte :tb.getTelefonbuch()) {
                sb.append(kontakte.getStrVorname());
                sb.append(";");
                sb.append(kontakte.getStrNachname());
                sb.append(";");
                sb.append(kontakte.getlTelefonnummer());
                sb.append(";");
                sb.append(kontakte.getStrEmail());
                sb.append("\n");
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("Der Datei Telefonbuch.csv ist erstellt.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    //TODO 32.1 Auslesen der CSV-Datei implementieren

}
