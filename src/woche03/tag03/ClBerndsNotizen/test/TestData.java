package woche03.tag03.ClBerndsNotizen.test;



import woche03.tag03.ClBerndsNotizen.model.Note;

/**
 * Stellt statische Methoden zur Generierung von Testdaten bereit
 * TODO 6 Anlegen der TestData-Klasse
 */
public class TestData {
    //region Konstanten
    private static final int TEST_NOTE_AMOUNT = 10;
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    private TestData() {
    }
    //endregion

    //region Methoden

    /**
     * Generiert Testnotizen und gibts diese zurück.
     *
     * @return {@link Note} : Array mit Testnotizen
     * TODO 7 Implementieren der Methode TestNotes
     */
    public static Note[] getTestNotes() {
        Note[] testNotes = new Note[TEST_NOTE_AMOUNT];

        for (int i = 0; i < TEST_NOTE_AMOUNT; i++) {
            testNotes[i] = new Note("Notiz " + i, "Inhalt " + i);
            if (i % 2 == 0) testNotes[i].setImportant(true);
        }

        return testNotes;
    }
    //endregion
}
