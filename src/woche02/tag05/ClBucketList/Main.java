package woche02.tag05.ClBucketList;

import de.rhistel.logic.ConsoleReader;

/**
 * Mikroaufgabe BucketList
 */
public class Main {

    private static final String APP_NAME = """
            XXXXXXXXXXXXXXXX
            X ClBucketList X
            XXXXXXXXXXXXXXXX
            """;
    private static final String DEFAULT_STRING_VALUE = "!!!DEFAULT!!!";
    public static final String TXT_BUCKET_LIST_ENTRIES = "\nDeine Einträge:\n";

    private static String[] bucketListEntries;

    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        initializeBucketList();
        fillBucketList();
        printBucketList(bucketListEntries);
    }



    private static void printApplicationName() {
        System.out.println(APP_NAME);
    }

    /**
     * Initialisiert die BucketList mit Standardwerten
     */
    private static void initializeBucketList() {
        bucketListEntries = new String[] {
                DEFAULT_STRING_VALUE,
                DEFAULT_STRING_VALUE,
                DEFAULT_STRING_VALUE,
                DEFAULT_STRING_VALUE
        };
    }

    /**
     * Liest Bucketlisteinträge über die Konsole ein
     */
    private static void fillBucketList() {
        for (int i = 0; i < bucketListEntries.length; i++) {
            System.out.println((i + 1) + ". Eintrag:");
            bucketListEntries[i] = ConsoleReader.in.readMandatoryString();
        }
    }

    /**
     * Gibt die übergebene BucketList auf der Konsole aus
     * @param array : {@link String[]} : BucketList
     */
    private static void printBucketList(String[] array) {
        System.out.println(TXT_BUCKET_LIST_ENTRIES);

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}