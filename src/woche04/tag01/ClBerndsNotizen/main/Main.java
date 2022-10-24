package woche04.tag01.ClBerndsNotizen.main;




import woche04.tag01.ClBerndsNotizen.ui.UiController;

import java.util.ArrayList;

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