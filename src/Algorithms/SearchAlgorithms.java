package Algorithms;

public class SearchAlgorithms {
    public static<T extends Comparable<T>> int linearSearch(T[] arr, T target){
        for (int i = 0; i<arr.length; i++)
            if(arr[i].compareTo(target) ==0)
                return i;
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T target){
        //TODO for pelican 50-4
        return -1;
    }

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] arr, T target,
         int low, int high){
        if (low>high) return -1;
        int mid = (low+high)/2;
        if (arr[mid].compareTo(target)==0) return mid;
        else if (arr[mid].compareTo(target)<0) 
            
        
    }
}
