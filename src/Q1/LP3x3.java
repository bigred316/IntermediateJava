package Q1;
import java.util.Scanner;
public class LP3x3 {
    public static void main(String[] args) {
         Scanner input  =  new Scanner(System.in);
    System.out.print("How much will rent cost for the semester?");
    double rent = input.nextDouble();
    System.out.print("How much will your tuition cost for the semester?");
    double tuition = input.nextDouble();
    System.out.print("How much will your food cost for the semester?");
    double food = input.nextDouble();
    System.out.print("How much will your books cost for the semester?");
    double books = input.nextDouble();
    System.out.print("How much will offsets, such as scholarships, save you?");
    double offsets = input.nextDouble();

    double total = rent+tuition+food+books-offsets;
    System.out.printf("This semester will cose $%.2f\n", total);
    input.close();
    }
   
}

// How much will rent cost for the semester?1000
// How much will your tuition cost for the semester?1000
// How much will your food cost for the semester?500
// How much will your books cost for the semester?20000
// How much will offsets, such as scholarships, save you?10
// This semester will cose $22490.00