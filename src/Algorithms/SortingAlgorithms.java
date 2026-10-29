package Algorithms;
import java.util.Arrays;
import java.util.Random;

//SuppressWarnings({"unchecked", "unused", "ManualArrayCopy"})
public class SortingAlgorithms {
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }

    public static <T extends Comparable<T>> void bubbleSort (T[] arr){
        for(int i = 0; i<arr.length-1; i++)
            for(int j = 0; j< arr.length-i-1;j++)
                if(arr[j].compareTo(arr[j+1])>0)
                    swap(arr, j, j+1);
    }

    public static <T extends Comparable<T>> void insertionSort (T[] arr) {insertionSort(arr, arr.length);}  
    public static <T extends Comparable<T>> void insertionSort (T[] arr, int n){
        for(int i = 1; i<n; i++){
            T key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j].compareTo(key)>0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }

    public static <T extends Comparable<T>> void selectionSort (T[] arr){
        for (int i = 0; i<arr.length; i++){
            int min = i;
            for (int ii = i+1; ii < arr.length; ii++){
                if (arr[ii].compareTo(arr[min])<0){
                    min = ii;
                }
            }
            swap(arr, i, min);
        }
    }

    public static <T extends Comparable<T>> void shellSort (T[] arr){
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                T temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap].compareTo(temp)>0) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = temp;
            }
            gap = gap / 2;
        }
    }
}
