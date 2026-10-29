package Q1;
import java.util.ArrayList;

import DataStructures.dynamicArray;

public class dynamicArrayLab {
    public static void main(String[] args) {
        System.out.println("==========Dynamic Array==========");
        var dArray = new dynamicArray<Integer>();
        long start = System.nanoTime();
        for (int i = 0; i< 100_000; i++)
            dArray.add((int)(Math.random()*100000));
        long end = System.nanoTime();
        System.out.println("Dynamic Array add: "+ (end - start)/1e6 + " ms");

        start = System.nanoTime();
        dArray.sort();
        end = System.nanoTime();
        System.out.println("Dynamic Array sort: "+ (end - start)/1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i< 100_000; i++){
            dArray.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Dynamic Array remove: "+ (end - start)/1e6 + " ms");
        
        

        System.out.println("==========ArrayList==========");
        var LArray = new ArrayList<Integer>();
        start = System.nanoTime();
        for (int i = 0; i< 100_000; i++)
            LArray.add((int)(Math.random()*100000));
        end = System.nanoTime();
        System.out.println("ArrayList add: "+ (end - start)/1e6 + " ms");

        start = System.nanoTime();
        LArray.sort(null);
        end = System.nanoTime();
        System.out.println("ArrayList sort: "+ (end - start)/1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i< 100_000; i++){
            LArray.remove(0);
        }
        end = System.nanoTime();
        System.out.println("ArrayList remove: "+ (end - start)/1e6 + " ms");
    }
}
