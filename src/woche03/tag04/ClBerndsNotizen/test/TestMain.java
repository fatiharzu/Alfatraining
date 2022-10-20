package woche03.tag04.ClBerndsNotizen.test;





/**
 * Testet Programmteile unabhängig vom regulären Programmablauf
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

//        //Listen Performance-Test
//        List<Note> arrayList = new ArrayList<>();
//        List<Note> linkedList = new LinkedList<>();
//
//        final int maxElements = 10000000;
//
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < maxElements; i++) {
//            arrayList.add(new Note());
//        }
//        long endTime = System.currentTimeMillis();
//        long runTime = endTime - startTime;
//        System.out.printf("Einfügen von %d Elementen in Arraylist: %d ms\n", maxElements, runTime);
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < maxElements; i++) {
//            linkedList.add(new Note());
//        }
//        endTime = System.currentTimeMillis();
//        runTime = endTime - startTime;
//        System.out.printf("Einfügen von %d Elementen in LinkedList: %d ms", maxElements, runTime);

//        //Test von Listen
//        List<Note> noteArrayList = new ArrayList<>();
//        List<Note> noteLinkedList = new LinkedList<>();
//
//
//        Note firstNode = new Note("bla", "blubb", true);
//        Note secondNote = new Note("test", "test");
//
//        //Einfügen in eine Liste
//        noteArrayList.add(firstNode);
//        noteArrayList.add(secondNote);
//
//        //Anzahl der Listenelemente ausgeben
//        System.out.println(noteArrayList.size());
//
//        //Ausgeben der Liste
//        for (Note currentNote : noteArrayList) {
//            System.out.println(currentNote);
//        }
//
//        //Entfernen aus der Liste
////        noteArrayList.remove(firstNode);
//        noteArrayList.remove(0);
//
//        System.out.println(noteArrayList.size());
//
//        for (Note currentNote : noteArrayList) {
//            System.out.println(currentNote);
//        }
//
//        //Bearbeiten der Liste
//        noteArrayList.set(0, new Note());
//
//        System.out.println(noteArrayList.size());
//
//        for (Note currentNote : noteArrayList) {
//            System.out.println(currentNote);
//        }
//
//        int indexToUpdate = 0;
//
//        Note noteToUpdate = noteArrayList.get(0);
//        noteToUpdate.setTitle("abc");
//        noteToUpdate.setContent("xyz");
//
//        System.out.println(noteArrayList.size());
//
//        for (Note currentNote : noteArrayList) {
//            System.out.println(currentNote);
//        }


//        //Test der Methode getTestNotes der TestData-Klasse
//        Note[] notes = TestData.getTestNotes();
//
//        for (Note note: notes) {
//            System.out.println(note);
//        }

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
