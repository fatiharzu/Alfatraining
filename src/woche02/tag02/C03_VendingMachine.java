package woche02.tag02;

import java.util.Scanner;

public class C03_VendingMachine {
    //region Konstanten
    public static final String[] produkten = {"Cola", "Fanta", "Mezzo Mix", "Sprite"};

    public static final double produktKosten = 2.0;

    private static final String APP_NAME = "\n=================\n Vending Machine\n=================";
    private static final String WRONG_PRODUKT_NAME = "Geben Sie die Produktnummer erneut ein";
    private static final String SELECTED_PRODUKT = "Ausgewähltes Produkt: ";
    private static final String WILKOMMEN = "\nWillkommen\nBitte geben Sie die Nummer des gewünschten Produkts ein";
    private static final String VERIFIKATION_PRODUKT = "Wenn das ausgewählte Produkt richtig ist (R) wenn es falsch ist (F) DRÜCKEN";
    private static final String GET_PRODUKT = "Guten Appetit\nSie können Ihr Getränk haben";
    private static final String INSUFFICIENT_BALANCE = " Ihr Geld ist nicht genug, Sie müssen ";
    private static final String INSUFFICIENT_BALANCE2 = "€ mehr bezahlen!!";
    private static final String RUCKGELD = "Guten Appetit\nHolen Sie sich Ihr Geld ";
    private static final String GIVE_MONEY = "Bitte geben Sie den Geldbetrag ein, den Sie hinzufügen möchten";
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApplication();


    }

    private static void startApplication() {

        printApplicationName();
        System.out.println(WILKOMMEN);
        selectProdukt();
    }

    private static void printApplicationName() {
        System.out.println(APP_NAME);
    }

    private static void selectProdukt(){
        Scanner scanner = new Scanner(System.in);
        int inputProdukt =0;

        do {

            for (int i =0 ; i < produkten.length ; i++ ) {
                String produkt = produkten[i];
                System.out.println((i+1)+" -> "+produkt);
            }

            inputProdukt = scanner.nextInt();
            if (inputProdukt>0&&inputProdukt<5){

                System.out.println(SELECTED_PRODUKT+inputProdukt+" -> "+produkten[(inputProdukt-1)]);
                System.out.println(VERIFIKATION_PRODUKT);

                indexVerification();

            }else {
                  System.err.println(WRONG_PRODUKT_NAME);
                  selectProdukt();
            }
        }while (!(inputProdukt>0 && inputProdukt<5));
        }

    private static void indexVerification() {
        Scanner scanner = new Scanner(System.in);
        String verification = "F";
        verification = scanner.next().toUpperCase();
        if (verification.equals("F")){

            System.err.println(WRONG_PRODUKT_NAME);
            selectProdukt();

        }else if (verification.equals("R")){
            geldBerechnen(produkten);
        }else{
            System.err.println(WRONG_PRODUKT_NAME);
            selectProdukt();
        }
    }

    private static String[] geldBerechnen(String[] produkten) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GIVE_MONEY);
        double inputMoney = scanner.nextDouble();

        if (produktKosten==inputMoney){
            System.out.println(GET_PRODUKT);

        } else if (produktKosten>inputMoney) {

            double result = (produktKosten)-(inputMoney);

            System.out.println( INSUFFICIENT_BALANCE +result+ INSUFFICIENT_BALANCE2);

        }else {
            double rückgeld = inputMoney-produktKosten;
            System.out.println(RUCKGELD+rückgeld);
        }

        return produkten;
    }
    //endregion

}

