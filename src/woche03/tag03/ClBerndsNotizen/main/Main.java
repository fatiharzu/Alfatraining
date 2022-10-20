package woche03.tag03.ClBerndsNotizen.main;





import woche03.tag03.ClBerndsNotizen.ui.UiController;

/**
 * Startklasse des Hauptprogramms
 * TODO 0 Anlegen der Grundstruktur des Projektes (Package-Struktur)
 */
public class Main {

    /**
     * Starmethode des Programms
     *
     * @param args : {@link String[]} : Startparameter
     */
    public static void main(String[] args) {
        UiController uiController = new UiController();
        uiController.startUi();
    }
}