package Algorithms;

public class SearchAlgorithms {
    public static<T extends Comparable<T>> int linearSearch(T[] arr, T target){
        for (int i = 0; i<arr.length; i++)
            if(arr[i].compareTo(target) ==0)
                return i;
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T target){
        int lowb = 0;
        int upb = arr.length-1;
        while (lowb <= upb){
            int mid = (lowb+upb)/2;
            if(arr[mid].compareTo(target)==0)return mid;
            else if (target.compareTo(arr[mid])>0) lowb=mid+1;
            else upb = mid-1;
        }
        return -1;
    }

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] arr, T target) {
        return recursiveBinarySearch(arr, target, 0, arr.length);
    }

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] arr, T target,
                                                                    int low, int high){
        if (low>high) return -1;
        int mid = (low+high)/2;
        if (arr[mid].compareTo(target)==0) return mid;
        else if (arr[mid].compareTo(target)<0) return recursiveBinarySearch(arr, target, mid+1, high); //search right
        else return recursiveBinarySearch(arr, target, low, mid-1); //search left

            
        
    }
}
