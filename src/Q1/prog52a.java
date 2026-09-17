package Q1;
import java.util.Scanner;
public class prog52a {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length ");
        int length  = input.nextInt();
        System.out.println();
        
        System.out.print("Input Width ");
        int width = input.nextInt();
        System.out.println();

        int area = length * width;
        int perimeter = (length + width)*2;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}
