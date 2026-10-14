package Q1;
import java.util.Scanner;
public class LP3x5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
         System.out.print("Enter the change required in cents.");
         int cents = input.nextInt();
         int quarters = cents/25;
         cents = cents%25;
         int dimes = cents/10;
         cents = cents%10;
         int nick = cents/5;
         cents %= 5;
         System.out.println("The minimum amount of change would be:");
         System.out.println(quarters + " quarters");
         System.out.println(dimes + " dimes");
         System.out.println(nick + " nickles");
         System.out.println(cents + " pennies");
         input.close();
    }
}
// Enter the change required in cents.212
// The minimum amount of change would be:
// 8 quarters
// 1 dimes
// 0 nickles
// 2 pennies