package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class prog464d {
    /**
     * transposes a 2d array of integers
     * @param mat 2d array to be transposed
     * @return the transposed form of mat
     */
    public static int[][] transpose(int[][] mat){
        int[][] transposed = new int[mat[0].length][mat.length];
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                transposed[col][row] = mat[row][col];
            }
        }
            return transposed;
    }
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for(int r = 0; r<5; r++){
                for(int c = 0; c<5; c++){
                    mat[r][c] = file.nextInt();
                }
            }
            var mat_T = transpose(mat);

            System.out.println("Original:");
            for(int[] row :mat){
                for(int n: row){
                    System.out.print(n+" ");
                }
                System.out.println();
            }

            System.out.println("Transposed:");
            for(int[] row :mat_T){
                for(int n: row){
                    System.out.print(n+" ");
                }
                System.out.println();
            }




            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Original:
// 45 67 89 12 -3 
// -3 -6 -7 -4 -9 
// 96 81 -8 52 12 
// 14 -7 72 29 -1 
// 19 43 28 63 87 
// Transposed:
// 45 -3 96 14 19 
// 67 -6 81 -7 43 
// 89 -7 -8 72 28 
// 12 -4 52 29 63 
// -3 -9 12 -1 87 