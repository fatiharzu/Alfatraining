package woche02.tag01;

import java.util.Arrays;

public class C03_FaArrayUebung {
    public static final String APPLICATION_NAME = "=============\nClArrayUebung\n=============\n";
    public static final String DEFAULT_VALUE = "Alex";
    public static void main(String[] args) {


        startApplication();
    }

    private static void startApplication() {
        String[] namen = { "Milan", "Max","Roni","Alex","Samuel"};

        printApplicationName();
        uebergebenesStringArray();
        mittelwert();
        kopierteArray(namen);
        zusammenzufuegen();
        bestimmtenIndex();
        gemeinsamenElemente();
        duplikateElement();




    }
    //      Aufgabe 7
    private static void duplikateElement() {
        float num1[] = { 1, 7, 3, 8, 5, 2, 9, 2, 3, 1};


        System.out.println("Aufgabe 7");


        for (int i=0; i<num1.length; i++)
        {
            for (int j= i+1; j<num1.length; j++)
            {
                if (num1[i]==num1[j])
                {
                    System.out.println("Duplikate elementen => "+num1[i]);
                }
            }
        }
        System.out.println("======================================================================\n");
    }
    //      Aufgabe 6
    private static void gemeinsamenElemente() {
        String namen[] = { "Milan", "Alex", "Finn", "Marcus", "Dani","Bonn"};
        String staedte[] = {"Istanbul", "Milan", "London", "Berlin", "Madrid","Bonn"};

        System.out.println("Aufgabe 6");
        for (int i=0; i<namen.length; i++)
        {
            for (int j=0; j<staedte.length; j++)
            {
                if (namen[i].equals(staedte[j]))
                {
                    System.out.println("Gemeinsamen elementen => "+namen[i]);
                    break;
                }
            }
        }
        System.out.println("======================================================================\n");
    }
//      Aufgabe 5
    private static void bestimmtenIndex() {
        String[] namen = { "Milan", "Max","Roni","Alex","Samuel"};
        System.out.println("Aufgabe 5");
        for (int i = 0 ; i < namen.length ; i++ ){

            if (namen[i].equals(DEFAULT_VALUE)){
                System.out.println("Bestimmten index ist  : "+  i);
            }

        }
        System.out.println("======================================================================\n");
    }

    //    Aufgabe 4
    private static void zusammenzufuegen() {
        System.out.println("Aufgabe 4");
        String[] namen = { "Milan", "Max","Roni","Alex","Samuel"};
        String[] staedte = { "Milan", "Madrid","Roma","Istanbul","Berlin"};
        String[] staedteNamen = new String[namen.length+ staedte.length];
        System.out.println(Arrays.toString(staedteNamen));
        System.out.println("----------------------------------------------------------------------");
        for (int i =0; i<namen.length ; i++){
            staedteNamen[i] = namen[i];
        }
        System.out.println(Arrays.toString(staedteNamen));

        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i< staedte.length; i++){
            staedteNamen[i+ namen.length]=namen[i];
        }

        System.out.println(Arrays.toString(staedteNamen));
        System.out.println("======================================================================\n");
    }

//    Aufgabe 3
    private static String[] kopierteArray(String[] namen) {
        System.out.println("Aufgabe 3");
        String[] kopierteNamen = new String[namen.length];

        for (int i = 0 ; i < namen.length ; i++){
            kopierteNamen[i]=namen[i] ;
        }

        System.out.println("Kopierte Namen => "+Arrays.toString(kopierteNamen));
        System.out.println("======================================================================\n");
        return kopierteNamen;
    }

//    Aufgabe 2
    private static void mittelwert() {
        System.out.println("Aufgabe 2");
        int[] numbers = {1001,1002,1003,1004,1005};
        double result =0;
        for (int i =0 ; i<numbers.length ; i++){
           
            result = result + numbers[i];

        }
        System.out.println("Mittelwert => "+result/numbers.length);

        System.out.println("======================================================================\n");
    }

//    Aufgabe 1
    private static void uebergebenesStringArray() {
        System.out.println("Aufgabe 1");
        String[] städte = { "Milano", "Madrid","Roma","Istanbul","Berlin"};


        for (int i = 0; i <städte.length ; i++){

            if (städte[i].equals("Roma")){
                System.out.println("übergebenes String =>\t Roma gefunden");
            }
        }

        System.out.println("======================================================================\n");

    }


    private static void printApplicationName() {
        System.out.println(APPLICATION_NAME);
    }
}
