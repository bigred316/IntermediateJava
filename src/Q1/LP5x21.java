package Q1;
import java.util.Scanner;
public class LP5x21 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Please enter your first name. ");
        String fn = input.nextLine();
        System.out.print("Please enter your last name. ");
        String ln = input.nextLine();
        input.close();
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for(int x=0; x<alph.length(); x++){
            if(ln.substring(0,1).toLowerCase().equals(alph.substring(x,x+1))){
                if(x<9){
                    System.out.println(fn+ " "+ ln + " is assigned to Group 1.");
                    return;
                }
                if(x>18){
                    System.out.println(fn+ " "+ ln + " is assigned to Group 3.");
                    return;
                }
                if(x>=9&&x<=18){
                    System.out.println(fn+ " "+ ln + " is assigned to Group 2.");
                    return;
                }
            }
        }
        
    }
}

// Please enter your first name. Christina
// Please enter your last name. Brigilo
// Christina Brigilo is assigned to Group 1.