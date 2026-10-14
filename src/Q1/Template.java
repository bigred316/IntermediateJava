package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog1050 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/REPLACE.dat"));

            while (file.hasNext()) {

            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
