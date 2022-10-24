package woche04.tag01.ClSwingExample.cloch.gui;


import woche04.tag01.ClSwingExample.cloch.settings.AppTexts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Eigene ActionListener Klasse für das
 * Behandeln von Events und das Einleiten
 * weiterer Logik
 *
 */
public class MyActionListener implements ActionListener {

    //region Konstanten
    //endregion

    //region Attribute
    private SwingGuiExample swingGuiExample;
    //endregion

    //region Konstruktor
    public MyActionListener(SwingGuiExample swingGuiExample) {
        this.swingGuiExample = swingGuiExample;
    }
    //endregion

    //region Methoden
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = swingGuiExample.getTxtInput().getText();

        if (!input.isEmpty() && !input.isBlank()) {
            swingGuiExample.getLblOutput().setText(input);
            swingGuiExample.getTxtInput().setText("");
        } else {
            System.err.println(AppTexts.TXT_INVALID_INPUT);
            swingGuiExample.getTxtInput().setText("");
        }
    }
    //endregion
}
