package Q1;
import Algorithms.SortingAlgorithms;

public class Pelican40x1 {
    public static void main(String[] args) {
        Integer arr1[] = {4,2,5,1,3,18,0,9,6};
        SortingAlgorithms.insertionSort(arr1);
        System.out.println("Insertion Sort");
        for(Integer x: arr1){
            System.out.print(x+" ");
        }
        System.out.println();

        Integer arr2[] = {4,2,5,1,3,18,0,9,6};
        SortingAlgorithms.selectionSort(arr2);
        System.out.println("Selection Sort");
        for(Integer x: arr2){
            System.out.print(x+" ");
        }
        System.out.println();

        Integer arr3[] = {4,2,5,1,3,18,0,9,6};
        SortingAlgorithms.bubbleSort(arr3);
        System.out.println("Bubble Sort");
        for(Integer x: arr3){
            System.out.print(x+" ");
        }
        System.out.println();

        Integer arr4[] = {4,2,5,1,3,18,0,9,6};
        SortingAlgorithms.shellSort(arr4);
        System.out.println("Shell Sort");
        for(Integer x: arr4){
            System.out.print(x+" ");
        }
        System.out.println();


    }
}

// Insertion Sort
// 0 1 2 3 4 5 6 9 18 
// Selection Sort
// 0 1 2 3 4 5 6 9 18 
// Bubble Sort
// 0 1 2 3 4 5 6 9 18 
// Shell Sort
// 0 1 2 3 4 5 6 9 18 