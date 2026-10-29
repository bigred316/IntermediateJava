package Q1;
import java.util.*;

interface LinearFunctionMethods {
    double getSlope();
    double getYintercept();
    double getRoot();
    double getYvalue(double x);
    double getXvalue(double y);
    
}

class LinearFunction implements LinearFunctionMethods{
    double slope;
    double yint;
    public LinearFunction(double s, double y){
        slope = s;
        yint = y;
    }

    public double getYvalue(double x){
        return slope*x + yint;
    }

    public double getXvalue(double y){
        return (y-yint)/ slope;
    }

    public double getRoot(){
        return getXvalue(0);
    }

    public double getYintercept(){
        return yint;
    }

    public double getSlope(){
        return slope;
    }
}

public class Pelican37x8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the slope of your line? ");
        double slope = input.nextDouble();
        
        System.out.print("What is the y-intercept of your line? ");
        double yIntc = input.nextDouble();
        
        LinearFunction line = new LinearFunction(slope, yIntc);
        
        System.out.println("\nSlope of this line is: " + line.getSlope());
        
        System.out.println("Y-intercept of this line is: " + line.getYintercept());

        System.out.println("Root of this line is: " + line.getRoot());
        
        System.out.print("\nWhat is an x value for which you wish to solve for y? ");
        double x = input.nextDouble();
        double yValue = line.getYvalue(x);
        System.out.println("The y value corresponding to x = " + x + " is " + yValue);
        
        System.out.print("\nWhat is a y value for which you wish to solve for x? ");
        double y = input.nextDouble();
        double xValue = line.getXvalue(y);
        System.out.println("The x value corresponding to y = " + y + " is " + xValue);
        input.close();
    }
}

// Slope of this line is: -3.0
// Y-intercept of this line is: 2.5
// Root of this line is: 0.8333333333333334

// What is an x value for which you wish to solve for y? -4.61
// The y value corresponding to x = -4.61 is 16.330000000000002

// What is a y value for which you wish to solve for x? 5.0
// The x value corresponding to y = 5.0 is -0.8333333333333334