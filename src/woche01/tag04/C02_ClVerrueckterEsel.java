package woche01.tag04;

/**
 * Übungsauflösung zur Übung Zum Verrückten Esel
 */
public class C02_ClVerrueckterEsel {

    /**
     * Einstiegspunkt ins Programm
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("========================\nClub zum verrückten Esel\n========================");

        final String password = "LilaBlume";

        final int pin = 7721;

        final double lowBudgetMin = 100;
        final double lowBudgetMax = 200;

        final double mediumBudgetMin = 500;
        final double mediumBudgetMax = 1000;

        final double highBudgetMin = 1000;

        final String name = "Mustermann";

        String guestPassword = "LilaBlume";
        int guestPin = 7721;
        double guestMoney = 600;
        String guestName = "Muster";

        //Passwortüberprüfung
        if (guestPassword.equals(password)) {

            System.out.println("\nRichtiges Passwort. Betreten sie den Sicherheitskorridor und " +
                    "nennen sie die Zahlenkombination!");

            //Pin-Überprüfung
            if (guestPin == pin) {

                System.out.println("\nRichtiger Pin. Sie Dürfen den Club betreten.");

                //Budgetüberprüfung
                if (guestMoney > lowBudgetMin && guestMoney < lowBudgetMax) {

                    System.out.println("\nSie dürfen Clubraum 1 betreten.");

                } else if (guestMoney > mediumBudgetMin && guestMoney < mediumBudgetMax) {

                    System.out.println("\nSie dürfen Clubraum 2 und 3 betreten.");

                } else if (guestMoney > highBudgetMin) {

                    System.out.println("\nSie dürfen den VIP-Bereich betreten.\nHinterlegen sie bitte ihre Kreditkarte.");

                    //Überprüfen des Namens der Kreditkarte
                    if (guestName.equals(name)) {

                        System.out.println("\nName der Kreditkarte stimmt. Haben sie einen schönen Aufenthalt.");

                    } else {

                        System.out.println("\nName stimmt nicht überein! Die Polizei wird gerufen, " +
                                "sie müssen den Club verlassen!");
                    }

                } else {

                    System.out.println("\nIhr Budget ist nicht ausreichend. Bitte verlassen sie den Club.");
                }

            } else {
                System.out.println("\nFalscher Pin! Verlassen sie bitte das Gebäude!");
            }
        } else {
            System.out.println("\nFalsches Passwort! Zutritt verweigert!");
        }

        System.out.println("\nProgrammende!");
    }
}