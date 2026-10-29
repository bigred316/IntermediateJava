package Q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Algorithms.SearchAlgorithms;

public class prog460a {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/sort.dat"));
            var nums = new ArrayList<Integer>();

            while (file.hasNext()) {
                nums.add(file.nextInt());
            }
            file.close();

            int lcv = 0;
            var arr = new Integer[nums.size()]; 
            for (var n : nums ) arr[lcv++] = n;

            //user can enter -1 to quit

            int num = 0;
            var input = new Scanner(System.in);
            do {
                System.out.print("Enter a number to search for. ");
                num = input.nextInt();
                int pos = SearchAlgorithms.recursiveBinarySearch(arr,num);
                System.out.println(pos == -1 ? "Your number doesnt occur in the list\n" : "Your number occurs at index " + (pos+1) + "\n"); //if else type stuff
            }while (num != -1);

            input.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Enter a number to search for. 50
// Your number occurs at index 33

// Enter a number to search for. 12
// Your number doesnt occur in the list

// Enter a number to search for. 18
// Your number occurs at index 13

// Enter a number to search for. 100
// Your number occurs at index 60

// Enter a number to search for. 87
// Your number doesnt occur in the list

// Enter a number to search for. -1
// Your number doesnt occur in the list