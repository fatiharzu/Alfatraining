package woche02.tag02;

import java.util.Scanner;

public class C04_Songlist {
    //region Konstanten
    private static final String WILLKOMMEN = "\n==========\n Songlist\n==========\n\n==========\nWILLKOMMEN\n==========\n";
    private static final String SONG_GEBEN = "Sie können 10 Songs über die Konsole einzulesen";
    private static final String FEHLER = "Du hast einen Fehler gemacht\nBitte geben Sie den Songnamen mit mindestens 2 Buchstaben ein.";
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
        inputSongs();
    }

    private static void inputSongs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(SONG_GEBEN);
        String song = scanner.next();
       String[] songArray = new String[10];

        if (song.length() > 2) {
            for (int i = 0;i < 10 ; i++){
                songArray[i] = scanner.next();

            }
            songList(songArray);
        }else
         System.err.println(FEHLER);

    }

    private static String[] songList(String[] namen) {

        for (int i = 0 ; i < namen.length ; i++){

            System.out.println((i+1)+" - Songname " + namen[i].toString());
        }

        return namen;
    }

    private static void printApplicationName() {
        System.out.println(WILLKOMMEN);
    }
    //endregion
}
