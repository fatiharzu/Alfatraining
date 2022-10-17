package woche03.tag01.ClEinfuerungOop.main;


import de.rhistel.logic.ConsoleReader;
import woche03.tag01.ClEinfuerungOop.model.House;

public class Main {



    public static void main(String[] args) {
        //TODO 3 Klasse House anhand von Objekten testen
        House house = new House(10,5,7, 15,"blau");

        House[] houses = new House[5];
        houses[0] = house;

        //TODO 5 Einlesen des Hauses testen
        house = getHouseFromConsole();
        System.out.println(houses[0]);
        System.out.println(house);


        house = new House();

        System.out.println(houses[0]);
        System.out.println(house);

        System.out.println("Quadratmeter: " + calculateArea(houses[0]));
    }

    /**
     * Liest die Eingenschaften eines Hauses über die Konsole ein
     * und liefert ein Objekt der Klasse {@link House} zurück.
     *
     * @return : {@link House} : Aus den Eingaben erzeugtes Haus
     * TODO 4 Methode zum Einlesen eines Haus-Objektes über die Konsole implementieren
     */
    private static House getHouseFromConsole() {
        House houseFromConsole = new House();

        System.out.println("Länge eingeben:");
        double length = ConsoleReader.in.readPositivDouble();
        houseFromConsole.setLength(length);

        //TODO 6 restliche Werte des Hauses einlesen

        return houseFromConsole;
    }

    private static double calculateArea(House house) {
        return (house.getLength() * house.getWidth()) * house.getFloorCount();
    }
}