package woche02.tag05.ClKochbuchFuerSingles;

import de.rhistel.logic.ConsoleReader;

/**
 * Mikroaufgabe Kochbuch für Singles
 */
public class Main {

    public static final String RECIPE_ONE = "\nPfanne auf Herd heiß machen.\n" +
            "Ei aufschlagen, langsam in Pfanne gleiten lassen." +
            "\nMit Maggi, Salz, Pfeffer und Paprika würzen. Garen lassen und fertig!";

    public static final String RECIPE_TWO = "\nFolge dem Miracoli-Rezept auf der Packung.\n" +
            "Oder iss Ramen(Heißes Wasser, Nudeln, Würze 5 min ziehen lassen, fertig)";

    public static final String RECIPE_THREE = "\n09876 / 123456 - www.lieferheld.de/musterlieferant";

    private static final String APP_NAME = """
            =========================
            = ClKochbuchFürSingles =
            =========================
            """;
    public static final String TXT_CHOOSE_RECIPE = "Wählen sie eines der oben stehenden Rezepten.";
    public static final String TXT_IVALID_CHOICE = "Ungültige Auswahl!";

    private static String[] recipeOptions = {
            "Spiegelei",
            "Spaghetti mit Tomatensoße",
            "Lieferdienst"
    };


    private static String[] recipes = {
            RECIPE_ONE,
            RECIPE_TWO,
            RECIPE_THREE
    };

    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printAppName();
        chooseRecipe();
    }

    private static void printAppName() {
        System.out.println(APP_NAME);
    }

    /**
     * Gibt Rezept-Optionen aus und liest eine Nutzereingabe über die Konsole.
     * Gibt danach das passende Rezept zur Auswahl auf der Konsole aus.
     */
    private static void chooseRecipe() {
        //Rezept-Optionen ausgeben
        printRecipeOptions();

        //Auswahl einlesen
        System.out.println(TXT_CHOOSE_RECIPE);
        int userChoice = ConsoleReader.in.readPositivInt();

        //Check ob Index gültig ist
        if (userChoice < recipeOptions.length) {
            System.out.println(recipes[userChoice]);
        } else {
            System.out.println(TXT_IVALID_CHOICE);
        }
    }

    private static void printRecipeOptions() {
        for (int i = 0; i < recipeOptions.length; i++) {
            System.out.println("[\t" + i + "\t] " + recipeOptions[i]);
        }
    }
}