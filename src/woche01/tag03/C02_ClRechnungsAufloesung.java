package woche01.tag03;

import java.text.DecimalFormat;

/**
 * Gibt die Rechnung aus der Übung mit Variablen auf
 * der Konsole aus
 */
public class C02_ClRechnungsAufloesung {

    /**
     * Einstiegspunkt ins Programm
     *
     * @param args : Startparameter
     */
    public static void main(String[] args) {

        //Unternehmensdetails
        String companyName = "Heimservice Ahiloo";
        String companyOwner = "Jaswinder Multani";
        String companyAddress = "Bürgermeister-Regitz-Straße 44\n\t\t\t66539 Neunkirchen/Wellesweiler";
        String taxId = "DE81500273456";

        //Rechnungsdetails
        String customerName = "Shrek vom Tümpel";
        String customerAddress = "Schlammtümpelstraße 90001\n12345 Weit Weit Weg";

        int invoiceNumber = 69;
        String invoiceCreationDate = "20. September 2020";
        int orderNumber = 1171;
        String invoiceOrderDate = invoiceCreationDate;
        String paymentMethod = "PayPal";

        //Bestellpositionen
        String schnitzelName = "Schnitzel Haus";
        String schnitzelExtras = "Hähnchenfleisch anstelle von Schweinefleisch";
        double schnitzelExtraPrice = 1.5;
        String schnitzelId = "255";
        int schnitzelAmount = 1;
        double schnitzelPrice = 13.0;

        String pizzaName = "Pizza Ahiloo 40cm";
        String pizzaFirstExtra = "Champingons";
        String pizzaSecondExtra = "Paprika";
        double pizzaExtraPrice = 2.0;
        String pizzaId = "57-3";
        int pizzaAmount = 1;
        double pizzaPrice = 14.0;

        double invoiceTax = 1.29;
        double deliveryPrice = 0.0;
        double subtotal = (schnitzelAmount * schnitzelPrice) + (pizzaAmount * pizzaPrice);
        double total = subtotal + deliveryPrice;

        //Erzeugen einer Instanz der Klasse DecimalFormat, über welche Zahlen nach einem Muster formatiert werden können
        DecimalFormat df = new DecimalFormat("###.00");


        System.out.println(companyName);
        System.out.println("\nInhaber: \t" + companyOwner);
        System.out.println("Addresse: \t" + companyAddress);
        System.out.println("Ust.Id: \t" + taxId);

        System.out.println("\nRechnung\n========");
        System.out.println("Herr " + customerName);
        System.out.println(customerAddress);

        System.out.println("\nRechnungsnummer: \t" + invoiceNumber);
        System.out.println("Rechnungsdatum: \t" + invoiceCreationDate);
        System.out.println("Bestellnummer: \t\t" + orderNumber);
        System.out.println("Bestelldatum: \t\t" + invoiceOrderDate);
        System.out.println("Zahlungsart: \t\t" + paymentMethod);

        System.out.println("\nProdukt \t\t\t\t\t\t\t\t\t\t\t\t\t\tAnzahl \t\t\t\tPreis");

        System.out.println("\n" + schnitzelName + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + schnitzelAmount
                + "\t\t\t\t" + df.format(schnitzelPrice) + "€");
        System.out.println("Extra (" + df.format(schnitzelExtraPrice) + "€): " + schnitzelExtras);
        System.out.println("Art.Nr.: " + schnitzelId);

        System.out.println("\n" + pizzaName + "\t\t\t\t\t\t\t\t\t\t\t\t\t" + pizzaAmount
                + "\t\t\t\t" + df.format(pizzaPrice) + "€");
        System.out.println("Extra (" + df.format(pizzaExtraPrice) + "€): " + pizzaFirstExtra);
        System.out.println("Extra (" + df.format(pizzaExtraPrice) + "€): " + pizzaSecondExtra);
        System.out.println("Art.Nr.: " + pizzaId);

        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tZwischensumme: \t\t\t" + df.format(subtotal) + "€");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLieferung: \t\t\t\tKostenlose Lieferung");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGesamtsumme: \t\t\t" + df.format(total) + "€");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tinkl. 5% Mwst.: \t\t" + df.format(invoiceTax) + "€");
    }
}