package Q1;
import java.util.Scanner;
public class prog82aClass {
    static class C182a{
        private int limit;
        private int speed;
        private double fine=0;
        private static final int BASE_FINE = 20;

        public C182a(int limit, int speed){
            this.limit = limit;
            this.speed = speed;
        }

        public void calc() {
            if(speed > limit){
                fine = BASE_FINE + ((speed-limit)*5);
            }
        }

        public double getFine(){return fine;}
    }
    public static void main(String[] args) {
        var input = new Scanner(System.in);


        System.out.print("Enter the speed limit.");
        int speedLimit = input.nextInt();
        System.out.print("Enter the vehicle speed.");
        int carSpeed = input.nextInt();

        C182a ticket = new C182a(speedLimit, carSpeed);
        ticket.calc();
        System.out.printf("Fine: $%.2f\n", ticket.getFine());

        input.close();
    }
}

// Enter the speed limit.30
// Enter the vehicle speed.42
// Fine: $80.00
