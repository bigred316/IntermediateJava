package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class prog602bStack {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog602b.dat"));
            var db = new Stack<Account>();
            while (file.hasNext()) {
                int a = file.nextInt();
                double h = file.nextDouble();
                int p = file.nextInt();
                db.push(new Account(a, h, p));
            }
            file.close();
            System.out.println("Account\tHours\tCode\tDue");
            while(!db.isEmpty()){
                System.out.println(db.pop());
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Account {
    int aNum;
    double hours;
    int priority;
    double amount;
    public Account(int accnum, double hours, int priority){
        aNum = accnum;
        this.hours = hours;
        this.priority = priority;
        amount = calcAmount();
    }

    private double calcAmount(){
        double amount;
        if(hours > 15){
            amount = 550;
            amount += 30 * (hours-15);}
        else {
            amount = 200;
            if(hours > 5){
                amount += 50 *(hours -5);
            }
        }

        if(priority==1) amount += 50;
        if(priority==2) amount += 150;
        return amount;
    }

    public String toString(){
        return aNum + "\t" +hours + "\t"+priority + "\t"+amount + "\t";
    }
}

// 29118   15.02   0       550.6
// 23051   1.55    2       350.0
// 22841   27.9    2       1087.0
// 21352   5.84    0       242.0
// 20045   5.0     1       250.0
// 19111   12.0    2       700.0
// 17185   7.93    1       396.5
// 14063   17.06   1       661.8
// 1825    3.25    0       200.0