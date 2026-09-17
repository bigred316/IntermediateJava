package Q1;
import java.util.Scanner;
public class LP5x10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Input 2 positive integers separated by a space.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int temp = 0;

        while (num2 > 0){
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Gcd = " + num1);
        input.close();
    }
}
