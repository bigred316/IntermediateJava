package Q1;
import java.util.Scanner;
public class LP5x20 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        System.out.println();
        int cnt = 0;
        for(int x = 0; x<str.length(); x++){
            String y = str.substring(x,x+1).toLowerCase();

            if(y.equals("a")){cnt++;}
            if(y.equals("e")){cnt++;}
            if(y.equals("i")){cnt++;}
            if(y.equals("o")){cnt++;}
            if(y.equals("u")){cnt++;}
        }
        System.out.println("There are " +cnt+" vowels in the string.");
        input.close();
    }
}

// Input a string: Java Programming Assistant
// 
// There are 8 vowels in the string.