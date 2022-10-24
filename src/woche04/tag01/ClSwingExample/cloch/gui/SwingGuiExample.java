package woche04.tag01.ClSwingExample.cloch.gui;



import woche04.tag01.ClSwingExample.cloch.settings.AppTexts;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Stellt das Hauptfenster der Applikation dar
 * und implementiert Steuerlogik dafür.
 */
public class SwingGuiExample {
    //region Konstanten
    //endregion

    //region Attribute
    private JFrame mainFrame;

    private JTextField txtInput;
    private JButton btnSubmit;
    private JLabel lblOutput;
    //endregion

    //region Konstruktor
    //endregion

    //region Methoden

    /**
     * Startet die grafische Oberfläche
     */
    public void startGui() {
        initializeGuiElements();
        showGuiElements();
    }

    /**
     * Initialisiert die Elemente der grafischen Oberfläche
     */
    private void initializeGuiElements() {
        mainFrame = new JFrame(AppTexts.APP_NAME);
        mainFrame.setLayout(null);
        mainFrame.setSize(415, 500);
        mainFrame.setLocation(200, 200);

        txtInput = new JTextField();
        txtInput.setSize(350, 50);
        txtInput.setLocation(25, 50);

        btnSubmit = new JButton(AppTexts.TXT_BTN_SUBMIT);
        btnSubmit.setSize(350, 50);
        btnSubmit.setLocation(25, 150);

        /*
         * Innere Anonyme Klasse, welche das ActionListener-Interface implementiert.
         * ActionListener ist ein Interface, von welchem lein Objekt erzeugt werden kann.
         * Hier wird deshalb eine innere anonyme Klasse erzeugt, welche dieses Interface implementiert
         * und dessen Methoden überschreiben muss.
         */
//        btnSubmit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String input = txtInput.getText();
//
//                if (!input.isEmpty() && !input.isBlank()) {
//                    lblOutput.setText(input);
//                    txtInput.setText("");
//                } else {
//                    System.err.println(AppTexts.TXT_INVALID_INPUT);
//                    txtInput.setText("");
//                }
//            }
//        });
//
//        btnSubmit.addActionListener(e -> {
//            String input = txtInput.getText();
//
//            if (!input.isEmpty() && !input.isBlank()) {
//                lblOutput.setText(input);
//                txtInput.setText("");
//            } else {
//                System.err.println(AppTexts.TXT_INVALID_INPUT);
//                txtInput.setText("");
//            }
//        });

        btnSubmit.addActionListener(new MyActionListener(this));

        lblOutput = new JLabel(AppTexts.TXT_LBL_OUTPUT);
        lblOutput.setSize(350, 50);
        lblOutput.setLocation(25, 250);
    }

    /**
     * Fügt Elemente der grafischen Oberfläche hinzu und zeigt
     * sie an
     */
    private void showGuiElements() {
        mainFrame.add(txtInput);
        mainFrame.add(btnSubmit);
        mainFrame.add(lblOutput);
        mainFrame.setVisible(true);
    }

    public JTextField getTxtInput() {
        return txtInput;
    }

    public JLabel getLblOutput() {
        return lblOutput;
    }

    //endregion
}
