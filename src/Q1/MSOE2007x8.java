package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MSOE2007x8 {


    public static void main(String[] args) {
        try {
            var scan = new Scanner(System.in);
            System.out.print("Please input a file to read, it must be in the directory Langdat with the extension '.dat' ");
            String filer = scan.nextLine();
            var file = new Scanner(new File("Langdat/"+filer+".dat"));
            int s1 = file.nextInt();
            int s2 = file.nextInt();
            int[][] altdata = new int[s1][s2];
            for(int r = 0; r<s1; r++)
                for(int c = 0; c<s2; c++)
                    altdata[r][c] = file.nextInt();
            
            for(int r = 1; r< s1-1; r++)
                for(int c = 1; c< s2-1; c++){
                    if(checkAround(altdata, r, c))
                        System.out.println("There is a high point with a value of " +altdata[r][c] + " in row "+ (r+1)+" and column "+ (c+1));
                }
                    
            file.close();
            scan.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean checkAround(int[][]a, int r, int c){
        int check = a[r][c];
        if(a[r-1][c-1]>check)
            return false;
        if(a[r-1][c]>check)
            return false;
        if(a[r-1][c+1]>check)
            return false;
        if(a[r][c-1]>check)
            return false;
        if(a[r][c+1]>check)
            return false;
        if(a[r+1][c-1]>check)
            return false;
        if(a[r+1][c]>check)
            return false;
        if(a[r+1][c+1]>check)
            return false;
        return true;
    }


}


// Please input a file to read, it must be in the directory Langdat with the extension '.dat' problem8
// There is a high point with a value of 6 in row 2 and column 3
// There is a high point with a value of 9 in row 2 and column 5