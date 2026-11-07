package Q1;
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.io.*;


class BankAccount{
    String name;
    double balance;
    public BankAccount(String nm, double amt){
        name = nm;
        balance = amt;
    }

    public void deposit(double dp){
        balance += dp;
    }

    public void withdraw(double wd){
        balance-= wd;
    }
}


public class Pelican42x7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var bank = new ArrayList<BankAccount>();
        System.out.print("Please answer the name of the account holder (Type Exit to abort) ");
        while(!(input.next().toLowerCase().equals("exit"))){
            String name = input.nextLine();
            System.out.print("Please input the account balance ");
        }
    }
}
