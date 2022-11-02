package woche05.tag01.telefonbuch.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import woche05.tag01.telefonbuch.model.Kontakte;
import woche05.tag01.telefonbuch.model.Telefonbuch;

public class CsvFileHandler {

    public CsvFileHandler(){}


    public void createCSVFile(Telefonbuch tb) {
        try {
            
            PrintWriter pw = new PrintWriter(new File("src/de/resource/List.csv"));
            StringBuilder sb = new StringBuilder();

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

}
