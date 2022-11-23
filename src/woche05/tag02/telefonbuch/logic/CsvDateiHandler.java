package woche05.tag02.telefonbuch.logic;

import de.schoenercode.model.Kontakt;
import de.schoenercode.model.Telefonbuch;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Dieser Singleton übernimmt das synchronisierte und zugriffssichere Dateihandling
 */
public class CsvDateiHandler {

    //region Konstanten
    private static final String CSV_DATEIPFAD = "src/de/schoenercode/resource/telfonbuch.csv";
    //endregion

    //region Attribute
    private static CsvDateiHandler instanz;
    //endregion

    //region Konstruktor
    private CsvDateiHandler() {

    }
    //endregion

    //region Methoden
    public static synchronized CsvDateiHandler getInstanz() {
        if (instanz == null) {
            instanz = new CsvDateiHandler();
        }

        return instanz;
    }

    /**
     * Speichert die Daten hier {@link CsvDateiHandler#CSV_DATEIPFAD}
     *
     * @param telefonbuchZumSpeichern : {@link Telefonbuch} : Zu speicherndes Telefonbuch
     */
    public void speichereTelefonbuchInCsvDatei(Telefonbuch telefonbuchZumSpeichern) {

        PrintWriter pw = null;

        try {

            File csvDatei = new File(CSV_DATEIPFAD);

            if (!csvDatei.exists()) csvDatei.createNewFile();

            pw = new PrintWriter(csvDatei);
            StringBuilder gesamtesTelefonbuch = new StringBuilder();

            for (Kontakt k : telefonbuchZumSpeichern.getAlleKontakte()) {
                gesamtesTelefonbuch.append(k.getAlleAttributeAlsCsvZeile());
            }

            pw.write(gesamtesTelefonbuch.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

    }

    /**
     * Liest aus der folgenden Datei {@link CsvDateiHandler#CSV_DATEIPFAD} das
     * gesamte {@link Telefonbuch} aus und liefert es zurück
     *
     * @return telefonbuchAusCsvDatei : {@link Telefonbuch} : Aus Datei gelesenes Telefonbuch
     */
    public Telefonbuch leseTelefonbuchAusCsvDatei() {

        Telefonbuch telefonbuchAusCsvDatei = new Telefonbuch();

        FileInputStream   fis;
        InputStreamReader isr;
        BufferedReader    in  = null;

        try {
            File csvDatei = new File(CSV_DATEIPFAD);

            if (csvDatei.exists()) {
                fis = new FileInputStream(csvDatei);
                isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                in = new BufferedReader(isr);

                boolean endeDerDateiErreicht = false;

                while (!endeDerDateiErreicht) {
                    String strGelesenCsvZeile = in.readLine();

                    if (strGelesenCsvZeile == null) {
                        endeDerDateiErreicht = true;
                    } else {
                        Kontakt kontaktVonCsvDatei = new Kontakt();

                        kontaktVonCsvDatei.setAlleAttributeDurchCsvZeile(strGelesenCsvZeile);

                        telefonbuchAusCsvDatei.kontaktHinzufuegen(kontaktVonCsvDatei);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return telefonbuchAusCsvDatei;
    }
    //endregion


}
