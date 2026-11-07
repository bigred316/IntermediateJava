package Q1;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class prog1060bQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        String op;
        do{
            System.out.print("Enter task A)dd, D)elete, E)xit ");
            op = input.nextLine();
            if(op.toLowerCase().equals("a")){
                System.out.print("enter number to add ");
                Integer a = Integer.parseInt(input.nextLine());
                q.add(a);
            }
            if(op.toLowerCase().equals("d")){
                System.out.print("enter number to delete ");
                Integer d = Integer.parseInt(input.nextLine());
                q.remove(d);
            }
            System.out.println("The list is " + q);
        } 
        while (!op.toLowerCase().equals("e"));
        input.close();
    }
}

// Enter task A)dd, D)elete, E)xit a
// enter number to add 10
// The list is [10]
// Enter task A)dd, D)elete, E)xit a
// enter number to add 15
// The list is [10, 15]
// Enter task A)dd, D)elete, E)xit a
// enter number to add 2
// The list is [10, 15, 2]
// Enter task A)dd, D)elete, E)xit d
// enter number to delete 10
// The list is [15, 2]
// Enter task A)dd, D)elete, E)xit d
// enter number to delete 2
// The list is [15]
// Enter task A)dd, D)elete, E)xit d
// enter number to delete 15
// The list is []
// Enter task A)dd, D)elete, E)xit a
// enter number to add 7
// The list is [7]
// Enter task A)dd, D)elete, E)xit e
// The list is [7]