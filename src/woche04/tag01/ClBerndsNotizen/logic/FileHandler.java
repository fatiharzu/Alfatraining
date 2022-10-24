package woche04.tag01.ClBerndsNotizen.logic;


import woche04.tag01.ClBerndsNotizen.model.Note;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Datei-Handling durch FileHandler</h2>
 * <h3>Funktionalität</h3>
 * <p>
 * Diese Klasse speichert die Daten dieses Programms
 * in eine selbst generierte CSV-Datei.
 * <b>C</b>haracter/Comma <b>S</b>eparated <b>V</b>alues
 * </p>
 *
 * <h3>Speicherort</h3>
 * <p>
 * Die Datei wird innerhalb des Projektes gespeichert.
 * Pfad dabei ist: src/de/cloch/resources/notes.csv
 * </p>
 *
 * <h3>Resource-Package festlegen</h3>
 * <p>
 * Menüpunkt File -> Project Structure -> Modules -> Ordner resources auswählen -> als Resources markieren
 * </p>
 *
 * <h3>Singleton</h3>
 * <p>
 * Es gibt zur Laufzeit nur genau ein Objekt (eine Instanz) der Klasse.
 * Dieses Objekt wird beim ersten Gebrauch angelegt und dann nur noch zurückgeliefert.
 * </p>
 * <p>
 * Singletons werden genutzt, wenn es sich um threadsicheren Datei-, Netzwerk- Internet- Datenbankzugriff handelt.
 * </p>
 * <p>
 * Aufbau eines Singletons in 3 Schritten:
 *
 *     <ol>
 *         <li>Private statische Instanz als Klassenattribut</li>
 *         <li>Privater Konstruktor</li>
 *         <li>
 *             Öffentlicher, statischer und synchronisierter Getter für die Instanz.
 *             Der Getter instanziiert die Klasse beim ersten Aufruf und liefert dieses Objekt danach zurück.
 *         </li>
 *     </ol>
 * </p>
 */
public class FileHandler {

    //region Konstanten
    public static final String CSV_FILE_PATH = "src/de/cloch/resources/notes.csv";

    public static final String DELIMITER = ";";
    //endregion

    //region Attribute
    private static FileHandler instance;
    //endregion

    //region Konstruktor
    private FileHandler() {
        System.out.println("Filehandler erzeugt");
    }
    //endregion

    //region Methoden

    /**
     * Instanziiert beim ersten Aufruf ein Objekt der Klasse.
     * Danach wird dieses Objekt nur noch zurückgeliefert.
     *
     * @return {@link FileHandler} : EINZIGE Instanz der Klasse
     */
    public static synchronized FileHandler getInstance() {
        //Prüfen, ob Objekt existiert
        if (instance == null) {
            //Falls nein, anlegen
            instance = new FileHandler();
        }
        //Instanz zurückliefern
        System.out.println("Filehandler zurückgeliefert");
        return instance;
    }

    /**
     * Speichert Notizen einer übergebenen Liste als CSV-Strings
     * in einer CSV-Datei.
     *
     * @param notesToSave : {@link List<Note>} : Liste mit zu speichernden Notizen
     */
    public void saveNotesToCsvFile(List<Note> notesToSave) {
        //Anlegen eines Dateiobjektes
        File csvFile = new File(CSV_FILE_PATH);

        //Brücke zur Datei definieren
        FileOutputStream fos = null;

        //Schreibt in Bytes und definiert einen bestimmten Zeichensatz
        OutputStreamWriter osw = null;

        //Schreibt Zeichenketten und nutzt einen Zwischenspeicher dafür
        BufferedWriter out = null;

        try {

            //fos mit Dateiobjekt generieren
            fos = new FileOutputStream(csvFile);
            //osw mit fos und Zeichensatz generieren
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            //out mit osw generieren
            out = new BufferedWriter(osw);

            //Durch Liste iterieren
            for (Note noteToSave : notesToSave) {
                //Jeden Csv-String einer Notiz in Datei schreiben
                out.write(noteToSave.getAttributesAsCsvLine());
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try {
                //Zwischenspeicher leeren
                out.flush();
                //Brücke zur Datei schließen
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Liest die Datei Zeile für Zeile aus, generiert aus jeder Zeile ein Notiz-Objekt
     * und fügt es einer Liste hinzu. Diese Liste wird zurückgegeben.
     *
     * @return {@link List<Note>} : Liste von Notizen
     * TODO 0 Auslesen der Datei implementieren
     */
    public List<Note> readNotesFromCsvFile() {
        //Leere Liste erzeugen
        List<Note> noteList = new ArrayList<>();

        //Dateiobjekt anlegen
        File csvFile = new File(CSV_FILE_PATH);

        FileInputStream fis = null;

        InputStreamReader isr = null;

        BufferedReader in = null;

        try {
            //Prüfen ob Datei existiert
            if (!csvFile.exists()) {
                //Falls nicht, Datei erstellen
                csvFile.createNewFile();
            }

            fis = new FileInputStream(csvFile);
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            in = new BufferedReader(isr);

            //Variable für das Erreichen des Dateiendes (end of file)
            boolean eof = false;

            while (!eof) {

                String csvLine = in.readLine();

                if (csvLine == null) {

                    eof = true;

                } else {

                    Note note = new Note(csvLine);
                    noteList.add(note);
                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try {
                //Brücke zur Datei schließen
                in.close();

            } catch (Exception e) {

                e.printStackTrace();

            }
        }

        //Liste zurückgeben
        return noteList;
    }

    //endregion
}

