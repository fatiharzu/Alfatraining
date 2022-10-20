package woche03.tag02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            List<String> sb = new ArrayList<>();

            sb.add("Ali");
            sb.add("Fatih");
            sb.add("Murat");


            for (String s : sb) {
                writer.write(s+" ");
            }


            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
