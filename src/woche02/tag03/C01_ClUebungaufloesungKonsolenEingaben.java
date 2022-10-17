package woche02.tag03;

import de.rhistel.logic.ConsoleReader;

/**
 * Auflösung der Übung zu Konsoleneingaben
 */
public class C01_ClUebungaufloesungKonsolenEingaben {

    public  static  final String TXT_APP_NAME_VENDING_MACHINE = """
            XXXXXXXXXXXXXXXXXXXXXX
            XX ClVendingMachine XX
            XXXXXXXXXXXXXXXXXXXXXX
            """;
    public  static  final String TXT_APP_NAME_SONGLIST = """
            XXXXXXXXXXXXXXXXXXXXXX
            XX ClVendingMachine XX
            XXXXXXXXXXXXXXXXXXXXXX
            """;

    public static final double PRODUCT_PRICE = 2;
    public static final String TXT_PURCHASE_DRINK = "\nWählen sie bitte ein Getränk aus der Liste aus.";
    public static final String TXT_INVALID_CHOICE = "\nUngültige Auswahl!";
    public static final String TXT_GELD_EIN = "\nWerfen sie bitte genügend Geld ein.";
    public static final String DAS_RÜCKGELD_IM_WERT = " und das Rückgeld im Wert von ";
    public static final String TXT_PURCHASE_SUCCES_WITH_CHANGE = "Entnehmen sie ihr Getränk";
    public static final String TXT_PURCHASE_MISSING_MONEY = "\n Daha bu kadar praya ihtiyaciniz var ";

    private static String[] products = {
            "Cola",
            "Fanta",
            "Mezzo",
            "Sprite"
    };

    public static void main(String[] args) {
        startApplication();
        }

    private static void startApplication() {
        printAppnName();
        printMainMenu();
        handlePurchase();
    }

    private static void printAppnName() {
        System.out.println(TXT_APP_NAME_VENDING_MACHINE);
    }

    private  static void printMainMenu(){
        for (int i = 0 ; i < products.length ; i++){
            System.out.println(" [ " + (i+1) + " ] " + products[i]);
        }
    }

    private static void handlePurchase(){

        System.out.println(TXT_PURCHASE_DRINK);

        int purchaseIndex = ConsoleReader.in.readPositivInt();

        if (purchaseIndex < products.length){
            //gültiger Index
            System.out.println(TXT_GELD_EIN);
            double moneyGiven = ConsoleReader.in.readPositivInt();
            
            if ( moneyGiven > PRODUCT_PRICE ){
                System.out.println(TXT_PURCHASE_SUCCES_WITH_CHANGE +DAS_RÜCKGELD_IM_WERT+ (PRODUCT_PRICE - moneyGiven)); 
            } else if (moneyGiven==PRODUCT_PRICE   ) {
                System.out.println(TXT_PURCHASE_SUCCES_WITH_CHANGE);
                
            }else {
                System.out.println(TXT_PURCHASE_MISSING_MONEY +(PRODUCT_PRICE-moneyGiven));
                
            }

        }else {
            //ungültiger Index
            System.out.println(TXT_INVALID_CHOICE);

        }

    }
}
