package woche03.tag04.ClBerndsNotizen.main;


import woche03.tag04.ClBerndsNotizen.ui.UiController;

/**
 * Startklasse des Hauptprogramms
 */
public class Main {

    /**
     * Startmethode des Programms
     *
     * @param args : {@link String[]} : Startparameter
     */
    public static void main(String[] args) {
        UiController uiController = new UiController();
        uiController.startUi();
    }
}