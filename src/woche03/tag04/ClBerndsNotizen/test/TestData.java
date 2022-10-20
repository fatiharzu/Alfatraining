package woche03.tag04.ClBerndsNotizen.test;



import woche03.tag04.ClBerndsNotizen.model.Note;

import java.util.ArrayList;
import java.util.List;


/**
 * Stellt statische Methoden zur Generierung von Testdaten bereit
 */
public class TestData {

    //region Konstanten
    private static final int TEST_NOTE_AMOUNT = 10;
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    private TestData() {}
    //endregion

    //region Methoden

    /**
     * Generiert Testnotizen und gibts diese zurück.
     *
     * @return {@link } : Array mit Testnotizen
     * TODO 2 Methode so anpassen, dass eine Liste mit Notizen zurückgegeben wird
     */
    public static List<Note> getTestNotes() {
        List<Note> testNoteList = new ArrayList<>();

        for (int i = 0; i < TEST_NOTE_AMOUNT; i++) {
            Note testNote = new Note("Notiz " + i, "Inhalt " + i);
            if (i % 2 == 0) testNote.setImportant(true);
            testNoteList.add(testNote);
        }

        return testNoteList;
    }
    //endregion
}
