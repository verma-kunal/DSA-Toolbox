package DataStructures.Arrays;
import java.util.*;

public class multiDimensionalArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//      int[][] nums = new int[3][];
        int[][] nums = {
                {1, 2, 3}, // 0th index => Row-1
                {4, 5}, // 1st index => Row-2
                {6, 7, 8, 9} // 2nd index => Row-3
        };

        //Input:
        int[][] arr2D = new int[3][3];

        for (int row = 0; row < arr2D.length; row++) {
            // for each column at every row
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }
//        for (int row = 0; row < arr2D.length; row++) {
//            // for each column at every row
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.printf(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < arr2D.length; row++) {
//            System.out.println(Arrays.toString(arr2D[row]));
//        }

        // Enhanced FOR LOOP approach:
        for(int[] elementAsArr : arr2D){
            System.out.println(Arrays.toString(elementAsArr));
        }

        for (int[] ints : arr2D) {
            // for each column at every row
            for (int anInt : ints) {
                System.out.printf(anInt + " ");
            }
            System.out.println();
        }






    }
}
