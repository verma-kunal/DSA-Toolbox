package Algorithms.LinearSearch;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 5;
        // the format of our answer would be an array itself,
        // that will give the row & column index, if element is found => {row, col}
        int[] ans = searchIn2DArray(arr, target);
        int maxVal = maxIn2DArray(arr);

//        System.out.println(Arrays.toString(ans));
        System.out.println(maxVal);

    }
    static int[] searchIn2DArray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // Finding the max element in a 2D array
    static int maxIn2DArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

            }
        }
        return max;
    }

}







