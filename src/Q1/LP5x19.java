package Q1;
import java.util.Scanner;
public class LP5x19 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        System.out.print("Please input a sentence.");
        String sen = input.nextLine();
        System.out.println();

        System.out.print("Input the string you would like removed.");
        String rem = input.nextLine();
        System.out.println();

        System.out.println("Original sentence:" + sen);

        for(int x = 0; x<=sen.length()-rem.length();x++){
            if(sen.substring(x,x+rem.length()).equals(rem)){
                sen = sen.substring(0,x) + sen.substring(x+rem.length());
                //x -= rem.length();
            }
        }
        System.out.println("Edited Sentence: "+sen);
        input.close();
    }
}


// Please input a sentence.I really hope you get an interview.

// Input the string you would like removed. really

// Original sentence:I really hope you get an interview.
// Edited Sentence: I hope you get an interview.