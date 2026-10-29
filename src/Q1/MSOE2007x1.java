package Q1;
import java.util.Scanner;

public class MSOE2007x1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is the known height? ");
    double height = input.nextDouble();
    System.out.print("\nWhat is the shadow length for the same object? ");
    double lengthK = input.nextDouble();
    System.out.print("\nWhat is the shadow length for the unknown object? ");
    double lengthU = input.nextDouble();

    double Uheight = (height/lengthK)*lengthU;
    System.out.println("\nThe object of unknown height has a height of " + Uheight);
    input.close();
}
    }

// What is the known height? 5

// What is the shadow length for the same object? 5

// What is the shadow length for the unknown object? 5

// The object of unknown height has a height of 5.0
