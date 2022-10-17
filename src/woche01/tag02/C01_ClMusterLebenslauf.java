package woche01.tag02;

/**
 * Dieses Programm gibt einen kleinen Musterlebenslauf
 * auf der Konsole aus. Dabei wird der Ausgabebefehl
 * System.out.println() genutzt sowie die Escapesequenzen
 * \n (Zeilenumbruch) und \t (Tabulator).
 */
public class C01_ClMusterLebenslauf {

    /**
     * Einstiegspunkt in unser Programm. Alle Befehle zum Ausführen werden
     * für den Anfang in diese Methode geschrieben.
     *
     * @param args : Startparameter
     */
    public static void main(String[] args) {
        System.out.println("Lebenslauf");

        //Persönliche Informationen
        System.out.println("\nPersönliche Daten\n");
        System.out.println("Name: \t\t\t\tMax Mustermann");
        System.out.println("Geburtsdatum: \t\t01.01.1990");
        System.out.println("Adresse: \t\t\tMusterstraße 1");
        System.out.println("\t\t\t\t\t12345 Musterstadt");
        System.out.println("Telefon: \t\t\t0123456789");
        System.out.println("Email: \t\t\t\tmax@mustermann.de");

        //Berufliche Laufbahn
        System.out.println("\nBerufliche Laufbahn\n");
        System.out.println("seit 2020 \t\t\tChefentwickler Musterfirma GmbH");
        System.out.println("2015 - 2020 \t\tSoftwareentwickler Musterfirma oHG");
        System.out.println("...");

        //Schulische Laufbahn
        System.out.println("\nSchulische Laufbahn\n");
        System.out.println("2010 - 2015 \t\tMustergymnasium mit Abschluss Allgemeine Hochschulreife");
        System.out.println("2005 - 2010 \t\tMustergrundschule");

        System.out.println("\n...");
    }

}