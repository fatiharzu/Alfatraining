package woche03.tag03.ClBerndsNotizen.test;


import woche03.tag03.ClBerndsNotizen.model.Note;

/**
 * Testet Programmteile unabhängig vom regulären Programmablauf
 * TODO 5 Anlegen der TestMain und Testen der Modellklasse
 * TODO 8 Teste der Methode getTestNotes aus der Klasse TestData
 */
public class TestMain {
    //region Konstanten
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    //endregion

    //region Methoden
    public static void main(String[] args) {
        System.out.println("TestMain:\n");

        //Test der Methode getTestNotes der TestData-Klasse
        Note[] notes = TestData.getTestNotes();

        for (Note note: notes) {
            System.out.println(note);
        }

        //Test der Modellklasse
//        Note testNote = new Note();
//        System.out.println(testNote);
//
//        testNote = new Note("Titel", "Inhalt");
//        System.out.println(testNote);
//
//        testNote = new Note("Titel", "Inhalt", true);
//        System.out.println(testNote);
//
//        System.out.println("Titel: " + testNote.getTitle());
//        System.out.println("Inhalt: " + testNote.getContent());
//        System.out.println("Wichtig: " + testNote.isImportant());
//
//        testNote.setTitle("Neuer Titel");
//        testNote.setContent("Neuer Inhalt");
//        testNote.setImportant(false);
//
//        System.out.println(testNote);
    }
    //endregion
}
