package woche01.tag03;
/**
 * <h2>Verzweigungen in Java</h2>
 *
 * <h3>Verzweigungsarten</h3>
 * <h4>Einfache Verzweigung</h4>
 * <p>
 * Auswerten einer Bedingung und das Ausführen eines bestimmten Codebereiches<br>
 * Aussehen:<br>
 * if (Bedingung) anweisung1;    <br>
 * else anweisung2;
 * </p>
 *
 * <h4>Mehrfachverzweigung</h4>
 * <p>
 * Auswerten einer Bedingung und das Ausführen eines bestimmten Codebereiches<br>
 * Aussehen:<br>
 * if (Bedingung1) anweisung1;      <br>
 * else if (Bedingung2) anweisung2; <br>
 * else anweisung3;
 * </p>
 *
 * <h4>Fallunterscheidung</h4>
 * <p>
 *     Weg 1: Mehrfachverzweigung<br>
 *     Weg 2: Switch-Case-Statement
 *
 *     Aussehen:<br>
 *     switch(zahl) {
 *         case 0: anweisung;
 *         case 1: anweisung;
 *         case 2: anweisung;
 *         default:
 *     }
 * </p>
 */
public class C04_ClVerzweigung {
    public static void main(String[] args) {
        int zahl = 2;

        //Einfache Verzweigung
        if ((zahl > 0 && zahl < 10) || (zahl > 15 && zahl < 20)) {
            System.out.println("Zahl passt!");
        } else System.out.println("Zahl ist falsch!");

        //Mehrfachverzweigung
        if (zahl >= 0 && zahl < 10) {
            System.out.println("Zahl in 0-9");
        }
        else if (zahl >= 10 && zahl < 20) {
            System.out.println("Zahl in 10-19");
        }
        else if (zahl >= 20 && zahl < 30) {
            System.out.println("Zahl in 20-29");
        }
        else {
            System.out.println("Zahl liegt in keinem Wertebereich");
            System.err.println("FEHLER!");
        }

        //Verschachtelte Verzweigung
        if (zahl > 5) {

            if (zahl > 1000000) {
                System.out.println("Zahl ist ziemlich groß.");
            } else {
                System.out.println("Zahl ist überschaubar.");
            }

        } else {
            System.err.println("Zahl ist zu klein!");
        }

        //Fallunterscheidung mit Mehrfachverzweigung
        if (zahl == 0) {
            //anweisungen
        } else if (zahl == 1) {
            //anweisungen
        } else if (zahl == 2) {
            //anweisungen
        } else {
            //anweisungen
        }

        boolean isLightOn = true;

        switch (zahl) {
            case 0:
                System.out.println("Zahl ist 0");
                break;
            case 1:
                System.out.println("Zahl ist 1");
                break;
            case 2:
                System.out.println("Zahl ist 2");
                System.out.println("Zahl ist 2");
                System.out.println("Zahl ist 2");
                break;
            default:
                System.err.println("Ungültige Zahl");
        }

        switch (zahl) {
            case 0 -> System.out.println("Zahl ist 0");
            case 1 -> System.out.println("Zahl ist 1");
            case 2 -> {
                System.out.println("Zahl ist 2");
                System.out.println("Zahl ist 2");
            }
            default -> System.err.println("Ungültige Zahl");
        }

        System.out.println("Programmende");
    }
}