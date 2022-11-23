package de.schoenercode.main;

import de.schoenercode.ui.UiController;

/**
 * Startet die Hauptapplikation
 */
public class Main {

    /**
     * Einstieg in die Applikation
     *
     * @param args : {@link String} [] : Keine Argumente benötigt
     */
    public static void main(String args[]) {
        UiController.getInstanz().starteBenutzeroberflaeche();
    }
}
