package woche01.tag03;

/**
 * Zugsangskontrolle eines Labors anhand von Verzweigungen
 */
public class C03_ClSecretLab {

    /**
     * Einstiegspunkt ins Programm
     *
     * @param args : Startparameter
     */
    public static void main(String[] args) {

        //Deklaration und Initialisierung
        //Freigabestufen des Labors als Konstanten durch final
        final int clearanceLevelVisitor = 1;
        final int clearanceLevelEmployee = 2;
        final int clearanceLevelTopSecret = 3;

        //Mindestalter für das Betreten des Labors
        final int minimumAge = 18;

        //Registrierte Namen
        final String employeeName = "Shrek";
        final String visitorName = "Max Mustermann";
        final String ownerName = "Chris";

        //Besucherdaten
        String personName = "Max Musterman";
        int personClearanceLevel = 0;
        int personAge = 15;

        System.out.println("Geheimlabor");
        System.out.println("===========");

        System.out.println(">> STOP! Bitte Ausweis Scannen!");

        //Prüfen, ob Mindestalter erreicht ist
        if (personAge >= minimumAge) {

            System.out.println("\nAusweis wurde gescannt. Person ist mindestens 18 Jahre alt.");

            //Prüfen, ob der Name registriert ist
            if (personName.equalsIgnoreCase(employeeName) ||
                    personName.equalsIgnoreCase(visitorName) || personName.equalsIgnoreCase(ownerName)) {

                System.out.println("\nWillkommen " + personName + "! Haben sie einen schönen Tag.");

                //Freigabestufe prüfen
                switch (personClearanceLevel) {
                    case clearanceLevelVisitor -> System.out.println("\nZugangslevel: Besucher");
                    case clearanceLevelEmployee -> System.out.println("\nZugangslevel: Angestellter");
                    case clearanceLevelTopSecret -> System.out.println("\nZugangslevel: Hochsicherheit");
                    default -> System.err.println("\nZugang verweigert! Keine passende Freigabestufe!");
                }

            } else {
                System.err.println("\nZugang verweigert! Name der Person ist nicht registriert!");
            }

        } else {
            System.err.println("\nZugang verweigert! Person ist nicht alt genug!");
        }
    }
}