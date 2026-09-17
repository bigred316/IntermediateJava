package Q1;
import java.util.Scanner;
public class prog54c {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        System.out.print("Enter Radius");
        Double radius = input.nextDouble();
        System.out.println();
        
        final double PI = 3.1459;

        double area = PI * Math.pow(radius,2);
        double circ = 2 *PI*radius;

        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumfrence: %.3f\n", circ);
        input.close();
    }
}
