package Q1;

import java.util.Scanner;

public class MSOE2007x3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is the measure of angle A? ");
    int a = input.nextInt();
    System.out.print("What is the measure of angle B? ");
    int b = input.nextInt();
    System.out.print("What is the measure of angle C? ");
    int c = input.nextInt();
    if (a+b+c != 180){
        System.out.print("Not a valid triangle.");
    } else{
    System.out.print("What is the measure of the side length opposite angle C? ");
    double cside = input.nextDouble();
    double a2= Math.sin(Math.toRadians(a/2.0));
    double b2= Math.sin(Math.toRadians(b/2.0));
    double c2 = 1/Math.cos(Math.toRadians(c/2));
    input.close();
    double radius = cside *Math.toDegrees(a2) * Math.toDegrees(b2)* Math.toDegrees(c2);

    System.out.print("Radius of the inscribed circle is " + radius);}

    }
}
