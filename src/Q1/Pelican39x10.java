package Q1;
import java.util.*;

public class Pelican39x10 {
    public static void main(String[] args) {
        Scanner kbReader= new Scanner(System.in);
        System.out.print("Generate which term number? ");
        int k = kbReader.nextInt();

        System.out.println("Term #"+k+" is " + modFib.findTerm(k));
        kbReader.close();
    }
}



class modFib{
    public static int findTerm(int x){
        if (x == 0) return 3;
        else if (x==1) return 5;
        else if (x==2) return 8;
        else {
            return (findTerm(x-1)+ findTerm(x-2)+findTerm(x-3));
        }
    }
}

// Generate which term number? 6
// Term #6 is 98