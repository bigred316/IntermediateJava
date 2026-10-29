package Q1;
import java.util.Scanner;

public class MSOE2007x2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String thing = input.nextLine();
        int cnt =0;
        for(int i =0; i<thing.length();i++){
            if (thing.substring(i,i+1).equals("a")){cnt++;}
            else if (thing.substring(i,i+1).equals("e")){cnt++;}
            else if (thing.substring(i,i+1).equals("i")){cnt++;}
            else if (thing.substring(i,i+1).equals("o")){cnt++;}
            else if (thing.substring(i,i+1).equals("u")){cnt++;} 
        }
        System.out.print("There are "+ cnt+ " vowels in the string.");
        input.close();
    }
}
// Input String: freaking cool beans man  
// There are 8 vowels in the string.