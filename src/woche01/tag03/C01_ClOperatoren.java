package woche01.tag03;

/**
 * <h2>Operatoren in Java</h2>
 *
 * <h3>Arithmetische Operatoren</h3>
 * <ul>
 *     <li> + : Addition</li>
 *     <li> - : Subtraktion</li>
 *     <li> * : Multiplikation</li>
 *     <li> / : Division</li>
 *     <li> % : Modulo (Berechnet den Rest einer Division)</li>
 *     <li> + : Positives Vorzeichen für eine Zahl</li>
 *     <li> - : Negatives Vorzeichen für eine Zahl</li>
 *     <li>
 *          ++ : Inkrement (erhöht einen Wert um 1) <br>
 *          zahl++ - Post-Inkrement - Übergeben der Zahl, danach hochzählen <br>
 *          ++zahl - Pre-Inkrement - Hochzählen, danach Zahl übergeben
 *     </li>
 *     <li>
 *          -- : Dekrement (verringert einen Wert um 1)<br>
 *          zahl-- - Post-Dekrement - Übergeben der Zahl, danach verringern <br>
 *  *       --zahl - Pre-Dekrement - Verringern, danach Zahl übergeben
 *     </li>
 * </ul>
 *
 * <h3>Zuweisungsoperatoren</h3>
 * <ul>
 *     <li> = : einfache Zuweisung</li>
 *     <li> += : addiert einen Wert zu einer Variablen und weist neu zu</li>
 *     <li> -= : subtrahiert einen Wert von einer Variablen und weist neu zu</li>
 *     <li> *= : multipliziert einen Wert mit einer Variablen und weist neu zu</li>
 *     <li> /= : dividiert eine Variable durch einen Wert und weist neu zu</li>
 *     <li> %= : dividiert eine Variable durch einen Wert und weist den Rest neu zu</li>
 * </ul>
 *
 * <h3>Vergleichsoperatoren</h3>
 * <ul>
 *     <li> < : kleiner</li>
 *     <li> > : größer</li>
 *     <li> <= : kleiner gleich</li>
 *     <li> >= : größer gleich</li>
 *     <li> != : ungleich</li>
 *     <li> == : gleich</li>
 * </ul>
 *
 * <h3>Logische Operatoren</h3>
 * <ul>
 *     <li>&& - Logisches Und</li>
 *     <li>|| - Logisches Oder</li>
 *     <li>! - Logische Negation</li>
 *     <li>^ - Exklusives Oder</li>
 * </ul>
 */
public class C01_ClOperatoren {

    /**
     * Einstiegspunkt ins Programm
     *
     * @param args: Startparameter
     */
    public static void main(String[] args) {

        System.out.println("Operatoren in Java");
        System.out.println("==================");

        int firstNumber = 5;
        double secondNumber = 3.2;
        double result = 0;

        System.out.println("\nArithmetische Operatoren");
        //Addition
        result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        //Subtraktion
        result = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        //Multiplikation
        result = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        //Division
        result = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + result);

        //Inkrement
        result = firstNumber; // result = 5 ; firstNumber = 5
        System.out.println("\nErgebnis: " + result + " firstNumber: " + firstNumber);

        result = ++firstNumber; // result = 6 ; firstNumber = 6
        System.out.println("\nErgebnis: " + result + " firstNumber: " + firstNumber);

        result = firstNumber++; // result = 6 ; firstNumber = 7
        System.out.println("\nErgebnis: " + result + " firstNumber: " + firstNumber);

        result = firstNumber; // result = 7 ; firstNumber = 7
        System.out.println("\nErgebnis: " + result + " firstNumber: " + firstNumber);

        //Logische Operatoren
        boolean isLightOn = false;
        boolean isAgeValid = true;

        System.out.println("\n" + isAgeValid + " == " + isLightOn + "? \t" + (isLightOn == isAgeValid));
        System.out.println("\n" + isAgeValid + " != " + isLightOn + "? \t" + (isLightOn != isAgeValid));

        System.out.println(isLightOn & isAgeValid);
        System.out.println(isLightOn && isAgeValid);

//        System.out.println(isLightOn || isAgeValid);
        System.out.println(!isLightOn ^ !isAgeValid);

//        System.out.println(isLightOn && isAgeValid);
//        System.out.println(isLightOn==true && isAgeValid==true);

        secondNumber += 2.8;
        System.out.println("\nsecondNumber = " + secondNumber);
    }
}