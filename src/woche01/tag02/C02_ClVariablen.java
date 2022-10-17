package woche01.tag02;

/**
 * <h2>Variablen</h2>
 * <p>Dieses Programm zeigt wie Variablen in Java funktionieren</p>
 *
 * <h3>Meistgenutzte Datentypen</h3>
 * <ul>
 *     <li>String = Zeichenkette</li>
 *     <li>int = Ganzzahl (integer) = Wertebereich von -2.147.483.648 bis 2.147.483.647</li>
 *     <li>long = Ganzzahl = Wertebereich von –9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807</li>
 *     <li>double = Gleitkommazahl = Wertebereich von 4,94065645841246544E-324 ... bis 1,79769131486231570E+308</li>
 *     <li>boolean = 1bit = true und false</li>
 * </ul>
 *
 * <h3>Nicht so häufig verwendete Datentypen</h3>
 * <ul>
 *     <li>char = einzelnes Zeichen (character) = 16 bit Unicode-Zeichen</li>
 *     <li>byte = Ganzzahl mit Wertebereich von -128 bis 127</li>
 *     <li>short = Ganzzahl mit Wertebereich von -32.786 bis 32.785</li>
 *     <li>float = Gleitkommazahl mit Wertebereich von 1,40239846E-45f bis 3,40282347E+38f</li>
 * </ul>
 *
 * <h2>Deklarierung und Initialisierung</h2>
 * <p>
 *     Die Deklarierung einer Variablen besteht aus dem Definieren eines Datentyps und eines Namens für die Variable.<br>
 *     Die erste Wertzuweisung einer Variablen nennt man Initialisierung.
 *     <code>String applicationName = "ClVariablen";</code>
 *     <code>int index = 0;</code>
 * </p>
 *
 * <h2>Namensgebung:</h2>
 * <ul>
 *     <li>Variablennamen beginnen immer mit einem Kleinbuchstaben</li>
 *     <li>Variablennamen enthalten keine Sonderzeichen oder Umlaute</li>
 *     <li>Keine Variablennamen mit nur einem Buchstaben (es gibt einige Ausnahmen)</li>
 *     <li>Sprechende Namen vergeben</li>
 *     <li>
 *         Bei Variablennamen mit mehreren Wörtern, werden diese zusammen und der erste Buchstabe
 *         jedes Wortes groß geschrieben.
 *     </li>
 * </ul>
 *
 * <h3>Shortcuts / Hotkeys</h3>
 * <ul>
 *     <li>Strg + / = Aus- / Einkommentieren</li>
 *     <li>Shift + F6 = Umbenennen von Variablen/Methoden/Klassen</li>
 * </ul>
 */
public class C02_ClVariablen {

    public static void main(String[] args) {
        String applicationName = "ClVariablen";
        String splitLine = "===========";
        String applicationHeader = splitLine + "\n" + applicationName + "\n" + splitLine;

        System.out.println(applicationHeader);

        System.out.println("\nMeistgenutzte Datentypen:\n");

        //Zustandsbeschreibung (wahr oder falsch)
        boolean isLightOn = false;
        boolean isAgeValid = true;

        System.out.println("boolean:" + "\n========");
        System.out.println("Licht an?\t" + isLightOn);
        System.out.println("Über 18?\t" + isAgeValid);

        //Ganzzahlen: Long-Werte werden durch ein endendes L gekennzeichnet
        byte populationOfMoon = 0;
        short populationOfVillage = 8000;
        int populationOfEurope = 746_400_000;
        long populationOfTheWorld = 7_985_053_625L;

        System.out.println("\nGanzzahlen:\n============");
        System.out.println("byte - Bevölkerungszahl des Mondes:\t\t" + populationOfMoon);
        System.out.println("short - Bevölkerungszahl des Dorfes:\t" + populationOfVillage);
        System.out.println("int - Bevölkerungszahl von Europa:\t\t" + populationOfEurope);
        System.out.println("long - Bevölkerungszahl der Welt:\t\t" + populationOfTheWorld);

//        populationOfTheWorld = populationOfEurope;
//        System.out.println("Bevölkerungszahl von Europa nach Cast:\t" + populationOfTheWorld);

//        populationOfEurope = (int)populationOfTheWorld;
//        System.out.println(("Bevölkerungszahl von Europa nach Cast:\t" + populationOfEurope));

        //Gleitkommazahlen - floats müssen durch ein endendes f gekennzeichnet werden
        float smallDecimalNumber = 1.2f;
        double bigDecimalNumber = 2564.165436465316544651;

        System.out.println("\nGleitkommazahlen:\n==================");
        System.out.println("float - kleine Kommazahl:\t\t" + smallDecimalNumber);
        System.out.println("double - große Kommazahl:\t\t" + bigDecimalNumber);

//        int doubleAsInt = (int)bigDecimalNumber;
//        double intAsDouble = populationOfEurope;
//        System.out.println("double nach cast in int:\t" + doubleAsInt);
//        System.out.println("int nach cast in double:\t" + intAsDouble);

        //Einzelne Zeichen (characters)
        char topCategoryLetter = 'A';
        char secondCategoryLetter = 'B';
        char unicodeBulletPoint = '\u1D11';

        System.out.println("\nEinzelne Zeichen:\n=================");
        System.out.println(unicodeBulletPoint + " Güteklasse: " + topCategoryLetter);
        System.out.println(unicodeBulletPoint + " Güteklasse: " + secondCategoryLetter);
    }
}