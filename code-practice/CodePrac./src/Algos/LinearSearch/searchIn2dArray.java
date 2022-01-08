package Algos.LinearSearch;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,56},
                {534,123,6,7},
                {123,6,88}
        };
        int target = 123;

        int[] ans = in2dArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] in2dArray(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
