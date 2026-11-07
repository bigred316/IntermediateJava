package Q1.Prog285b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import DataStructures.Stack;

public class prog285bStack {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog285b.dat"));
            var stack = new Stack<Cl285b>();

            System.out.println("Id\tCode\tSales\t\tCommission");
            while (file.hasNext()) {
                int id   = file.nextInt();
                int c    = file.nextInt();
                double s = file.nextDouble();

                var sp = new Cl285b(id, c, s);
                stack.push(sp);
            }
            file.close();

            while (!stack.isEmpty()) {
                var sp = stack.pop();
                System.out.println(sp);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}