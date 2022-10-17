package woche02.tag05.ClMiniChatbot;

import de.rhistel.logic.ConsoleReader;

/**
 * Mikroaufgabe Minichatbot
 */
public class Main {

    public static final String TXT_APP_NAME = """
            :::::::::::::::::::
            :: ClMiniChatbot ::
            :::::::::::::::::::
            
            """;
    private static final String TXT_WELCOME_MSG = "MC: Willkommen :)";
    private static final String TXT_HEADER = TXT_APP_NAME + TXT_WELCOME_MSG;
    public static final String TXT_INPUT_QUESTION = "\nStelle eine der folgenden Fragen:\n";


    private static String[] questions = {
            "Wer bist du?",
            "Wie alt bist du?",
            "Wie heißt du?",
            "Was ist deine Lieblingsfarbe?"
    };

    private static String[] answers = {
            "Ich bin der MiniChatbot",
            "Ich bin so alt wie die Ausführung des Programms selbst",
            "Ich heiße Mark Cäsar",
            "Meine Lieblingsfarbe ist blau"
    };

    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printAppHeader();
        startUserChatInteraction();
    }

    /**
     * Gibt den Applikationsnamen und die Willkommensnachricht auf der
     * Konsole aus
     */
    private static void printAppHeader() {
        System.out.println(TXT_HEADER);
    }

    /**
     * Startet die Interaktion mit dem Benutzer.
     * Gibt Fragen aus, liest eine Frage ein und prüft auf Gültigkeit.
     * Gibt danach eine passende Antwort auf die eingegebene Frage.
     */
    private static void startUserChatInteraction() {
        printMainMenu();

        String userQuestion = ConsoleReader.in.readString();

        boolean isValidQuestion = false;

        for (int i = 0; i < questions.length; i++) {
            if (questions[i].equalsIgnoreCase(userQuestion)) {
                System.out.println("\nMC: " + answers[i]);
                isValidQuestion = true;
            }
        }

        if (!isValidQuestion) System.out.println("\nMC: Ich kenne diese Frage leider nicht.");
    }

    private static void printMainMenu() {
        System.out.println(TXT_INPUT_QUESTION);
        for (String question : questions) {
            System.out.println(question);
        }
        System.out.println("\n");
    }
}